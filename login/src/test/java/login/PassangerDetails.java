package login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.Select;

public class PassangerDetails {

	private WebDriver driver;

	// 1st passenger Details
	@FindBy(xpath = "(//input[@placeholder='First name'])[1]")
	private WebElement FirstPassangerName;

	@FindBy(xpath = "(//input[@placeholder='Last name'])[1]")
	private WebElement FirstPassangerLastName;

	@FindBy(xpath = "(//div[contains(text(),'Gender')])[1]")
	private WebElement FirstPassangerGender;

	@FindBy(xpath = "(//li[normalize-space()='Male'])[1]")
	private WebElement firstGenderSelect;

	@FindBy(xpath = "(//div[contains(text(),'Nationality (e.g. India)')])[1]")
	private WebElement firstNationalityBox;
	
	@FindBy(xpath = "//input[@placeholder='Type here']")
	private WebElement firstNationalityText;
	
	@FindBy(xpath = "//li[normalize-space()='India']")
	private WebElement firstNationalityClick;

	// 1st //xpath need to find
	@FindBy(xpath = "//select[1]") // doubt
	private WebElement firstDate;

	@FindBy(xpath = "//select[2]")
	private WebElement firstMonth;

	@FindBy(xpath = "//select[3]")
	private WebElement firstYear;

	
	// 2ndpassenger Details
	@FindBy(xpath = "(//input[@placeholder='First name'])[2]")
	private WebElement secondPassangerName;

	@FindBy(xpath = "(//input[@placeholder='Last name'])[2]")
	private WebElement secondPassangerLastName;

	@FindBy(xpath = "(//div[contains(text(),'Gender')])[2]")
	private WebElement secondPassangerGender;

	@FindBy(xpath = "(//li[normalize-space()='Female'])[1]")
	private WebElement secondGenderSelect;

	@FindBy(xpath = "(//div[contains(text(),'Nationality (e.g. India)')])[2]")
	private WebElement secondNationalityBox;
	
	@FindBy(xpath = "(//input[@placeholder='Type here'])[1]")
	private WebElement secondNationalityText;
	
	@FindBy(xpath = "//li[normalize-space()='India']")
	private WebElement secondNationalityClick;

	@FindBy(xpath = "//div[3]//div[4]//div[2]//select[1]")
	private WebElement secondDate;

	@FindBy(xpath = "//div[3]//div[4]//div[3]//select[1]")
	private WebElement secondMonth;

	@FindBy(xpath = "//div[3]//div[4]//div[4]//select[1]")
	private WebElement secondYear;

	// 3rd passenger Details
	@FindBy(xpath = "(//input[@placeholder='First name'])[3]") //need to get element from this
	private WebElement thirdPassangerName;

	@FindBy(xpath = "(//input[@placeholder='Last name'])[3]")
	private WebElement thirdPassangerLastName;

	@FindBy(xpath = "(//div[contains(text(),'Gender')])[3]")
	private WebElement thirdPassangerGender;

	@FindBy(xpath = "(//li[normalize-space()='Male'])[1]")
	private WebElement thirdGenderSelect;

	@FindBy(xpath = "(//div[contains(text(),'Nationality (e.g. India)')])[3]")
	private WebElement thirdNationalityBox;
	
	@FindBy(xpath = "(//input[@placeholder='Type here'])[1]")
	private WebElement thirdNationalityText;
	
	@FindBy(xpath = "//li[normalize-space()='India']")
	private WebElement thirdNationalityClick;

	@FindBy(xpath = "//div[4]//div[4]//div[2]//select[1]")
	private WebElement thirdDate;

	@FindBy(xpath = "//div[4]//div[4]//div[3]//select[1]")
	private WebElement thirdMonth;

	@FindBy(xpath = "//div[4]//div[4]//div[4]//select[1]")
	private WebElement thirdYear;

	// 4th passenger Details
	@FindBy(xpath = "(//input[@placeholder='First name'])[4]")
	private WebElement fourthPassangerName;

	@FindBy(xpath = "(//input[@placeholder='Last name'])[4]")
	private WebElement fourthPassangerLastName;

	@FindBy(xpath = "(//div[contains(text(),'Gender')])[4]")
	private WebElement fourthPassangerGender;

	@FindBy(xpath = "(//li[normalize-space()='Female'])[1]")
	private WebElement fourthGenderSelect;

	@FindBy(xpath = "(//div[contains(text(),'Nationality (e.g. India)')])[4]")
	private WebElement fourthNationalityBox;
	
