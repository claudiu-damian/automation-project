package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import project.TestBase;
import project.pages.CartPage;
import project.pages.HomePage;
import project.pages.ProductPage;
import project.pages.TabletsPage;


public class AddToCartTest extends TestBase {
    private HomePage homePage = new HomePage();
    private TabletsPage tabletsPage = new TabletsPage();
    private ProductPage productPage = new ProductPage();
    private CartPage cartPage = new CartPage();

    @Given("user is on the main page")
    public void userIsOnTheMainPage() {
        accessWebPage()
                .isSlideShowPresent()
                .isSearchBarPresent()
                .isLogoPresent();
    }

    @And("selects tablets subcategory")
    public void selectsTablets() {
        homePage.enterTabletesPage();
    }

    @When("user enters a product")
    public void userEntersAProduct() {
        tabletsPage.isTabletsPageDisplayed()
                .accessProductPage();
    }

    @And("clicks on the add to cart button")
    public void clicksOnTheAddToCartButton() {
        productPage.areProductSpecificationsDisplayed()
                .isProductDescriptionDisplayed()
                .addProductToCart();
    }

    @Then("the product is displayed in the user's cart")
    public void theProductIsDisplayedInTheCart() {
        cartPage.navigateToCartPage()
                .isProductPresent("Vonino Navo P");
    }
}
