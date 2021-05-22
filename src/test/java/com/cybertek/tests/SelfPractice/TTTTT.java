package com.cybertek.tests.SelfPractice;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TTTTT {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver= new WebDriverFactory().getDriver("chrome");
        driver.get("https://www.google.com");
        Thread.sleep(2000);
        WebElement element = driver.findElement(By.cssSelector("div[class='FPdoLc lJ9FBc']>center>input[class='gNO89b']"));

        System.out.println(element.getAttribute("Google Search"));
        element.click();

    }
}
