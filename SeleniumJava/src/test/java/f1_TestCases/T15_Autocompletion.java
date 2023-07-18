package f1_TestCases;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class T15_Autocompletion {

	@Test
	public void autoCompletion() {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/autocomplete/");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.switchTo().frame(0);

		WebElement search = driver.findElement(By.id("tags"));
		search.sendKeys("j");

		List<WebElement> results = driver.findElements(By.xpath("//ul[@id='ui-id-1']/li"));

		for (WebElement allResults : results) {
			String text = allResults.getText();
			if (text.equals("Java")) {
				allResults.click();
				break;
			}
		}
	}	
}
