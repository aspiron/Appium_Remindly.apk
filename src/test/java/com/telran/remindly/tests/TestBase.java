package com.telran.remindly.tests;

import com.telran.fw.AppManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.net.MalformedURLException;

public class TestBase {

    protected static AppManager app = new AppManager();

    @BeforeMethod
    public void setUp() throws MalformedURLException {
        app.init();
    }




    @AfterMethod (enabled = false)
    public void tearDown(){
        app.stop();
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
