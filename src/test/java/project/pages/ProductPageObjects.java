package project.pages;

import org.openqa.selenium.By;

public class ProductPageObjects {
    static final By addToCartButton = By.xpath("//div[@id='add-to-cart']");
    static final By description = By.xpath("//div[@class='description-text']");
    static final By specifications = By.xpath("//div[@id='specs-main']");
    static final By orderNowButton = By.xpath("//div[@id='product-order']");
    static final By confirmOrderButton = By.xpath("//form[@id='zaps-byprod-buynow-form']//div[@class='b-confirm']");
    static final By instructionForInstantOrder = By.xpath("//div[contains(text(),'Pentru a cumpăra rapid acest produs completează fo')]");
    static final By nameField = By.xpath("//input[@id='edit-user-name']");
    static final By phoneNumberField = By.xpath("//input[@id='edit-user-phone']");
    static final By orderConfirmation = By.xpath("//div[@class='product-buy-success creditenabled']");
    static final By okButton = By.xpath("//div[@class='ok-button']");
    static final By confirmationText = By.xpath("//span[@class='span1']");
    static final By instructionText = By.xpath("//span[@class='span2']");
}
