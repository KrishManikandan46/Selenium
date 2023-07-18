package f1_TestCases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class T13_Interactions {

	@Test
	public void draggable() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/draggable/");

		driver.switchTo().frame(0);

		WebElement drag = driver.findElement(By.id("draggable"));
		Actions actions = new Actions(driver);
		actions.dragAndDropBy(drag, 100, 100).perform();
	}

	@Test
	public void droppable() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");

		driver.switchTo().frame(0);

		WebElement drag = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("droppable"));
		Actions actions = new Actions(driver);
		actions.dragAndDrop(drag, drop).perform();
	}

	@Test
	public void resizable() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/resizable/");

		driver.switchTo().frame(0);

		WebElement resizable = driver.findElement(By.xpath("//div[@id='resizable']/div[3]"));
		Actions actions = new Actions(driver);
		actions.clickAndHold(resizable).moveByOffset(200, 0).perform();
	}

	@Test
	public void selectable() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/selectable/");

		driver.switchTo().frame(0);

		List<WebElement> selectable = driver.findElements(By.xpath("//ol[@id='selectable']/li"));
		WebElement item1 = selectable.get(0);
		WebElement item3 = selectable.get(2);
		WebElement item5 = selectable.get(4);
		WebElement item7 = selectable.get(6);
		Actions actions = new Actions(driver);
		actions.keyDown(Keys.CONTROL).click(item1).build().perform();
		actions.keyDown(Keys.CONTROL).click(item3).build().perform();
		actions.keyDown(Keys.CONTROL).click(item5).build().perform();
		actions.keyDown(Keys.CONTROL).click(item7).build().perform();
		actions.keyDown(Keys.CONTROL).click(item1).build().perform();
	}

	@Test
	public void sortable() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/sortable/");

		driver.switchTo().frame(0);

		List<WebElement> sortable = driver.findElements(By.xpath("//ul[@id='sortable']/li"));
		//WebElement item1 = sortable.get(0);
		WebElement item2 = sortable.get(1);
		//WebElement item3 = sortable.get(2);
		WebElement item4 = sortable.get(3);
		Actions actions = new Actions(driver);
		actions.clickAndHold(item4).moveToElement(item2).release(item2).build().perform();

	}
}
