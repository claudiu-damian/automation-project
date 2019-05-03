package project.pages;


import org.openqa.selenium.By;
import project.TestContext;

public abstract class BasePage<T extends BasePage<T>> extends TestContext {
    private By logo = By.xpath("//div[@id='dynamic-logo']");
    private By subCategories = By.xpath("//div[@id='subcategories']");

    public T isSearchBarPresent() {
        actionsHelper.getElement(logo).isDisplayed();
        return (T) this;
    }

    public T areSubCategoriesDisplayed() {
        actionsHelper.isElementDisplayed(subCategories);
        return (T) this;
    }

}
