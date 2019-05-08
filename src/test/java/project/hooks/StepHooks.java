package project.hooks;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import project.helpers.DriverHelper;

import static project.helpers.DriverHelper.getDriver;

public class StepHooks {


    @Before
    public void initDriver() {
        DriverHelper.initDriver();
    }


    @After
    public void stopDriver() {
        if(getDriver() != null) {
            getDriver().quit();
        }
    }
}
