package steps;

import java.util.List;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ListPage;

public class ListSteps {

    ListPage list = new ListPage();

    @Given("^I navigate to the list page$")
    public void navigateToListPage() {
        list.navigateToList();
    }

    @When("^I search the list$")
    public void searchTheList() throws InterruptedException {
        list.enterSearchCriteria();
    }

    @Then("^I can find the text in the list$")
    public void theTableIsThere() {
        List<String> lista = list.getAllSearchResults();
        boolean textIsThere = lista.contains("Christina");

        if (textIsThere) {
            System.out.println("The text is in the list: PASSED.");
        } else {
            System.out.println("The text is not in the list: FAILED.");
        }
    }
    
}
