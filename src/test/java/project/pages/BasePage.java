package project.pages;

import org.openqa.selenium.Keys;
import project.TestContext;

import static project.pages.BasePageObjects.*;

public abstract class BasePage<T extends BasePage<T>> extends TestContext {
    public T isSearchBarPresent() {
        actionsHelper.isElementDisplayed(searchBar);
        return (T) this;
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

    public SearchResultPage searchFor(String text) {
        actionsHelper.sendStringKeysToElement(searchBar, text);
        assertHelper.shouldContain("iphone", text);
        actionsHelper.sendKeysToElement(searchBar, Keys.ENTER);
        return new SearchResultPage();
    }

    public T nextImageOfProductButton() {
        actionsHelper.isElementDisplayed(nextImageRightButton);
        actionsHelper.isElementDisplayed(nextImageLeftButton);
        return (T) this;
    }
}
