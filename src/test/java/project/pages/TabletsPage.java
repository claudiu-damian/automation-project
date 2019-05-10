package project.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

import static project.constants.TestConstants.*;

public class TabletsPage extends BasePage<TabletsPage> {

    public TabletsPage isTabletsPageDisplayed() {
        assertHelper.shouldContain(actionsHelper.getTextElement(TABLETS_PAGE_HEADING), "Tablete");
        return this;
    }

    public void accessFilter(By filter) {
        actionsHelper.clickElement(filter);

    }

    //TODO: make the method generic
    public ProductPage accessProductPage() {
        actionsHelper.clickElement(PRODUCT);
        return new ProductPage();
    }

    public void checkNextProductButton() {
        FilteredPage filteredPage = new FilteredPage();
        WebElement button = actionsHelper.getElement(NEXT_PRODUCTS_BUTTON);
        List<WebElement> listOfProducts = filteredPage.returnListOfProducts();
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);

        while (button.isDisplayed()) {

            button.click();
            FilteredPage newFilteredPage = new FilteredPage();
            List<WebElement> newListOfProducts = newFilteredPage.returnListOfProducts();
            if (newListOfProducts.size() >= listOfProducts.size() + MAX_NUMBER_OF_PRODUCTS_PER_PAGE) {
                listOfProducts = newListOfProducts;
            } else break;
            button = actionsHelper.getElement(NEXT_PRODUCTS_BUTTON);


        }


    }


}
