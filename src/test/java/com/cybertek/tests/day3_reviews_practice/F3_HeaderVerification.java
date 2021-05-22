package com.cybertek.tests.day3_reviews_practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class F3_HeaderVerification {
    public static void main(String[] args) {
        //set up browser driver
        WebDriverManager.chromedriver().setup();

        //create driver instance and open browser
        WebDriver driver = new ChromeDriver();

        //maximize browser
        driver.manage().window().maximize();

        // go to https://www.facebook.com
        driver.get("https://www.facebook.com");

        // verify header text is as expected:
        WebElement header = driver.findElement((By.className("_8eso")));

        String expectedHeader = "Connect with friends and the world around you on Facebook.";
        String actualdHeader = header.getText();

        if (expectedHeader.equals(actualdHeader)){
            System.out.println("Header verification passed");
        }else{
            System.out.println("Header verification failed");
        }
    }
}
