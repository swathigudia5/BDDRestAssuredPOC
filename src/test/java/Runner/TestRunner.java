package Runner;


import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;




@CucumberOptions(
        features = "src/test/java/features",
        glue = "stepDefinitions",
        tags = "@smoke",
        monochrome = true,
        plugin = {"pretty","json:target/cucumber-reports/CucumberTestReport.json",
                "html:target/cucumber-reports/cucumber-html-report"}
)


public class TestRunner extends AbstractTestNGCucumberTests {
}
