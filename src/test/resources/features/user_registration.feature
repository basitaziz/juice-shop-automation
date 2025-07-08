Feature: User Registration

  Scenario: Register a new user successfully
    Given I open the Juice Shop application
    When I navigate to the registration page
    And I register a user with random credentials
    Then I should see the registration confirmation
