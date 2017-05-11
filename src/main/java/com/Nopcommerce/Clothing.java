package com.Nopcommerce;

import org.openqa.selenium.By;
import org.testng.Assert;

/**
 * Created by user on 4/15/2017.
 */
public class Clothing extends Utils
{
    public void selectSortOptionOfProduct()
    {
        dropDownSelectionByAttribute(By.xpath("//select[@id='products-orderby']/option"),"text","Price: Low to High");
        Assert.assertTrue(driver.findElement(By.xpath("//select[@id='products-orderby']/option[4]")).isSelected(),"Sort by Price: Low to High is not selected");
    }

    public void selectDisplayProduct()
    {

        dropDownSelectionByAttribute(By.xpath("//select[@id='products-pagesize']/option"),"text","3");
        Assert.assertTrue(driver.findElement(By.xpath("//select[@id='products-pagesize']/option")).isSelected(),"Display 3 products per page is not selected");
    }

    public void selectListView()
    {
        clickOnElement(By.xpath("//div/div/div[2]/div/div/a[2]"));
    }

    public void compareClothingProduct()
    {
        //compare first product and last product
        clickOnElement(By.xpath("//div[2]/div/div[2]/div[3]/div[2]/input[2]"));
        clickOnElement(By.xpath("//div[3]/div/div[2]/div[3]/div[2]/input[2]"));

        // Click on product comparision option
        clickOnElement(By.xpath("//div[@id='bar-notification']/p/a"));
    }

    public void clearComparision()
    {
        clickOnElement(By.className("clear-list"));
    }


}
