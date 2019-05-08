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

    public ProductPage getProductName() {
        actionsHelper.getTextElement(productTitle);
        return this;
    }

    public ProductPage clickOrderNowButton() {
        actionsHelper.clickElement(orderNowButton);
        return this;
    }

    public ProductPage clickConfirmOrderButton() {
        actionsHelper.clickElement(confirmOrderButton);
        //getDriver().manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        //getDriver().switchTo().alert().getText();
        //assertHelper.shouldContain(getDriver().switchTo().alert().getText(), "Numele este un cîmp obligatoriu");
        //getDriver().switchTo().alert().accept();
        return this;
    }

    public ProductPage handleBrowserPopUp() {
        assertHelper.shouldContain(actionsHelper.getAlertText(), "Numele este un cîmp obligatoriu");
        return this;
    }




}
