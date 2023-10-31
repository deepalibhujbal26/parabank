Feature: Home Page displayed

  @HomePage @Regression @Smoke
  Scenario: verify the home page is display
    Then  user able to see the Home Screen

  @HomePage @Regression
  Scenario: verify the customer Login is display
    And user able to see the Home Screen
    Then user able to see Customer Login ,Verifies Username and password field are display

  @HomePage @Regression
  Scenario: verify the Register link is display
    And user able to see the Home Screen
    Then  user able to see Register Link

  @HomePage @Regression
  Scenario: Verify the Forgot link is display
    And user able to see the Home Screen
    Then User able see Forgot link info is display
