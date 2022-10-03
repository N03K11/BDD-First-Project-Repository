package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions
		(
			features = "//Features/login.feature",
			glue = "stepdefinitions",
			dryRun = true,
			monochrome = true,
			plugin = {"pretty","html:target/HtmlReports/Htmlreport.html"}
		)
public class TestRunner 
{
	

}
