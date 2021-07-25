//package StepDefinition;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.FindBy;
//
//import cucumber.api.PendingException;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//import junit.framework.Assert;
//
//public class loginstepdefinition_datadriven {
	
//	WebDriver driver;
//	
//		@Given("^User is already on Login Page$")
//	public void user_already_On_LoginPage()
//	{
//		System.setProperty("webdriver.chrome.driver", "./ExternalJars/chromedriver.exe");
//		driver=new ChromeDriver();
//		driver.get("https://ui.cogmento.com/");
//		driver.manage().window().maximize();
//}
//	
//	@When("^Title of the Login Page is Cogmento CRM$")
//	public void title_of_the_Login_Page_is_Cogmento_CRM() {
//		String title=driver.getTitle();
//		Assert.assertEquals("Cogmento CRM", title);
//		
//			}
//
//	@Then("^User Enters \"(.*)\" and \"(.*)\"$")
//	public void user_Enters_username_and_Password(String username, String password) {
//		
//		
//		driver.findElement(By.name("email")).sendKeys(username);
//		driver.findElement(By.name("password")).sendKeys(password);
//	   	}
//
//	@Then("^User Clicks on Login Button$")
//	public void user_Clicks_on_Login_Button(){
//		driver.findElement(By.xpath("//div[contains(text(),'Login')]")).click();	   
//	}
//
//	@Then("^User is on Home Page$")
//	public void user_is_on_Home_Page() {
//	   System.out.println("User is in home page");
//	}
//	
//	@Then ("^Close the browser$")
//	public void Close_the_browser() {
//		   System.out.println("User close the browser");
//		   driver.quit();
//		}
//		
//
//
//
//}
