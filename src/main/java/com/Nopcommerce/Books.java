package com.Nopcommerce;

import org.openqa.selenium.By;
import org.testng.Assert;

/**
 * Created by user on 4/15/2017.
 */
public class Books extends Utils
{
    public void addToCartBookProduct()
    {
        //Click on Add To Cart First Book Product
        clickOnElement(By.cssSelector("input.button-2.product-box-add-to-cart-button"));

        //Assert that Product is added to cart
        Assert.assertEquals(getText(By.cssSelector("p.content")),"The product has been added to your shopping cart");
        sleep(2);

        //Close shopping cart tab
        clickOnElement(By.cssSelector("span.close"));
    }

    public void addProductToWishList()
    {
        //Click on first book to wish list
        clickOnElement(By.cssSelector("input.button-2.add-to-wishlist-button"));

//        //Assert product is selected for wish list
//        Assert.assertEquals(getText(By.cssSelector("p.content")),"The product has been added to your wishlist");
//        sleep(2);

        //Close wish list tab
        clickOnElement(By.cssSelector("span.close"));
    }

    public void goToShoppingCart()
    {
        mouseHover(By.className("cart-label"));

        elementToBeClickable(By.cssSelector("input.button-1.cart-button"),2);
    }

}
