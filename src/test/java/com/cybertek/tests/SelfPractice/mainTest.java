package com.cybertek.tests.SelfPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class mainTest extends baseTest {

    @Test
    public void TestNo1() {


        WebElement simpleDD = driver.get().findElement(By.xpath("//select[@id='dropdown']"));
        Select selectForDD = new Select(simpleDD);
        String actualSimple = selectForDD.getFirstSelectedOption().getText();
        String expectedSimple = "Please select an option";

        Assert.assertEquals(actualSimple, expectedSimple);
        WebElement stateSelection = driver.get().findElement(By.xpath("//select[@id='state']"));
        Select selectForState = new Select(stateSelection);

        String actualSelection = selectForState.getFirstSelectedOption().getText();
        String expectedSelection = "Select a State";
        Assert.assertEquals(actualSelection, expectedSelection);

    }
    @Test
    public void TestNo2() {


        WebElement stateSelector = driver.get().findElement(By.xpath("//select[@id='state']"));
        Select selectorForState = new Select(stateSelector);
        selectorForState.selectByVisibleText("Illinois");
        selectorForState.selectByValue("VA");
        selectorForState.selectByIndex(5);

        String actualChoice = selectorForState.getFirstSelectedOption().getText();
        String expectedChoice = "California";

        Assert.assertEquals(actualChoice,expectedChoice);

    }

    @Test
    public void TestNo3() {


        WebElement year = driver.get().findElement(By.xpath("//select[@id='year']"));
        Select selectorForYear = new Select(year);
        selectorForYear.selectByVisibleText("1922");

        WebElement month = driver.get().findElement(By.xpath("//select[@id='month']"));
        Select selectorForMonth = new Select(month);
        selectorForMonth.selectByValue("11");

        WebElement day = driver.get().findElement(By.xpath("//select[@id='day']"));
        Select selectorForDay = new Select(day);
        selectorForDay.selectByIndex(0);

        String actualYear = selectorForYear.getFirstSelectedOption().getText();
        String expectedYear = "1922";
        Assert.assertEquals(actualYear,expectedYear);

        String actualMonth = selectorForMonth.getFirstSelectedOption().getText();
        String expectedMonth = "December";
        Assert.assertEquals(actualMonth,expectedMonth);

        String actualDay = selectorForDay.getFirstSelectedOption().getText();
        String expectedDay = "1";
        Assert.assertEquals(actualDay,expectedDay);

    }
    @Test
    public void TestNo4(){

        WebElement languages =driver.get().findElement(By.xpath("//select[@name='Languages']"));
        Select selector = new Select(languages);
        selector.selectByIndex(0);
        selector.selectByValue("js");
        selector.selectByVisibleText("C#");
        selector.selectByVisibleText("Python");
        selector.selectByValue("ruby");
        selector.selectByIndex(5);

       List<WebElement>  myList = selector.getAllSelectedOptions();
       myList.forEach( each -> System.out.print(each.getText()+" "));

       selector.deselectAll();
       // WebElement languagesNotSelected =driver.get().findElement(By.xpath("//select[@name='Languages']"));

       Assert.assertTrue(selector.getAllSelectedOptions().isEmpty());

    }
    @Test
    public void  TestNo5() throws InterruptedException {


        WebElement lastDD = driver.get().findElement(By.xpath("//a[@id='dropdownMenuLink']"));
        lastDD.click();
        WebElement facebook = driver.get().findElement(By.xpath("//a[text()='Facebook']"));
        facebook.click();
        Thread.sleep(3000);

        Assert.assertEquals(driver.get().getTitle(), "Facebook - Log In or Sign Up");


    }
}

