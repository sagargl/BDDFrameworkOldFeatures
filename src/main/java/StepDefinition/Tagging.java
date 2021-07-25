//package StepDefinition;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.When;
//
//public class Tagging {
//	WebDriver driver;
//	
//	@Given("^This is a valid login test$")
//	public void this_is_a_valid_login_test() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "./ExternalJars/chromedriver.exe");
//		driver=new ChromeDriver();
//		driver.get("https://ui.cogmento.com/");
//		driver.manage().window().maximize();
//
//		System.out.println("Vlid login test");
//	   	}
//	
//
//	@Given("^This is a invalid login test$")
//	public void this_is_a_invalid_login_test() throws Throwable {
//	    System.out.println("Invalid login test");
//	    
//	    
//	}
//
//	@Given("^Titles of the Login Page is Cogmento CRM$")
//	public void Title_of_the_login_page()
//	{
//		System.out.println("Title of the login page is cogmento crm");
//	}
//	
//	@Given("^User Clicks on Logins Button$")
//	public void User_Clicks_On_LoginButton()
//	{
//		System.out.println("User clicks on login button");
//	}
//	
//	@When("^User is on Homes Page$")
//	public  void User_Is_On_HomePage()
//	{
//		System.out.println("User is on home page");
//
//	}
//
//}
