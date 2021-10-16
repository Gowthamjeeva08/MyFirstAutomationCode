package login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class loginCleartrip {

	private WebDriver driver;
	
	@FindBy(xpath="//p[text()='Your trips']/parent::div")
	private WebElement YourTrip;
	
	@FindBy(xpath="//button[text()='Sign in']/parent::div")
	private WebElement signin;
	
	@FindBy(xpath="//input[@placeholder='Email address']")
	private WebElement email;
	
	@FindBy(xpath="//input[@data-testid='password']")
	private WebElement password;
	
	@FindBy(xpath="//span[text()='Sign in']/parent::button")
	private WebElement submit;
	
	//constructor method
	public loginCleartrip(WebDriver driver) {
		
		this.driver=driver;
		AjaxElementLocatorFactory afdriver=new AjaxElementLocatorFactory(driver,20);
		PageFactory.initElements(afdriver, this);
	}
	
	//operational methods
	


	public void clickYourtrip ()
	{
		YourTrip.click();
	}
	
	public void clickonSignin()
	{
		signin.click();
	}
	
	public void SetEmailID(String value)
	{
		email.sendKeys(value);
	}
	
	public void Setpassword(String value)
	{
		password.sendKeys(value);
	}
	
	public void ClickonSubmit()
	{
		submit.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
