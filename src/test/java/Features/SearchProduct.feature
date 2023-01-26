Feature: Verify and Search product in amazon application
  Scenario: Search product in amazon application
    Given User launch chrome browser
    When User navigate to url "https://www.amazon.in/"
    And User Enter product name is "Iphone"
    And User Click on Searh button
    Then User Close the browser

