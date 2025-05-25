package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage {
    WebDriver driver;

    // Locators
    @FindBy(id = "first-name")
    WebElement firstNameInput;

    @FindBy(id = "last-name")
    WebElement lastNameInput;

    @FindBy(id = "postal-code")
    WebElement zipCodeInput;

    @FindBy(id = "continue")
    WebElement continueButton;

    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //Actions
    public void enterFirstName(String firstName){
        firstNameInput.sendKeys(firstName);
    }

    public void enterLastName(String lastName){
        lastNameInput.sendKeys(lastName);
    }

    public void enterZipCode(String zipCode){
        zipCodeInput.sendKeys(zipCode);
    }

    public void clickContinue(){
        continueButton.click();
    }

    public void enterInfo(String firstName, String lastName, String zipCode){
        enterFirstName(firstName);
        enterLastName(lastName);
        enterZipCode(zipCode);
        clickContinue();
    }

}