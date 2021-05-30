package com.cybertek.tests.day6_testng_intro_dropdawns;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;
/*
1. Go to http://practice.cybertekschool.com/checkboxes 2. Confirm checkbox #1 is NOT selected by default
3. Confirm checkbox #2 is SELECTED by default.
4. Click checkbox #1 to select it.
5. Click checkbox #2 to deselect it.
6. Confirm checkbox #1 is SELECTED.
7. Confirm checkbox #2 is NOT selected.
 */
public class P0_CheckboxPractice {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //1. Go to http://practice.cybertekschool.com/checkboxes 2. Confirm checkbox #1 is NOT selected by default
        driver.get("http://practice.cybertekschool.com/checkboxes");

        //confirm the checkbox #1  is not selected by default && #2 is selected (checkbox.isSelected() -> true/false)
        WebElement checkBox1 =driver.findElement(By.xpath("(//input[@type ='checkbox'])[1]"));
        WebElement checkBox2 =driver.findElement(By.xpath("(//input[@type ='checkbox'])[2]"));

        if(!checkBox1.isSelected()){
            System.out.println("Checkbox 1 is not selected. Verification Pased!");
        }else{
            System.out.println("Checkbox 1 is selected . Verification Failed");
        }

        if(checkBox2.isSelected()){
            System.out.println("Checkbox 2 is selected. Verification Pased!");
        }else{
            System.out.println("Checkbox 2 is not selected . Verification Failed");
        }
        //4. Click checkbox #1 to select it.
        Thread.sleep(2000);
        checkBox1.click();

        //5. Click checkbox #2 to deselect it.
        Thread.sleep(2000);
        checkBox2.click();

        //6. Confirm checkbox #1 is SELECTED.
        //7. Confirm checkbox #2 is NOT selected.

        if(checkBox1.isSelected()){
            System.out.println("Checkbox 1 is  selected. Verification Pased!");
        }else{
            System.out.println("Checkbox 1 is not selected . Verification Failed");
        }

        if(!checkBox2.isSelected()){
            System.out.println("Checkbox 2 is not selected. Verification Pased!");
        }else{
            System.out.println("Checkbox 2 is selected . Verification Failed");
        }

        Thread.sleep(2000);
    driver.close();




    }
}
