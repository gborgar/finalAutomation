package com.finalAutomation.Steps;

import com.finalAutomation.pages.Inbox;
import com.finalAutomation.pages.Login;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyStepdefs {

    private Login login = new Login();
    private Inbox inbox = new Inbox();


    @Given("an user logged in the application")
    public void anUserLoggedInTheApplication() {
        login.goToLogin();
        login.enterUserName();
        login.identifierNextButtonClick();
        login.enterPassword();
        login.passwordNextButtonClick();
        inbox.checkInboxIsDisplayed();
    }

    @When("we open the window to compose a new email")
    public void weOpenTheWindowToComposeANewEmail() {
        inbox.composeButtonClick();
    }

    @And("we put the destination email")
    public void wePutTheDestinationEmail() {
        inbox.enterEmailTo();
    }

    @And("we put an email subject")
    public void wePutAnEmailSubject() {
        inbox.enterSubject();
    }

    @And("we put an email content")
    public void wePutAnEmailContent() {
       inbox.enterEmailContent();
    }

    @And("we click on the send button")
    public void weClickOnTheSendButton() {
        inbox.sendButtonClick();
    }

    @Then("the email is sent successful")
    public void theEmailIsSentSuccessful() {
        inbox.checkNewEmailIsSent();
    }


}
