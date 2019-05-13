package project.pages;

import org.openqa.selenium.By;
import project.constants.TestConstants;

public class HomePage extends BasePage<HomePage> {
    private By homePageSlideShow = By.xpath("//body[contains(@class,'front not-logged-in page-node node-type-mainpage no-sidebars i18n-ro col-1')]/div[@id='content']/div[@id='page']/div/img[1]");

    private By homePagePhoneInfo = By.xpath("//span[@class='ctatext-phone']");
    private By homePageAdressInfo = By.xpath("//span[@class='ctatext-location']");
    private By twitterButton = By.xpath("//a[contains(text(),'twitter')]");
    private By facebookButton = By.xpath("//a[contains(text(),'facebook')]");


    public HomePage isSlideShowPresent() {
        actionsHelper.getElement(homePageSlideShow).isDisplayed();
        return this;
    }

    public HomePage isContactInfoPresent() {
        actionsHelper.getElement(homePagePhoneInfo).isDisplayed();
        actionsHelper.getElement(homePageAdressInfo).isDisplayed();
        return this;
    }
    public HomePage goToStorageAddress() {
        actionsHelper.navigateTo(TestConstants.CONTACTLOCATIONURL);
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
