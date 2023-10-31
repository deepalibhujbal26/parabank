Feature: user able to Register

  Background: User is able to register
    Given user able to see the Home Screen
    When  user click on Register Link

  @Register @Regression @Smoke @test
  Scenario: verify user is successfully added
    When user is able to enter first name as "Sohail"
    And user able to Enter Sign Up details in Registration page with username as "random"
    And user click on Register Button
    Then user registration is successful

  @Register @Regression @test1
  Scenario: verify username us already exist message is displayed
    When user is able to enter first name as "Sohail"
    And user able to Enter Sign Up details in Registration page with username as "random"
    And user click on Register Button
    And user logs out
    And user click on Register Link
    And user able to Enter Sign Up details in Registration page with username as "already exist"
    And user click on Register Button
    Then user get the Message that userName is already exist

  @Register @Regression @test2
  Scenario: verify userName is required message is displayed
    When user is able to enter first name as "Sohail"
    And user able to Enter Sign Up details in Registration page with username as ""
    And user click on Register Button
    Then user get the Message that userName is empty

  @Register @Regression @test3
  Scenario: verify firstName is required message is displayed
    When user is able to enter first name as ""
    And user able to Enter Sign Up details in Registration page with username as "Sohail"
    And user click on Register Button
    Then user get the Message that firstName is empty