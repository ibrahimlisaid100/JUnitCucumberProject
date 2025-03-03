package com.CYDEO.StepDefinitions;

import com.CYDEO.Pages.yandexPages;
import com.CYDEO.Utilities.BrowserUtils;
import com.CYDEO.Utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;

import java.util.List;

public class yandexStepDefinitions {
    yandexPages yandex = new yandexPages();

    @Given("user is in the search page of yandex")
    public void user_is_in_the_search_page_of_yandex() {
        Driver.getDriver().get("https://www.yandex.com");
    }

    @Then("user should see tittle contain {string}")
    public void user_should_see_tittle_contain(String string) {
        BrowserUtils.verifyTittleContain(string);
    }




    @And("user enter {string} into searchbox")
    public void userEnterIntoSearchbox(String arg0) {

        yandex.searchbox.sendKeys(arg0,Keys.ENTER);
    }
}
