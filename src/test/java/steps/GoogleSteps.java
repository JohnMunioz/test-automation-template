package steps;

import io.cucumber.java.en.*;
import pages.GooglePage;
import org.junit.Assert;

public class GoogleSteps {

    GooglePage google = new GooglePage();

    @Given("^I am on the Google search page$")
    public void navigateToGoogle() {
    google.navigateToGoogle();

    } 

    @When("^I enter a search criterias$")
    public void enterSearchCriteria() {
        google.enterSearchCriteria("Google");

    }

    @And("^click on the search button$")
    public void clickSearchButton() {
        google.clickGoogleSearch();

    }

    @Then("^the results match the criteria$")
    public void validateResults() {
        Assert.assertEquals("Texto que Esperamos", google.firstResult());
    }
    
}
