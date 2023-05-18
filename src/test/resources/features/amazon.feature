Feature: Amazon sample test

  @amazon
  Scenario: Execute a sample amazon test
    Given the user navigates to amazon website
    When the user searches for "pencil"
    And the user clicks on the 2. result
    Then the page title should contain product title
