package com.CYDEO.StepDefinitions;

import com.CYDEO.Pages.BingPages;
import com.CYDEO.Utilities.BrowserUtils;
import com.CYDEO.Utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BingStepDef {

    BingPages bingPages = new BingPages();
    @Given("user in on the main search page")
    public void user_in_on_the_main_search_page() {
        Driver.getDriver().get("https://bing.com");
    }
    @Given("user write orange in searchbox")
    public void user_write_orange_in_searchbox() {

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(bingPages.searchbox));
        bingPages.searchbox.sendKeys("orange",Keys.ENTER);


    }
    @Then("user should see orange - Bing tittle")
    public void user_should_see_orange_bing_tittle() {
        BrowserUtils.verifyTittle("orange - Bing");
    }
}
