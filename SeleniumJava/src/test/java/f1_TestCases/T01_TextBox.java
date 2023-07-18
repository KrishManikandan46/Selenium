package f1_TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class T01_TextBox {

	@Test
	public void openGoogle() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91979\\Documents\\WebDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
	}

	@Test
	public void textBox() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/input.xhtml;jsessionid=node016gcexetb0vmn1otjv5vmdk5l4312781.node0");

		WebElement typeYourName = driver.findElement(By.id("j_idt88:name"));
		typeYourName.sendKeys("Krishna");

		WebElement appendCountry = driver.findElement(By.id("j_idt88:j_idt91"));
		appendCountry.sendKeys(" India");

		WebElement clearTypedText = driver.findElement(By.id("j_idt88:j_idt95"));
		clearTypedText.clear();

		WebElement typeEmail = driver.findElement(By.id("j_idt88:j_idt99"));
		typeEmail.sendKeys("krishna46@gamil.com"+Keys.TAB);
	}
}
