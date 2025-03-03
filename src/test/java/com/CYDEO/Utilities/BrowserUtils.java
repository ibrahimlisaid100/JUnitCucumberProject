package com.CYDEO.Utilities;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.util.Set;

public class BrowserUtils {


    public static void sleep(int seconds){

        seconds= seconds*1000;

        try {
            Thread.sleep(seconds);
        }catch (InterruptedException e){

        }

    }


    public static void Task1(WebDriver driver, String expectedURL, String expectedTitle){

        String original= driver.getWindowHandle();
       Set < String> set = driver.getWindowHandles();

        for (String each : set) {
            if(!each.equalsIgnoreCase(original)){
                driver.switchTo().window(each);
            }

        }

       String actuaUrl= driver.getCurrentUrl();
        String actualTittlr = driver.getTitle();
        Assert.assertEquals(actualTittlr,expectedTitle);
        Assert.assertEquals(actuaUrl,expectedURL);


    }


    public static void WebtablesUtils(WebDriver driver, String costumerName,String expectedDate){

        // BrowserUtils.WebtablesUtils(driver, costumerName)== date;

        String locator= "//table[@class= 'SampleTable']//td[.='"+costumerName+"']/following-sibling::td[3]";

        String actualDate= driver.findElement(By.xpath(locator)).getText();

             Assert.assertEquals(actualDate,expectedDate);


    }




    public static void verifyTittle(String expectedTitle){

       String actualTittle= Driver.getDriver().getTitle();


       Assert.assertEquals(expectedTitle,actualTittle);
    }


    public static void verifyTittleContain(String expectedTitle){

        String actualTittle= Driver.getDriver().getTitle();


        Assert.assertTrue(actualTittle.contains(expectedTitle));
    }

}
