package com.example.my_application_test;// This sample code supports Appium Java client >=9
// https://github.com/appium/java-client
import io.appium.java_client.AppiumBy;
import io.appium.java_client.remote.options.BaseOptions;
import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebElement;

public class PayNowApp {


    @Test
    public void setUp() throws MalformedURLException {
        var options = new BaseOptions()
                .amend("platformName", "Android")
                .amend("appium:automationName", "UiAutomator2")
                .amend("appium:app", "C:\\Users\\vela.os010\\Downloads\\SampleApp.apk")
                .amend("appium:ensureWebviewsHavePages", true)
                .amend("appium:nativeWebScreenshot", true)
                .amend("appium:newCommandTimeout", 3600)
                .amend("appium:connectHardwareKeyboard", true);

        AndroidDriver driver = new AndroidDriver(
                new URL("http://127.0.0.1:4723/"), options);
        try {
            WebElement el = driver.findElement(AppiumBy.xpath("//Button"));
            el.click();
            driver.getPageSource();
        } finally {
            driver.quit();

        }
    }
}













