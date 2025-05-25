package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class ConfirmationPage {
    WebDriver driver;

    // Locators
    @FindBy(className = "complete-header")
    WebElement confirmationMessage;

    @FindBy(id = "back-to-products")
    WebElement backHomeButton;

    public ConfirmationPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //Actions
    public boolean isConfirmationDisplayed(){
        return confirmationMessage.isDisplayed();
    }

    public String getConfirmationsText(){
        return confirmationMessage.getText();
    }
    public void clickBackHome(){
        backHomeButton.click();
    }

    public void confirmationAndReturnHome(){
        if (!isConfirmationDisplayed()){
            throw new RuntimeException("Confirmation message was not displayed");
        }
        clickBackHome();
    }
}
