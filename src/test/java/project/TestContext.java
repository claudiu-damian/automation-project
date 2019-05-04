package project;

import org.junit.After;
import org.openqa.selenium.WebDriver;
import project.helpers.ActionsHelper;
import project.helpers.AssertHelper;
import project.helpers.DriverHelper;

public class TestContext {
    private static DriverHelper driverHelper = new DriverHelper();
    protected ActionsHelper actionsHelper = new ActionsHelper();
    protected AssertHelper assertHelper = new AssertHelper();

    public static WebDriver getDriver() {
        return driverHelper.getDriver();
    }

}
