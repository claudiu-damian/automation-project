package project;

import org.junit.After;
import org.openqa.selenium.WebDriver;
import project.helpers.ActionsHelper;
import project.helpers.AssertHelper;
import project.helpers.DriverHelper;
import project.helpers.LoggerHelper;

public class TestContext {
    private static DriverHelper driverHelper = new DriverHelper();
    protected ActionsHelper actionsHelper = new ActionsHelper();
    protected AssertHelper assertHelper = new AssertHelper();
    protected LoggerHelper loggerHelper = new LoggerHelper();

    public static WebDriver getDriver() {
        return DriverHelper.getDriver();
    }
}
