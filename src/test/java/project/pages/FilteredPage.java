package project.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import project.helpers.ActionsHelper;
import project.helpers.AssertHelper;

import java.util.List;

import static project.constants.TestConstants.PATH_OF_PRODUCTS;

public class FilteredPage extends TabletsPage {

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
        return actionsHelper.getElements(PATH_OF_PRODUCTS);
    }
}
