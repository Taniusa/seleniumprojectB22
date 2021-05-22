package com.cybertek.tests.day4_practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T5_WebOrdersLogin {
    public static void main(String[] args) {
        /*
         TC #5: Basic login authentication
 1- Open a chrome browser
 2- Go to:
 http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
 3- Verify title equals:
 Expected: Web Orders Login
 4- Enter username: Tester
 5- Enter password: test
 6- Click “Sign In” button
 7- Verify title equals:
 Expected: Web Orders
         */

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");


        WebElement inputUser =  driver.findElement(By.id("ctl00_MainContent_username"));
        inputUser.sendKeys("Tester");

        WebElement inputPassword = driver.findElement(By.id("ctl00_MainContent_password"));
        inputPassword.sendKeys("test");

        WebElement loginButton = driver.findElement(By.id("ctl00_MainContent_login_button"));
        loginButton.click();

    }
}
