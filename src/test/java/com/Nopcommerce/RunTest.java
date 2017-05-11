package com.Nopcommerce;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by user on 5/11/2017.
 */

@RunWith(Cucumber.class)
@CucumberOptions(features = ".",format = "html:target/CucumberReportes", tags = "@Raja1")
public class RunTest
{
}