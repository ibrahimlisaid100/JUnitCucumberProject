package com.CYDEO.Pages;

import com.CYDEO.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class libraryPages {

    public libraryPages (){

        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(id = "inputEmail")
    public WebElement username;

    @FindBy(id="inputPassword")
        public WebElement password;

    @FindBy(xpath ="//button[@type='submit']" )
    public WebElement loginButton;

    @FindBy(xpath = "//*[@id=\"login-form\"]/div[2]/div")
    public WebElement wrongCredentialsMsg;





}
