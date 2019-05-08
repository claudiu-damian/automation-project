package project.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import project.helpers.ActionsHelper;
import project.helpers.AssertHelper;

import java.util.List;

import static project.TestContext.getDriver;

public class FilteredPage  extends TabletsPage{
    By webElements = By.xpath("//div[@class='views-field-title']");
    ActionsHelper actionsHelper = new ActionsHelper();
    AssertHelper assertHelper = new AssertHelper();



    public void checkTableFields( ) {
        String wordExpected;
        String wordPresent = actionsHelper.getElement(filter).getText();
        getDriver().manage().deleteAllCookies();
        List<WebElement> elements =  actionsHelper.getElements(webElements);
        for(WebElement element : elements)
        {
            wordExpected = element.getText();
            assertHelper.shouldContain(wordExpected,wordPresent);
        }

    }
}
