package runners;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/features/user_registration.feature",
    glue = {"stepdefinitions"},
    plugin = {"pretty", "html:reports/cucumber-html-report"}
)
public class TestRunner {
}
