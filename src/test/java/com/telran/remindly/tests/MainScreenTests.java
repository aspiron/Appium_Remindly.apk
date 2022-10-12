package com.telran.remindly.tests;

import org.testng.annotations.Test;

public class MainScreenTests extends TestBase {

    @Test
    public void launchAppTest() {
        System.out.println("App launch!");
    }

    @Test
    public void centralElementTest() {
        app.isCentralElementPresent();
    }

    @Test
    public void licencePresenceTest() {
        app.isLicencePresent();
    }


}
