Feature: User Login

  Scenario: Login with valid credentials
    Given I open the Juice Shop application
    When I navigate to the login page
    And I login with valid credentials
    Then I should be redirected to the home page
