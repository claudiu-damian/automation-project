package project.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static project.constants.TestConstants.*;

public class CartPage extends BasePage<CartPage> {



    //TODO: make the column number generic
    public void isProductPresent(String wordPresent) {
        checkTableFields(countTableRows(), 2, wordPresent);
    }

    public int countTableRows() {
        List<WebElement> totalRowsList = actionsHelper.getElements(By.tagName("tr"));
        int rowNumber = totalRowsList.size() - 1;
        return rowNumber;
    }

    public void checkTableFields(int rowNumber, int columnNumber, String wordPresent) {
        for (int row = 1; row <= rowNumber; row++) {
            By tableField = By.xpath(String.format("//tr[%s]//td[%s]", row, columnNumber));
            assertHelper.shouldContain(actionsHelper.getTextElement(tableField),
                    wordPresent);
        }
    }

    public void pressDeleteFromCartButton() {
        actionsHelper.clickElement(DELETE_FROM_CART_BUTTON);
    }

    public void checkIfThereAreNoProductsInCart() {
        actionsHelper.deleteAllCoockies();
        assertHelper.shouldContain(actionsHelper.getTextElement(CART_CONTENT), NO_CONTENT_IN_CART_WARNING);
    }

}
