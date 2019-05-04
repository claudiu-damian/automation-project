package project.pages;

import org.openqa.selenium.By;

public class ProductPage extends BasePage<ProductPage> {
    private By addToCartButton = By.xpath("//div[@id='add-to-cart']");
    private By description = By.xpath("//div[@class='description-text']");
    private By specifications = By.xpath("//div[@id='specs-main']");
    public By productTitle = By.xpath("//div[@class='product-title']");

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
}
