package com.cbt.tests.locatorHomework;

import com.cbt.utilities.BrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class amazonTest {
    public static void main(String[] args) {
        //    go to amazon
//    enter search term
//    click on search button
//    verify title contains search term

        WebDriver driver = BrowserFactory.getDriver("firefox");
        driver.get("https://www.amazon.com/");

        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("alice in wonderland");

        driver.findElement(By.xpath("//div/input[@type='submit']")).click();

        System.out.println("driver.getTitle() = " + driver.getTitle());
        Assert.assertTrue( driver.getTitle().contains("alice in wonderland"));

    }



}
