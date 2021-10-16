package login;

import java.util.Set;
import java.util.Iterator;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class loginRunner {

	public static void main(String[] args) throws Exception {
		// testcasenaani08@gmail.com";
		// String password = "Test@12345";

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
//		WebDriverManager.edgedriver().setup();
//		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
      
	
		driver.get("https://www.cleartrip.com");
		Thread.sleep(5000);
		loginCleartrip pobj = new loginCleartrip(driver);
		JourneyDetails jdobj = new JourneyDetails(driver);
		Flights flightobj =new Flights(driver);
		ContactDetails cdobj =new ContactDetails(driver);
		PassangerDetails pdobj=new PassangerDetails(driver);
		
		pobj.clickYourtrip();
		pobj.clickonSignin();

		Thread.sleep(5000);
		pobj.SetEmailID("testcasenaani08@gmail.com"); //usernamme
		Thread.sleep(2000);

		pobj.Setpassword("Test@12345"); //password
		Thread.sleep(2000);

		pobj.ClickonSubmit();
		Thread.sleep(5000);
		
		jdobj.roundtrip();
		Thread.sleep(2000);

		jdobj.SelectSource("Chennai"); //source
		jdobj.defaultHomePage();
		jdobj.SelectDestination("Mumbai"); //destination
		Thread.sleep(3000);
		
		//calendar
		jdobj.fromDate();
	//	jdobj.toDate();
		
		//No. of Passenger
		jdobj.adult("2");
		jdobj.children("1");
		jdobj.infant("1");
		Thread.sleep(2000);
		jdobj.flightSearch();
		
		
		//flight booking
		Thread.sleep(10000);
		flightobj.CheckBoxNonStop();
		flightobj.SourceTime();
	//	flightobj.ReturnTime();
		Thread.sleep(2000);
		
		// Open new window within the main window
		flightobj.ClickBook();
		
		//Get handles of the windows
        String mainWindowHandle = driver.getWindowHandle();
        Set<String> allWindowHandles = driver.getWindowHandles();
        Iterator<String> iterator = allWindowHandles.iterator();
        
     // Here we will check if child window has other child windows and will fetch the heading of the child window
        while (iterator.hasNext()) {
            String ChildWindow = iterator.next();
                if (!mainWindowHandle.equalsIgnoreCase(ChildWindow)) {
                driver.switchTo().window(ChildWindow);
              //  WebElement text = driver.findElement(By.id("sampleHeading"));
                //System.out.println("Heading of child window is " + text.getText());
            }
        }
		
		Thread.sleep(9000);
		JavascriptExecutor js = (JavascriptExecutor) driver; // scroll down
		js.executeScript("window.scrollBy(0,500)", "");
		
		
		//travel confirmation
		cdobj.RefundPolicy();
		//JavascriptExecutor js = (JavascriptExecutor) driver; // scroll down
		js.executeScript("window.scrollBy(0,700)", "");
		cdobj.BaggageProtection();
		cdobj.TermsConditions();
		js.executeScript("window.scrollBy(0,600)", "");
		Thread.sleep(3000);
		cdobj.TripContinue();
		Thread.sleep(2000);
		//cdobj.RefundPolicy(); // for some reason not recommended to use here
		cdobj.ContinueAddon();
		cdobj.Mobilenumber();
		cdobj.ContactContinue();
		Thread.sleep(2000);
		
		//passenger Details 1st passanger
		pdobj.FirstName();
		pdobj.FirstLastName();
		pdobj.FirstGender();
		pdobj.FirstNationality();
		pdobj.FirstDay();
		pdobj.FirstMonth();
		pdobj.FirstYear();
		
		//2nd
		pdobj.SecondName();
		pdobj.SecondLastName();
		pdobj.SecondGender();
		pdobj.SecondNationality();
		pdobj.SecondDay();
		pdobj.SecondMonth();
		pdobj.SecondYear();
		
		//3rd
		pdobj.ThirdName();
		pdobj.ThirdLastName();
		pdobj.ThirdGender();
		pdobj.ThirdNationality();
		pdobj.ThirdDay();
		pdobj.ThirdMonth();
		pdobj.ThirdYear();
		
		//4th
		pdobj.FourthName();
		pdobj.FourthLastName();
		pdobj.FourthGender();
		pdobj.FourthNationality();
		pdobj.FourthDay();
		pdobj.FourthMonth();
		pdobj.FourthYear();
		
		
		//Continue Payment
		pdobj.PaymentContinueButton();
		
		
		

	}

}
