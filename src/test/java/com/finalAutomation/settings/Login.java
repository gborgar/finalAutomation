package com.finalAutomation.settings;

import com.finalAutomation.basePage.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.finalAutomation.settings.HandleProperties;

import java.util.Properties;

public class Login extends BasePage {
    private static final String LOGIN_URL = "https://www.gmail.com";
    Properties prop = new HandleProperties().getProperties();

    @FindBy(css = "input[name=identifier]")
    private WebElement usernameInput;
    @FindBy(css = "input[name=password]")
    private WebElement passwordInput;
    @FindBy(css = ".RveJvd .snByac")
    private WebElement nextButton;

    public Login() {
        PageFactory.initElements(driver, this);
    }

    public void goToLogin(){
        System.out.println("url" + LOGIN_URL);
        driver.get(LOGIN_URL);
        wait.forLoading(5);
    }

    public void checkUsernameInputIsDisplayed() {
        wait.forElementToBeDisplayed(5, this.usernameInput, "username Input");
    }

    public void nextButtonClick() {
        nextButton.click();
    }


    public void enterUsername(String username) {
//        String username = prop.getProperty("username");
        this.usernameInput.sendKeys(username);
    }

    public User getUser() {
        User user = new User(prop.getProperty("username"), prop.getProperty("password"));
        return user;
    }

    public void enterPassword(String password) {
//        String password = prop.getProperty("password");
        this.passwordInput.sendKeys(password);
    }
}

