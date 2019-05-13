package project;

import org.openqa.selenium.WebDriver;
import project.helpers.*;

public class TestContext {
    private static DriverHelper driverHelper = new DriverHelper();
    protected ActionsHelper actionsHelper = new ActionsHelper();
    protected AssertHelper assertHelper = new AssertHelper();
    protected LoggerHelper loggerHelper = new LoggerHelper();
    protected WaiterHelper waiterHelper = new WaiterHelper();

    public static WebDriver getDriver() {
        return DriverHelper.getDriver();
    }
}
