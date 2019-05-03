package project.pages;

import org.openqa.selenium.By;

public class HomePage extends BasePage<HomePage> {

    private By homePageSlideShow = By.xpath("//body[contains(@class,'front not-logged-in page-node node-type-mainpage no-sidebars i18n-ro col-1')]/div[@id='content']/div[@id='page']/div/img[1]");

    public HomePage isSlideShowPresent() {
        actionsHelper.getElement(homePageSlideShow).isDisplayed();
        return this;
    }
}
