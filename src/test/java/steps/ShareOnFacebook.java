package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import project.TestBase;
import project.pages.ContactInfoLocationPage;
import project.pages.HomePage;
import project.pages.SocialMediaPages;

public class ShareOnFacebook extends TestBase {
    private HomePage homePage = new HomePage();
    private SocialMediaPages socialMediaPages = new SocialMediaPages();

    @Given("user is on the main page")
    public void userIsOnTheMainPage() {
        accessWebPage()
                .isSlideShowPresent()
                .isSearchBarPresent()
                .isLogoPresent()
                .isContactInfoPresent()
                .isSocialMediaPresent();
    }

    @When("user clicks on Facebook button")
    public void userEntersAProduct() {
        homePage.goToFacebook();
    }

    @Then("user is redirected on Facebook page")
    public void theFacebookPageIsDisplayed() {
        socialMediaPages.theFacebookPageIsDisplayed();
    }
}
