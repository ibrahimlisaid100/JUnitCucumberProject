package com.CYDEO.Pages;

import com.CYDEO.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class yandexPages {

    public yandexPages(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(name = "text")
    public WebElement searchbox;
}
