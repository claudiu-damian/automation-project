package project.pages;

import org.openqa.selenium.By;

public class ContactInfoLocationPage extends HomePage {
    private By contactPageContainsWebsite = By.xpath("//span[contains(text(),'zap.md')]");
    private By contactPageContainsAdress = By.xpath("//span[contains(text(),'Strada București 59, Chișinău 2012')]");

public ContactInfoLocationPage isMapWithLocationPresent(){
    actionsHelper.getElement(contactPageContainsWebsite).isDisplayed();
    actionsHelper.getElement(contactPageContainsAdress).isDisplayed();
    return this;
}

}
