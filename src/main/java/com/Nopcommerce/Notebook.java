package com.Nopcommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by user on 4/14/2017.
 */
public class Notebook extends Utils
{
    public void selectSortOption()
    {
        dropDownSelectionByAttribute(By.xpath("//select[@id='products-orderby']/option"),"text","Name: A to Z");
//        selectText(By.id("products-orderby"),"Name: A to Z");
        Assert.assertTrue(driver.findElement(By.xpath("//select[@id='products-orderby']/option[2]")).isSelected(),"Sort by Name: A to Z is not selected");
    }

    public void getProductName()
    {
       List<WebElement> lists = new ArrayList<WebElement>() ;
            //   new LinkedList<WebElement>();

       lists = driver.findElements(By.xpath("//div[@class='product-grid']/div/div/div/div[2]/h2/a"));

       for(WebElement element: lists)
       {
           String var2 = element.getText();
           System.out.println(var2);
       }
    }

}
