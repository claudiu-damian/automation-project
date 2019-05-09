package project.pages;

import org.openqa.selenium.By;

public class ProductPage extends BasePage<ProductPage> {
    private By addToCartButton = By.xpath("//div[@id='add-to-cart']");
    private By description = By.xpath("//div[@class='description-text']");
    private By specifications = By.xpath("//div[@id='specs-main']");
    private By productTitle = By.xpath("//div[@class='product-title']");
    private By orderNowButton = By.xpath("//div[@id='product-order']");
    private By confirmOrderButton = By.xpath("//form[@id='zaps-byprod-buynow-form']//div[@class='b-confirm']");
    private By instructionForInstantOrder = By.xpath("//div[contains(text(),'Pentru a cumpăra rapid acest produs completează fo')]");
    private By nameField = By.xpath("//input[@id='edit-user-name']");
    private By phoneNumberField = By.xpath("//input[@id='edit-user-phone']");
    private By cancelButton = By.xpath("//form[@id='zaps-byprod-buynow-form']//div[@class='b-cancel']");
    private By orderConfirmation = By.xpath("//div[@class='product-buy-success creditenabled']");
    private By okButton = By.xpath("//div[@class='ok-button']");
    private By confirmationText = By.xpath("//span[@class='span1']");
    private By instructionText = By.xpath("//span[@class='span2']");

    public ProductPage addProductToCart() {
        actionsHelper.clickElement(addToCartButton);
        return this;
    }

    public ProductPage isProductDescriptionDisplayed() {
        actionsHelper.isElementDisplayed(description);
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

    public ProductPage isConfimationMessageDisplayed() {
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
        actionsHelper.clickElement(confirmOrderButton);
        return this;
    }

    public ProductPage clickOkButton() {
        actionsHelper.clickElement(okButton);
        return this;
    }

    public ProductPage checkTheAlertMessage(String expectedAlertMessage) {
        actionsHelper.implicitlyWait(30);
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
}
