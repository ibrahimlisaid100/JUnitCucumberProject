package com.CYDEO.StepDefinitions;

import com.CYDEO.Pages.DropdownPage;
import com.CYDEO.Utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DropdownTest {

DropdownPage dropdownPage= new DropdownPage();

    @Given("user is on the dropdowns page of practice tool")
    public void user_is_on_the_dropdowns_page_of_practice_tool() {
        Driver.getDriver().get("https://practice.cydeo.com/dropdown");
    }
    @Then("user should see below months dropdown")
    public void user_should_see_below_months_dropdown(List<String> expected) {


        Select select = new Select(dropdownPage.dropdown);

       List<WebElement> actualw =  select.getOptions();
        List <String> actual = new ArrayList<>();
        for (WebElement actualEacch : actualw) {
            actual.add(actualEacch.getText());

        }


        Assert.assertEquals(actual,expected);





    }
}
