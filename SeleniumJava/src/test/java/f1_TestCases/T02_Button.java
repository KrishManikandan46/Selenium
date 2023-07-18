package f1_TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import f4_POMframework.T02_ButtonPOM;
import io.github.bonigarcia.wdm.WebDriverManager;

public class T02_Button {

	@Test
	public void button() {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.leafground.com/button.xhtml");

		PageFactory.initElements(driver, T02_ButtonPOM.class);

		T02_ButtonPOM.clickAndConfirmTitle.click();
		String title = driver.getTitle();
		if (title.equalsIgnoreCase("dashboard")) {
			System.out.println("correct title");
		} else {
			System.out.println("incorrect title");
		}

		driver.navigate().back();

		int x = T02_ButtonPOM.findPositionofButton.getLocation().getX();
		System.out.println("Position of X : "+x);
		int y = T02_ButtonPOM.findPositionofButton.getLocation().getY();
		System.out.println("Position of Y : "+y);

		String color = T02_ButtonPOM.findButtonColor.getCssValue("color");
		String c = Color.fromString(color).asRgba();
		System.out.println(c);

		int height = T02_ButtonPOM.findHeightAndWidth.getSize().getHeight();
		System.out.println("Height of the button : "+height);
		int width = T02_ButtonPOM.findHeightAndWidth.getSize().getWidth();
		System.out.println("Width of the button : "+width);

		int size = T02_ButtonPOM.howManyButtons.size();
		System.out.println("There are "+ size +" rounded buttons");
	}
}
