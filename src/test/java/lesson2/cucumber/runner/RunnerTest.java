package lesson2.cucumber.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/features", glue ={ "src/test/java/lesson2/cucumber/steps","src/test/java/lesson2/cucumber/runner"})
public class RunnerTest extends AbstractTestNGCucumberTests {
}
