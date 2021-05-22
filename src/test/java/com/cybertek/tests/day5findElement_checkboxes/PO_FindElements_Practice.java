package com.cybertek.tests.day5findElement_checkboxes;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class PO_FindElements_Practice {
    public static void main(String[] args) {


    WebDriver driver = WebDriverFactory.getDriver("chrome");

    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

    driver.get("http://practice.cybertekschool.com/forgot_password");

// we need to create all locators that returns all links
        //body //a

        List<WebElement> listOfLinks =driver.findElements(By.xpath("//body//a"));
//        for (WebElement each : listOfLinks) {
//
//            System.out.println(each.getText());
//
//        }

        listOfLinks.forEach(n -> System.out.println( n.getText()));
        int numberOfLinks= listOfLinks.size();
        System.out.println(numberOfLinks);

}
}