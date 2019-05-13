package steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import project.pages.FilteredPage;
import project.pages.TabletsPage;




public class Filter extends FilteredPage {
    //SubmenuPage
    public static final By TABLETS_PAGE_HEADING = By.xpath("//div[@class='headding']");
    public static final By PRODUCT = By.xpath("//td[@class='col-1 col-first']");
    public static final By filter = By.xpath("//*[@id=\"block-product_filter-67\"]/div/div/ul[1]/li/ul/li[5]/span/a");
    //
    TabletsPage tabletsPage = new TabletsPage();
    FilteredPage filteredPage = new FilteredPage();
    static final By filterAcendingButton = By.xpath("//a[@class='desc sort-price-asc']");

    @When("selects filter by name \"Acer\"")
    public void selectsAFilter() {
        accessFilter(filter);
    }

    @Then("filtered array of items is displayed")
    public void filteredArray() {
        checkTableFields(filter);
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
