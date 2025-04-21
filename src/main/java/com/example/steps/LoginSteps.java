package com.example.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import com.example.utils.ConfigReader;
import com.example.pages.LoginPage;
import com.example.utils.DriverFactory;

public class LoginSteps {

    private LoginPage loginPage;
    private WebDriver driver;
    private DriverFactory driverFactory;

    public LoginSteps() { driverFactory = new DriverFactory();
        this.driver = driverFactory.getDriver(); loginPage = new LoginPage(driver);}

    @Given("I am on the login page")
    public void i_am_on_the_login_page() {
        loginPage.navigateToLoginPage();
    }

    @When("I enter valid credentials")
    public void i_enter_valid_credentials() {
        loginPage.enterCredentials("testuser", "testpassword");

    }

    @When("I click the login button")
    public void i_click_the_login_button() {
        loginPage.clickLoginButton();
    }

    @Then("I should be redirected to the dashboard")
    public void i_should_be_redirected_to_the_dashboard() {
        Assert.assertTrue(loginPage.isOnDashboard());
    }

    @When("I enter invalid credentials")
    public void i_enter_invalid_credentials() {
        loginPage.enterCredentials("invalid", "invalid");
    }

    @Then("I should see an error message")
    public void i_should_see_an_error_message() {
        Assert.assertTrue(loginPage.hasErrorMessage());
    }
}