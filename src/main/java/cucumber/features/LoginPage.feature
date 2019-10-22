Feature: Login page field validation

  Scenario: UI validation for login
    Given I open the browser and navigate to facebook login page
    When I land on facebook homepage I validate login page is displayed
    Then I validate email or phone field is displayed
    Then I validate password field is displayed
    Then I validate login button is displayed
    Then I_quit_the_browser