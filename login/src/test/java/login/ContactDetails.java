package login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class ContactDetails {

	private WebDriver driver;

	@FindBy(xpath = "(//*[name()='circle'])[2]") //"(//*[name()='circle'])[1]")
	private WebElement refundRadioButton;

	@FindBy(xpath = "//button[text()='Add'])[2]")
	private WebElement baggageProtect;
/*	//h3[contains(text(),'baggage protection')]//parent::div//following::button[text()='Add'] */
	

	@FindBy(xpath = "//div[@data-name='BAGGAGE_INSURANCE']//div//div//div//div//div//label//div//span")
	private WebElement termsConditions;

	@FindBy(xpath = "//button[normalize-space()='Continue']")
	private WebElement tripContinueButton;

	@FindBy(xpath = "//input[@placeholder='Mobile number']") // 1100020111
	private WebElement mobileNumber;

	@FindBy(xpath = "(//div[@class='d-inline-block'])[2]")
	private WebElement continueContact;

	@FindBy(xpath = "//button[normalize-space()='Skip this step']")
	private WebElement continueAddon;

//	//passenger Details
//	@FindBy(xpath = "(//input[@placeholder='First name'])[1]")
//	private WebElement FirstPassangerName;
//
//	@FindBy(xpath = "(//input[@placeholder='Last name'])[1]")
//	private WebElement FirstPassangerLastName;
//
//	@FindBy(xpath = "(//div[contains(text(),'Gender')])[1]")
//	private WebElement FirstPassangerGender;
//
//	@FindBy(xpath = "(//li[normalize-space()='Male'])[1]")
//	private WebElement firstGenderSelect;
//	

	public ContactDetails(WebDriver driver) {
		this.driver = driver;
		AjaxElementLocatorFactory afdriver = new AjaxElementLocatorFactory(driver, 20);
		PageFactory.initElements(afdriver, this);
	}

	///////////////// operational methods Starts////////////////

	// Fare and refund policy
	public void RefundPolicy() {
		refundRadioButton.click();
	}

	// baggage protection
	public void BaggageProtection() {
		baggageProtect.click();
	}

	// terms & conditions
	public void TermsConditions() {
		termsConditions.click();
	}

	// press continue
	public void TripContinue() {
		tripContinueButton.click();
	}

	// continue add-on
	public void ContinueAddon() {
		continueAddon.click();
	}

	// enter mobile number
	public void Mobilenumber() {
		mobileNumber.sendKeys("1100020100");
	}

	// continue contact
	public void ContactContinue() {
		continueContact.click();
	}

}
