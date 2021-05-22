package com.cybertek.tests.SelfPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class userStory {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://qa3.vytrack.com/user/login");

        driver.findElement(By.id("prependedInput")).sendKeys("user159");

        driver.findElement(By.id("prependedInput2")).sendKeys("UserUser123");
        driver.findElement(By.id("_submit")).click();

        String expected ="Dashboard";

        Thread.sleep(3000);
        String actual = driver.getTitle();

        if(expected.equals(actual)){
            System.out.println("Verification Passed");
        }else{
            System.out.println("Verification Failed");
        }

        driver.close();





    }
}
