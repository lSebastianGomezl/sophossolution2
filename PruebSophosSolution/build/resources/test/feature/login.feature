Feature: Login
  as user
  I want to be able to log into my account
  To access protected functionalities

  @LoginSuccessful
  Scenario: Login successfully
    Given Sebastian is on the login page
    When he enters his username and password
    And click the send button
    Then He should see the home page Prueba de automatización