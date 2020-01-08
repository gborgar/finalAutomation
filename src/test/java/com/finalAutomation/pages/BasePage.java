package com.finalAutomation.pages;

import com.finalAutomation.driver.Setup;
import com.finalAutomation.driver.Wait;
import org.openqa.selenium.WebDriver;

public class BasePage {
    protected WebDriver driver;
    protected Wait wait;

    public BasePage () {
        this.driver = Setup.driver;
        this.wait = new Wait(this.driver);
    }
}
