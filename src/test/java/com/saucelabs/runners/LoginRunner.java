package com.saucelabs.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/login.feature",
        glue = "com.saucelabs.definitions",
        plugin={"pretty","json:target/cucumber-reports/Cucumber.json"})

public class LoginRunner {
}
