package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="/Users/swath/eclipse-workspace/BDDFramework/src/main/java/Feature/Test.feature",//Path of the feature file
		//glue={"C:/Users/swath/eclipse-workspace/BDDFramework/src/main/java/StepDefinition/loginstepdefinition_datadriven"},
		glue= {"StepDefinition"},//path of the step definition
		format= {"pretty", "html: test-output","json:json_output/cucumber.json","junit:junit_xml/cucumber.xml"},
		dryRun=true, //to check the mapping is proper between feature file and step def file
		monochrome=true, //display the console output in a proper readable format
		strict=true //it will check if any step is not defined in step definition file
		//tags= {"@RegressionTest"}
		)

public class TestRunner {
	

}


//ORed : tags = {"@SmokeTest , @RegressionTest"} -- execute all tests tagged as @SmokeTest OR @RegressionTest
	//ANDed : tags = tags = {"@SmokeTest" , "@RegressionTest"} -- execute all tests tagged as @SmokeTest AND @RegressionTest
	
//Tagged Hooks:-> If you want to execute any precondition for the specific scenario- Tag like this @First, @Second, @Third in the feature file
//In Testng if you define before method it will be applicable for all the scenarios
//If you want to execute any precondition for the specific scenario then tagged hooks will be used