package project.pages;

import org.openqa.selenium.By;

public class CartPageObjects {
    static final By deleteFromCartButton = By.xpath("//td[@class='remove']//div");
    static final By cartContent = By.xpath("//div[@id='main-content']");
    static final String noContentInCartWarning = "Nu ai niciun produs în coş. Pentru a adăuga produse, te rugăm să te întorci în magazin.";
}
