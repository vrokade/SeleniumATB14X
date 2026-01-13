package org.testingacademy.Selenium_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Selenium_Maximize_Minimize {

    @Test
    public void test1() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.manage().window().maximize();
        driver.manage().window().minimize();
        Thread.sleep(3000);

        Assert.assertEquals(driver.getTitle(),"Google");
        driver.quit();

    }
}
