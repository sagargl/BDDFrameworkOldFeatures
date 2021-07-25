package StepDefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Testclass {
	
	@Given("^user enters to the amazon app$")
	public void user_enters_to_the_amazon_app() throws Throwable {
		System.out.println("Login to the app");
	   	}

	@When("^search the \"([^\"]*)\" and price (\\d+)$")
	public void search_the_and_price(String arg1, int arg2) throws Throwable {
		
	    	}

	@Then("^\"([^\"]*)\" should be displayed$")
	public void should_be_displayed(String arg1) throws Throwable {
	    	}





@Then("^user enters \"([^\"]*)\" and \"([^\"]*)\"$")
public void user_enters_and(String arg1, String arg2) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}
}