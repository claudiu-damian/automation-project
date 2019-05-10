package project.helpers;

import org.openqa.selenium.By;
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
}
