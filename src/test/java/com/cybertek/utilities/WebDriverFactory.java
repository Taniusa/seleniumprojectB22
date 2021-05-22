package com.cybertek.utilities;

// task : NEW METHOD CREATION
/*
name : getDriver
Static method
// Accepts String arg: browserType
//   - This arg will determine what type of browser is opened
//   - if "chrome" passed --> it will open chrome browser
//   - if "firefox" passed --> it will open firefox browser
// RETURN TYPE: "WebDriver"
 */

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverFactory {

    public static WebDriver getDriver(String browserType ){

        if(browserType.equalsIgnoreCase("chrome")){
           WebDriverManager.chromedriver().setup();

           return new ChromeDriver();

        }if(browserType.equalsIgnoreCase("firefox")){
            WebDriverManager.firefoxdriver().setup();

            return new FirefoxDriver();

        }else {
            System.out.println("You have not permission  to use other browsers./nThank you.");
        }
        return null;
    }

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");



    }
}
