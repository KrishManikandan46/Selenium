package f1_TestCases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class T12_Calendar {

	@Test
	public void datePicker() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://jqueryui.com/datepicker/");

		driver.switchTo().frame(0);

		WebElement datePicker = driver.findElement(By.id("datepicker"));
		datePicker.click();

		List<WebElement> date = driver.findElements(By.xpath("//div[@id='ui-datepicker-div']/table/tbody/tr/td/a"));
		for (WebElement allDate : date) {
			String d = allDate.getAttribute("data-date");
			if (d.equals("1")) {
				allDate.click();
				break;
			}
		}

	}
}
