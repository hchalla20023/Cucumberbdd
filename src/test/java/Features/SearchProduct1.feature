Feature: Verify and Search product in amazon application1
  Scenario: Search product in amazon application1
    Given User launch chrome browser1
    When User navigate to url1 "https://www.amazon.in/"
    And User Enter product name1 is "Iphone"
    And User Click on Searh button1
    Then User Close the browser1

