package com.cybertek.tests.day4_practice;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class test1 {
    /*
    - access to the login page
- check if you are on the expected login page
- correct username and password
- access to the dashboard
- check the title after login - if correct with the expected
- check if the login title is NOT the same as the Dashboard Title. If not - Passed

Username: Storemanager201     Password: UserUser123
[6:29 PM]
https://qa3.vytrack.com/user/login
     */
    public static void main(String[] args) {
        // call webDriver
        WebDriver driver = new WebDriverFactory().getDriver("chrome");
        driver.get("https://qa3.vytrack.com/user/login");

        String actualTitle = driver.getTitle();
        String expectedTitle ="Login";

        String check = actualTitle.equals(expectedTitle) ? "Passed: Actual title matches expected" : "Failed: Actual is not matching expected";
        System.out.println(check);


        WebElement username = driver.findElement(By.xpath("//input[@id='prependedInput']"));
        username.sendKeys("Storemanager201");

        WebElement password = driver.findElement(By.xpath("//input[@id='prependedInput2']"));
        password.sendKeys("UserUser123");
        password.submit();

        //   driver.findElement(By.xpath("//button[@id='_submit']")).click();

        String homePageTitle = driver.getTitle();
        //String  homePageExpectedTitle =


    }
}
