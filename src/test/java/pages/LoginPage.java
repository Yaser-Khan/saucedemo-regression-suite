package pages;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    WebDriver driver;

    // Locators

    @FindBy(id = "user-name")

    WebElement usernameInput;

    @FindBy(id = "password")

    WebElement passwordInput;

    @FindBy(id = "login-button")

    WebElement loginButton;

    // Constructor

    public LoginPage(WebDriver driver) {

        this.driver = driver;

        PageFactory.initElements(driver, this);

    }

    // Actions

    public void enterUsername(String username) {

        usernameInput.sendKeys(username);

    }

    public void enterPassword(String password) {

        passwordInput.sendKeys(password);

    }

    public void clickLogin() {

        loginButton.click();

    }

    public void login(String username, String password) {

        enterUsername(username);

        enterPassword(password);

        clickLogin();

    }

}

