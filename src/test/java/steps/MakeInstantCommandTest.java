package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import project.TestBase;
import project.pages.ProductPage;

public class MakeInstantCommandTest extends TestBase {
    private ProductPage productPage = new ProductPage();

    @Given("user is on the product page")
    public void isOnTheProductPage() {
        productPage.isProductDescriptionDisplayed()
        .areProductSpecificationsDisplayed();
    }


    @When("user clicks on order now button")
    public void userClicksOnOrderNowButton() {
         productPage.clickOrderNowButton();
    }

    @And("user clicks on confirm order button without completing name and number fields")
    public void userClicksOnConfirmOrderButton() {
        productPage.clickConfirmOrderButton();
    }

    @Then("a browser alert appears")
    public void aBrowserAlertAppears() {
        productPage.handleBrowserPopUp();
    }

}
