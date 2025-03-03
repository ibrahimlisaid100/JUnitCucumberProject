package com.CYDEO.StepDefinitions;

import com.CYDEO.Utilities.BrowserUtils;
import com.CYDEO.Utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import org.junit.AfterClass;
import org.junit.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.time.Duration;

public class Hooks {

    @After
    public void teardownMethod(Scenario scenario){
        if (scenario.isFailed()){
        byte [] screenshot =((TakesScreenshot)Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
        scenario.attach(screenshot,"image/png",scenario.getName());}

        Driver.closeDriver();
    }


}
