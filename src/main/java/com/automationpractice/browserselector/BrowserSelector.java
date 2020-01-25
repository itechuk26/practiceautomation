package com.automationpractice.browserselector;

import com.automationpractice.basepage.BasePage;
import com.automationpractice.loadproperty.LoadProperty;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by : Divyesh Patel
 * since : Friday  24/01/2020
 * Time  : 22:43
 **/

public class BrowserSelector extends BasePage {

    String baseurl = new LoadProperty().getProperty("baseurl");
    String projetpath = System.getProperty("user.dir");

    public void selectBrowser(String browser)
    {
        if(browser.equalsIgnoreCase("chrome"))
        {
            System.setProperty("webdriver.chrome.driver", projetpath + "/drivers/chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get(baseurl);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        }
        else if(browser.equalsIgnoreCase("firefox"))
        {
            System.setProperty("webdriver.gecko.driver", projetpath +"/drivers/geckodriver.exe");
            driver =  new FirefoxDriver();
            driver.manage().window().maximize();
            driver.get(baseurl);
            driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        }
        else if(browser.equalsIgnoreCase("ie"))
        {
            System.setProperty("webdriver.EdgeDriver", projetpath + "/drivers/microsoftWebdriver.exe");
            driver = new EdgeDriver();
            driver.manage().window().maximize();
            driver.get(baseurl);
            driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        }else
            System.out.println("Wrong Browser");
    }
}
