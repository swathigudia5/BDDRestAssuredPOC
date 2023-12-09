package Runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features",
        glue = "stepDefinitions",
        //tags = {"@smoke"},
        monochrome = true,
        plugin = {"pretty","json:target/cucumber-reports/CucumberTestReport.json",
                "html:target/cucumber-reports/cucumber-html-report"}
)


public class TestRunner {
}
