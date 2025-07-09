Feature: Add Products to Cart

  Scenario: Add a product to the cart
    Given I open the Juice Shop application
    When I navigate to the login page
    And I login with valid credentials
    When I add a product to the cart
    Then the cart should show the product
