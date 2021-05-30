package com.cybertek.OfficeHours;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;
/*
1. Navigate to: https://moneygaming.qa.gameaccount.com/
        2. Click the JOIN NOW button to open the registration page
        3. Select a title value from the dropdown
        4. Enter your first name and surname in the form
        5. Check the tickbox with text 'I accept the Terms and Conditions and certify that I am over the age of 18.'
        6. Submit the form by clicking the JOIN NOW button
        7. Validate that a validation message with text ‘ This field is required’ appears under the date of
        birth box
 */

public class MoneyGamingTask {
    @Test
    public void Task1() throws InterruptedException {
        // open Chrome Browser

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://moneygaming.qa.gameaccount.com/");
        // handle time delays
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

            //2. Click the JOIN NOW button to open the registration page
       WebElement joinButton = driver.findElement(By.xpath("//a[.='Join Now!']"));
       joinButton.click();

        //  3. Select a title value from the dropdown

        WebElement titleElement = driver.findElement(By.id("title"));

        Select titleDropDown = new Select(titleElement);

        // we are going to add a MR to gaiming
        titleDropDown.selectByVisibleText("Mr");

        //verify that Mr is selected
        String expectedtitle = "Mr";
        String actualTitle =titleDropDown.getFirstSelectedOption().getText();

        Assert.assertEquals(expectedtitle,actualTitle);

        // 4. Enter your first name and surname in the form
        WebElement firstName = driver.findElement(By.xpath("//input[@id='forename']"));
        firstName.sendKeys("Tatiana");

        WebElement lastName = driver.findElement(By.xpath("//input[@name='map(lastName)']"));
        lastName.sendKeys("Barbulat");

        driver.findElement(By.xpath("//input[@id='checkbox']")).click();
        driver.findElement(By.xpath("//input[@id='form']")).click();

        //7. Validate that a validation message with text ‘ This field is required’ appears under the date of
        //        birth box

        String expectedErrow = "This field is required";
        String actualError = driver.findElement(By.xpath("//label[@for='dob']")).getText();
        Assert.assertEquals(expectedErrow,actualError);




    }





}
