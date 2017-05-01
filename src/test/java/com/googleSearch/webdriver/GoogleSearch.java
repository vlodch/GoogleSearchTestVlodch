package com.googleSearch.webdriver;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class GoogleSearch {



    private WebDriver driver;
    private String baseUrl;

    @Before
    public void setUp() {
        driver = new FirefoxDriver();
        baseUrl = "http://www.google.com";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Test
    public void test() {
        driver.get(baseUrl + "");
        driver.findElement(By.className("gsfi")).sendKeys("Test");
        driver.findElement(By.id("_fZl")).click();
    }




}









