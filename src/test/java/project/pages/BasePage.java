package project.pages;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import project.TestContext;

public abstract class BasePage<T extends BasePage<T>> extends TestContext {
    private By logo = By.xpath("//div[@id='dynamic-logo']");
    private By searchBar = By.xpath("//input[@id='edit-keys']");
    private By subCategories = By.xpath("//div[@id='subcategories']");
    private By cartButton = By.xpath("//span[@class='cart-icon']");
    private By phones = By.xpath("//span[contains(text(),'telefoane')]");
    private By tablets = By.xpath("//li[@class='simple']//a[contains(text(),'tablete')]");

    public T isSearchBarPresent() {
        actionsHelper.isElementDisplayed(searchBar);
        return (T) this;
    }
    public SearchResultPage searchFor(String text) {
        actionsHelper.sendStringKeysToElement(searchBar, text);
        assertHelper.shouldContain("iphone", text);
        actionsHelper.sendKeysToElement(searchBar, Keys.ENTER);
        return new SearchResultPage();
    }
        public T isLogoPresent() {
        actionsHelper.isElementDisplayed(logo);
        return (T) this;
    }

    public HomePage navigateToHomePage() {
        actionsHelper.clickElement(logo);
        return new HomePage();
    }

    public T areSubCategoriesDisplayed() {
        actionsHelper.isElementDisplayed(subCategories);
        return (T) this;
    }

    public CartPage navigateToCartPage() {
        actionsHelper.clickElement(cartButton);
        return new CartPage();
    }

    public TabletsPage enterTabletesPage() {
        actionsHelper.clickElement(phones);
        areSubCategoriesDisplayed();
        actionsHelper.clickElement(tablets);
        return new TabletsPage();
    }

}
/*    public ProductPage accessProductPage(String productName) {
        By product = By.xpath(String.format("//a[contains(text(),'%s')]", productName));
        actionsHelper.clickElement(product);
        return new ProductPage();
    }*/

