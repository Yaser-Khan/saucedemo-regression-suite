package stepDefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.*;

public class BuyProductsStep {
    WebDriver driver;
    LoginPage loginPage;
    ProductsPage productsPage;
    CartPage cartPage;
    CheckoutPage checkoutPage;
    ConfirmationPage confirmationPage;
    OverviewPage overviewPage;

    @Given("i am on the SauceDemo login page")

    public void i_am_on_the_sauce_demo_login_page() {
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        loginPage = new LoginPage(driver);
        productsPage = new ProductsPage(driver);
        cartPage = new CartPage(driver);
        checkoutPage = new CheckoutPage(driver);
        confirmationPage = new ConfirmationPage(driver);
        overviewPage = new OverviewPage(driver);
    }

    @When("I log in with valid credentials")
    public void i_login_with_valid_credentials(){
        loginPage.login("standard_user", "secret_sauce");


    }

    @When("I add a product to the cart")
    public void i_add_a_product_to_the_cart(){
        productsPage.addToCart();
        productsPage.goToCart();
    }

    @When("I proceed to checkout")
    public void i_proceed_to_checkout(){
        cartPage.clickCheckout();
    }

    @When("I enter the checkout information with first name {string}, last name {string}, and zip code {string}")
    public void i_enter_the_checkout_information(String firstName, String lastName, String zipCode){
        checkoutPage.enterInfo(firstName, lastName, zipCode);
    }

    @When("I finish reviewing my order")
    public void i_finish_reviewing_my_order(){
        overviewPage.clickFinish();
    }

    @When("I should see the order confirmation page")
    public void i_should_see_the_order_confirmation_page(){
        confirmationPage.confirmationAndReturnHome();
        //Assert.assertTrue(confirmationPage.isConfirmationDisplayed());
    }

}
