package com.cybertek.tests.SelfPractice;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TeamPractiseCss {
    /*
 1- Open a chrome browser
 2- Go to:
 http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx

 3- Enter username: Tester
 4- Enter password: test
 5- Click “Sign In” button
 6  Verify text displayed is as expected:
Expected: “Web Orders”
7 Click on Vew All Products
8 Verify text displayed is as expected:
     */


    public static void main(String[] args) throws InterruptedException {

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        WebElement username =driver.findElement(By.xpath("//input[@id='ctl00_MainContent_username']"));
        username.sendKeys("Tester");

         Thread.sleep(2000);

        WebElement password = driver.findElement(By.xpath("//input[contains(@name, 'password')]"));
        password.sendKeys("test"+ Keys.TAB+Keys.ENTER);

        WebElement displayd = driver.findElement(By.xpath("//h1[.='Web Orders']"));
        System.out.println(displayd.getText());

        System.out.println("displayd.isDisplayed() = " + displayd.isDisplayed());











    }
}