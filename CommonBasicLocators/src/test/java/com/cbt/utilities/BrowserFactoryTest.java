package com.cbt.utilities;

import org.openqa.selenium.WebDriver;

public class BrowserFactoryTest {
    public static void main(String[] args) {
        WebDriver driver = BrowserFactory.getDriver("chrome");
    }
}
