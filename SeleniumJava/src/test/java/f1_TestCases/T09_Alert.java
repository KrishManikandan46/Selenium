package f1_TestCases;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class T09_Alert {

	@Test
	public void alert() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.leafground.com/alert.xhtml");

		WebElement simpleDialog = driver.findElement(By.xpath("//button[@id='j_idt88:j_idt91']/span[2]"));
		simpleDialog.click();
		driver.switchTo().alert().accept();

		WebElement confirmDialog = driver.findElement(By.xpath("//button[@id='j_idt88:j_idt93']/span[2]"));
		confirmDialog.click();
		driver.switchTo().alert().dismiss();

		WebElement promptDialog = driver.findElement(By.xpath("//button[@id='j_idt88:j_idt104']/span[2]"));
		promptDialog.click();
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("selenium");
		alert.accept();
	}
}
