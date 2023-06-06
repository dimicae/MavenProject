Feature: Login Page

  Scenario: Successful Login
    Given the User is on SauceDemo login page
    When the user enters the correct user and password
    Then the user should see the Welcome message