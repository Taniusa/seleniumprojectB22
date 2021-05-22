package com.cybertek.tests.SelfPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class userStory2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("http://zero.webappsecurity.com/");

        Thread.sleep(3000);
        driver.findElement(By.id("signin_button")).click();
        driver.findElement(By.id("user_login")).sendKeys("username");
        driver.findElement(By.name("user_password")).sendKeys("password"+ Keys.ENTER);

        driver.findElement(By.id("details-button")).click();
        driver.findElement(By.id("proceed-link")).click();

        Thread.sleep(1000);
        driver.findElement(By.id("transfer_funds_tab")).click();




        Select  loan = new Select (driver.findElement(By.id("tf_fromAccountId")));
        loan.selectByValue("4");
        Thread.sleep(3000);

        Select  credit = new Select (driver.findElement(By.id("tf_toAccountId")));
        loan.selectByValue("5");
        Thread.sleep(3000);

        driver.findElement(By.className("input-small")).sendKeys("300");
        Thread.sleep(1000);

        driver.findElement(By.id("tf_description")).sendKeys("You have money now :)"+ Keys.ENTER+Keys.ENTER);

        driver.findElement(By.id("btn_submit")).click();

        String expectedText ="You successfully submitted your transaction.";
        String actual = driver.findElement(By.className("alert-success")).getText();

        String actual2 = driver.findElement(By.tagName("h2")).getText();





    }
}
