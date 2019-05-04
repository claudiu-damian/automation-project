package project.helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import project.TestContext;

import java.util.List;

public class ActionsHelper {

    private WebDriver getDriver() {
        return TestContext.getDriver();
    }

    public void navigateTo(String link) {
        getDriver().get(link);
    }

    public WebElement getElement(By by) {
        return getDriver().findElement(by);
    }

    public void clickElement(By by) {
        getElement(by).click();
    }

    public void isElementDisplayed(By by) {
        getElement(by).isDisplayed();
    }

    public void sendStringKeysToElement(By by, String keys) {
        getElement(by).sendKeys(keys);
    }

    public void sendKeysToElement(By by, Keys keys) {
        getElement(by).sendKeys(keys);
    }

        public List<WebElement> getElements(By by) {
        return getDriver().findElements(by);
    }

    public String getTextElement(By by) {
        return getElement(by).getText();
    }

}