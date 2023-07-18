package f1_TestCases;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class T20_TakesScreenShot {

	@Test
	public void screenShot1() throws IOException, AWTException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");

		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File sourcefile = screenshot.getScreenshotAs(OutputType.FILE);
		File destinationfile = new File("C:\\Users\\91979\\Downloads\\OpenGoogle.png");
		FileHandler.copy(sourcefile, destinationfile);
		//or
		FileUtils.copyFile(sourcefile, destinationfile);

		Robot robot = new Robot();
		Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle rectangle = new Rectangle(dimension);
		BufferedImage image = robot.createScreenCapture(rectangle);
		File file = new File("C:\\Users\\91979\\Downloads\\OpenGoogle1.png");
		ImageIO.write(image, "png", file);
	}		
}
