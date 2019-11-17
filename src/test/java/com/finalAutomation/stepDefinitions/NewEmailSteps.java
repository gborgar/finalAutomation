package com.finalAutomation.stepDefinitions;

import com.finalAutomation.settings.Login;
import com.finalAutomation.settings.User;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NewEmailSteps {
    private Login login;
    public User user;
    public NewEmailSteps() {
        this.login = new Login();
    }

    @Given("we are an user with an email address")
    public void we_are_an_user_with_an_email_address() {
        this.user = this.login.getUser();
    }

    @Given("we are logged in the application")
    public void we_are_logged_in_the_application() {
        this.login.goToLogin();
//        this.login.enterUsername(user.getUsername());
//        this.login.nextButtonClick();
//        this.login.enterPassword(user.getPassword());
//        this.login.nextButtonClick();
    }

    @And("we have an email address as target")
    public void we_have_an_email_address_as_target() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @And("we have an email subject")
    public void we_have_an_email_subject() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @And("we have an email content")
    public void we_have_an_email_content() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("we click in the send button")
    public void we_click_in_the_send_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("the email is sent successful")
    public void the_email_is_sent_successful() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }
}
