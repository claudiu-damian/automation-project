package project.pages;

import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

import static project.pages.SearchResultPageObjects.*;

public class SearchResultPage extends BasePage<SearchResultPage> {

    public SearchResultPage isSearchResultPageDisplayed() {
        assertHelper.shouldContain(actionsHelper.getTextElement(searchResultPageContentTitle),
                "căutare");
        return this;
    }

    //TODO: waiter for this method
    public SearchResultPage verifyThatSearchIsDone() {
        List<WebElement> expectedSearchCriteria = actionsHelper.getElements(newExpectedSearchCriteria);
        List<String> expectedSearch = new ArrayList<String>();
        for (WebElement eSC : expectedSearchCriteria) {
            expectedSearch.add(eSC.getText());
        }
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        actionsHelper.clickElement(filterByMobilePhone);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        actionsHelper.clickElement(filterByAllCategory);
        List<WebElement> actualSearchCriteria = actionsHelper.getElements(newExpectedSearchCriteria);
        List<String> actualSearch = new ArrayList<String>();
        for (WebElement aSC : actualSearchCriteria) {
            actualSearch.add(aSC.getText());
        }
        return this;
    }
}
