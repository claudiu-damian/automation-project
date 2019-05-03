package project;

import org.junit.After;
import org.openqa.selenium.WebDriver;
import project.helpers.DriverHelper;

public class TestContext {
    private static DriverHelper driverHelper = new DriverHelper();

    public static WebDriver getDriver() {
        return driverHelper.getDriver();
    }

    @After
    public void stopDriver() {
        getDriver().quit();
    }
}
