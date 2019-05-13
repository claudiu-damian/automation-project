package steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import project.TestBase;
import project.pages.HomePage;
import project.pages.SocialMediaPages;

public class ShareOnFacebook extends TestBase {
    private HomePage homePage = new HomePage();
    private SocialMediaPages socialMediaPages = new SocialMediaPages();

    @When("user clicks on Facebook button")
    public void userEntersAProduct() {
        homePage.goToFacebook();
    }

    @Then("user is redirected on Facebook page")
    public void theFacebookPageIsDisplayed() {
        socialMediaPages.theFacebookPageIsDisplayed();
    }
}
