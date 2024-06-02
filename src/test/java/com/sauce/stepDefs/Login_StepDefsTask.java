package com.sauce.stepDefs;

import com.sauce.pages.CartPage;
import com.sauce.pages.CheckoutPage;
import com.sauce.pages.LoginPage;
import com.sauce.pages.ProductsPage;
import org.checkerframework.checker.units.qual.C;

public class Login_StepDefsTask {
    LoginPage loginPage=new LoginPage();
    ProductsPage productsPage=new ProductsPage();
    CartPage cartPage=new CartPage();
    CheckoutPage checkoutPage=new CheckoutPage();


}
/**
 *
 * //username=standard_user
 * password=secret_sauce
 @Given("The user is on the login page")
 public void the_user_is_on_the_login_page() {
 Driver.get().get(ConfigurationReader.get("url"));

 }
 @When("The user enters {string} and {string} credentials")
 public void the_user_enters_and_credentials(String username, String password) {
 loginPage.login(username,password);

 }
 @Then("The user should be able to login sauce demo website")
 public void the_user_should_be_able_to_login_sauce_demo_website() {
 //assertEquals("Products",productsPage.productsText.getText());
 assertTrue(productsPage.productsText.isDisplayed());
 //BrowserUtils.verifyElementDisplayed(productsPage.productsText);
 }
 @When("The user enters invalid or empty {string} or {string} credentials")
 public void the_user_enters_invalid_or_empty_or_credentials(String username, String password) {
 loginPage.login(username, password);
 }
 @Then("The user should see the {string}")
 public void the_user_should_see_the(String expectedMsg) {
 assertEquals(expectedMsg,loginPage.errorMsg.getText());
 }

 *
 */