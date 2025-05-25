package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OverviewPage {
    WebDriver driver;

    // Locators
    @FindBy(id = "finish")
    WebElement finishButton;

    public OverviewPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //Actions
    public void clickFinish(){
        finishButton.click();
    }

    public void reviewAndFinish(){
        clickFinish();
    }

}
