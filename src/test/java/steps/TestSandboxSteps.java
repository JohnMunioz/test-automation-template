package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import pages.TestSandBox;

public class TestSandboxSteps {

    TestSandBox sandBoxPage = new TestSandBox();

    @Given("^I navigate to the Sandbox page$")
    public void navigateToSandboxSite() {
        sandBoxPage.navigateToSandbox();
    }

    @And("^select a value from the dropdown$")
    public void selectState() {
        sandBoxPage.selectCategory("Group 1, Option 2");    }
    
}
