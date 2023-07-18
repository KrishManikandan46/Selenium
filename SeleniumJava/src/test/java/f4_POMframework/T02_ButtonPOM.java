package f4_POMframework;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class T02_ButtonPOM {

	@FindBy(how = How.XPATH,using = "//span[text()='Click']")
	public static WebElement clickAndConfirmTitle;

	@FindBy(how = How.XPATH,using = "//button[@id='j_idt88:j_idt94']/span[2]")
	public static WebElement findPositionofButton;

	@FindBy(how = How.XPATH,using = "//span[text()='Save']")
	public static WebElement findButtonColor;

	@FindBy(how = How.XPATH,using = "//button[@id='j_idt88:j_idt98']/span[2]")
	public static WebElement findHeightAndWidth;

	@FindBy(how = How.XPATH,using = "//div/div[2]/div[4]/button")
	public static List<WebElement> howManyButtons;

}
