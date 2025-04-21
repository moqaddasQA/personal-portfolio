package com.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {

    // Constructor
    public HomePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    // Locators
    @FindBy(name = "search")
    private WebElement searchBox;

    @FindBy(css = "button.btn.btn-default.btn-lg")
    private WebElement searchButton;

    @FindBy(linkText = "My Account")
    private WebElement myAccountLink;

    @FindBy(linkText = "Login")
    private WebElement loginLink;

    // Actions
    public void searchForProduct(String productName) {
        enterText(searchBox, productName);
        clickElement(searchButton);
    }

    public void clickMyAccount() {
        clickElement(myAccountLink);
    }

    public void clickLogin() {
        clickElement(loginLink);
    }

    public boolean isHomePageDisplayed() {
        return searchBox.isDisplayed();
    }
}