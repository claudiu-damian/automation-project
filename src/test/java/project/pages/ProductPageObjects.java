package project.pages;

import org.openqa.selenium.By;

public class ProductPageObjects {
    static final By addToCartButton = By.xpath("//div[@id='add-to-cart']");
    static final By description = By.xpath("//div[@class='description-text']");
    static final By specifications = By.xpath("//div[@id='specs-main']");
    static final By image = By.xpath("//div[@class='zaps-slider-image first']");
    static final By orderNowButton = By.xpath("//div[@id='product-order']");
    static final By confirmOrderButton = By.xpath("//form[@id='zaps-byprod-buynow-form']//div[@class='b-confirm']");
    static final By instructionForInstantOrder = By.xpath("//div[contains(text(),'Pentru a cumpăra rapid acest produs completează fo')]");
    static final By nameField = By.xpath("//input[@id='edit-user-name']");
    static final By phoneNumberField = By.xpath("//input[@id='edit-user-phone']");
    static final By orderConfirmation = By.xpath("//div[@class='product-buy-success creditenabled']");
    static final By okButton = By.xpath("//div[@class='ok-button']");
    static final By confirmationText = By.xpath("//span[@class='span1']");
    static final By instructionText = By.xpath("//span[@class='span2']");
    static final By nextPictureRightSlideButton = By.xpath("//button[@class='slider-arrow slider-arrow-right']");
    static final By firstSliderPicture = By.xpath("//div[@class='zaps-slider-image first']//img[@class='imagecache imagecache-product-large imagecache-default imagecache-product-large_default']");
    static final By secondSliderPicture = By.xpath("///div[@class='holder']//div[2]//img[1]");
    static final By thirdSliderPicture = By.xpath("//div[@class='container-1200']//div[3]//img[1]");
    static final By fourthSliderPicture = By.xpath("//div[@class='container-1200']//div[4]//img[1]");
    static final By fiveSliderPicture = By.xpath("//div[@class='container-1200']//div[5]//img[1]");
    static final By lastSliderPicture = By.xpath("//div[@class='zaps-slider-image last']//img[@class='imagecache imagecache-product-large imagecache-default imagecache-product-large_default']");
}
