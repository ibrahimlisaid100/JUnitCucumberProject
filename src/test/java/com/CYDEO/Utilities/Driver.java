package com.CYDEO.Utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Driver {



    private Driver() {
    }

    private static InheritableThreadLocal <WebDriver> driverpool = new InheritableThreadLocal<>();

    public static WebDriver getDriver() {
        String browser = ConfigurationReader.getProperties("browser");

        if (driverpool.get() == null) {

            switch (browser.toLowerCase()) {

                case "chrome":

                    driverpool.set(new ChromeDriver());
                    driverpool.get().manage().window().maximize();
                    driverpool.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
                    break;

                case "firefox":
                    driverpool.set( new FirefoxDriver());
                    driverpool.get().manage().window().maximize();
                    driverpool.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
                    break;
                case "head-less":
                    WebDriverManager.chromedriver().setup();
                    ChromeOptions option = new ChromeOptions();
                    option.addArguments("--headless=new");
                    driverpool.set( new ChromeDriver());
                    driverpool.get().manage().window().maximize();
                    driverpool.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
                    break;
            }

        }
            return driverpool.get();

    }
  //  This method will make sure our driver value is always null after using quit() method
//     */
    public static void closeDriver(){
        if (driverpool.get() != null){
            driverpool.get().quit(); // this line will terminate the existing session. value will not even be null
            driverpool.remove();
        }
    }



}
