package steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import project.pages.FilteredPage;
import project.pages.TabletsPage;


public class Filter extends FilteredPage {
    public static final By product = By.xpath("//td[@class='col-1 col-first']");
    public static final By filter = By.xpath("//*[@id=\"block-product_filter-67\"]/div/div/ul[1]/li/ul/li[5]/span/a");
    static final By filterAlphabeticDescending = By.linkText("alfabetic: A spre Z");

    @When("selects filter by name \"Acer\"")
    public void selectsAFilter() {
        accessFilter(filter);
    }

    @Then("filtered array of items is displayed")
    public void filteredArray() {
        checkTableFields(filter);
    }

    @Then("Items are ordered in ascending order by alphabet")
    public void itemsAreOrderedInAscendingOrderByPrice() {
        checkNextProductButton();
        chechSorting();
    }

    @When("User clicks on alphabetic sort")
    public void userClicksOnAlphabeticSort() {
        checkNextProductButton();
        setProductsStringList(getNewList());
        accessFilter(filterAlphabeticDescending);
    }
}
