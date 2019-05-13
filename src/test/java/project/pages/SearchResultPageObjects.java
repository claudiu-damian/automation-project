package project.pages;

import org.openqa.selenium.By;

public class SearchResultPageObjects {
    static final By searchResultPageContentTitle = By.xpath("//a[contains(.,'căutare')]");
    static final By newExpectedSearchCriteria = By.xpath("//*[@id=\"page-content\"]/div/div[2]/div[2]/table");
    static final By filterByMobilePhone = By.xpath("//a[contains(text(),'telefoane mobile')]");
    static final By filterByAllCategory = By.xpath("//a[@class='selected-filter']");
}
