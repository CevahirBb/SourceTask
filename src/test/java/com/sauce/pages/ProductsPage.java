package com.sauce.pages;

import com.sauce.utilities.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class ProductsPage extends BasePage{
    @FindBy(className = "title")
    public WebElement productsText;

    @FindBy(className = "product_sort_container")
    public WebElement dropDown;

    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    public WebElement secondProduct;

    @FindBy(id = "add-to-cart-sauce-labs-onesie")
    public WebElement cheapestProduct;

    @FindBy(id = "add-to-cart-sauce-labs-onesie" )
    public WebElement addBtnCheaper;

    @FindBy(id = "add-to-cart-sauce-labs-backpack" )
    public WebElement addBtnSecond;
    @FindBy(className = "shopping_cart_link")
    public WebElement basket;

    public void selectDropdown(String dropSelect){
        Select selectDay=new Select(dropDown);
        BrowserUtils.waitFor(2);
        selectDay.selectByValue(dropSelect);
    }

}
