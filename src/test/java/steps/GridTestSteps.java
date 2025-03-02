package steps;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.GridPage;

public class GridTestSteps {

    GridPage grid = new GridPage();

    @Given("^I navigate to the static table$")
    public void navigateToGridPage() {
        grid.navigateToGrid();
    }

    @Then("^I can return the value I wanted$")
    public void returnCellValue() {
        String value = grid.getValuesFromGrid(3, 2);
        Assert.assertEquals("r: 2, c: 1", value);
    }

    @Then("^I can validate the table is displayed$")
    public void theTableIsThere() {
        Assert.assertTrue("Exploto todo", grid.cellStatus());
    }

    
}
