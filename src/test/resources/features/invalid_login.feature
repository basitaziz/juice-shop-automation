Feature: User Login

  Scenario: Login with valid credentials
    Given I open the Juice Shop application
    When I navigate to the login page
    And I login with Invalid credentials
    Then Login error message appears
