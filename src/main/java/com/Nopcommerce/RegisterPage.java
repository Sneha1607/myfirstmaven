package com.Nopcommerce;

import org.openqa.selenium.By;
import org.testng.Assert;

/**
 * Created by user on 4/8/2017.
 */

public class RegisterPage extends Utils
{
    public String email;

    public void register_On_Nop_Commerce()
    {
        //Click on Register
        clickOnElement(By.className("ico-register"));

        //Filling  Registration Detail
        clickOnElement(By.id("gender-female"));
        typeText(By.name("FirstName"),"Sneha");
        typeText(By.name("LastName"),"Pathak");
        selectValue(By.name("DateOfBirthDay"),"16");
        selectValue(By.name("DateOfBirthMonth"),"7");
        selectValue(By.name("DateOfBirthYear"),"1990");

        email = "Sneha" + dateStamp() + "@yahoo.in";

        typeText(By.id("Email"),email);
        typeText(By.id("Company"),"Unique Testing");

        typeText(By.id("Password"),"abc123");
        typeText(By.id("ConfirmPassword"),"abc123");

        //Click on Register Button
        clickOnElement(By.id("register-button"));

        Assert.assertEquals("Your registration completed",getText(By.className("result")));

        //Sleep web page for 3 seconds
        //sleep(3);

        //Capture Screenshot
        //Utils.browserScreenshot("C:\\Users\\user\\IdeaProjects\\FirstSeleniumWebDriver\\src\\DemoPackageObjectModel\\Screenshot");

        clickOnElement(By.className("ico-logout"));
        clickOnElement(By.className("ico-login"));

        typeText(By.id("Email"),email);
        typeText(By.id("Password"),"abc123");

        //Click on Login Button
        clickOnElement(By.cssSelector("input.button-1.login-button"));
    }

}
