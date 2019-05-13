package project.pages;

import project.constants.TestConstants;


import static project.pages.HomePageObjects.*;

public class HomePage extends BasePage<HomePage> {
    
    public HomePage isSlideShowPresent() {
        actionsHelper.getElement(homePageSlideShow).isDisplayed();
        return this;
    }

    public HomePage isContactInfoPresent() {
        actionsHelper.getElement(homePagePhoneInfo).isDisplayed();
        actionsHelper.getElement(homePageAddressInfo).isDisplayed();
        return this;
    }

    public HomePage goToStorageAddress() {
        actionsHelper.navigateTo(TestConstants.CONTACT_LOCATION_URL);
        return this;
    }

    public HomePage isSocialMediaPresent() {
        actionsHelper.getElement(twitterButton).isDisplayed();
        actionsHelper.getElement(facebookButton).isDisplayed();
        return this;
    }

    public HomePage goToFacebook() {
        actionsHelper.clickElement(facebookButton);
        return this;
    }
}
