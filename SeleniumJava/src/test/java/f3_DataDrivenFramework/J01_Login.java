package f3_DataDrivenFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class J01_Login {

	WebDriver driver;

	@BeforeSuite
	public void openBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://practicetestautomation.com/practice-test-login/");
	}

	@AfterSuite
	public void closeBrowser() {
		driver.close();
	}

	@Test(dataProvider ="loginData", dataProviderClass = J02_DataProvider.class)
	public void login(String name, String pwd) {

		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys(name);
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys(pwd);
		WebElement submit = driver.findElement(By.id("submit"));
		submit.click();
	}
}
