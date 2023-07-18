package f1_TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class T06_RetrieveText {

	@Test
	public void retrieveText() {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.leafground.com/input.xhtml;jsessionid=node02ezkpyqrac04er7qwhssisau315206.node0");

		WebElement retrieveText1 = driver.findElement(By.id("j_idt88:j_idt97"));
		String text1 = retrieveText1.getAttribute("value");
		System.out.println(text1);

		WebElement retrieveText2 = driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/div/div[1]/div/form/h5[5]"));
		String text2 = retrieveText2.getText();
		System.out.println(text2);
	}
}
