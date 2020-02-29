package TestRunner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src//test//java//Features//GoogleSearch.feature",
                 glue = "Steps")
public class TestRunner extends AbstractTestNGCucumberTests {
}
