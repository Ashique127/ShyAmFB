package testrunnerAMFB;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = { "src/test/resources/Features" }, plugin = {
		"json:target/cucumber.json" }, glue = "stepdefiAMFB", tags = { "@ShyAMFB" })

public class TestRunnerAMFB extends AbstractTestNGCucumberTests {
}
