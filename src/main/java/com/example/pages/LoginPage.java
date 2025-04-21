package com.example.pages;

import com.example.utils.ConfigReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {
    public LoginPage() {
        super(null);
    }
    // Constructor
    public LoginPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    // Locators
    @FindBy(id = "username")
    private WebElement usernameField;

    @FindBy(id = "password")
    private WebElement passwordField;

    @FindBy(id = "login")
    private WebElement loginButton;

    @FindBy(className = "icon-user")
    private WebElement dashboardIcon;
    @FindBy(className = "alert-danger")
    private WebElement errorMessage;
    // Actions
    public void enterUsername(String text) {
        enterText(usernameField, text);
    }

    public void enterPassword(String text) {
        enterText(passwordField, text);
    }

    public void clickLoginButton() {
        clickElement(loginButton);
    }

    public boolean isOnDashboard() {
        return isElementDisplayed(dashboardIcon);
    }

    public boolean hasErrorMessage() {
        return isElementDisplayed(errorMessage);
    }
}