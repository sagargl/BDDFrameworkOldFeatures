//package StepDefinition;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import cucumber.api.PendingException;
//import cucumber.api.java.After;
//import cucumber.api.java.Before;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class Hooks {
//	
//
//
//		WebDriver driver;
//		
//		@Before
//		public void setUP(){
//			System.out.println("launch chrome browser");
//			System.setProperty("webdriver.chrome.driver", "./ExternalJars/chromedriver.exe");
//			driver=new ChromeDriver();
//			
//		System.out.println("Enter URL for Free CRM APP");
//	}
//		@After
//		public void tearDown()
//		{
//			System.out.println("Close the browser");
//		}
//		
//		@Given("^user is on deal page$")
//		public void user_is_on_deal_page() throws Throwable {
//		    System.out.println("User is on deals page");	
//		    }
//
//		@When("^user fills the deals form$")
//		public void user_fills_the_deals_form() throws Throwable {
//		    System.out.println("User fills the deal form");
//		}
//
//		@Then("^deal is created$")
//		public void deal_is_created() throws Throwable {
//		    System.out.println("User creates the deal");
//		}
//
//		@Given("^user is on contact page$")
//		public void user_is_on_contact_page() throws Throwable {
//		    System.out.println("User is on contact page");
//		}
//
//		@When("^user fills the contact form$")
//		public void user_fills_the_contact_form() throws Throwable {
//		    System.out.println("User fills the contact form");
//		}
//
//		@Then("^contact is created$")
//		public void contact_is_created() throws Throwable {
//		    System.out.println("User creates the contact");
//		}
//}
//
