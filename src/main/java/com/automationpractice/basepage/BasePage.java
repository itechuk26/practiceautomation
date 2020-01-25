package com.automationpractice.basepage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by : Divyesh Patel
 * since : Friday  24/01/2020
 * Time  : 22:35
 **/

public class BasePage {

    public static WebDriver driver;

    public BasePage() {
        PageFactory.initElements(driver, this);
    }
}
