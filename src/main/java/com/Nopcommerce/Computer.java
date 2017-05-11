package com.Nopcommerce;

import org.openqa.selenium.By;
import org.testng.Assert;

/**
 * Created by user on 4/14/2017.
 */
public class Computer extends Utils
{
    public void navigateToNotebooks()
    {
        clickOnElement(By.xpath("//ul[@class='sublist']/li[2]/a"));
        Assert.assertEquals("Notebooks",getText(By.xpath("//div[@class='page-title']/h1")),"You are not in Notebook Page.");
    }
}
