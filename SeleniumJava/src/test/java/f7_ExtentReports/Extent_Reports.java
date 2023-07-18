package f7_ExtentReports;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Extent_Reports {

	WebDriver driver;
	ExtentReports extent;
	ExtentSparkReporter spark;
	ExtentTest test;

	@BeforeSuite
	public void openBrowser() {
		extent = new ExtentReports();
		spark = new ExtentSparkReporter("target/Spark.html");
		extent.attachReporter(spark);
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	@AfterSuite
	public void closeBrowser() {
		driver.close();
		extent.flush();
	}

	@Test
	public void openGoogle() throws IOException {
		test = extent.createTest("Verify Google Title");
		test.log(Status.INFO, "Navigating to Google");
		driver.get("https://www.google.com/");
		String title = driver.getTitle();
		if (title.contains("Google")) {
			test.log(Status.PASS, "Actual title and expected title are equal");
		}else {
			test.log(Status.FAIL, "Actual title and expected title are not equal");
			TakesScreenshot screenshot = (TakesScreenshot) driver;
			File sourcefile = screenshot.getScreenshotAs(OutputType.FILE);
			File destinationfile = new File("openGoogle.png");
			FileHandler.copy(sourcefile, destinationfile);
			test.addScreenCaptureFromPath("openGoogle.png");
		}
	}

	@Test
	public void openBing() throws IOException {
		test = extent.createTest("Verify Bing Title");
		test.log(Status.INFO, "Navigating to Bing");
		driver.get("https://www.bing.com/");
		String title = driver.getTitle();
		if (title.contains("Bing")) {
			test.log(Status.PASS, "Actual title and expected title are equal");
		}else {
			test.log(Status.FAIL, "Actual title and expected title are not equal");
			TakesScreenshot screenshot = (TakesScreenshot) driver;
			File sourcefile = screenshot.getScreenshotAs(OutputType.FILE);
			File destinationfile = new File("bing.png");
			FileHandler.copy(sourcefile, destinationfile);
			test.addScreenCaptureFromPath("bing.png");
		}
	}

	@Test
	public void openYahoo() throws IOException {
		test = extent.createTest("Verify Yahoo Title");
		test.log(Status.INFO, "Navigating to Yahoo");
		driver.get("https://in.search.yahoo.com/?fr2=inr");
		String title = driver.getTitle();
		if (title.contains("bing")) {
			test.log(Status.PASS, "Actual title and expected title are equal");
		}else {
			test.log(Status.FAIL, "Actual title and expected title  not equal");
			TakesScreenshot screenshot = (TakesScreenshot) driver;
			File sourcefile = screenshot.getScreenshotAs(OutputType.FILE);
			File destinationfile = new File("yahoo.png");
			FileHandler.copy(sourcefile, destinationfile);
			//test.addScreenCaptureFromPath("C:\\Users\\91979\\eclipse-workspace\\SeleniumJava\\Yahoo.png");
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath("C:\\Users\\91979\\eclipse-workspace\\SeleniumJava\\Yahoo.png").build());
		}
	}

}
