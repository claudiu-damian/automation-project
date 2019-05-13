package project.pages;

import org.openqa.selenium.By;

import static project.pages.ProductPageObjects.*;

public class ProductPage extends BasePage<ProductPage> {
    public ProductPage isProductDescriptionDisplayed() {
        actionsHelper.isElementDisplayed(description);
        return this;
    }
public ProductPage areImageOfProductDisplayed(){
        actionsHelper.isElementDisplayed(image);
        return this;
}
    public ProductPage areProductSpecificationsDisplayed() {
        actionsHelper.isElementDisplayed(specifications);
        return this;
    }

    public ProductPage areInstructionForInstantOrderDisplayed() {
        actionsHelper.isElementDisplayed(instructionForInstantOrder);
        return this;
    }

    public ProductPage isNameFieldDisplayed() {
        actionsHelper.isElementDisplayed(nameField);
        return this;
    }

    public ProductPage isOkButtonDisplayed() {
        waiterHelper.waitUntilElementIsPresent(okButton);
        actionsHelper.isElementDisplayed(okButton);
        return this;
    }

    public ProductPage isOrderConfirmationDisplayed() {
        actionsHelper.isElementDisplayed(orderConfirmation);
        return this;
    }

    public ProductPage isInstructionDisplayed() {
        actionsHelper.isElementDisplayed(instructionText);
        return this;
    }

    public ProductPage isConfirmationMessageDisplayed() {
        waiterHelper.waitUntilElementIsPresent(confirmationText);
        actionsHelper.isElementDisplayed(confirmationText);
        return this;
    }

    public ProductPage isPhoneNumberFieldDisplayed() {
        actionsHelper.isElementDisplayed(phoneNumberField);
        return this;
    }

    public ProductPage clickOrderNowButton() {
        actionsHelper.clickElement(orderNowButton);
        return this;
    }

    public ProductPage clickConfirmOrderButton() {
        waiterHelper.waitUntilElementIsPresent(confirmOrderButton);
        actionsHelper.clickElement(confirmOrderButton);
        return this;
    }

    public ProductPage clickOkButton() {
        actionsHelper.clickElement(okButton);
        return this;
    }

    public ProductPage addProductToCart() {
        actionsHelper.clickElement(addToCartButton);
        return this;
    }

    public ProductPage checkTheAlertMessage(String expectedAlertMessage) {
        waiterHelper.implicitlyWait(30);
        assertHelper.shouldContain(actionsHelper.getAlertText(), expectedAlertMessage);
        return this;
    }

    public ProductPage completeNameField(String userName) {
        actionsHelper.sendStringKeysToElement(nameField, userName);
        return this;
    }

    public ProductPage completePhoneNumberField(String phoneNumber) {
        actionsHelper.sendStringKeysToElement(phoneNumberField, phoneNumber);
        return this;
    }
    public ProductPage checkThatImagesAreSlide(){
        actionsHelper.isElementDisplayed(By.xpath("//div[@class='zaps-slider-image first']//img[@class='imagecache imagecache-product-large imagecache-default imagecache-product-large_default']"));
        actionsHelper.clickElement(By.xpath("//button[@class='slider-arrow slider-arrow-right']"));
        actionsHelper.isElementDisplayed(By.xpath("//div[@class='holder']//div[2]//img[1]"));
        actionsHelper.clickElement(By.xpath("//button[@class='slider-arrow slider-arrow-right']"));
        actionsHelper.isElementDisplayed(By.xpath("//div[@class='container-1200']//div[3]//img[1]"));
        actionsHelper.clickElement(By.xpath("//button[@class='slider-arrow slider-arrow-right']"));
        actionsHelper.isElementDisplayed(By.xpath("//div[@class='container-1200']//div[4]//img[1]"));
        actionsHelper.clickElement(By.xpath("//button[@class='slider-arrow slider-arrow-right']"));
        actionsHelper.isElementDisplayed(By.xpath("//div[@class='container-1200']//div[5]//img[1]"));
        actionsHelper.clickElement(By.xpath("//button[@class='slider-arrow slider-arrow-right']"));
        actionsHelper.isElementDisplayed(By.xpath("//div[@class='zaps-slider-image last']//img[@class='imagecache imagecache-product-large imagecache-default imagecache-product-large_default']"));
        return this;
    }
}
