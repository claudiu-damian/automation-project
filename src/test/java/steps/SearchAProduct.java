package steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import project.TestBase;
import project.pages.HomePage;
import project.pages.SearchResultPage;


public class SearchAProduct extends TestBase {
    private SearchResultPage searchResultPage = new SearchResultPage();
    private HomePage homePage = new HomePage();

    @When("user search a product")
    public void userEntersInSearchAProduct() {
        searchResultPage.searchFor("iphone").
                verifyThatSearchIsDone();
    }

    @Then("the list of search products is displayed on the search result page")
    public void theSearchedProductIsDisplayed() {
        searchResultPage.isSearchResultPageDisplayed();
    }

}
