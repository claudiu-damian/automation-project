package project.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

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

    public ProductPage areInstructionForInstantOrderPresent() {
        actionsHelper.isElementDisplayed(instructionForInstantOrder);
        return this;
    }

    public ProductPage isNameFieldPresent() {
        actionsHelper.isElementDisplayed(nameField);
        return this;
    }

    public ProductPage isPhoneNumberFieldPresent() {
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

    public ProductPage checkTheAlertMessage(String expectedAlertMessage) {
        getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
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
