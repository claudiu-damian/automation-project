package project.pages;

import static project.constants.TestConstants.homePageSlideShow;

public class HomePage extends BasePage<HomePage> {



    public HomePage isSlideShowPresent() {
        actionsHelper.getElement(homePageSlideShow).isDisplayed();
        return this;
    }
}
