Feature: An alert appears when user makes instat comand without completing any required fields

  Background:
    Given user is on the main page
    And selects tablets subcategory
    When user enters a product

  @Claudiu
  Scenario: An alert appears when user makes an fast command and does not complete the required fields
    Given user is on the product page
    When user clicks on order now button
    And user clicks on confirm order button
    Then a browser alert: "Numele este un cîmp obligatoriu" appears

