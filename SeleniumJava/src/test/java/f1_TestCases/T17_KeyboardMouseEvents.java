package f1_TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class T17_KeyboardMouseEvents {

	@Test
	public void moveToElement(){
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/");

		WebElement element = driver.findElement(By.xpath("//a[text()='Not Sure Where To Begin?']"));
		Actions actions = new Actions(driver);
		actions.moveToElement(element).perform();
	}

	@Test
	public void rightClick(){
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/");

		WebElement element = driver.findElement(By.id("search2"));
		Actions actions = new Actions(driver);
		actions.contextClick(element).perform();
	}

	@Test
	public void doubleClick(){
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/");

		WebElement element = driver.findElement(By.xpath("//h1[text()='Learn to Code']"));
		Actions actions = new Actions(driver);
		actions.doubleClick(element).perform();
	}

	@Test
	public void copyAndPaste(){
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://extendsclass.com/text-compare.html");

		WebElement copy = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[3]/div[2]/div/div[6]/div[1]/div/div/div/div[5]/div[1]/pre/span"));
		WebElement paste = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[4]/div[2]/div/div[6]/div[1]/div/div/div/div[5]/div[1]/pre/span"));
		Actions actions = new Actions(driver);

		actions.keyDown(copy, Keys.CONTROL).sendKeys("a").sendKeys("c").build().perform();
		actions.keyDown(paste, Keys.CONTROL).sendKeys("a").sendKeys("v").build().perform();
	}
}
