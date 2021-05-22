package com.cybertek.tests.SelfPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task5 {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        String expectedTitle = "Web Orders Login";
        String actualTitle = driver.getTitle();
        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Verification PASSED!");
        }else{
            System.out.println("Verification FAILED!");
        }
        WebElement userName =  driver.findElement(By.id("ctl00_MainContent_username"));
        userName.sendKeys("Tester");

        WebElement password = driver.findElement(By.name("ctl00$MainContent$password"));
        password.sendKeys("test");

        driver.findElement(By.className("button")).click();
        Thread.sleep(3000);
        expectedTitle = "Web Orders";
        actualTitle = driver.getTitle();
        if(expectedTitle.equals(actualTitle)){
            System.out.println("After login Title Verification PASSED!");
        }else{
            System.out.println("After login Title Verification FAILED!");
        }

        //click on the boxes and loop to delete all the checkboxes one by one with the loop.

        WebElement checkBox = driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_orderGrid_ctl02_OrderSelector\"]"));
        WebElement delete =driver.findElement((By.id("ctl00_MainContent_orderGrid_ctl02_OrderSelector")));

        for( int i=0 ; i<8 ; i++){

            checkBox.click();
           // delete.click();

        }


    }
    }

