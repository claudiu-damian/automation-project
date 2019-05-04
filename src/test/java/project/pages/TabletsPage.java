package project.pages;

import org.openqa.selenium.By;

public class TabletsPage extends BasePage<TabletsPage>{
    private By tabletsPageHeadding = By.xpath("//div[@class='headding']");
    public By product = By.xpath("//td[@class='col-1 col-first']");

    public TabletsPage isTabletsPageDisplayed() {
        assertHelper.shouldContain(actionsHelper.getTextElement(tabletsPageHeadding), "Tablete");
        return this;
    }

    //TODO: make the method generic
    public ProductPage accessProductPage() {
        actionsHelper.clickElement(product);
        return new ProductPage();
    }
}
