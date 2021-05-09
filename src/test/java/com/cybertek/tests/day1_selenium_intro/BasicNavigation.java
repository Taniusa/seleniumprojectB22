package com.cybertek.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigation {
    public static void main(String[] args) throws InterruptedException {

        // 1 setup the browser driver
        WebDriverManager.chromedriver().setup();

        // 2 create instance of seleniumweb driver
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();


        // 3 get the page for Tesla.com
        driver.get("https://www.tesla.com");
        System.out.println("Current title : " + driver.getTitle());

        String currentUrl=driver.getCurrentUrl();
        System.out.println("curentUrl "+ currentUrl);

        //thos method will close the currently opened browser
        //it will close 1 browser or only 1 tab
        driver.close();

        //this method will close all  the opened browsers or tabs
        driver.quit();



        // going back using navigations
        Thread.sleep(3000);
        driver.navigate().back();

        // going forward using navigation
        Thread.sleep(3000); //putting 3 sec wait
        driver.navigate().forward();

        driver.navigate().refresh();

        Thread.sleep(3000);
        // going to another url using .(to) method
        driver.navigate().to("https://www.google.com");

        System.out.println("Current title : " + driver.getTitle());

        currentUrl=driver.getCurrentUrl();
        System.out.println("curentUrl "+ currentUrl);

        //this line will maximize the brouser size
        driver.manage().window().maximize();


    }
}
