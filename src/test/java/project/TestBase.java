package project;

import project.constants.TestConstants;
import project.pages.HomePage;

public class TestBase extends TestContext {
    public HomePage accessWebPage() {
        actionsHelper.navigateTo(TestConstants.URL);
        return new HomePage();
    }
}