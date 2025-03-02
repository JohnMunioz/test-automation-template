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

    @When("^I search (.+) in the list$")
    public void searchTheList(String state) throws InterruptedException {
        list.enterSearchCriteria(state);
    }

    @Then("^I can find (.+) in the list$")
    public void theTableIsThere(String text) {
        List<String> lista = list.getAllSearchResults();
        boolean textIsThere = lista.contains(text);

        if (textIsThere) {
            System.out.println("The text is in the list: PASSED.");
        } else {
            System.out.println("The text is not in the list: FAILED.");
        }
    }
    
}
