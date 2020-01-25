package com.automationpractice.pages;

import com.automationpractice.basepage.BasePage;
import com.automationpractice.utility.Util;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by : Divyesh Patel
 * since : Saturday  25/01/2020
 * Time  : 00:42
 **/

public class ShoppingCartSummeryPage extends Util {
    @FindBy(xpath = "//a[@class='button btn btn-default standard-checkout button-medium']//span[contains(text(),'Proceed to checkout')]")
    WebElement _proceedToCheckOutButton;

    @FindBy(xpath = "//span[contains(text(),'Sign in')]")
    WebElement _signinButton;

    public void cliciOnProceedtoCheckOut(){
        clickOnElement(_proceedToCheckOutButton);
    }

    public String verifySignInText()
    {
        return getTextFromElement(By.xpath("//h1[@class='page-heading']"));
    }



}
