@BuyProduct
Feature: Purchase a product on SauceDemo

  Scenario: Successful purchase flow from login to order confirmation
    Given i am on the SauceDemo login page
    When I log in with valid credentials
    And I add a product to the cart
    And I proceed to checkout
    And I enter the checkout information with first name "John", last name "Doe", and zip code "1234"
    And I finish reviewing my order
    Then I should see the order confirmation page