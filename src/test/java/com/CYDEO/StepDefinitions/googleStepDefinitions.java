package com.CYDEO.StepDefinitions;

import com.CYDEO.Pages.googlePages;
import com.CYDEO.Utilities.BrowserUtils;
import com.CYDEO.Utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class googleStepDefinitions {
    googlePages googlePage = new googlePages();

    @When("User is on the google main page")
    public void user_is_on_the_google_main_page() {
        Driver.getDriver().get("https://www.google.com");
    }
    @Then("User should see tittle is Google")
    public void user_should_see_tittle_is_google() {
        BrowserUtils.verifyTittle("Google");
    }

    @When("user input apple in the search box")
    public void userInputAppleInTheSearchBox() {
googlePage.searchbox.sendKeys("apple", Keys.RETURN);


    }

    @Then("user should see the tittle is apple - Google Search")
    public void userShouldSeeTheTittleIsAppleGoogleSearch() {

        String expected = "apple - Google Search";
        String actual = Driver.getDriver().getTitle();

        Assert.assertEquals(expected,actual);
    }
}
