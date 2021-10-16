package login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class Flights {

	private WebDriver driver;

	@FindBy(xpath = "//p[normalize-space()='Non-stop']")
	private WebElement checkNonStop;

	@FindBy(xpath = "(//p[contains(text(),'Evening')])[1]")
	private WebElement srcTime;

	@FindBy(xpath = "(//p[contains(text(),'Night')])[2]")
	private WebElement rtnTime;

	@FindBy(xpath = "//button[normalize-space()='Book']")
	private WebElement bookButton;

	public Flights(WebDriver driver) {
		this.driver = driver;
		AjaxElementLocatorFactory afdriver = new AjaxElementLocatorFactory(driver, 20);
		PageFactory.initElements(afdriver, this);
	}

	///////////////// operational methods Starts////////////////

	public void CheckBoxNonStop() {
		checkNonStop.click();
	}

	public void SourceTime() {
		srcTime.click();
	}

	public void ReturnTime() {
		rtnTime.click();
	}

	public void ClickBook() {
		bookButton.click();
	}

	

}