package f1_TestCases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class T10_Frame {

	@Test
	public void frame() {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.leafground.com/frame.xhtml");

		driver.switchTo().frame(0);
		WebElement frame1 = driver.findElement(By.id("Click"));
		frame1.click();

		driver.switchTo().defaultContent();

		List<WebElement> framesize = driver.findElements(By.tagName("iframe"));
		int size = framesize.size();
		System.out.println("There are " + size + " frames in this page");

		driver.switchTo().defaultContent();

		driver.switchTo().frame(2);
		driver.switchTo().frame("frame2");
		WebElement frame2 = driver.findElement(By.id("Click"));
		frame2.click();
	}
}