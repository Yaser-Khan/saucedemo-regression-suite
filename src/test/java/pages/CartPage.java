package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
    WebDriver driver;

    // Locators
    @FindBy(id = "cart_item")
    WebElement cartItem;

    @FindBy(id = "checkout")
    WebElement checkoutButton;

    public CartPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //Actions

    //First we verify the presence of the product in the cart
    public boolean isProductInCart() {

        return cartItem.isDisplayed();
    }

    // Proceed to the checkout page
    public void clickCheckout() {
        checkoutButton.click();
    }

    public void verifyAndCheckout(){
        if (isProductInCart()){
            clickCheckout();
        } else {
            throw new IllegalStateException("No product available in cart");
        }
    }
}
