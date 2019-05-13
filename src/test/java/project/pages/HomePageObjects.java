package project.pages;

import org.openqa.selenium.By;

public class HomePageObjects {
    static final By homePageSlideShow = By.xpath("//body[contains(@class,'front not-logged-in page-node node-type-mainpage no-sidebars i18n-ro col-1')]/div[@id='content']/div[@id='page']/div/img[1]");
    static final By homePagePhoneInfo = By.xpath("//span[@class='ctatext-phone']");
    static final By homePageAddressInfo = By.xpath("//span[@class='ctatext-location']");
    static final By twitterButton = By.xpath("//a[contains(text(),'twitter')]");
    static final By facebookButton = By.xpath("//a[contains(text(),'facebook')]");
}
