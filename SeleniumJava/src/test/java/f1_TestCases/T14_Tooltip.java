package f1_TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class T14_Tooltip {

	@Test
	public void tooltip() {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/tooltip/");

		driver.switchTo().frame(0);

		WebElement tooltip = driver.findElement(By.xpath("//a[text()='Tooltips']"));
		String title = tooltip.getAttribute("title");
		System.out.println(title);
		Actions actions = new Actions(driver);
		actions.moveToElement(tooltip).perform();
	}
}
