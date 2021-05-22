package com.cybertek.tests.day4_practice;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P6_XPATH_MultipleButtons {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        /*
        TC #6: XPATH LOCATOR practice
1. Open Chrome browser
2. Go to http://practice.cybertekschool.com/multiple_buttons
3. Click on Button 1
4. Verify text displayed is as expected:
Expected: “Clicked on button one!”
         */

        driver.get("http://practice.cybertekschool.com/multiple_buttons");

        // 3. Click on Button 1
        // locating using XPATH with class attribute value
        //WebElement button1= driver.findElement(By.xpath("//button[@class='btn btn-primary']"));

        // locating using text of the button with XPATH
        //WebElement button1= driver.findElement(By.xpath("//button[.='Button 1']"));

        // locating using "onclick" attribute value with xpath locator
        WebElement button1= driver.findElement(By.xpath("//button[@onclick='button1()']"));

        button1.click();

        WebElement resultText = driver.findElement(By.xpath(""));

        // 4. Verify text displayed is as expected:
        // Expected: “Clicked on button one!”

        String expectedText = "Clicked on button one!";

    }
}
