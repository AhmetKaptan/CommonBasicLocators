package com.cbt.tests.locatorHomework;

import com.cbt.utilities.BrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class wikipediaTest {
    public static void main(String[] args) {
//        Go to wikipedia.org
//        enter search term `selenium webdriver`
//        click on search button
//        click on search result `Selenium (software)`
//        verify url ends with `Selenium_(software)'

        WebDriver driver = BrowserFactory.getDriver("CHROME");
        driver.get("https://www.wikipedia.org/");

        driver.findElement(By.id("searchInput")).sendKeys("selenium webdriver");
        driver.findElement(By.xpath("//i[@class='sprite svg-search-icon']")).click();
        driver.findElement(By.xpath("//a[@href='/wiki/Selenium_(software)']")).click();


        if(driver.getCurrentUrl().contains("Selenium_(software)")){
            System.out.println("PASS");
        }else {
            System.out.println("FAIL");
        }


    }
}
