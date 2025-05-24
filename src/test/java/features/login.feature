Feature: User Login

  As a user of the SauceDemo website
  I want to be able to login with valid credentials
  So that I can access the products page

  Scenario: Successful login with valid credentials
    Given I am on the SauceDemo login page
    When I login with username "standard_user" and password "secret_sauce"
    Then I should be redirected to the products page

  Scenario: Login fails with invalid credentials
    Given I am on the SauceDemo login page
    When I login with username "invalid_user" and password "wrong_password"
    Then I should see an error message

  Scenario: Login fails with empty fields
    Given I am on the SauceDemo login page
    When I login with username "" and password ""
    Then I should see an error message