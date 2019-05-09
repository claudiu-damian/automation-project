package project.pages;

import project.TestContext;

import static project.constants.TestConstants.*;

public abstract class BasePage<T extends BasePage<T>> extends TestContext {


    public T isSearchBarPresent() {
        actionsHelper.isElementDisplayed(SEARCH_BAR);
        return (T) this;
    }

    public T isLogoPresent() {
        actionsHelper.isElementDisplayed(LOGO);
        return (T) this;
    }

    public HomePage navigateToHomePage() {
        actionsHelper.clickElement(LOGO);
        return new HomePage();
    }

    public T areSubCategoriesDisplayed() {
        actionsHelper.isElementDisplayed(SUB_CATEGORIES);
        return (T) this;
    }

    public CartPage navigateToCartPage() {
        actionsHelper.clickElement(CART_BUTTON);
        return new CartPage();
    }

    public TabletsPage enterTabletesPage() {
        actionsHelper.clickElement(PHONES);
        areSubCategoriesDisplayed();
        actionsHelper.clickElement(TABLETS);
        return new TabletsPage();
    }
//    public TabletsPage enterWearalePage(){
//        actionsHelper.clickElement();
//        return new TabletsPage();
//    }

/*    public ProductPage accessProductPage(String productName) {
        By product = By.xpath(String.format("//a[contains(text(),'%s')]", productName));
        actionsHelper.clickElement(product);
        return new ProductPage();
    }*/
}
