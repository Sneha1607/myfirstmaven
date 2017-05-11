package com.Nopcommerce;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created by user on 4/8/2017.
 */
public class Utils extends BasePage
{
    //For Type or send any string (e.g. username, password).
    public static void typeText(By by, String text) {
        driver.findElement(by).clear();
        driver.findElement(by).sendKeys(text);
    } //in a sub-Class this is shown as: typetext(By.xpath("-//div[@class=name]-"),"-'String'-").

    //For Click on any element.
    public static void clickOnElement(By by) {
        driver.findElement(by).click();
    }

    //For try, catch and sleep function.
    public static void sleep(int i) {
        try {
            Thread.sleep(i * 1000); //sleep is always in milliseconds. multiply by 1000 for seconds.
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    //Select Method
    //For Dropdown selection by visible text.
    public static void selectText(By by, String text) {
        new Select(driver.findElement(by)).selectByVisibleText(text);
    }

    //For Dropdown selection by value.
    public static void selectValue(By by, String value) {
        Select select = new Select(driver.findElement(by));
        select.selectByValue(value);
    }

    //For Dropdown selection by index.
    public static void selectIndex(By by, int index) {
        Select select;
        new Select(driver.findElement(by)).selectByIndex(index);
    }

    //For Opening URL for any website.
    public static void getLink(String url)
    {
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    //Explicit Wait Method
    //For Waiting for element to be present.
    public static void elementToBePresent(By by, int seconds) {
        WebDriverWait wait = new WebDriverWait(driver, seconds);
        wait.until(ExpectedConditions.presenceOfElementLocated(by));
    }

    //For Waiting for element to be clickable.
    public static void elementToBeClickable(By by, int seconds) {
        WebDriverWait wait = new WebDriverWait(driver, seconds);
        wait.until(ExpectedConditions.elementToBeClickable(by));
    }

    //For Waiting for element to be visible.
    public static void elementToBeVisible(By by, int seconds) {
        WebDriverWait wait = new WebDriverWait(driver, seconds);
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    //For Waiting for element to be selected.
    public static void elementToBeSelected(By by, int seconds) {
        WebDriverWait wait = new WebDriverWait(driver, seconds);
        wait.until(ExpectedConditions.elementToBeSelected(by));
    }

    //For Waiting for element to be located.
    public static void elementToBeLocated(By by, int seconds) {
        WebDriverWait wait = new WebDriverWait(driver, seconds);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(by));
    }

    //For Waiting for element invisibility of element with text.
    public static void invisibilityOfElementWithText(By by, String text, int seconds) {
        WebDriverWait wait = new WebDriverWait(driver, seconds);
        wait.until(ExpectedConditions.invisibilityOfElementWithText(by, text));
    }

    //For getting text from any element.
    public static String getText(By by) {
        String text = driver.findElement(by).getText();
        return text;
    }

    public static void mouseHover(By by)
    {
        Actions actions = new Actions(driver);
        WebElement mouse = driver.findElement(by);
        actions.moveToElement(mouse).build().perform();
    }

    //For Assert Expected Result to Actual Result
    public static void assertResult(String expectedText,String actualText)
    {

    }

    //Date Stamp Method
    public static String dateStamp() {
        DateFormat dateformat = new SimpleDateFormat("MMddyyHHmmss");
        Date date = new Date();
        String date1 = dateformat.format(date);
        return date1;
    }

    //For Screenshotting method.
    //Browser Screenshot.
    public static void browserScreenshot(String filePath) {
        TakesScreenshot screenshot = (TakesScreenshot) driver;
        File screenshot1 = screenshot.getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(screenshot1, new File(filePath + "\\photo" + dateStamp() + ".jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //Print Screen Screenshot.
    public static void printScreen(String filePath)
    {
        try
        {
            Robot robot = new Robot();
            BufferedImage screenshot = robot.createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
            ImageIO.write(screenshot, "jpg", new File(filePath + "\\photo" + dateStamp() + ".jpg"));
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        catch (AWTException e)
        {
            e.printStackTrace();
        }
    }

    //For Random number method.
    public static int randomNumber(int range)
    {
        Random random = new Random();
        int number = random.nextInt(range);
        return number;
    }

    //Dropdown Selection by attribute if select class is not available
    public static void dropDownSelectionByAttribute(By by,String attributeName,String dropDownText)
    {
        List<WebElement> size_menu = driver.findElements(by);

        for(WebElement element : size_menu)
        {
            String innerText = element.getAttribute(attributeName); //get attribute from element
            if (innerText.contentEquals(dropDownText))
            {
                element.click();
                break;
            }
            //System.out.println(element);
        }
    }

    public static void getTextOfDropdown()
    {
        WebElement sel = driver.findElement(By.name("products-orderby"));
        List<WebElement> lists = sel.findElements(By.tagName("option"));
        for(WebElement element: lists)
        {
            String var2 = element.getText();
            System.out.println(var2);
        }
    }


}
