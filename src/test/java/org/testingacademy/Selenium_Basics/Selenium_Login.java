package org.testingacademy.Selenium_Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Selenium_Login {

    @Test
    public void login(){

        WebDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com/#/login");
        WebElement startTrial = driver.findElement(By.linkText("Start a free trial"));
        startTrial.click();

        WebElement email = driver.findElement(By.xpath("//input[@id='page-v1-step1-email']"));
        email.sendKeys("abc.com");

        WebElement checkBox = driver.findElement(By.id("page-free-trial-step1-cu-gdpr-consent-checkbox"));
        checkBox.click();
    }
}
