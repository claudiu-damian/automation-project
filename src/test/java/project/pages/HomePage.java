package project.pages;

import static project.constants.TestConstants.HOME_PAGE_SLIDE_SHOW;

public class HomePage extends BasePage<HomePage> {



    public HomePage isSlideShowPresent() {
        actionsHelper.getElement(HOME_PAGE_SLIDE_SHOW).isDisplayed();
        return this;
    }
}
