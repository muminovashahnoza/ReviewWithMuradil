package etsy_runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(

		dryRun=false,
		features="src/test/resources/com/etsy/features/",
		glue = "stepdefs"
		//tags= "@csvReportDataValidation"
		)
public class CukesRunner {

}
