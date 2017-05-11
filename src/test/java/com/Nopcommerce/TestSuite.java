package com.Nopcommerce;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by user on 4/8/2017.
 */
public class TestSuite
{
    HomePage homePage = new HomePage();
    RegisterPage registerPage = new RegisterPage();
    LoginPage loginPage = new LoginPage();
    Computer computer = new Computer();
    Notebook notebook = new Notebook();
    Clothing clothing = new Clothing();
    Books books = new Books();
    VirtualGiftCard giftCard= new VirtualGiftCard();
    EmailAFriendPage emailFriend =new EmailAFriendPage();

//    @Test
//    public void userShouldLogInSuccessfully()
//    {
//        loginPage.login_On_Nop_Commerce();
//    }

    @Test
    public void userShouldRegisterSuccessfully()
    {
        registerPage.register_On_Nop_Commerce();
        Assert.assertEquals(Utils.getText(By.xpath("//div[@class='topic-block-title']/h2")),"Welcome to our store","Ur registeration & Login is not completed.");
    }

//    @Test
//    public void userShouldSortNotebooksAToZ()
//    {
//        homePage.navigateToComputer();
//        computer.navigateToNotebooks();
//        notebook.selectSortOption();
//        notebook.getProductName();
//    }

    @Test
    public void userShouldCompareClothingProductSuccessfully()
    {
        homePage.navigateToClothingFromApparel();
        clothing.selectSortOptionOfProduct();
        clothing.selectDisplayProduct();
        clothing.selectListView();
        clothing.compareClothingProduct();
        clothing.clearComparision();
        Assert.assertEquals(Utils.getText(By.className("no-data")),"You have no items to compare.","Comparision is not successfull");
    }

//    @Test
//    public void userShouldChangeQuantityOfBookProductSuccessfully()
//    {
//        homePage.navigateToBookCategory();
//        books.addToCartBookProduct();
//        books.addProductToWishList();
//        books.goToShoppingCart();
//    }

    @Test
    public void userShouldSendEmailToAFriendAVirtualGiftCard()
    {
        registerPage.register_On_Nop_Commerce();
        homePage.addToCartVirtualGiftCardFromHomePage();
        giftCard.emailFriendGiftCard();
        emailFriend.emailGiftCard();
        Assert.assertEquals(Utils.getText(By.className("result")),"Your message has been sent.","Your email a friend is not successfully.");
    }


}
