package project.pages;

import org.openqa.selenium.By;

public class SocialMediaPages extends HomePage {

    private By listOfProductsOnFacebook = By.xpath("//a[@class='_64-f']//span[contains(text(),'ZAP')]");

    public SocialMediaPages theFacebookPageIsDisplayed() {
        actionsHelper.getElement(listOfProductsOnFacebook).isDisplayed();
        return this;
    }
}
