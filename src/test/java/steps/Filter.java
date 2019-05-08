package steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import project.pages.FilteredPage;
import project.pages.TabletsPage;

public class Filter {
    TabletsPage tabletsPage = new TabletsPage();
    FilteredPage filteredPage = new FilteredPage();

    @When("selects filter by name \"Acer\"")
    public void selectsAFilter() {
        tabletsPage.accessFilter();
    }

    @Then("filtered array of items is displayed")
    public void filteredArray() {
        filteredPage.checkTableFields();

    }
}
