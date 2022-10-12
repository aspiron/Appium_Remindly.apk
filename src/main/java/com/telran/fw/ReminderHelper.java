package com.telran.fw;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ReminderHelper extends HelperBase {
    public ReminderHelper(AppiumDriver dr) {
        super(dr);
    }

    public void tapOnAddButton() {
        tap(By.id("add_reminder"));
    }

    public void fillReminderName(String text, int timeOut) {
        waitForElementAndType(By.id("reminder_title"), timeOut, text);
        hideKeyboard();
    }

    public void saveReminder() {
        tap(By.id("save_reminder"));
    }


    public void tapOnDate() {
        tap(By.id("date_text"));
    }

    public void switchOffRepeat() {
        tap(By.id("repeat_switch"));
    }

    public void enterRepeatNumber(String text, int timeOut) {
        tap(By.id("repeat_no_icon"));
        waitForElementAndType(By.className("android.widget.EditText"), timeOut, text);
        hideKeyboard();
        tapOnRepeatOk(0);
        hideKeyboard();

    }
    public void tapOnRepeatOk(int index){
        List<WebElement> days = dr.findElements(By.className("android.widget.Button"));
        days.get(index).click();
    }

    public void selectRepeatTime(int index) {
        tap(By.id("repeat_type_text"));
        List<WebElement> days = dr.findElements(By.className("android.widget.TextView"));
        days.get(index).click();

    }

    public void selectDay(int index) {
        List<WebElement> days = dr.findElements(By.className("android.view.View"));
        days.get(index).click();
    }

    public void tapOnOk() {
        tap(By.id("ok"));
    }

}
