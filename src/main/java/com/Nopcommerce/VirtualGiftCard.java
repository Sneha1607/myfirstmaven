package com.Nopcommerce;

import org.openqa.selenium.By;
import org.testng.Assert;

/**
 * Created by user on 4/18/2017.
 */
public class VirtualGiftCard extends Utils
{
    public void emailFriendGiftCard()
    {
        clickOnElement(By.xpath("//div[@class='email-a-friend']/input"));
        Assert.assertEquals(getText(By.xpath("//div[@class='page-title']/h1")),"Email a friend","You are not in Email a Friend Page.");
    }
}
