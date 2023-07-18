package f1_TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class T19_JavaScriptExecutor {

	@Test
	public void hitURL() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("window.location = 'https://www.google.com/'");
	}
	
	@Test
	public void getTitle() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");

		JavascriptExecutor executor = (JavascriptExecutor) driver;
		String title = "return document.title;";
		String t = (String) executor.executeScript(title);
		System.out.println(t);
	}

	@Test
	public void clickButton() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");

		driver.switchTo().frame("iframeResult");
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("myFunction()");
		driver.switchTo().alert().accept();
	}

	@Test
	public void highlightButton() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");

		driver.switchTo().frame("iframeResult");
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		WebElement button = driver.findElement(By.xpath("//button[text()='Try it']"));
		executor.executeScript("arguments[0].style.border='5px solid red'", button);
	}

	@Test
	public void scroll() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/");

		JavascriptExecutor executor = (JavascriptExecutor) driver;

		//WebElement findElement = driver.findElement(By.xpath("//a[text()='Learn How To']"));
		//executor.executeScript("arguments[0].scrollIntoView(true);", findElement);

		//executor.executeScript("window.scroll(0,700)", "");
		//Thread.sleep(3000);
		//executor.executeScript("window.scroll(0,-700)", "");

		executor.executeScript("window.scroll(0,document.body.scrollHeight)", "");
		Thread.sleep(3000);
		executor.executeScript("window.scroll(0,0)", "");
	}

}
