package com.cybertek.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ifElsePractise {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.amazon.ca/");

        String expectedTitle = "XXAmazon.ca: Low Prices – Fast Shipping – Millions of Items";

        if(driver.getTitle().equals(expectedTitle)){
            System.out.println("Title match");
        }else{
            System.out.println("Title doesn't match");
            driver.quit();
        }
    }
}
