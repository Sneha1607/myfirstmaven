package com.Nopcommerce;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.io.FileInputStream;

/**
 * Created by user on 4/22/2017.
 */
public class BrowserSelactor extends BasePage
{
    public void browser()
    {
        loadProp load = new loadProp();
//        String browser = load.getProperty("browser");
        String browser = System.getProperty("browser");

        if (browser.equalsIgnoreCase("firefox"))
        {
            driver = new FirefoxDriver();
        }
        else if(browser.equalsIgnoreCase("chrome"))
        {
            System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\IdeaProjects\\myfirstmaven\\src\\test\\Resources\\BrowserDriver\\chromedriver.exe");
            driver = new ChromeDriver();
        }
        else if(browser.equalsIgnoreCase("ie"))
        {
            System.setProperty("webdriver.ie.driver","C:\\Users\\user\\IdeaProjects\\myfirstmaven\\src\\test\\Resources\\BrowserDriver\\IEDriverServer.exe");
            driver = new InternetExplorerDriver();
        }
        else
        {
            System.out.println("Browser name is wrong...");
        }
    }
}
