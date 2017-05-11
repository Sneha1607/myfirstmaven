package com.Nopcommerce;

import org.openqa.selenium.By;
import org.testng.Assert;

/**
 * Created by user on 4/8/2017.
 */
public class HomePage extends Utils
{
    public void navigateToComputer()
    {
        clickOnElement(By.xpath("//ul[@class='top-menu']/li/a"));
        Assert.assertEquals(getText(By.xpath("//div[@class='page-title']/h1")),"Computers","You are not on Computer Page.");
    }

    public void navigateToClothingFromApparel()
    {
        clickOnElement(By.xpath("//a[contains(@href, '/apparel')]"));
        clickOnElement(By.xpath("//div[@class='master-wrapper-page']/div[3]/div[2]/div[2]/div/div[2]/div/div/div[2]"));
    }

    public void navigateToBookCategory()
    {
        clickOnElement(By.xpath("//ul[@class='top-menu']/li[5]/a"));
        Assert.assertEquals(getText(By.xpath("//div[@class='page-title']/h1")),"Books");
    }

    public void addToCartVirtualGiftCardFromHomePage()
    {
        clickOnElement(By.xpath("//div[@class='item-grid']/div[4]/div/div[2]/div[@class='add-info']/div[2]/input"));
    }
}
