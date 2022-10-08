package com.telran.remindly.tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MainPageTests extends TestBase {

    @Test
    public void launchAppTest() {
        System.out.println("App launch!");
    }

    @Test
    public void centralElementTest() {
        isCentralElementPresent();
    }

    @Test
    public void licencePresenceTest() {
        isLicencePresent();
    }


}
