package project.pages;

import org.openqa.selenium.By;
import project.helpers.ActionsHelper;

public class TabletsPage extends BasePage<TabletsPage>{
    private By tabletsPageHeadding = By.xpath("//div[@class='headding']");
    public By product = By.xpath("//td[@class='col-1 col-first']");
    public By filter = By.xpath("//*[@id=\"block-product_filter-67\"]/div/div/ul[1]/li/ul/li[1]/span/a");
    public TabletsPage isTabletsPageDisplayed() {
        assertHelper.shouldContain(actionsHelper.getTextElement(tabletsPageHeadding), "Tablete");
        return this;
    }
    public void accessFilter(){
        actionsHelper.clickElement(filter);

    }

    //TODO: make the method generic
    public ProductPage accessProductPage() {
        actionsHelper.clickElement(product);
        return new ProductPage();
    }


}
