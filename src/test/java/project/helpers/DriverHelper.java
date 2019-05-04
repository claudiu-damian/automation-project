package project.helpers;

import org.openqa.selenium.NoSuchSessionException;
import org.openqa.selenium.WebDriver;
import project.factory.DriverFactory;

import java.util.concurrent.TimeUnit;

public class DriverHelper {
    static private WebDriver driver;

    public WebDriver getDriver() {
        if (driver == null || !isActive()) {
            driver = DriverFactory.buildDriver();
            driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
            driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        }
        return driver;
    }

    public boolean isActive() {
        boolean isActive = true;
        try {
            driver.getCurrentUrl();
        } catch (NoSuchSessionException e) {
            isActive = false;
        }
        return isActive;
    }
}

