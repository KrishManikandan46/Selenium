package f1_TestCases;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class T23_Maximize {

	@Test
	public void maximize(){
		WebDriverManager.chromedriver().setup();

		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("start-maximized");
		WebDriver driver = new ChromeDriver(chromeOptions);

		driver.manage().window().maximize();

		Dimension dimension = new Dimension(1920, 720);
		driver.manage().window().setSize(dimension);

		driver.get("https://www.google.com/");
	}
}
