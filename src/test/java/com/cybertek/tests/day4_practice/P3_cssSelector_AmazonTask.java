package com.cybertek.tests.day4_practice;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P3_cssSelector_AmazonTask {
    public static void main(String[] args) throws InterruptedException {


    WebDriver driver = WebDriverFactory.getDriver("chrome");
    /*
    TC #3: Amazon link number verification
1. Open Chrome browser
2. Go to https://www.amazon.com
3. Enter search term (use cssSelector to locate search box)
4. Verify title contains search term
     */

    driver.get("https://www.amazon.com");
    WebElement searchButton = driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']"));

    searchButton.sendKeys("wooden spoon"+ Keys.ENTER);

    String expectedTitle = "wooden";
    String actualTitle = driver.getTitle();



    if(actualTitle.contains(expectedTitle)){
        System.out.println("Verification Passed");
    }else{
        System.out.println("Verification Failed");
    }

        Thread.sleep(5000);
        driver.close();

    }
}
