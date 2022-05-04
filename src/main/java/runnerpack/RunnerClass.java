package runnerpack;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="E:\\eclipse\\NewJavaVyravan\\CucumberSimple\\src\\main\\resources\\Feature\\cucumber.feature",
				glue= {"stepDefin"},dryRun=false,monochrome=true,
				tags= "@regerssion",
				plugin={"rerun:target/rerun.txt","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
		)
public class RunnerClass {

}
