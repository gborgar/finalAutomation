package com.finalAutomation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

public class Inbox extends BasePage {
    private static final String USERNAME = "finalautomationtest@gmail.com";
    private static final String SUBJECT = "the first test";
    private static final String BODYTEXT = "This is a first automatic test to learn cucumber and selenium.";
    @FindBy(css="input[name=q]")
    WebElement searchInput;
    @FindBy(css="div[data-tooltip='Recibidos']")
    WebElement labelReceived;
    @FindBy(css="div[gh='cm']")
    WebElement composeButton;
    @FindBy(css=".oj div textarea")
    WebElement emailToTextArea;
    @FindBy(name="subjectbox")
    WebElement subjectInput;
    @FindBy(css=".Ar.Au div")
    WebElement bodyText;
    @FindBy(css=".dC div")
    WebElement sendButton;
    @FindBy(css=".F.cf.zt tr")
    WebElement emailSent;

    public Inbox () {
        PageFactory.initElements(driver, this);
    }

    public void checkInboxIsDisplayed() {
       wait.forElementToBeDisplayed(5, searchInput, "searchInput");
       assertThat("the searchInput is not displayed", searchInput.isDisplayed());
       assertThat("the labelReceived is not displayed", labelReceived.isDisplayed());
    }

    public void composeButtonClick() {
        composeButton.click();
    }
    public void enterEmailTo() {
        wait.forElementToBeDisplayed(5, emailToTextArea, "emailToTextArea");
        emailToTextArea.sendKeys(USERNAME);
    }
    public void enterSubject() {
        subjectInput.sendKeys(SUBJECT);
    }
    public void enterEmailContent() {
        bodyText.sendKeys(BODYTEXT);
    }
    public void sendButtonClick() {
        sendButton.click();
    }
    public void checkNewEmailIsSent() {
        wait.forElementToBeDisplayed(5, emailSent, "emailSent");
        assertThat("The email sent is not displayed", emailSent.isDisplayed());
    }
}
