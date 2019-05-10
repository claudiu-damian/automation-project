package project.constants;

import org.openqa.selenium.By;

public class TestConstants {
    public static final String URL = "https://www.zap.md/";

    //Cart Page constants
    public static final By DELETE_FROM_CART_BUTTON = By.xpath("//td[@class='remove']//div");
    public static final By CART_CONTENT = By.xpath("//div[@id='main-content']");
    public static final String NO_CONTENT_IN_CART_WARNING = "Nu ai niciun produs în coş. Pentru a adăuga produse, te rugăm să te întorci în magazin.";

    //Filtered page constants
    public static final By PATH_OF_PRODUCTS = By.xpath("//div[@class='views-field-title']");
    public static final String IMPUTE_BOX_SEARCH = "iPhone";

    //Home page constants
    public static final By HOME_PAGE_SLIDE_SHOW = By.xpath("//body[contains(@class,'front not-logged-in page-node node-type-mainpage no-sidebars i18n-ro col-1')]/div[@id='content']/div[@id='page']/div/img[1]");

    //SubmenuPage
    public static final By TABLETS_PAGE_HEADING = By.xpath("//div[@class='headding']");
    public static final By PRODUCT = By.xpath("//td[@class='col-1 col-first']");
    public static final By FILTER = By.xpath("//*[@id=\"block-product_filter-67\"]/div/div/ul[1]/li/ul/li[5]/span/a");
    //
    public static final By NEXT_PRODUCTS_BUTTON = By.xpath("//a[contains(text(),'Următoarele produse')]");
    public static final int MAX_NUMBER_OF_PRODUCTS_PER_PAGE = 60;

}
