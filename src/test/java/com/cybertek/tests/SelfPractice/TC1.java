package com.cybertek.tests.SelfPractice;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class TC1 {
    public static void main(String[] args) {


    //TC #1: PracticeCybertek.com_ForgotPassword WebElement verification
    // 1. Open Chrome browser
    WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

    // 2. Go to http://practice.cybertekschool.com/forgot_password
        driver.get("http://practice.cybertekschool.com/forgot_password");

    // 3. Locate all the WebElements on the page using XPATH locator only (total of 6)
    //List<WebElement> myList = driver.findElements(By.xpath(""));


    // a. “Home” link

        WebElement homeLink = driver.findElement(By.xpath("//a[@class='nav-link']"));
    // b. “Forgot password” header
        WebElement forgotPasswordLink = driver.findElement(By.xpath("//div[@class= 'example']//h2"));
    // c. “E-mail” text
        WebElement emailText = driver.findElement(By.xpath("//label[@for='email']"));
    // d. E-mail input box
        WebElement emailBox = driver.findElement(By.xpath("//input[@type='text']"));
    // e. “Retrieve password” button
        WebElement passwordButtom = driver.findElement(By.xpath("//i[@class='icon-2x icon-signin']"));
    // f. “Powered byCybertek School” text
        WebElement text = driver.findElement(By.xpath("//div[@style='text-align: center;']"));
    // 4. Verify all WebElements are displayed.
        List<WebElement> isAllDisplayed = new ArrayList<WebElement>
                (Arrays.asList(homeLink,forgotPasswordLink,emailText,emailBox,passwordButtom,text));
    }
}

