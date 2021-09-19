@ToTest
Feature: Send a simple new email from the application
    As a user
    I want to write and send a new mail to an email address

Scenario: The customer sent a new email
    Given we are an user with an email address
    And we are logged in the application
    And we have an email address as target
    And we have an email subject
    And we have an email content
    When we click in the send button
    Then the email is sent successful
