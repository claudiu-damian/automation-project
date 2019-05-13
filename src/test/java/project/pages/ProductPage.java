package project.pages;

import static project.pages.ProductPageObjects.*;

public class ProductPage extends BasePage<ProductPage> {
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
}
