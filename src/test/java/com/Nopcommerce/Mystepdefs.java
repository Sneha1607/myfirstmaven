package com.Nopcommerce;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;

/**
 * Created by user on 5/11/2017.
 */
public class Mystepdefs extends Utils
{
    HomePage homePage = new HomePage();

    @Given("^User should on homepage$")
    public void user_should_on_homepage()
    {

    }

    @When("^User click on register link$")
    public void user_click_on_register_link()
    {
        clickOnElement(By.className("ico-register"));
    }

    @Then("^User should navigate to registration page$")
    public void user_should_navigate_to_registration_page()
    {
        Assert.assertTrue(driver.getCurrentUrl().contains("register"));
    }

    @Given("^User should on homepage for login$")
    public void user_should_on_homepage_for_login() {


    }

    @When("^User click on login link$")
    public void user_click_on_login_link() {

        clickOnElement(By.linkText("Log in"));
    }

    @Then("^User should navigate to login page$")
    public void user_should_navigate_to_login_page() {

        Assert.assertEquals(getText(By.xpath("//div[6]/div[3]/div/div/div/div[1]/h1")),"Welcome, Please Sign In!","no");
    }


}
