package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SearchFlight {

	public static WebDriver driver;
	SoftAssert softAssert = new SoftAssert();
	
	@Given("Url for Cleartrip Application")
	public void Url_for_Cleartrip_Application() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.cleartrip.com/flights");
	}

	@When("Url is validated")
	public void Url_is_validated() {
		System.out.println("Hello");
	}
	
	@And("Select trip as RoundTrip")
		public void Select_trip_as_RoundTrip() {
			driver.findElement(By.xpath("//input[@id='RoundTrip']")).click();
		}
	
	
	@And("Select Source")
		public void Select_Source() {
			WebElement source = driver.findElement(By.xpath("//input[@id='FromTag']"));
			source.sendKeys("Coimbatore");
			source.sendKeys(Keys.ARROW_DOWN);
			source.sendKeys(Keys.ENTER);
		}
	
	   
	@Then("select Destination")
		public void select_Destination() {
		WebElement destination = driver.findElement(By.xpath("//input[@id='ToTag']"));
		destination.sendKeys("Bangalore");
		destination.sendKeys(Keys.ARROW_DOWN);
		destination.sendKeys(Keys.ENTER);	
		}
	
	    
	@Then("select Depart Date")
		public void select_Depart_Date() {
			driver.findElement(By.xpath("//input[@id='DepartDate']")).sendKeys("Sat, 6 Feb, 2021");
		}
	
	    @And("Select Return date")
	    public void Select_Return_date(){
	    	driver.findElement(By.xpath("//input[@id='ReturnDate']")).sendKeys("Sun, 7 Feb, 2021");
	    }
	    
	    @And("Select Number of Adults")
	    public void Select_Number_of_Adults() {
	    	WebElement NoOfAdults = driver.findElement(By.xpath("//select[@id='Adults']"));
	    	NoOfAdults.click();
	    	NoOfAdults.sendKeys(Keys.ARROW_DOWN);
	    }
	    
	    @And("Click on Search Flight")
	    public void Click_on_Search_Flight() {
	    	driver.findElement(By.xpath("//input[@id='SearchBtn']"));
	    }
	    @Then("Close the Application")
	    public void Close_the_Application() {
	    	driver.quit();
	    }

	
}
