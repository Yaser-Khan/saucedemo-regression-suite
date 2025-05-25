package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductsPage {

    WebDriver driver;

    @FindBy(className = "title")
    WebElement pageTitle;

    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    WebElement addToCartButton;

    @FindBy(className = "shopping_cart_container")
    WebElement cartIcon;


    public ProductsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void addToCart(){
        addToCartButton.click();
    }

    public void goToCart(){
        cartIcon.click();
    }

    public boolean isAt() {
        return pageTitle.getText().equals("Products");
    }
}