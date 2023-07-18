package f1_TestCases;

import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class T21_Waits {

	@Test
	public void implcitlyWait(){
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement electronics = driver.findElement(By.xpath("//div[@id='mainContent']/div[1]/ul/li[3]"));
		Actions actions = new Actions(driver);
		actions.moveToElement(electronics).perform();

		driver.findElement(By.xpath("//a[text()='Apple']")).click();
	}	

	@Test
	public void explicitWait(){
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");

		WebElement electronics = driver.findElement(By.xpath("//div[@id='mainContent']/div[1]/ul/li[3]"));
		Actions actions = new Actions(driver);
		actions.moveToElement(electronics).perform();

		WebDriverWait driverWait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Apple']"))).click();
	}

	@Test
	public void fluentWait(){
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");

		WebElement electronics = driver.findElement(By.xpath("//div[@id='mainContent']/div[1]/ul/li[3]"));
		Actions actions = new Actions(driver);
		actions.moveToElement(electronics).perform();

		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofSeconds(5))
				.ignoring(NoSuchElementException.class);

		WebElement apple = wait.until(new Function<WebDriver, WebElement>() {

			@Override
			public WebElement apply(WebDriver driver) {
				// TODO Auto-generated method stub
				return driver.findElement(By.xpath("//a[text()='Apple']"));
			}
		});
		apple.click();
	}
}