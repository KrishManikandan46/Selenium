package f1_TestCases;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import f4_POMframework.T11_WindowsPOM;
import io.github.bonigarcia.wdm.WebDriverManager;

public class T11_Windows {

	@Test
	public void windows() {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.leafground.com/window.xhtml");

		PageFactory.initElements(driver, T11_WindowsPOM.class);

		/*T11_WindowsPOM.openNewWindow.click();

		Set<String> windows = driver.getWindowHandles();
		Iterator<String> iterator = windows.iterator();
		String parentWindow = iterator.next();
		String childWindow = iterator.next();

		driver.switchTo().window(childWindow);
		T11_WindowsPOM.message.sendKeys("Hi...");
		driver.close();*/

		//driver.switchTo().window(parentWindow);

		T11_WindowsPOM.findNoOfWindows.click();
		int size = driver.getWindowHandles().size();
		System.out.println("There are "+ size +" number of opened windows");

		Set<String> windows = driver.getWindowHandles();
		Iterator<String> iterator = windows.iterator();
		String parentWindow = iterator.next();
		//String childWindow = iterator.next();

		for (String allWindows : windows) {
			if (!allWindows.equals(parentWindow)) {
				driver.switchTo().window(allWindows);
				driver.close();
			}
		}
	}
}
