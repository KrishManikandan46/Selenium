package f1_TestCases;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class T16_DownloadUpload {

	@Test
	public void download() {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/upload-download");

		WebElement download = driver.findElement(By.id("downloadButton"));
		download.click();

		File file = new File("C:\\Users\\91979\\Downloads");
		File[] allfiles = file.listFiles();
		for (File f : allfiles) {
			if (f.getName().equals("New Text Document.txt")) {
				System.out.println("There is File");
				break;
			}
		}
	}

	@Test
	public void upload() throws AWTException, InterruptedException {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/upload-download");

		WebElement upload = driver.findElement(By.id("uploadFile"));
		Actions actions = new Actions(driver);
		actions.click(upload).perform();

		StringSelection selection = new StringSelection("C:\\Users\\91979\\Downloads\\sampleFile.jpeg");	
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);

		Thread.sleep(3000);

		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}
}
