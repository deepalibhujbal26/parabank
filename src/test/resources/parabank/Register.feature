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


  @datatable
  Scenario Outline: verfiy all sign up details Field
    When user click on Register Link
    And user enter the Sign up Fields "<firstName>" "<lastName>" "<address>" "<city>" "<state>" "<zipCode>" "<phoneNo>" "<SSN>" "<userName>" " <password>" "<confirmpwd>"
    And user click on Register Button
    Then user verify the Error msg "<message>"
    Examples:
      | firstName | lastName | address  | city   | state | zipCode | phoneNo | SSN  | userName    | password     | confirmpwd   | message                             |
      | sohail    | bassi    | dontknow | indore | MP    | 01234   | 98764   | 6758 | parabank_1  | parabank#123 | parabank#123 | Sucessfully Login                   |
      |           | bassi    | dontknow | indore | MP    | 01234   | 98764   | 6758 | parabank    | parabank#123 | parabank#123 | First name is required.             |
      | mozaam    |          | dontknow | indore | MP    | 01234   | 98764   | 6758 | parabank_21 | parabank#123 | parabank#123 | Last name is required.              |
      | mozaam1   | bassi    |          | indore | MP    | 01234   | 98764   | 6758 | parabank_31 | parabank#123 | parabank#123 | Address is required.                |
      | mozaam2   | bassi2   | pak      |        | MP    | 01234   | 98764   | 6758 | parabank_41 | parabank#123 | parabank#123 | City is required.                   |
      | mozaam4   | bassi4   | paki     | indore |       | 01234   | 98764   | 6758 | parabank_51 | parabank#123 | parabank#123 | State is required.                  |
      | mozaam5   | bassi5   | pakis    | indore | Mp    |         | 98764   | 6758 | parabank_61 | parabank#123 | parabank#123 | Zip Code is required.               |
      | mozaam6   | bassi6   | pakist   | indore | Mp    | 04355   |         | 6758 | parabank_71 | parabank#123 | parabank#123 | Phone is required.                  |
      | mozaam61  | bassi6   | pakist   | indore | Mp    | 04355   | 87695   |      | parabank_81 | parabank#123 | parabank#123 | Social Security Number is required. |
      | mozaam62  | bassi6   | pakist   | indore | Mp    | 04355   | 87695   | 7896 |             | parabank#123 | parabank#123 | Username is required.               |
      | mozaam63  | bassi6   | pakist   | indore | Mp    | 04355   | 87695   | 7896 | parabank_91 |              | parabank#123 | Password is required.               |
      | mozaam64  | bassi64  | pakistan | indor  | Mpc   | 04375   | 87675   | 2896 | parabank_76 | parabank#123 |              | Password confirmation is required.  |
      | mozaam65  | bassi65  | pakistan | indor  | Mpc   | 04375   | 87675   | 2896 | parabank_79 | parabank#123 | parabank     | Passwords did not match.            |
















