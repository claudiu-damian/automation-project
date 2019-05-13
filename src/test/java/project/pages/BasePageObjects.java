package project.pages;

import org.openqa.selenium.By;

public class BasePageObjects {
    static final By logo = By.xpath("//div[@id='dynamic-logo']");
    static final By searchBar = By.xpath("//input[@id='edit-keys']");
    static final By subCategories = By.xpath("//div[@id='subcategories']");
    static final By nextImageRightButton = By.xpath("//button[@class='slider-arrow slider-arrow-right']");
    static final By nextImageLeftButton = By.xpath("//button[@class='slider-arrow slider-arrow-left']");
    static final By cartButton = By.xpath("//span[@class='cart-icon']");
    static final By phones = By.xpath("//span[contains(text(),'telefoane')]");
    static final By tablets = By.xpath("//li[@class='simple']//a[contains(text(),'tablete')]");
}
