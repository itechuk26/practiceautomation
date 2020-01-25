package com.automationpractice.testsuite;

import com.automationpractice.pages.HomePage;
import com.automationpractice.pages.ShoppingCartSummeryPage;
import com.automationpractice.pages.SummerDressPage;
import com.automationpractice.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by : Divyesh Patel
 * since : Friday  24/01/2020
 * Time  : 23:17
 **/

public class ShoppingTest extends TestBase {

    @Test
    public void userShouldAddPrintedSummerDressToCart(){

        HomePage homepage = new HomePage();
        SummerDressPage summerdressPage = new SummerDressPage();
        ShoppingCartSummeryPage shoppingCartSummeryPage = new ShoppingCartSummeryPage();

        homepage.clickOnSummerDress();
        summerdressPage.clickOnAddToCartButton();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Assert.assertEquals("Product successfully added to your shopping cart", summerdressPage.addToCartMessage());


        summerdressPage.clickOnProceedToCheckOut();
        shoppingCartSummeryPage.cliciOnProceedtoCheckOut();

        Assert.assertEquals("AUTHENTICATION", shoppingCartSummeryPage.verifySignInText());
    }
}
