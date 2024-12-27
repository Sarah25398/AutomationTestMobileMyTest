package com.example.my_application_test;

import android.sax.Element;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

import javax.xml.xpath.XPath;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class PayNowLocator {
    @AndroidFindBy(xpath ="//android.widget.Button[@resource-id='com.payu.testapp:id/btnPayNow']")
    private WebElement PayNowButton;
    public void PayNowClick(){
        PayNowButton.click();
    }
    public PayNowLocator(AppiumDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver,
                Duration.ofSeconds(10)), this);
    }

}
