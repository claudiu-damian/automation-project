package project.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;


public class SearchResultPage extends BasePage<SearchResultPage> {


    private By searchResultPageContentTitle = By.xpath("//a[contains(.,'căutare')]");

    public SearchResultPage isSearchResultPageDisplayed() {
        assertHelper.shouldContain(actionsHelper.getTextElement(searchResultPageContentTitle),
                "căutare");
        return this;
    }

    public SearchResultPage verifyThatSearchIsDone() {
        List<WebElement> expectedSearchCriteria = actionsHelper.getElements(By.xpath("//*[@id=\"page-content\"]/div/div[2]/div[2]/table"));
        List<String> expectedSearch = new ArrayList<String>();
        for (WebElement eSC : expectedSearchCriteria) {
            expectedSearch.add(eSC.getText());
        }
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        actionsHelper.clickElement(By.xpath("//a[contains(text(),'telefoane mobile')]"));
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        actionsHelper.clickElement(By.xpath("//a[@class='selected-filter']"));
        List<WebElement> actualSearchCriteria = actionsHelper.getElements(By.xpath("//*[@id=\"page-content\"]/div/div[2]/div[2]/table"));
        List<String> actualSearch = new ArrayList<String>();
        for (WebElement aSC : actualSearchCriteria) {
            actualSearch.add(aSC.getText());
        }
        System.out.println(actualSearch);
        System.out.println(actualSearch.containsAll(expectedSearch));
        return this;
    }
    public void isProductPresent(String wordPresent) {
        checkTableFields(countTableRows(), 2, wordPresent);
    }

    public int countTableRows() {
        List<WebElement> totalRowsList = actionsHelper.getElements(By.tagName("tr"));
        int rowNumber = totalRowsList.size() - 1;
        return rowNumber;
    }

    public void checkTableFields(int rowNumber, int columnNumber, String wordPresent) {
        for (int row = 1; row <= rowNumber; row++) {
            By tableField = By.xpath(String.format("//tr[%s]//td[%s]", row, columnNumber));
            assertHelper.shouldContain(actionsHelper.getTextElement(tableField),
                    wordPresent);
        }
    }
}
