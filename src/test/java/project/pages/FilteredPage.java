package project.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import project.helpers.ActionsHelper;
import project.helpers.AssertHelper;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static project.constants.TestConstants.PATH_OF_PRODUCTS;

public class FilteredPage extends TabletsPage {

    private List<WebElement> newList ;
    private ActionsHelper actionsHelper = new ActionsHelper();
    private AssertHelper assertHelper = new AssertHelper();

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
        List<WebElement> webElements = actionsHelper.getElements(PATH_OF_PRODUCTS);
        return webElements;
    }

    public List<WebElement> getList(List<WebElement> list) {
        return newList = list;
    }

    public List<WebElement> listProductsFromUnsortedPage() {

        checkNextProductButton();
        return returnListOfProducts();

    }

    public void chechSorting() {

//        List beforeSorting = listProductsFromUnsortedPage();
//        List afterSorting = returnListOfProducts();
//        Collections.s(beforeSorting, );
//        System.out.println(beforeSorting.get(1).toString());
//        afterSorting.equals(beforeSorting);
        ArrayList<String> obtainedList = new ArrayList<>();
        List<WebElement> elementList = newList;

        for (WebElement we : elementList) {
            obtainedList.add(we.getText());
        }
        ArrayList<String> obtainedSortedList = new ArrayList<>();
        List<WebElement> sortedList = returnListOfProducts();
        for (WebElement we : sortedList) {
            obtainedSortedList.add(we.getText());
        }
        Collections.sort(obtainedList);
        Assert.assertTrue(obtainedSortedList.equals(obtainedList));


    }

}
