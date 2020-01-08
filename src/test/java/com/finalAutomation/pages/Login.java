package com.finalAutomation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login extends BasePage {
    private static final String LOGIN_URL = "https://www.gmail.com";
    private static final String USERNAME = "finalautomationtest@gmail.com";
    private static final String PASSWORD = "2019FinalAutomationTest";

    @FindBy(css="input[name=identifier]")
    WebElement usernameInput;
    @FindBy(css="input[name=password]")
    WebElement passwordInput;
    @FindBy(id="identifierNext")
    WebElement indentifierNext;
    @FindBy(id="passwordNext")
    WebElement passwordNext;

    public Login () {
        PageFactory.initElements(driver, this);
    }
    public void quitDriver () {
        driver.quit();
    }
    public void goToLogin() {
        driver.get(LOGIN_URL);
    }
    public void enterUserName () {
        wait.forElementToBeDisplayed(5, usernameInput, "usernameInput");
        usernameInput.sendKeys(USERNAME);
    }
    public void identifierNextButtonClick() {
        indentifierNext.click();
    }
    public void enterPassword () {
        wait.forElementToBeDisplayed(5, passwordInput, "passwordInput");
        passwordInput.sendKeys(PASSWORD);
    }
    public void passwordNextButtonClick() {
        passwordNext.click();
    }
}
