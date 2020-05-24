package com.cbt.tests;

import com.cbt.utilities.BrowserFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class NavigationTests {
    public static void main(String[] args) {
        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.get("https://www.google.com/");
        String title1 = driver.getTitle();
        System.out.println("title1 = " + title1);
        driver.get("https://www.etsy.com/");
        String title2 = driver.getTitle();
        System.out.println("title2 = " + title2);
        driver.navigate().back();

        Assert.assertEquals(driver.getTitle(),title1);
        driver.navigate().forward();
        Assert.assertEquals(driver.getTitle(),title2);

        driver.quit();

//       // WebDriver driver1 = BrowserFactory.getDriver("firefox");
//       // driver1.get("https://www.google.com/");
//
//        WebDriver driver2 = BrowserFactory.getDriver("edge");
//        driver2.get("https://www.google.com/");
//        driver2.quit();
    }


}
