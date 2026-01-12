package org.testingacademy.Selenium_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Selenium_ex_01 {

    @Test
    public void testBasics(){

        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");

    }
}
