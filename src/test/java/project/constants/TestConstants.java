package project.constants;

import org.openqa.selenium.By;

public class TestConstants {
    public static final String URL = "https://www.zap.md/";

    //Filtered page constants
    public static final By PATH_OF_PRODUCTS = By.xpath("//div[@class='views-field-title']");
    public static final String IMPUTE_BOX_SEARCH = "iPhone";


    public static final By NEXT_PRODUCTS_BUTTON = By.xpath("//a[contains(text(),'Următoarele produse')]");
    public static final int MAX_NUMBER_OF_PRODUCTS_PER_PAGE = 60;

}
