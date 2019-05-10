package steps;

import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import project.helpers.ActionsHelper;

import java.util.List;

public class NextProductsButton {
    @Then("selects laptops subcategory")
    public void selectsLaptopsSubcategory() {
        ActionsHelper actionsHelper = new ActionsHelper();
        actionsHelper.clickElement(By.xpath("//span[contains(text(),'telefoane')]"));
        actionsHelper.clickElement(By.xpath("//li[@class='simple first']//a[contains(text(),'telefoane mobile')]"));
    }

    @Then("clicks on  if there are over  products")
    public void clicksOnUrmătoareleProduseIfThereAreOverProducts() throws InterruptedException {
        By webElements = By.xpath("//div[@class='views-field-title']");
        ActionsHelper actionsHelper = new ActionsHelper();
        List<WebElement> elements = actionsHelper.getElements(webElements);
        int number = elements.size();
        WebElement button = actionsHelper.getElement(By.xpath("//a[contains(text(),'Următoarele produse')]"));

        while (button.isDisplayed()) {
            button.click();

            int newNumberOfItems = elements.size();
            if (newNumberOfItems > number) {
                number = newNumberOfItems;
                button.click();
                System.out.println(newNumberOfItems);
            } else {
                System.out.println(newNumberOfItems);break;}

        }

    }
}
