package org.testingacademy.Selenium_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Selenium_ChromeOptions {

    @Test
    public void chromeOptions() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--incognito");
        Thread.sleep(5000);
        driver.navigate().to("https://google.com");
        driver.quit();
    }
}
