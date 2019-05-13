package project.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static project.constants.TestConstants.*;
import static project.pages.FilteredPageObjects.nextProductButton;

public class TabletsPage extends BasePage<TabletsPage> {
    private By tabletsPageHeadding = By.xpath("//div[@class='headding']");
    public By product = By.xpath("//td[@class='col-1 col-first']");
    public By filter = By.xpath("//*[@id=\"block-product_filter-67\"]/div/div/ul[1]/li/ul/li[1]/span/a");
    public TabletsPage isTabletsPageDisplayed() {
        assertHelper.shouldContain(actionsHelper.getTextElement(tabletsPageHeadding), "Tablete");
        return this;
    }

    public void accessFilter(By filter) {
        actionsHelper.clickElement(filter);

    }

    //TODO: make the method generic
    public ProductPage accessProductPage() {
        actionsHelper.clickElement(product);
        return new ProductPage();
    }

    public void checkNextProductButton() {
        FilteredPage filteredPage = new FilteredPage();
        WebElement button = actionsHelper.getElement(nextProductButton);
        List<WebElement> listOfProducts = filteredPage.returnListOfProducts();
        waiterHelper.implicitlyWait(30);

        while (button.isDisplayed()) {

            button.click();
            FilteredPage newFilteredPage = new FilteredPage();
            List<WebElement> newListOfProducts = newFilteredPage.returnListOfProducts();
            if (newListOfProducts.size() >= listOfProducts.size() + MAX_NUMBER_OF_PRODUCTS_PER_PAGE) {
                listOfProducts = newListOfProducts;
            } else break;
            button = actionsHelper.getElement(nextProductButton);
        }
    }
}
