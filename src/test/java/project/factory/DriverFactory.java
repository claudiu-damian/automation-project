package project.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DriverFactory {
    private static final String BROWSER_CHROME = "chrome";
    private static final String PATH_CHROME_DRIVER = "src\\test\\resources\\chromedriver.exe";

    private static final String BROWSER_IE = "ie";
    private static final String PATH_IE_DRIVER = "src\\test\\resources\\IEDriverServer.exe";


    public static WebDriver buildDriver() {
        ConfigFileRead configFileRead = new ConfigFileRead();
        String browser = configFileRead.readPropertyFile();

        if (browser.equalsIgnoreCase(BROWSER_CHROME))
            return buildChromeDriver();

        else if (browser.equalsIgnoreCase(BROWSER_IE)) {
            return buildInternetExplorer();
        }

        throw new Error("Unsupported browser.");
    }

    private static WebDriver buildChromeDriver() {
        System.setProperty("webdriver.chrome.driver", PATH_CHROME_DRIVER);
        return new ChromeDriver();
    }

    private static WebDriver buildInternetExplorer() {
        System.setProperty("webdriver.ie.driver",  PATH_IE_DRIVER);
        return new InternetExplorerDriver();
    }
}
