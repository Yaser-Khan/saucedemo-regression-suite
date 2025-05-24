package stepDefinitions;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LoginPage;
import pages.ProductsPage;


public class LoginSteps {

    WebDriver driver;

    LoginPage loginPage;

    ProductsPage productsPage;

    @Given("I am on the SauceDemo login page")

    public void i_am_on_the_sauce_demo_login_page() {

        // Set your ChromeDriver path if needed, or make sure it's in PATH

        driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com/");

        loginPage = new LoginPage(driver);

        productsPage = new ProductsPage(driver);

    }

    @When("I login with username {string} and password {string}")

    public void i_login_with_username_and_password(String username, String password) {

        loginPage.login(username, password);

    }

    @Then("I should be redirected to the products page")

    public void i_should_be_redirected_to_the_products_page() {

        Assert.assertTrue("Not redirected to products page", productsPage.isAt());

        driver.quit();

    }

    @Then("I should see an error message")

    public void i_should_see_an_error_message() {

        String errorText = driver.findElement(By.cssSelector("[data-test='error']")).getText();

        Assert.assertFalse("Expected error message, but none found", errorText.isEmpty());

        driver.quit();

    }

}

