package com.automationpractice.pages;

import com.automationpractice.utility.Util;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by : Divyesh Patel
 * since : Friday  24/01/2020
 * Time  : 22:51
 **/

public class HomePage extends Util {

    @FindBy(xpath = "//ul[@id='homefeatured']//li[@class='ajax_block_product col-xs-12 col-sm-4 col-md-3 last-item-of-tablet-line first-item-of-mobile-line']//img[@class='replace-2x img-responsive']")
    WebElement _printedDress;

    @FindBy(xpath = "//ul[@id='homefeatured']//li[@class='ajax_block_product col-xs-12 col-sm-4 col-md-3 last-line last-item-of-tablet-line last-item-of-mobile-line']//img[@class='replace-2x img-responsive']")
    WebElement _printedSummerDress;

    public void clickOnSummerDress(){
        clickOnElement(_printedSummerDress);
    }
}
