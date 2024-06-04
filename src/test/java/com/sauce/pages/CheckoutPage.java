package com.sauce.pages;

import com.sauce.utilities.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage extends BasePage {
    @FindBy(id = "first-name")
    public WebElement nameInput;

    @FindBy(id = "last-name")
    public WebElement lastNameInput;

    @FindBy(id = "postal-code")
    public WebElement zipcode;

    @FindBy(id = "continue")
    public WebElement continueBtn;
    @FindBy(className = "title")
    public WebElement checkoutText;

    @FindBy(id = "finish")
    public WebElement finishBtn;

    @FindBy(className = "title")
    public WebElement checkoutCompleteText;

    @FindBy(id = "back-to-products")
    public WebElement backHomeBtn;

    public void enterInfo(String name, String lastname, String zip) {
        nameInput.sendKeys(name);
        lastNameInput.sendKeys(lastname);
        zipcode.sendKeys(zip);
        BrowserUtils.waitFor(2);
        continueBtn.click();
        BrowserUtils.waitFor(1);

    }

}
