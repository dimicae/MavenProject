package com.saucelabs.definitions;

import com.saucelab.pages.HomePage;
import com.saucelab.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import static org.junit.Assert.*;

public class LoginDefinition {

    @Steps
    HomePage homePage;

    @Steps
    LoginPage loginPage;

    @Given("the User is on SauceDemo login page")
    public void openPage() {
        loginPage.navigateToUrl("https://www.saucedemo.com/");
    }

    @When("the user enters the correct user and password")
    public void loginPage() {
        loginPage.enterUserName("standard_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickLoginButton();
    }

    @Then("the user should see the Welcome message")
    public void validateMessage() {
        assertTrue(homePage.appLogoIsDisplayed());
    }
}
