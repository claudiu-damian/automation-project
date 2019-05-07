package project.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import project.helpers.LoggerHelper;

import java.util.List;


public class SearchResultPage extends BasePage<SearchResultPage> {


    private By searchResultPageContentTitle = By.xpath("//a[contains(.,'căutare')]");

    public SearchResultPage isSearchResultPageDisplayed() {
        assertHelper.shouldContain(actionsHelper.getTextElement(searchResultPageContentTitle),
                "căutare");
        return this;
    }

    public void checkFields(int rowNumber, int columnNumber, String wordPresent) {
        for (int row = 1; row <= rowNumber; row++)
            for (int column = 1; column <= columnNumber; column++) {
                By tableField = By.xpath(String.format("//tr[@class='row-%s row-first']//td[@class='col-%s']", row, column));
                assertHelper.shouldContain(actionsHelper.getTextElement(tableField), wordPresent);
                System.out.println("massiv");
            }

    }

    public int countTableRows() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement tableElements = actionsHelper.getElement(By.xpath("//*[@id=\"page-content\"]/div/div[2]/div[2]/table"));
        List<WebElement> totalRowsList = tableElements.findElements(By.tagName("tr"));
        int rowNumber = totalRowsList.size() - 1;
        System.out.println(totalRowsList.size());
//        System.out.println(rowNumber);
        return rowNumber;
    }

    public int countTableColumns() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement tableElements = actionsHelper.getElement(By.xpath("//*[@id=\"page-content\"]/div/div[2]/div[2]/table"));
        List<WebElement> totalColumnList = tableElements.findElements(By.tagName("td"));
        int columnNumber = totalColumnList.size() - 1;
        System.out.println(totalColumnList.size());
//        System.out.println(columnNumber);
        return columnNumber;
    }

    public SearchResultPage verifyThatSearchIsDone() {
        loggerHelper.logger.info("Step1");
        System.out.println("four");
        checkFields(countTableRows(), countTableColumns(), "iPhone");
        System.out.println("five");
        return this;
    }
}