	@FindBy(xpath = "(//input[@placeholder='Type here'])[1]")
	private WebElement fourthNationalityText;
	
	@FindBy(xpath = "//li[normalize-space()='India']")
	private WebElement fourthNationalityClick;

	@FindBy(xpath = "//div[5]//div[4]//div[2]//select[1]")
	private WebElement fourthDate;

	@FindBy(xpath = "//div[5]//div[4]//div[3]//select[1]")
	private WebElement fourthMonth;

	@FindBy(xpath = "//div[5]//div[4]//div[4]//select[1]")
	private WebElement fourthYear;
	
	@FindBy(xpath = "//button[normalize-space()='Continue to payment']")
	private WebElement continuePayment;
	

///////////////// operational methods Starts////////////////

	public PassangerDetails(WebDriver driver) {
		this.driver = driver;
		AjaxElementLocatorFactory afdriver = new AjaxElementLocatorFactory(driver, 20);
		PageFactory.initElements(afdriver, this);
	}

	public void FirstName() {
		FirstPassangerName.sendKeys("Tommy");
	}
	
	public void FirstLastName() {
		FirstPassangerLastName.sendKeys("Oliver");
	}
	
	public void FirstGender() {
		FirstPassangerGender.click();
		firstGenderSelect.click();
	}
	
	public void FirstNationality() {
		firstNationalityBox.click();
		firstNationalityText.sendKeys("India");
		firstNationalityClick.click();
	}
	
	public void FirstDay() {
		Select firstDay = new Select(firstDate);
		firstDay.selectByVisibleText("22");
	}

	public void FirstMonth() {
		Select firstmonth = new Select(firstMonth);
		firstmonth.selectByVisibleText("Mar");
	}

	public void FirstYear() {
		Select firstyear = new Select(firstYear);
		firstyear.selectByVisibleText("1986");
	}
	
	//2nd
	public void SecondName() {
		secondPassangerName.sendKeys("Susan");
	}
	
	public void SecondLastName() {
		secondPassangerLastName.sendKeys("Tommy");
	}
	
	public void SecondGender() {
		secondPassangerGender.click();
		secondGenderSelect.click();
	}
	
	public void SecondNationality() {
		secondNationalityBox.click();
		secondNationalityText.sendKeys("India");
		secondNationalityClick.click();
	}
	
	public void SecondDay() {
		Select secondDay = new Select(secondDate);
		secondDay.selectByVisibleText("12");
	}

	public void SecondMonth() {
		Select secondmonth = new Select(secondMonth);
		secondmonth.selectByVisibleText("May");
	}

	public void SecondYear() {
		Select secondyear = new Select(secondYear);
		secondyear.selectByVisibleText("1989");
	}

	//3rd passenger
	public void ThirdName() {
		thirdPassangerName.sendKeys("shelby");
	}
	
	public void ThirdLastName() {
		thirdPassangerLastName.sendKeys("Tommy");
	}
	
	public void ThirdGender() {
		thirdPassangerGender.click();
		thirdGenderSelect.click();
	}
	
	public void ThirdNationality() {
		thirdNationalityBox.click();
		thirdNationalityText.sendKeys("India");
		thirdNationalityClick.click();
	}
	
	public void ThirdDay() {
		Select thirdday = new Select(thirdDate);
		thirdday.selectByVisibleText("21");
	}

	public void ThirdMonth() {
		Select thirdmonth = new Select(thirdMonth);
		thirdmonth.selectByVisibleText("Apr");
	}

	public void ThirdYear() {
		Select thirdyear = new Select(thirdYear);
		thirdyear.selectByVisibleText("2012");
	}
	
	//4th
	public void FourthName() {
		fourthPassangerName.sendKeys("Selena");
	}
	
	public void FourthLastName() {
		fourthPassangerLastName.sendKeys("Tommy");
	}
	
	public void FourthGender() {
		fourthPassangerGender.click();
		fourthGenderSelect.click();
	}
	
	public void FourthNationality() {
		fourthNationalityBox.click();
		fourthNationalityText.sendKeys("India");
		fourthNationalityClick.click();
	}
	
	public void FourthDay() {
		Select fourthDay = new Select(fourthDate);
		fourthDay.selectByVisibleText("15");
	}

	public void FourthMonth() {
		Select fourthmonth = new Select(fourthMonth);
		fourthmonth.selectByVisibleText("Jul");
	}

	public void FourthYear() {
		Select fourthyear = new Select(fourthYear);
		fourthyear.selectByVisibleText("2020");
	}
	
	
	// Continue Payment
	public void PaymentContinueButton() {
		continuePayment.click();
	}
}