package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import project.TestBase;
import project.pages.ContactInfoLocationPage;
import project.pages.HomePage;

public class ContactsLocationVerification extends TestBase {
    private HomePage homePage = new HomePage();
    private ContactInfoLocationPage contactInfoLocationPage = new ContactInfoLocationPage();

    @Given("user is on the main page")
    public void userIsOnTheMainPage() {
        accessWebPage()
                .isSlideShowPresent()
                .isSearchBarPresent()
                .isLogoPresent()
                .isContactInfoPresent();
    }

    @When("user clicks on adress button")
    public void userEntersAProduct() {
        homePage.goToStorageAdress();
    }

    @Then("user is redirected on location page")
    public void theMapWithStorageLocationDisplayed() {
        contactInfoLocationPage.isMapWithLocationPresent();
    }
}
