package f1_TestCases;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class T22_Refresh {

	@Test
	public void refresh() throws AWTException{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.google.com/");

		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("Selenium");

		driver.navigate().refresh();

		driver.get(driver.getCurrentUrl());

		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_F5);
		robot.keyRelease(KeyEvent.VK_F5);

		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("location.reload()");


	}
}
