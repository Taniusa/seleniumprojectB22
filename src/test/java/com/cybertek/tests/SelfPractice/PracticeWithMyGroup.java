package com.cybertek.tests.SelfPractice;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

/* TC #03: FINDELEMENTS_APPLE
 * 1. Open Chrome browser
 * 2. Go to https://www.apple.com/
 * 3. Click to all of the headers one by one
 * a. Mac, iPad, iPhone, Watch, TV, Music, Support
 * 4. Print out the titles of the each page
 * 5. Print out total number of links in each page
 * 6. While in each page:
 * a. Print out how many link is missing text TOTAL
 * b. Print out how many link has text TOTAL
 */


public class PracticeWithMyGroup {
    WebDriver driver = new WebDriverFactory().getDriver("chrome");

    @Test
    public void TC1() throws InterruptedException {

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.apple.com/");

        List<WebElement> headers = driver.findElements(By.xpath("//ul[@class='ac-gn-list']//li"));




        for (int i = 1; i < headers.size() - 2; i++) {
            System.out.println("The header of the current page is - " + headers.get(i).getText());
            headers.get(i).click();
            Thread.sleep(2000);
            int empty = 0;
            int withText = 0;
            //int numberOfLinks =0;
            List<WebElement> links = driver.findElements(By.xpath("//body//a"));
            for (WebElement each : links) {


                if (each.getText().isEmpty()) {
                    empty++;
                } else {
                    withText++;
                }

            }
            //System.out.println("Number of the links - "+links.size());
            System.out.println("Links with no text = " + empty + "\n Links with text = " + withText);
            System.out.println("title from the each page - " + driver.getTitle());
            headers = driver.findElements(By.xpath("//ul[@class='ac-gn-list']//li"));


        }
    }

}
