package login;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;

public class JourneyDetails {

	private WebDriver driver;
	//fluent wait
	//Wait wait = new FluentWait(driver).withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofSeconds(30))
           // .ignoring(NoSuchElementException.class);

	@FindBy(xpath = "//p[normalize-space()='Round trip']")
	private WebElement roundTrip;

	@FindBy(xpath = "(//input[@placeholder='Any worldwide city or airport'])[1]")
	private WebElement srcFind;

	@FindBy(xpath = "(//input[@placeholder='Any worldwide city or airport'])[1]")
	private WebElement srcPlace;

	@FindBy(xpath = "(//input[@placeholder='Any worldwide city or airport'])[2])")
	private WebElement destFind;

	@FindBy(xpath = "(//input[@placeholder='Any worldwide city or airport'])[2])")
	private WebElement destPlace;

	// calendar
	@FindBy(xpath =	"//body//div[@id='root']//div//div//div//div//div//div//div//div//div//div//div//button[1]//div[1]") 
	private WebElement fromDateicker;
	
	@FindBy(xpath =	"(//div[contains(text(),'28')])[2]") 
	private WebElement fromDate;

	@FindBy(xpath =	"//body//div[@id='root']//div//div//div//div//div//div//div//div//div//div//button[2]") 
	private WebElement toDateicker; 
	
	@FindBy(xpath =	"//div[@aria-label='Sat Dec 25 2021']//div//div[contains(text(),'25')]") 
	private WebElement toDate;
	
	@FindBy(xpath = "(//*[name()='g'][@fill='none'])[13]")//(//*[name()='path'][@fill='#FFF'])[8]")
	private WebElement next;
	
	// passenger
	@FindBy(xpath = "(//div[@class='col flex flex-middle']//div[1]//select[1]")
	private WebElement Adults;

	@FindBy(xpath = "//div[@class='col flex flex-middle']//div[3]//select[1]")
	private WebElement Children;

	@FindBy(xpath = "//div[@class='col flex flex-middle']//div[5]//select[1]")
	private WebElement Infants;

	@FindBy(xpath = "//button[normalize-space()='Search flights']")
	private WebElement SearchFlights;

	public void roundtrip() {
		roundTrip.click();
	}

//	public WebElement srcTextTab() 
//	{
//		return srcFind;
//	}
//	
//	public void SrcPlace() throws IOException
//	{
//		List<WebElement> srcNames = driver.findElements(srcPlaces);
//		for(int i=0;i<srcNames.size();i++)
//		{
//			String srcName = srcNames.get(i).getText();
//			String[] sepName = srcName.split(",");
//			String actName = sepName[0].toLowerCase();
//			if(actName.contains(ic.source().toLowerCase()))
//			{
//				srcNames.get(i).click();
//			}
//			
//		}
//	}

	// calendar method
	
	public void fromDate() throws InterruptedException {
		
		fromDateicker.click();
		Thread.sleep(2000);
		fromDate.click();
		Thread.sleep(2000);
		//driver.switchTo().defaultContent();
		//Thread.sleep(2000);
		
		//to
		next.click();
		toDate.click();
		
	}
	
public void toDate() throws InterruptedException {
		
		toDateicker.click();
		Thread.sleep(2000);
		next.click();
		toDate.click();
		Thread.sleep(2000);
		//driver.switchTo().defaultContent();
		Thread.sleep(2000);
	}

	public void defaultHomePage() throws InterruptedException {
		
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
	}
	// passenger

	public void adult(String adultpassenger) {
		//Adults.click();
		Select adults = new Select(driver.findElement(By.xpath("//div[@class='col flex flex-middle']//div[1]//select[1]")));
		//Select adults = new Select(Adults);
		adults.selectByVisibleText(adultpassenger);
	}

	public void children(String kidpassenger) {
		//Children.click();
		Select childrens = new Select(Children);
		childrens.selectByVisibleText(kidpassenger);
	}

	public void infant(String babypassenger) {
		//Infants.click();
		Select infant = new Select(Infants);
		infant.selectByVisibleText(babypassenger);
	}

	public void flightSearch() {
		SearchFlights.click();
	}

	/* ........................Source............................... */

	public JourneyDetails(WebDriver driver) {
		this.driver = driver;
		AjaxElementLocatorFactory afdriver = new AjaxElementLocatorFactory(driver, 20);
		PageFactory.initElements(afdriver, this);
	}

	public void SelectSource(String sourcePlace) throws InterruptedException {
		String fromJour = "Chennai, IN - Chennai Airport (MAA)";

		WebElement textbox = driver.findElement(By.xpath("(//input[@placeholder='Any worldwide city or airport'])[1]"));
		textbox.sendKeys(sourcePlace);
		Thread.sleep(3000);
		List<WebElement> options = driver
				.findElements(By.xpath("//*[normalize-space(text())='Chennai, IN - Chennai Airport (MAA)']"));// *[normalize-space(text())='Mumbai,
																												// IN -
																												// Chatrapati
																												// Shivaji
																												// Airport
																												// (BOM)']

		// System.out.println("Number of elements:" + options.size());
		int count = 0;
		for (WebElement ele : options) {

			String currentoption = ele.getText();
			ele.click();
//		System.out.println(currentoption);
//		if (currentoption.contains(fromJour)) {
//			ele.click();
//			count++;
//			break;
//		}else {
//			System.out.println("element not clicked...");
//		}
//	}
			if (count != 0) {
				System.out.println(options + "has been selected...");
			} else {
				System.out.println("not been detected");
			}
		}
	}
	/* ........................destination............................... */

	public void SelectDestination(String destinationPlace) throws InterruptedException {

		String toplace = "Mumbai, IN - Chatrapati Shivaji Airport (BOM)";

		WebElement textbox = driver.findElement(By.xpath("(//input[@placeholder='Any worldwide city or airport'])[2]"));
		textbox.sendKeys(destinationPlace);
		Thread.sleep(3000);
		List<WebElement> options = driver
				.findElements(By.xpath("//*[normalize-space(text())='Mumbai, IN - Chatrapati Shivaji Airport (BOM)']"));// *[normalize-space(text())='Suggestions']/li

		// System.out.println("Number of elements:" + options.size());
		int count = 0;
		for (WebElement element : options) {

			String currentselection = element.getText();
			element.click();
			System.out.println(currentselection);
//			if (currentselection.contains(toplace)) {
//				element.click();
//				count++;
//				break;
//			}else {
//				System.out.println("element not clicked...");
//			}
//		}
			if (count != 0) {
				System.out.println(options + "has been selected...");
			} else {
				System.out.println("not been detected");
			}
		}
		/*----------------------------------------------------------------*/

	}
}
