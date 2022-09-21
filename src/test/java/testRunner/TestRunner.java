package testRunner;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith (Cucumber.class)
@CucumberOptions(
		features= "classpath:features",
		glue= "stepDefinitions",
		//tags="",
		monochrome= true,
		dryRun= false,
		plugin= {
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
//				"pretty",
//				"html: target/cucumber",
//				"json: target/cucumber.json"		
		},
			publish=true
		)

public class TestRunner {

}
