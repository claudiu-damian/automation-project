package steps;

import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import project.TestBase;
import project.pages.TabletsPage;

public class NextProductsButton extends TestBase {
    TabletsPage tabletsPage = new TabletsPage();

    @Then("selects laptops subcategory")
    public void selectsLaptopsSubcategory() {
        actionsHelper.clickElement(By.xpath("//span[contains(text(),'telefoane')]"));
        actionsHelper.clickElement(By.xpath("//li[@class='simple first']//a[contains(text(),'telefoane mobile')]"));
    }

    @Then("clicks on if there are over 60 products on page")
    public void clicksOnUrmătoareleProduseIfThereAreOverProducts() {
        tabletsPage.checkNextProductButton();
    }
}
