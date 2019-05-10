package project.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import project.helpers.ActionsHelper;
import project.helpers.AssertHelper;

import java.util.List;

public class FilteredPage extends TabletsPage {
    public By webElements = By.xpath("//div[@class='views-field-title']");
    ActionsHelper actionsHelper = new ActionsHelper();
    AssertHelper assertHelper = new AssertHelper();
    public String imputeBoxSearch = "Iphone";


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
        List<WebElement> elements = actionsHelper.getElements(webElements);
        return elements;
    }
}
