package com.Nopcommerce;

import org.openqa.selenium.By;

/**
 * Created by user on 4/8/2017.
 */
public class LoginPage extends Utils
{
    public void login_On_Nop_Commerce()
    {
        //Select Login from HomePage
        clickOnElement(By.className("ico-login"));

        //Fill Login detail
        typeText(By.id("Email"), "sneha@yahoo.in");
        typeText(By.id("Password"), "abc123");


        //Click on Login Button
        clickOnElement(By.cssSelector("input.button-1.login-button"));
    }

}
