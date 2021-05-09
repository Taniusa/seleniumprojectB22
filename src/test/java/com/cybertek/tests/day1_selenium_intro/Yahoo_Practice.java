package com.cybertek.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Yahoo_Practice {
    public static void main(String[] args) {
        //set up  browser
        WebDriverManager.chromedriver().setup();

        //open Chrome browser
        WebDriver driver = new ChromeDriver();

        //max browser
        driver.manage().window().maximize();

        driver.get("https://ca.yahoo.com");

        String expextedTitle = "Yahoo";

        //actual title
        String actualTitle = driver.getTitle();

        //creating verefication
        if(actualTitle.equals(expextedTitle)){
            System.out.println("Title is as expected . Verification PASSED!");
        }else{
            System.out.println("Title is not as acspected . Verification FAILED");
        }
        //closing the browser
        driver.close();
    }
}
