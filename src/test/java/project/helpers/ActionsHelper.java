package project.helpers;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import project.TestContext;

import java.util.List;
import java.util.concurrent.TimeUnit;

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

    public Alert switchToAlert() {
        return getDriver().switchTo().alert();
    }

    public String getAlertText() {
        return switchToAlert().getText();
    }

    public void deleteAllCookies() {
        getDriver().manage().deleteAllCookies();
    }
}