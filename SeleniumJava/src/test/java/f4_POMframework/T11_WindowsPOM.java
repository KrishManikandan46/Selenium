package f4_POMframework;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class T11_WindowsPOM {

	/*@FindBy(how = How.XPATH,using = "//span[text()='Open']")
	public static WebElement openNewWindow;
	@FindBy(how = How.ID,using = "message")
	public static WebElement message;*/

	@FindBy(how = How.XPATH,using = "//span[text()='Open Multiple']")
	public static WebElement findNoOfWindows;

}
