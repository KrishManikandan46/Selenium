package f4_POMframework;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class T05_HyperLinksPOM {

	@FindBy(how = How.LINK_TEXT,using = "Go to Dashboard")
	public static WebElement goToDashboard;

	@FindBy(how = How.PARTIAL_LINK_TEXT,using = "Find the URL")
	public static WebElement findMyDestination;

	@FindBy(how = How.LINK_TEXT,using = "Broken?")
	public static WebElement brokenLink;

	@FindBy(how = How.TAG_NAME,using = "a")
	public static List<WebElement> countLinks;

	@FindBy(how = How.XPATH,using = "//*[@id='j_idt87']/div/div/div")
	public static List<WebElement> countLayoutLinks;

}
