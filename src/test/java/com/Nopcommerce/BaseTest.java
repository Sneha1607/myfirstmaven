package com.Nopcommerce;

import cucumber.api.java.Before;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

/**
 * Unit test for simple BasePage.
 */
public class BaseTest extends BasePage{

    BrowserSelactor browserSelactor = new BrowserSelactor();
    @Before
    public  void  openBrowser()
    {
       // driver = new FirefoxDriver();

       browserSelactor.browser();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://demo.nopcommerce.com/");
    }

//    @AfterMethod
//    public void closeBrowser()
//    {
//        driver.close();
//    }
}
