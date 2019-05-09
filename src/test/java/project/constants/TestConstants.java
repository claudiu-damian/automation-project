package project.constants;

import org.openqa.selenium.By;

public class TestConstants {
    public static final String URL = "https://www.zap.md/";
    // BasePage constants
    public static final By LOGO = By.xpath("//div[@id='dynamic-LOGO']");
    public static final By SEARCH_BAR = By.xpath("//input[@id='edit-keys']");
    public static final By SUB_CATEGORIES = By.xpath("//div[@id='subcategories']");
    public static final By CART_BUTTON = By.xpath("//span[@class='cart-icon']");
    public static final By PHONES = By.xpath("//span[contains(text(),'telefoane')]");
    public static final By TABLETS = By.xpath("//li[@class='simple']//a[contains(text(),'tablete')]");

    //Cart Page constants
    public static final By DELETE_FROM_CART_BUTTON = By.xpath("//td[@class='remove']//div");
    public static final By CART_CONTENT = By.xpath("//div[@id='main-content']");
    public static final String NO_CONTENT_IN_CART_WARNING = "Nu ai niciun produs în coş. Pentru a adăuga produse, te rugăm să te întorci în magazin.";

    //Filtered page constants
    public static final By PATH_OF_PRODUCTS = By.xpath("//div[@class='views-field-title']");
    public static final String IMPUTE_BOX_SEARCH = "Iphone";

    //Home page constants
    public static final By HOME_PAGE_SLIDE_SHOW = By.xpath("//body[contains(@class,'front not-logged-in page-node node-type-mainpage no-sidebars i18n-ro col-1')]/div[@id='content']/div[@id='page']/div/img[1]");

    //SubmenuPage
    public static final By TABLETS_PAGE_HEADING = By.xpath("//div[@class='headding']");
    public static final By PRODUCT = By.xpath("//td[@class='col-1 col-first']");
    public static final By FILTER = By.xpath("//*[@id=\"block-product_filter-67\"]/div/div/ul[1]/li/ul/li[1]/span/a");
}
