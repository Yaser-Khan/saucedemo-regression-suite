package runners;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features",      // Path to your feature files
        glue = {"stepDefinitions"},                // Package with step definitions
        plugin = {
                "pretty",                              // Console output formatting
                "html:target/cucumber-report.html"    // Generate HTML report here
        },
        monochrome = true                          // Cleaner console output
)
public class TestRunner {
    // Empty - the annotations do all the work
}