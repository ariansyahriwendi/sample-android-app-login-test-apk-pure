@Login
Feature: Login
  As a user
  I want to login
  So that I can login my account

  @SuccessToLogin
  Scenario: Success To Login
    Given Account is registered
    Given Login page opened
    When I input email "andi@fakemail.com"
    And I input password "password"
    And I click login
    Then Success to login
    Then Redirect to welcome page

  @LoginWrongPassword
  Scenario: Login Wrong Password
    Given Account is registered
    Given Login page opened
    When I input email "andi@fakemail.com"
    And I input password "wrongpassword"
    And I click login
    Then Failed to login
    Then Show alert wrong email or password

  @LoginWrongEmail
  Scenario: Login Wrong Email
    Given Account is registered
    Given Login page opened
    When I input email "wrongemail@fakemail.com"
    And I input password "password"
    And I click login
    Then Failed to login
    Then Show alert wrong email or password

  @LoginWrongEmailAndPassword
  Scenario: Login Wrong Email And Password
    Given Account is registered
    Given Login page opened
    When I input email "wrongemail@fakemail.com"
    And I input password "wrongpassword"
    And I click login
    Then Failed to login
    Then Show alert wrong email or password

  @LoginInvalidEmailFormat
  Scenario: Login Invalid Email Format
    Given Account is registered
    Given Login page opened
    When I input email "invalidemail"
    And I input password "password"
    And I click login
    Then Failed to login
    Then Show alert enter valid email

  @LoginNoInputPassword
  Scenario: Login No Input Password
    Given Account is registered
    Given Login page opened
    When I input email "andi@fakemail.com"
    And I input password ""
    And I click login
    Then Failed to login
    Then Show alert enter password

  @LoginNoInputEmail
  Scenario: Login No Input Email
    Given Account is registered
    Given Login page opened
    When I input email ""
    And I input password ""
    And I click login
    Then Failed to login
    Then Show alert enter email