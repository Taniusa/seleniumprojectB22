package com.cybertek.tests.day2_locators_getText_getAtribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P2_CybertekUrlVerification {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/");

        String expectedInUrl= "cybertekschool";

        String actualUrl = driver.getCurrentUrl();

        if( actualUrl.contains(expectedInUrl)){
            System.out.println("URL verification PASSED");
        }else{
            System.out.println("URL verification failed");
        }

        String expectedTitle ="Practice";
        String actualTitle= driver.getTitle();
        

    }
}
