package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions (
		
		tags = "@google",
		features = "/Users/luisgonzalez/eclipse-workspace/ss/src/test/resources/steps/steps.feature",
		glue = "Step",
		plugin = { "summary", "pretty", "html:target/cucumber-reports.html", "json:target/cucumber-reports", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
		monochrome = true
		
		
		)


public class Runner {

}
