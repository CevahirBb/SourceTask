package com.sauce.stepDefs;

import com.sauce.pages.CartPage;
import com.sauce.pages.CheckoutPage;
import com.sauce.pages.LoginPage;
import com.sauce.pages.ProductsPage;
import com.sauce.utilities.BrowserUtils;
import com.sauce.utilities.ConfigurationReader;
import com.sauce.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.*;
public class Login_StepDefs {
    LoginPage loginPage=new LoginPage();
    ProductsPage productsPage=new ProductsPage();
    CartPage cartPage=new CartPage();
    CheckoutPage checkoutPage=new CheckoutPage();
 @Given("The user is on the login page")
 public void the_user_is_on_the_login_page() {
  Driver.get().get(ConfigurationReader.get("url"));
 }
 @When("The user enters {string} and {string} credentials")
 public void the_user_enters_and_credentials(String username, String password) {
  loginPage.login(username,password);

 }
 @When("The user should be able to login sauce demo website")
 public void the_user_should_be_able_to_login_sauce_demo_website() {
  assertTrue(productsPage.productsText.isDisplayed());
  BrowserUtils.waitFor(1);

 }
 @When("The user should able to sorting the products sort container")
 public void the_user_should_able_to_sorting_the_products_sort_container() {
  assertTrue(productsPage.dropDown.isDisplayed());
  BrowserUtils.waitFor(1);
 }
 @When("The user selects {string}")
 public void the_user_selects(String dropSelect) {
  BrowserUtils.waitFor(2);
  productsPage.selectDropdown(dropSelect);
  BrowserUtils.waitFor(1);
 }
 @When("The user selects the {string} and {string}")
 public void the_user_selects_the_and(String product1, String product2) {
//  productsPage.secondProduct.click();
//  BrowserUtils.waitFor(1);
//  productsPage.cheapestProduct.click();
}
 @When("The user should able to add {string} and {string} to basket")
 public void the_user_should_able_to_add_and_to_basket(String cheaper, String second) {
  BrowserUtils.waitFor(2);
  productsPage.addBtnSecond.click();
  BrowserUtils.waitFor(1);
  productsPage.addBtnCheaper.click();
  BrowserUtils.waitFor(1);

 }
 @When("The user opens the basket")
 public void the_user_opens_the_basket() {
  BrowserUtils.waitFor(2);
  productsPage.basket.click();
  BrowserUtils.waitFor(2);
  cartPage.chkOutBtn.click();
 }
 @When("The user enters {string} and {string} and {string}")
 public void the_user_enters_and_and(String name, String lastname, String zip) {
  checkoutPage.enterInfo(name,lastname,zip);
 }
 @When("The user click on the {string} button")
 public void the_user_click_on_the_button(String finishButton) {
  checkoutPage.finishBtn.click();
  BrowserUtils.waitFor(2);
 }
 @When("The user should be able to finish")
 public void the_user_should_be_able_to_finish() {
  assertTrue(checkoutPage.checkoutCompleteText.isDisplayed());
 }
 @When("The user clicks on the {string} button")
 public void the_user_clicks_on_the_button(String backHome) {
  checkoutPage.backHomeBtn.click();
  BrowserUtils.waitFor(2);
 }
 @Then("The user should be able to go to product page again")
 public void the_user_should_be_able_to_go_to_product_page_again() {
  assertTrue(productsPage.productsText.isDisplayed());
  BrowserUtils.waitFor(2);
 }}
