package project.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static project.pages.FilteredPageObjects.*;

public class FilteredPage extends TabletsPage {

    private List<WebElement> newList;

    private List<String> productsStringList = new ArrayList<>();

    public List<WebElement> getNewList() {
        return this.newList = returnListOfProducts();
    }

    public void setNewList(List<WebElement> list) {
        this.newList = list;
    }

    public List<String> getProductsStringList() {
        return this.productsStringList;
    }

    public void setProductsStringList(List<WebElement> newList) {

        List<WebElement> elementList = newList;

        for (WebElement we : elementList) {
            this.productsStringList.add(we.getText().toLowerCase());
        }
    }

    public String search(String imputeBoxSearch) {
        return imputeBoxSearch;
    }

    public String search(By filter) {
        String wordPresent = actionsHelper.getElement(filter).getText();
        return wordPresent;
    }

    public <E> void checkTableFields(E searchInput) {
        String wordExpected;
        String wordPresent = null;
        if (searchInput instanceof String) {
            wordPresent = search(searchInput.toString());
        } else if (searchInput instanceof By) {
            wordPresent = search((By) searchInput);
        }

        getDriver().manage().deleteAllCookies();
        List<WebElement> elements = returnListOfProducts();
        for (WebElement element : elements) {
            wordExpected = element.getText();
            assertHelper.shouldContain(wordExpected, wordPresent);
        }
    }

    public List<WebElement> returnListOfProducts() {
        waiterHelper.waitForPageLoaded();
        List<WebElement> webElements = actionsHelper.getElements(pathOfProducts);
        return webElements;
    }

    public void chechSorting() {

        List<String> obtainedList = getProductsStringList();
        List<String> obtainedSortedList = new ArrayList<>();
        List<WebElement> sortedList = returnListOfProducts();
        for (WebElement we : sortedList) {
            obtainedSortedList.add(we.getText().toLowerCase());
        }
        Collections.sort(obtainedList);
        Assert.assertEquals(obtainedSortedList, obtainedList);
    }
}
