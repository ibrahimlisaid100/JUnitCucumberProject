package com.CYDEO.Utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {


    public static String getProperties(String key){
       Properties properties =new Properties();


        try {
            FileInputStream file = new FileInputStream("configuration.properties");
            properties.load(file);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        return properties.getProperty(key);


    }



}
