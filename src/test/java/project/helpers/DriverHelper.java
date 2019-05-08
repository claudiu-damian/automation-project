package project.helpers;

import org.openqa.selenium.NoSuchSessionException;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import project.factory.DriverFactory;

import java.util.concurrent.TimeUnit;

public class DriverHelper implements Cloneable {
    static private WebDriver driver;

    public static void initDriver() {
        if (driver == null || !isActive()) {
            driver = DriverFactory.buildDriver();
            driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.manage().window().maximize();
        }
    }


    public static WebDriver getDriver() {
        return driver;
    }

    public static boolean isActive() {
        boolean isActive = true;
        try {
            driver.getCurrentUrl();
        } catch (UnhandledAlertException e) {
            driver.switchTo().alert();
        } catch (NoSuchSessionException e) {
            isActive = false;
        }
        return isActive;
    }

}

