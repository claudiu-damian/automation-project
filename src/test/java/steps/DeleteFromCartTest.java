package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import project.TestBase;
import project.pages.CartPage;

public class    DeleteFromCartTest extends TestBase {
    CartPage cartPage = new CartPage();

    @Given("is on the Cart page")
    public void isOnTheCartPage() {
        cartPage.navigateToCartPage();
    }


    @When("user clicks on the delete from cart button")
    public void userClicksOnTheDeleteFromCartButton() {
        cartPage.pressDeleteFromCartButton();
    }


    @Then("a message saying that there are no products in cart appears")
    public void aMessageSayingThatThereAreNoProductsInCartAppears() {
        cartPage.checkIfThereAreNoProductsInCart();
    }

}
