package com.finalAutomation.basePage;

import com.finalAutomation.settings.driver.Setup;
import com.finalAutomation.settings.driver.Wait;
import org.openqa.selenium.WebDriver;

public class BasePage {

    protected WebDriver driver;
    protected Wait wait;

    public BasePage() {
        this.driver = Setup.driver;
        this.wait = new Wait(this.driver);
    }
}