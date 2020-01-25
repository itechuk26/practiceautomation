package com.automationpractice.testbase;

import com.automationpractice.basepage.BasePage;
import com.automationpractice.browserselector.BrowserSelector;
import com.automationpractice.loadproperty.LoadProperty;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

/**
 * Created by : Divyesh Patel
 * since : Friday  24/01/2020
 * Time  : 22:47
 **/

public class TestBase extends BasePage {

    String browser = new LoadProperty().getProperty("browser");
    BrowserSelector browserSelector = new BrowserSelector();

    @BeforeMethod
    public void setUp() {
        browserSelector.selectBrowser(browser);
    }

    @AfterMethod
    public void closeDown(){
        driver.quit();
    }
}
