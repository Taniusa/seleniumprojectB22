package com.cybertek.tests.SelfPractice;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TC2_main {
     /*
     TC	#2:	SeleniumEasy	Checkbox Verification – Section	1
1. Open	Chrome	browser
2. Go	to	https://www.seleniumeasy.com/test/basic-checkbox-demo.html
3. Verify	“Success	– Check	box	is	checked”	message	is	NOT displayed.
4. Click	to	checkbox	under	“Single	Checkbox	Demo”	section
5. Verify	“Success	– Check	box	is	checked”	message	is displayed.
      */

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");

        WebElement first = driver.findElement(By.xpath("//div[@id='txtAge']"));



        String isBoxChecked = first.getAttribute("style");
        String checkBoxIsNotChecked = "display: none;";
        System.out.println(isBoxChecked);

        if(checkBoxIsNotChecked.equals(isBoxChecked)){
            System.out.println("Success\t– Check\tbox\tis\t not checked  - message Not displayd");
        }else{
            System.out.println("Success\t– Check\tbox\tis\tchecked  - message IS displayd");
        }


        WebElement second = driver.findElement(By.xpath("//input[@type='checkbox']"));
        second.click();
        second.click();
        second.click();

       WebElement second2 = driver.findElement(By.xpath("//div[@id='txtAge']"));

        String checkBoxIsChecked = "display: block;";


        String isBoxChecked2 = second2.getAttribute("style");
        System.out.println(isBoxChecked2);

        if(checkBoxIsChecked.equals(isBoxChecked2)){
            System.out.println("Success\t– Check\tbox\tis\tchecked  - message IS displayd");

        }else{
            System.out.println("Success\t– Check\tbox\tis not \tchecked  - message Not displayd");
        }
    }



}
