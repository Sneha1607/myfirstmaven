package com.Nopcommerce;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by user on 4/22/2017.
 */
public class loadProp extends BasePage
{
    static Properties prop;
    static FileInputStream input;

    public String getProperty(String key)
    {
        prop = new Properties();

        try
        {
            input = new FileInputStream("src\\test\\Resources\\config.properties");
            prop.load(input);
            input.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        return prop.getProperty(key);
    }
}
