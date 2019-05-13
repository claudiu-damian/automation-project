package project.constants;

import org.openqa.selenium.By;

public class TestConstants {
    public static final String URL = "https://www.zap.md/";

    //Filtered page constants
    public static final By PATH_OF_PRODUCTS = By.xpath("//div[@class='views-field-title']");
    public static final String IMPUTE_BOX_SEARCH = "iPhone";


    public static final By NEXT_PRODUCTS_BUTTON = By.xpath("//a[contains(text(),'Următoarele produse')]");
    public static final int MAX_NUMBER_OF_PRODUCTS_PER_PAGE = 60;
    public static final By ALPHANUMERC_FILTER = By.xpath("//a[@class='title sort-title']");

    public static final String CONTACTLOCATIONURL = "https://www.google.com/maps/place/Zap/@47.0195866,28.8288329,17z/data=!4m5!3m4!1s0x0:0x6f6d937bcdb0ed8d!8m2!3d47.0192122!4d28.8312122";
}
