Feature: Customer Page

  @Customer
    Scenario: User able to enter  the details
     When   user able to see the Home Screen
    When user enters username And Password
      And  click on Login Button.
      Then user able to Logged In successfully

     @Customer1
    Scenario: user try to register with same username and password
      When user able to see the Home Screen
      When user enters  existing username And  correct Password
      And click on Login Button.
      Then user get the Message that userName is already exist


