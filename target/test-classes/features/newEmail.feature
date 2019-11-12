@ToTest
Feature: Send a simple new email from the application
As a user
I want to write and send a new mail to an email address

Background:
    Given we are an user with an email address
    And we are logged in the application
    And we have an email address as target
    And we have a mail subject
    And we have a mail content


Scenario: Do login in the application
    When we click in the send button
    Then the email is sent successful


