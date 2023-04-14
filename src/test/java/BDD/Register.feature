@Register
Feature: Register
  As a user
  I want to register
  So that I can register my account

  @SuccessToRegister
  Scenario: Success To Register
    Given Account is not registered
    Given Login page opened
    When I click no account yet? create one
    And I input name "Andi"
    And I input email "andi@fakemail.com"
    And I input password "password"
    And I input confirm password "password"
    And I click register
    Then Success to register
    Then Show alert registration successful

  @SuccessToRegisterAndLogin
  Scenario: Success To Register And Login
    Given Account is not registered
    Given Login page opened
    When I click no account yet? create one
    And I input name "Andi"
    And I input email "andi@fakemail.com"
    And I input password "password"
    And I input confirm password "password"
    And I click register
    Then Success to register
    Then Show alert registration successful
    When I click already a member? login
    And I input email "andi@fakemail.com"
    And I input password "password"
    And I click login
    Then Success to login

  @RegisterAlreadyUsedEmail
  Scenario: Register Already Used Email
    Given Account is registered
    Given Login page opened
    When I click no account yet? create one
    And I input name "Andi"
    And I input email "andi@fakemail.com"
    And I input password "password"
    And I input confirm password "password"
    And I click register
    Then Failed to register
    Then Show alert email already exists

  @RegisterNoMatchesConfirmPassword
  Scenario: Register No Input Confirm Password
    Given Account is not registered
    Given Login page opened
    When I click no account yet? create one
    And I input name "Andi"
    And I input email "andi@fakemail.com"
    And I input password "password"
    And I input confirm password "password2"
    And I click register
    Then Failed to register
    Then Show alert password does not matches

  @RegisterNoInputConfirmPassword
  Scenario: Register No Input Confirm Password
    Given Account is not registered
    Given Login page opened
    When I click no account yet? create one
    And I input name "Andi"
    And I input email "andi@fakemail.com"
    And I input password "password"
    And I input confirm password ""
    And I click register
    Then Failed to register
    Then Show alert password does not matches

  @RegisterNoInputPassword
  Scenario: Register No Input Password
    Given Account is not registered
    Given Login page opened
    When I click no account yet? create one
    And I input name "Andi"
    And I input email "andi@fakemail.com"
    And I input password ""
    And I input confirm password ""
    And I click register
    Then Failed to register
    Then Show alert enter password

  @RegisterNoInputEmail
  Scenario: Register No Input Email
    Given Account is not registered
    Given Login page opened
    When I click no account yet? create one
    And I input name "Andi"
    And I input email ""
    And I input password ""
    And I input confirm password ""
    And I click register
    Then Failed to register
    Then Show alert enter email

  @RegisterNoInputName
  Scenario: Register No Input Name
    Given Account is not registered
    Given Login page opened
    When I click no account yet? create one
    And I input name ""
    And I input email ""
    And I input password ""
    And I input confirm password ""
    And I click register
    Then Failed to register
    Then Show alert enter full name

  @RegisterInvalidEmailFormat
  Scenario: Register Invalid Email Format
    Given Account is not registered
    Given Login page opened
    When I click no account yet? create one
    And I input name ""
    And I input email "invalidemail"
    And I input password ""
    And I input confirm password ""
    And I click register
    Then Failed to register
    Then Show alert enter valid email
