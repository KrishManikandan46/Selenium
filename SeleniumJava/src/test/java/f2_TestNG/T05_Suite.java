package f2_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class T05_Suite {

	WebDriver driver;

	@BeforeSuite
	public void openBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.navigate().to("https://www.google.com/");
	}

	@AfterSuite
	public void closeBrowser() {
		driver.quit();
	}

	@Test
	public void rider() {
		driver.findElement(By.name("q")).sendKeys("Fabio Quartararo \n");
		driver.navigate().back();
	}

	@Test
	public void wrestler() {
		driver.findElement(By.name("q")).sendKeys("John Cena \n");
		driver.navigate().back();
	}

	@Test
	public void cricketer() {
		driver.findElement(By.name("q")).sendKeys("Mahendra Singh Dhoni \n");
		driver.navigate().back();
	}
}
