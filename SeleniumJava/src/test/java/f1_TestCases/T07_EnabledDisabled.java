package f1_TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class T07_EnabledDisabled {

	@Test
	public void enabledDisabled() {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_pushbutton_disabled2");

		driver.switchTo().frame("iframeResult");

		WebElement myButton1 = driver.findElement(By.id("myBtn"));
		System.out.println(myButton1.isEnabled());

		WebElement tryIt = driver.findElement(By.xpath("//button[text()='Try it']"));
		tryIt.click();

		WebElement myButton2 = driver.findElement(By.id("myBtn"));
		System.out.println(myButton2.isEnabled());
	}
}
