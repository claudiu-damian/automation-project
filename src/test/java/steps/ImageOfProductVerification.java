package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import project.TestBase;
import project.pages.CartPage;
import project.pages.HomePage;
import project.pages.ProductPage;

public class ImageOfProductVerification extends TestBase {
    private CartPage cartPage = new CartPage();
    private HomePage homePage = new HomePage();
    private ProductPage productPage = new ProductPage();

    @Given("user on page with Vonino Navo P")
    public void theProductIsDisplayed() {
        cartPage.isProductPresent("Vonino Navo P");
    }


    @When("user select to see picture of product")
    public void userClicksOnNextImageButton() {
        cartPage.nextImageOfProductButton();
    }


    @Then("the pictures of product are visible on the page")
    public void nextImageOfProductAppears() {
        productPage.isImageOfProductDisplayed().checkThatImagesAreSlide();
    }
}
