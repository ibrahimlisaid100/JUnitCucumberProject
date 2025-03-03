package com.CYDEO.StepDefinitions;

import com.CYDEO.Pages.libraryPages;
import com.CYDEO.Utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class libraryStepDefinitions {

    libraryPages libraryPages = new libraryPages();

    @When("user is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get("https://library1.cydeo.com/login.html");
    }

    @When("user input {word}")
    public void user_input_username() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(libraryPages.username));

   libraryPages.username.sendKeys("saidibrahimli@gmsil.vom");

    }
    @When("user input password")
    public void user_input_password() {
        libraryPages.password.sendKeys("asdfdfasdfsdf");
    }
    @Then("user should see the invalid credential message")
    public void user_should_see_the_invalid_credential_message() {

        libraryPages.loginButton.click();

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(libraryPages.wrongCredentialsMsg));
        String actual = libraryPages.wrongCredentialsMsg.getText();
        String expected = "Sorry, Wrong Email or Password";
        Assert.assertEquals(expected,actual);
    }

}
