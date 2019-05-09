package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import project.TestBase;
import project.pages.ProductPage;

public class AlertTest extends TestBase {
    private ProductPage productPage = new ProductPage();

    @Given("user is on the product page")
    public void isOnTheProductPage() {
        productPage.isProductDescriptionDisplayed()
                .areProductSpecificationsDisplayed();
    }


    @When("user clicks on order now button")
    public void userClicksOnOrderNowButton() {
        productPage.clickOrderNowButton()
                .areInstructionForInstantOrderPresent()
                .isNameFieldPresent()
                .isPhoneNumberFieldPresent();
    }

    @And("user clicks on confirm order button")
    public void userClicksOnConfirmOrderButton() {
        productPage.clickConfirmOrderButton();
    }

    @Then("a browser alert: {string} appears")
    public void aBrowserAppears(String alertMessage) {
        productPage.checkTheAlertMessage(alertMessage);
    }

    @And("user completes the phone number field with an inappropriate {string}")
    public void userCompletesThePhoneNumberFieldWithAnInappropriate(String number) {
        productPage.completePhoneNumberField(number);
    }

    @And("user completes the username field as {string}")
    public void userCompletesTheField(String userName) {
        productPage.completeNameField(userName);
    }
}
