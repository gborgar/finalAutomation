package com.finalAutomation.driver;

import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Setup {
    public static WebDriver driver;
    @Before
    public void setWebDriver() throws Exception {
        String browser = System.getProperty("browser");
        if (browser == null) {
            browser = "chrome";
        }
        if ("chrome".equals(browser)) {
            ChromeOptions chromeOptions= new ChromeOptions();
            chromeOptions.addArguments("start-maximized");
            driver = new ChromeDriver(chromeOptions);
        } else if ("firefox".equals(browser)) {
            driver = new FirefoxDriver();
            driver.manage().window().maximize();
        } else {
            throw new IllegalArgumentException("Browser " + browser + "is not supported");
        }
    }
}

