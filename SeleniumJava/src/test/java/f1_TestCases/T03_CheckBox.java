package f1_TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class T03_CheckBox {

	@Test
	public void checkbox() {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_input_type_checkbox");

		driver.switchTo().frame("iframeResult");

		WebElement checkbox1 = driver.findElement(By.id("vehicle1"));
		checkbox1.click();
		System.out.println(checkbox1.isSelected());

		WebElement checkbox2 = driver.findElement(By.id("vehicle2"));
		System.out.println(checkbox2.isSelected());
	}
}
