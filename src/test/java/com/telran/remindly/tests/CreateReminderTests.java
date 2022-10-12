package com.telran.remindly.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateReminderTests extends TestBase{
    @Test
    public void addReminderWithDefaultDataTest(){
        int quantityBeforeAdd;
        int quantityAfterAdd;
        quantityBeforeAdd = app.getMainscreen().getTotalReminders();
        app.getReminder().tapOnAddButton();
        app.getReminder().fillReminderName("Test", 50);
        app.getReminder().saveReminder();
        app.getReminder().pause(5000);
        quantityAfterAdd = app.getMainscreen().getTotalReminders();
        Assert.assertEquals(quantityAfterAdd, quantityBeforeAdd +1);


    }

    @Test
    public void addReminderWithRandomSwipeTest(){

        app.getReminder().tapOnAddButton();
        app.getReminder().fillReminderName("Test", 10);
            app.getReminder().switchOffRepeat();
            app.getReminder().swipeDown();
            app.getReminder().enterRepeatNumber("5", 10);
            app.getReminder().swipeUp();
            app.getReminder().selectRepeatTime(4);
        app.getReminder().tapOnDate();
        app.getReminder().pause(2000);
        app.getReminder().swipeUp();
        app.getReminder().swipeDown();
        app.getReminder().selectDay(15);
        app.getReminder().tapOnOk();
        app.getReminder().saveReminder();





    }

}