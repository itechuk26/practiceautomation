package com.automationpractice.pages;

import com.automationpractice.utility.Util;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


/**
 * Created by : Divyesh Patel
 * since : Friday  24/01/2020
 * Time  : 23:08
 **/

public class SummerDressPage extends Util {

    @FindBy(xpath = "//span[contains(text(),'Add to cart')]")
    WebElement _addToCart;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/header[1]/div[3]/div[1]/div[1]/div[4]/div[1]/div[1]/h2[1]")
    WebElement _addToCartMessage;

    @FindBy(xpath = "//span[contains(text(),'Proceed to checkout')]")
    WebElement _proceedToCheckOutButton;

    public void clickOnAddToCartButton()
    {
        clickOnElement(_addToCart);
    }

    public String addToCartMessage(){
        return getTextFromElement(_addToCartMessage);
    }

    public void clickOnProceedToCheckOut(){
        clickOnElement(_proceedToCheckOutButton);
    }
}
