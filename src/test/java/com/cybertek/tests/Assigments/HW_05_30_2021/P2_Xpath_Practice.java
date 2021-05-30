package com.cybertek.tests.Assigments.HW_05_30_2021;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class P2_Xpath_Practice {
    /*
    TC #2: PracticeCybertek.com_AddRemoveElements WebElement verification
1. Open Chrome browser
2. Go to http://practice.cybertekschool.com/add_remove_elements/
3. Click to “Add Element” button
4. Verify “Delete” button is displayed after clicking.
5. Click to “Delete” button.
6. Verify “Delete” button is NOT displayed after clicking.
USE XPATH LOCATOR FOR ALL WEBELEMENT LOCATORS
     */
    @Test
    public  void TC1() throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/add_remove_elements/");

        //Click to “Add Element” button
        WebElement button = driver.findElement(By.xpath("//button[@onclick='addElement()']"));
        Thread.sleep(2000);
        button.click();

        WebElement deleteButton = driver.findElement(By.xpath("(//div//button)[2]"));
        Thread.sleep(2000);
        deleteButton.click();

        //Thread.sleep(2000);
        //Verify “Delete” button is displayed after clicking.
       // Assert.assertFalse(deleteButton.isDisplayed());

        try{
            deleteButton.click();

    if (!deleteButton.isDisplayed()){
        System.out.println("Delete button is NOT displaed, PASSED");
    }else{
        System.out.println("Delete button is displayd,FAILED");
    }
        }catch (StaleElementReferenceException exception){
            System.out.println("Delete button is not displayd");
        }
    }
}
