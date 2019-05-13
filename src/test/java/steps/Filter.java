package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import project.pages.FilteredPage;

import static project.constants.TestConstants.FILTER;


public class Filter extends FilteredPage {
    static final By filterAcendingButton = By.xpath("//a[@class='desc sort-price-asc']");

    @When("selects filter by name \"Acer\"")
    public void selectsAFilter() {
        accessFilter(FILTER);
    }

    @Then("filtered array of items is displayed")
    public void filteredArray() {
        checkTableFields(FILTER);
    }

    @Then("Items are ordered in ascending order by price")
    public void itemsAreOrderedInAscendingOrderByPrice() {
        checkNextProductButton();
        chechSorting();
    }

    @When("User clicks on preț: mare spre mic")
    public void userClicksOnPrețMareSpreMic() {
        getList(listProductsFromUnsortedPage());
        accessFilter(filterAcendingButton);
    }
}
