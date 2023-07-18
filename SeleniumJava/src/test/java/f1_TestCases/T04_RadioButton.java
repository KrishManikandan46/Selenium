package f1_TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class T04_RadioButton {

	@Test
	public void radioButton() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_input_type_radio");

		driver.switchTo().frame("iframeResult");

		WebElement radio1 = driver.findElement(By.id("html"));
		radio1.click();
		System.out.println(radio1.isSelected());

		WebElement radio2 = driver.findElement(By.id("css"));
		System.out.println(radio2.isSelected());
	}
}
