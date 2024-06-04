package com.sauce.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage extends BasePage {

    @FindBy(xpath = "//span[text()='Your Cart']")
    public WebElement yourCartMsg;

    @FindBy(id = "checkout")
    public WebElement chkOutBtn;
}
