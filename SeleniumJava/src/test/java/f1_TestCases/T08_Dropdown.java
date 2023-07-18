package f1_TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class T08_Dropdown {

	@Test
	public void singleValueSelect() {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_select_value2");

		driver.switchTo().frame("iframeResult");

		WebElement singleValue = driver.findElement(By.id("mySelect"));

		Select select = new Select(singleValue);
		select.selectByIndex(1);
		select.selectByValue("pineapple");
		select.selectByVisibleText("Banana");

	}

	@Test
	public void multiValueSelect() {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");

		driver.switchTo().frame("iframeResult");

		WebElement multiValue = driver.findElement(By.id("cars"));

		Select select = new Select(multiValue);
		select.selectByIndex(0);
		select.selectByValue("saab");
		select.selectByVisibleText("Audi");

		select.deselectAll();
		select.deselectByIndex(0);
		select.deselectByValue(null);
		select.deselectByVisibleText(null);
	}

}
