package com.cybertek.tests.SelfPractice;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TC_1 {
    /*TC#1: Verifying “Simple dropdown” and “State selection” dropdown default values
    1.Open Chrome browser
    2.Go to http://practice.cybertekschool.com/dropdown
    3.Verify “Simple dropdown” default selected value is correctExpected:
     “Please select an option”
     4.Verify“State selection” default selected value is correctExpected: “Select a State”
     */
    public static void main(String[] args) {



    WebDriver driver = WebDriverFactory.getDriver("chrome");
    driver.get("http://practice.cybertekschool.com/dropdown");

    driver.manage().window().maximize();

        WebElement dropDown = driver.findElement(By.xpath("//select[@id='dropdown']"));
        String actual = dropDown.getText();
        System.out.println(dropDown.getText());
        String expected = "Please select an option";

        if(actual.contains(expected)) System.out.println("Passed");

        WebElement stateDropDown = driver.findElement(By.xpath("//select[@id='state']"));
        System.out.println(stateDropDown.getText());
        if (stateDropDown.getText().equals("Select a State")) System.out.println("Passed");


}
}