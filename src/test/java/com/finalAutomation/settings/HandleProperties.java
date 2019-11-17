package com.finalAutomation.settings;

import java.io.*;
import java.util.Properties;

public class HandleProperties {
    HandleProperties() {}

    public Properties getProperties() {
        Properties prop = new Properties();
        try (InputStream input = new FileInputStream("src/test/resources/params.properties")) {
            prop.load(input);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return prop;
    }
}

