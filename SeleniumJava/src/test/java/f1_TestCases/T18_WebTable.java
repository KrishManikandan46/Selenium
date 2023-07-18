package f1_TestCases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class T18_WebTable {

	@Test
	public void table() {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");

		List<WebElement> row = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
		int r = row.size();
		System.out.println("No of Rows of the Table "+r);

		List<WebElement> column = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[1]/th"));
		int c = column.size();
		System.out.println("No of Columns of the Table "+c);

		for (int i = 1; i <= r; i++) {
			for (int j = 1; j <= c; j++) {
				System.out.println(driver.findElement(By.xpath("//table[@id='customers']/tbody/tr["+ i +"]/th["+ j +"]")).getText()+" ");
			}
			System.out.println();
		}
	}
}
