package project.helpers;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import static project.helpers.DriverHelper.getDriver;

public class WaiterHelper {
    private WebDriverWait wait = new WebDriverWait(getDriver(), 10);

    public void waitUntilElementIsPresent(By by) {
        wait.until(ExpectedConditions.presenceOfElementLocated(by));
    }

    public void implicitlyWait(int sec) {
        getDriver().manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);
    }

    public void waitForPageLoaded() {
        ExpectedCondition<Boolean> expectation = driver -> ((JavascriptExecutor) driver).executeScript("return document.readyState").toString().equals("complete");
        try {
            Thread.sleep(1000);
            WebDriverWait wait = new WebDriverWait(getDriver(), 30);
            wait.until(expectation);
        } catch (Throwable error) {
            Assert.fail("Timeout waiting for Page Load Request to complete.");
        }
    }
}
