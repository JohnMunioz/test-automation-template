package runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import pages.BasePage;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "steps",
        plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
        "json:target/cucumber-report/cucumber.json", 
        "pretty",
        "html:target/cucumber-report/cucumber.html"},
        monochrome = true,
        tags = "@Test"
)

public class runner {
        @AfterClass
        public static void cleanDriver() {
            BasePage.closeBrowser();
        } 
}
