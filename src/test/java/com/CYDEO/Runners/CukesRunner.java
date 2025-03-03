package com.CYDEO.Runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

import java.awt.*;


@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = {
                "pretty",
                "html:target/cucumber-report.html",
                    "rerun:target/rerun.txt"
                ,"me.jvt.cucumber.report.PrettyReports:target/cucumber"

        },
        features = "src/test/resources/features",
        glue = "com/CYDEO/StepDefinitions",
        dryRun = false,
        tags ="",
        publish = true
)

public class CukesRunner {}
