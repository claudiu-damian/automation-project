package steps;

import cucumber.api.java.After;

import static project.TestContext.getDriver;

public class TestDesign {
    @After
    public void stopDriver() {
        getDriver().quit();
    }
}
