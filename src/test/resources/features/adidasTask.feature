@all
Feature: Navigate Demoblize website and purchase feature
  User Story:
  As a user, I should be able to navigate to all product categories, add any product to cart and make purchase
  @laptopI5
  Scenario: Navigate to "Laptop" "Sony vaio i5"
    Given user is on the home page
    When user click on laptops category
    And user click on Laptop Sony vaio i5
    And user click on Add to cart
    Then user should be able to accept pop up confirmation and add iter in cart
  @laptopI7
  Scenario: Navigate to  Laptop Dell i7 8gb
    Given user is on the home page
    When user click on laptops category
    And user click on  Laptop Dell i7 8gb
    And user click on Add to cart
    Then user should be able to accept pop up confirmation and add iter in cart
  @delete
  Scenario: Navigate to Cart"and delete Dell i7 8gb from cart
    Given user is on the home page
    When user click cart button
    Then user should be able to navigate cart page
    And user should be able to delete any item from the cart by clicking button delete
  @order
  Scenario: Place order
    Given user on the cart page
    When user click on button Place order
    And user fill in all web form fields
    And user click on purchase button
    Then user should be able to make purchase
