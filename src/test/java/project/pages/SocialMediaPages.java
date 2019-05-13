package project.pages;

import org.openqa.selenium.By;

public class SocialMediaPages extends HomePage {

    private By logoOnFacebook = By.xpath("//div[@class='_6tay']");
    private By listOfProductsOnFacebook = By.xpath("//img[@class='_4on7 _3mk2 img']");

    public SocialMediaPages theFacebookPageIsDisplayed() {
        actionsHelper.getElement(logoOnFacebook).isDisplayed();
        actionsHelper.getElement(listOfProductsOnFacebook).isDisplayed();
        return this;
    }
}
