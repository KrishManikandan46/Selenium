package f1_TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import f4_POMframework.T05_HyperLinksPOM;
import io.github.bonigarcia.wdm.WebDriverManager;

public class T05_HyperLinks {

	@Test
	public void hyperLinks() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.leafground.com/link.xhtml;jsessionid=node02ezkpyqrac04er7qwhssisau315206.node0");

		PageFactory.initElements(driver, T05_HyperLinksPOM.class);

		T05_HyperLinksPOM.goToDashboard.click();
		driver.navigate().back();

		String link = T05_HyperLinksPOM.findMyDestination.getAttribute("href");
		System.out.println(link);

		T05_HyperLinksPOM.brokenLink.click();
		String title = driver.getTitle();
		if (title.contains("404")) {
			System.out.println("broken link");
		} else {
			System.out.println("not broken link");
		}
		driver.navigate().back();

		int size1 = T05_HyperLinksPOM.countLinks.size();
		System.out.println("There are "+size1+" Links in this page");

		int size2 = T05_HyperLinksPOM.countLayoutLinks.size();
		System.out.println("There are "+size2+" Layoutlinks");
	}


	@Test
	public void brokenImage() {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/broken");

		WebElement brokenImage = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/img[2]"));
		String broken = brokenImage.getAttribute("naturalWidth");
		if (broken.contains("0")) {
			System.out.println("brokenImage");
		} else {
			System.out.println("not brokenImage");
		}
	}

}
