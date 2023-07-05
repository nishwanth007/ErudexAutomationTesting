package com.erudex.pages.login;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    private static final String CONFIG_PROPS = "src/main/resources/config.properties";
    private static Properties properties;

    static {
        try {
            FileInputStream fileInputStream = new FileInputStream(CONFIG_PROPS);
            properties = new Properties();
            properties.load(fileInputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getProperty(String propertyName) {
        return properties.getProperty(propertyName);
    }
}
