package com.cybertek.tests.day3_reviews_practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class F4_AttributeValueVerification {
    public static void main(String[] args) {
        //set up browser driver
        WebDriverManager.chromedriver().setup();

        //create driver instance and open browser
        WebDriver driver = new ChromeDriver();

        //maximize browser
        driver.manage().window().maximize();

        // go to https://www.facebook.com
        driver.get("https://www.facebook.com");

        // Verify "Create a page" link href value contains text:
        // "registration form"


        WebElement createPageLink = driver.findElement(By.linkText("Create a Page"));

        String expectedInHref = "registration_form";
        String actualHrevValue = createPageLink.getAttribute("href");

        if (expectedInHref.contains(actualHrevValue)){
            System.out.println("Href value verification passed");
        }else{
            System.out.println("Href value verification FAILED ");
        }
    }
}
