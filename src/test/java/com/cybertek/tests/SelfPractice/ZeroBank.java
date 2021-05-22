package com.cybertek.tests.SelfPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/*
Zero Bank Project:

1. Open Google Browser

2. Go to http://zero.webappsecurity.com/   and make the screen full screen

3. Click on the Sign In Button

4. Locate USERNAME and PASSWORD spaces

5. Send keys for both login credential spaces - meaning for Username and Password

6. Access to the login page / dashboard right after entering keys.

7. Check the Page Title and make sure that is the expected Title with condition

8. Switch among the TABS and come to the TRANSFER FUNDS tab

9. Locate From Account and Choose the Savings account with "$ 1548"

10. Locate  To Account andChoose the account with  "-$500.2"

11. Locate Amount space and Insert "$750"

12. Locate description space and insert "Save someone from Bankruptcy :)" and CLICK Submit Button

RESULT PAGE: "You successfully submitted your transaction."
 */
public class ZeroBank {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("http://zero.webappsecurity.com/");
        driver.manage().window().maximize();

          // driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        Thread.sleep(3000);
        driver.findElement(By.id("signin_button")).click();

        Thread.sleep(3000);
        driver.findElement(By.id("user_login")).sendKeys("username");
        driver.findElement(By.name("user_password")).sendKeys("password"+ Keys.ENTER);

        driver.findElement(By.id("details-button")).click();
        driver.findElement(By.id("proceed-link")).click();


        Thread.sleep(3000);

        String actualTitle = driver.getTitle();
        String expectedTitle ="Zero - Account Summary";

        if(actualTitle.equals(expectedTitle)){
            System.out.println("PASSED -Actual title is the same as expected title");
        }else{
            System.out.println("FAILED: ");
        }

        driver.findElement(By.id("transfer_funds_tab")).click();



        WebElement dropDownMenu = driver.findElement(By.id("tf_fromAccountId"));

        dropDownMenu.click();

        Select savings = new Select(dropDownMenu);
        savings.selectByValue("3");

        WebElement dropDownMenu2 = driver.findElement(By.id("tf_toAccountId"));
        dropDownMenu2.click();

        Select checking = new Select(dropDownMenu2);
        checking.selectByValue("2");



        driver.findElement(By.className("input-small")).sendKeys("750");

        Thread.sleep(3000);
        driver.findElement(By.id("tf_description")).sendKeys("Save someone from Bankruptcy :)");



        driver.findElement(By.id("btn_submit")).click();
        Thread.sleep(3000);

        driver.findElement(By.id("btn_submit")).click();







    }
}
