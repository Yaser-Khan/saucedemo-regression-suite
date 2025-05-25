package runners;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features",
        glue = {"stepDefinitions"},
        tags = "@BuyProduct",
        plugin = {
                "pretty","html:target/cucumber-report.html"    // Generate HTML report here
        },
        monochrome = true
)
public class TestRunner {
    // Empty - the annotations do all the work
}