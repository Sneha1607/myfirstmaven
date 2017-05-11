package com.Nopcommerce;

import org.openqa.selenium.By;

/**
 * Created by user on 4/18/2017.
 */
public class EmailAFriendPage extends Utils
{
    public void emailGiftCard()
    {
        typeText(By.id("FriendEmail"),"7andip@gmail.com");
        typeText(By.id("PersonalMessage"),"Hiiii.....Here is gift for u.");
        clickOnElement(By.name("send-email"));
    }
}
