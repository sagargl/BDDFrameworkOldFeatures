//package StepDefinition;
//
//import java.util.List;
//
//import org.junit.Assert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//
//import cucumber.api.DataTable;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class DealStepderinition_DataTables {
//	
//	WebDriver driver;
//	
//	@Given("^User is already on Login Page$")
//	public void user_is_already_on_Login_Page() throws Throwable {
//		System.setProperty("webdriver.chrome.driver", "./ExternalJars/chromedriver.exe");
//		driver=new ChromeDriver();
//		driver.get("https://ui.cogmento.com/");
//		driver.manage().window().maximize();
//
//	    	}
//
//	@When("^Title of the Login Page is Cogmento CRM$")
//	public void title_of_the_Login_Page_is_Cogmento_CRM() throws Throwable {
//		String title=driver.getTitle();
//		Assert.assertEquals("Cogmento CRM", title);
//
//	    	}
//
//	@Then("^User Enters username and password$")
//	public void user_Enters_username_and_password(DataTable Cred) throws Throwable {
//		List<List<String>> data1=Cred.raw();
//		
//		driver.findElement(By.name("email")).sendKeys(data1.get(0).get(0));
//		driver.findElement(By.name("password")).sendKeys(data1.get(0).get(1));
//	    }
//
//	@Then("^User Clicks on Login Button$")
//	public void user_Clicks_on_Login_Button() throws Throwable {
//		driver.findElement(By.xpath("//div[contains(text(),'Login')]")).click();
//		
//	    	}
//
//	@Then("^User is on Home Page$")
//	public void user_is_on_Home_Page() throws Throwable {
//		 System.out.println("User is in home page");
//	    	}
//
//	@Then("^user moves to new deal page$")
//	public void user_moves_to_new_deal_page() throws Throwable {
//		
//		Actions act=new Actions(driver);
//		act.moveToElement(driver.findElement(By.xpath("//*[@id=\"main-nav\"]/div[5]/a/i"))).build().perform();
//		driver.findElement(By.xpath("//*[@id=\"main-nav\"]/div[5]/button/i")).click();
//				
//				
//	    	}
//
//	@Then("^user enters deal details$")
//	public void user_enters_deal_details(DataTable Creditianls) throws Throwable {
//		List<List<String>>data=Creditianls.raw();
//		driver.findElement(By.xpath("//input[@name='title']")).sendKeys(data.get(0).get(0));
//		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys(data.get(0).get(1));
//		driver.findElement(By.xpath("//i[@class='save icon']")).click();
//		
//	   	}
//	
//
//	@Then("^Close the browser$")
//	public void close_the_browser() throws Throwable {
//		driver.quit();
//	}
//
//
//
//}
