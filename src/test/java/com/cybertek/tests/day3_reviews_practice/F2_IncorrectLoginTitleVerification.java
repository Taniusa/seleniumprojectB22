package com.cybertek.tests.day3_reviews_practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class F2_IncorrectLoginTitleVerification {
    public static void main(String[] args) throws InterruptedException {
        //set up browser driver
        WebDriverManager.chromedriver().setup();

        //create driver instance and open browser
        WebDriver driver = new ChromeDriver();

        //maximize browser
        driver.manage().window().maximize();

        // go to https://www.facebook.com
        driver.get("https://www.facebook.com");

        //enter incorrect username
        WebElement inputUsername =driver.findElement(By.id("email"));

        inputUsername.sendKeys("something@gmail.com");

        WebElement inputRassword = driver.findElement(By.id("pass"));

        inputRassword.sendKeys("some wrong password " + Keys.ENTER);

        String expectedTitle = "Log into Facebook";

        Thread.sleep(5000); // freezing the code for 5 sec  so that Chrome can catch up the change of title
        String actualTitle = driver.getTitle();

        if(expectedTitle.equals(actualTitle)){
            System.out.println("Title verification PASSED");
        }else{
            System.out.println("Title verification FAILED");
        }






    }
}
