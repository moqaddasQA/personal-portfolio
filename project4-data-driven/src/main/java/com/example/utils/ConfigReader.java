package com.example.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public  class ConfigReader {

    private  Properties properties;

    public ConfigReader() {
        properties = new Properties();
        try (FileInputStream fileInputStream = new FileInputStream("src/test/resources/config.properties")) {
            properties = new Properties();
            properties.load(fileInputStream);
        } catch (IOException e) {
            throw new RuntimeException("Failed to load configuration file.");
        }
    }

    // Method to get a property value by key
    public  String getProperty(String key) {
        return properties.getProperty(key);
    }
}