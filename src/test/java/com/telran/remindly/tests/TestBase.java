package com.telran.remindly.tests;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.net.MalformedURLException;
import java.net.URL;

public class TestBase {
    AppiumDriver dr;
    DesiredCapabilities capabilities;

    @BeforeMethod
    public void setUp() throws MalformedURLException {
        capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "8.0");
        capabilities.setCapability("deviceName", "qa_mob");
        capabilities.setCapability("automationName", "Appium");
        capabilities.setCapability("appPackage", "com.blanyal.remindly");
        capabilities.setCapability("appActivity", "com.blanyal.remindme.MainActivity");
        capabilities.setCapability("app", "C:/Tools/com.blanyal.remindly_2_apps.evozi.com.apk/");

        dr = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
    }

    public void isLicencePresent() {
        dr.findElement(By.xpath("//android.widget.ImageView[@content-desc='More options']")).click();
        dr.findElement(By.id("title")).click();
        dr.findElement(By.id("licenses_text_view")).isDisplayed();
        dr.findElement(By.id("licenses_text_view")).click();
    }

    public void isCentralElementPresent() {
        Assert.assertNotNull(dr.findElement(By.id("no_reminder_text")));
    }


    @AfterMethod (enabled = false)
    public void tearDown(){
        dr.quit();
    }

}

//
//{
//        "platformName": "Android",
//        "appium:platformVersion": "8.0",
//        "appium:deviceName": "qa_mob",
//        "appium:appPackage": "com.blanyal.remindly",
//        "appium:appActivity": "com.blanyal.remindme.MainActivity"
//        }
