package StepDefinition;

import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

//Map-> To parmaterize the test case for the particular step we have to use maps. whereas in data table it can't. It allow single set of data
// Also in the reports it will display the test data column header and values

public class DealStepDefinition_Map {
	WebDriver driver;
	
	@Given("^User is already on Login Page$")
	public void user_is_already_on_Login_Page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./ExternalJars/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://ui.cogmento.com/");
		driver.manage().window().maximize();

	}

	@When("^Title of the Login Page is Cogmento CRM$")
	public void title_of_the_Login_Page_is_Cogmento_CRM() throws Throwable {
		String title=driver.getTitle();
		Assert.assertEquals("Cogmento CRM", title);
	}

	@Then("^User Enters username and password$")
	public void user_Enters_username_and_password(DataTable creditianls) throws Throwable {
		for (Map<String, String>data: creditianls.asMaps(String.class, String.class)) {
		driver.findElement(By.name("email")).sendKeys(data.get("username"));
		driver.findElement(By.name("password")).sendKeys(data.get("password"));

				}
	}

	@Then("^User Clicks on Login Button$")
	public void user_Clicks_on_Login_Button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^User is on Home Page$")
	public void user_is_on_Home_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^user moves to new deal page$")
	public void user_moves_to_new_deal_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^user enters deal details$")
	public void user_enters_deal_details(DataTable dealdata) throws Throwable {
		for (Map<String, String>data1: dealdata.asMaps(String.class, String.class))
		{
		driver.findElement(By.xpath("//input[@name='title']")).sendKeys(data1.get("title"));
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys(data1.get("description"));
		driver.findElement(By.xpath("//i[@class='save icon']")).click();
		
	}
	}

	@Then("^Close the browser$")
	public void close_the_browser() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}



}
