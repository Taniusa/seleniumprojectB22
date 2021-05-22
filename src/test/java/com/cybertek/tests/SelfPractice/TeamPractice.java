package com.cybertek.tests.SelfPractice;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class TeamPractice {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("http://zero.webappsecurity.com/ ");
        Thread.sleep(3000);
        driver.findElement(By.id("signin_button")).click();

        Thread.sleep(3000);
        driver.findElement(By.id("user_login")).sendKeys("username");
        driver.findElement(By.name("user_password")).sendKeys("password"+ Keys.ENTER);

        driver.findElement(By.id("details-button")).click();
        driver.findElement(By.id("proceed-link")).click();


        Thread.sleep(3000);
        driver.findElement(By.linkText("Transfer Funds")).click();

        WebElement dropDownMenu = driver.findElement(By.id("tf_fromAccountId"));
       // dropDownMenu.click();
        Thread.sleep(2000);
        Select menu =new Select(dropDownMenu);
        menu.selectByValue("3");

        WebElement dropDownMenu2 = driver.findElement(By.id("tf_toAccountId"));
        Thread.sleep(3000);
        Select account = new Select(dropDownMenu2);
        account.selectByValue("5");

        driver.findElement(By.id("tf_amount")).sendKeys("500");

        driver.findElement(By.id("btn_submit")).click();
        Thread.sleep(3000);

        driver.findElement(By.id("btn_submit")).click();

        driver.findElement(By.id("btn_submit")).click();
        Thread.sleep(3000);

        driver.findElement(By.id("btn_submit")).click();

        Thread.sleep(3000);
        driver.close();





    }

}
