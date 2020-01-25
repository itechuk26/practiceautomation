package com.automationpractice.loadproperty;

import com.automationpractice.basepage.BasePage;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by : Divyesh Patel
 * since : Friday  24/01/2020
 * Time  : 22:40
 **/

public class LoadProperty extends BasePage {

    static Properties prop;
    static FileInputStream input;
    String projectpath = System.getProperty("user.dir");

    public String getProperty(String key) {
        prop = new Properties();

        try {
            input = new FileInputStream(projectpath + "\\src\\test\\java\\com\\automationpractice\\resources\\propertiesfile\\config.properties");
            prop.load(input);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return prop.getProperty(key);
    }
}
