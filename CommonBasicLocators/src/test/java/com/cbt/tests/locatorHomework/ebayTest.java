package com.cbt.tests.locatorHomework;

import com.cbt.utilities.BrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ebayTest {

    //    Go to ebay
//    enter search itemm
//    click on search button
//    print number of results
    public static void main(String[] args) {

        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.get("https://www.ebay.com");
        WebElement searchBox = driver.findElement(By.id("gh-ac"));
        searchBox.sendKeys("macbook");
        WebElement clickSearch = driver.findElement(By.id("gh-btn"));
        clickSearch.click();

        System.out.println(driver.findElement(By.xpath("//h1/span[@class='BOLD'][1]")).getText());
        System.out.println(driver.findElement(By.className("srp-controls__count-heading")).getText());
    }


}
