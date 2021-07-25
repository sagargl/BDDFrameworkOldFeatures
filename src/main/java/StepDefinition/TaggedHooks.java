//package StepDefinition;
//
//import cucumber.api.java.After;
//import cucumber.api.java.Before;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class TaggedHooks {
//	@Before(order=0)//Global Hooks: Applicable for all the scenarios before with order 0
//	public void setUP(){
//		System.out.println("launch chrome");
//		System.out.println("Enter URL for Free CRM APP");
//	}
//
//	@After(order=0)//Global Hooks: Applicable for all the scenarios after with order 0
//	public void tearDown(){
//		System.out.println("close the browser");
//	}
//	
//	@Before(order=1)//Global Hooks: Applicable for all the scenarios before with order 1
//	public void setUP1(){
//		System.out.println("launch chrome");
//		System.out.println("Enter URL for Free CRM APP");
//	}
//
//	@After(order=1)//Global Hooks: Applicable for all the scenarios after with order 1
//	public void tearDown1(){
//		System.out.println("close the browser");
//	}
//	
//	@Before("@First")// Execute before first scenario
//	public void beforeFirst(){
//		System.out.println("before only first scenario");
//	}
//	
//	@After("@First")// Execute after first scenario
//	public void afterFirst(){
//		System.out.println("after only first sceanrio");
//	}
//	
//	@Before("@Second")//Execute before second scenario
//	public void beforeSecond(){
//		System.out.println("before only second scenario");
//	}
//	
//	@After("@Second")//Execute after second scenario
//	public void afterSecond(){
//		System.out.println("after only second sceanrio");
//	}
//	
//	@Before("@Third")//Execute before third scenario
//	public void beforeThird(){
//		System.out.println("before only third scenario");
//	}
//	
//	@After("@Third")//Execute after third scenario
//	public void afterThird(){
//		System.out.println("after only third sceanrio");
//	}
//	
//	@Given("^this is the first step$")
//	public void this_is_the_first_step() throws Throwable {
//	    System.out.println("Firststep");	}
//
//	@When("^this is the second step$")
//	public void this_is_the_second_step() throws Throwable {
//		System.out.println("Secondstep");	}
//
//	@Then("^this is the third step$")
//	public void this_is_the_third_step() throws Throwable {
//		System.out.println("Thirdstep");	}
//
//
//
//}
