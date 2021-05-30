package com.cybertek.tests.Assigments.HW_05_30_2021;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class P1_Xpath {
/*
TC #1: PracticeCybertek.com_ForgotPassword WebElement verification
1. Open Chrome browser
2. Go to http://practice.cybertekschool.com/forgot_password
3. Locate all the WebElements on the page using XPATH locator only (total of 6)
a. “Home” link
b. “Forgot password” header
c. “E-mail” text
d. E-mail input box
e. “Retrieve password” button
f. “Powered by Cybertek School” text
4. Verify all WebElements are displayed.
 */
    @Test

    public void  TestNo1(){
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("http://practice.cybertekschool.com/forgot_password");
        WebElement homelink = driver.findElement(By.xpath("//a[@class = 'nav-link']"));
        WebElement poweredBy = driver.findElement(By.xpath("//div[@style='text-align: center;']"));

        List<WebElement> myList = new ArrayList<>(Arrays.asList(homelink,poweredBy));

        int count=0;
        for (int i = 0; i < myList.size() ; i++) {
            if(myList.get(i).isDisplayed())  count++;

        }
        Assert.assertEquals(myList.size(),count);

    }

}
