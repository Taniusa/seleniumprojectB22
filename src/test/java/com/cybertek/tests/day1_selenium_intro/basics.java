package com.cybertek.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class basics {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver page = new ChromeDriver();

        page.manage().window().maximize();
        page.get("https:/okurfamily.com");
        Thread.sleep(3000);
        System.out.println(page.getTitle());

        System.out.println(page.getCurrentUrl());
        page.get("https:/google.com");
        Thread.sleep(3000);
        //page.close();

        page.navigate().back();
        Thread.sleep(3000);
        page.navigate().forward();
        Thread.sleep(3000);

        page.navigate().refresh();
        page.navigate().to("https:/www.sporx.con");

        String newtab = Keys.chord(Keys.CONTROL,"t");



    }
}
