@ToTest
  Feature: Send a new email from the application

    Scenario: The customer sends a new email
#      Given we are an user with an email address
      Given an user logged in the application
      When we open the window to compose a new email
      And we put the destination email
      And we put an email subject
      And we put an email content
      And we click on the send button
#      Then the email is sent successful
