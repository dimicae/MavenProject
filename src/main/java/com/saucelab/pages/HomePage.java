package com.saucelab.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageObject {


    @FindBy(className = "app_logo")
    WebElement appLogoLabel;

    public boolean appLogoIsDisplayed() {
        return appLogoLabel.isDisplayed();
    }


}
