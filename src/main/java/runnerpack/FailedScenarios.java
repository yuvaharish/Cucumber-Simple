package runnerpack;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="@target/rerun.txt",
				glue= {"stepDefin"},dryRun=false,monochrome=true,
				plugin={"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
		)
public class FailedScenarios {

}
