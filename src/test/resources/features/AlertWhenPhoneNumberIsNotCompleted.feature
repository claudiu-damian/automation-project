Feature: An alert appears when user makes fast command with completing just the name field

  Background:
    Given user is on the main page
    And selects tablets subcategory
    When user enters a product

  @Claudiu
  Scenario: An alert appears when user makes an fast command and does not complete the phone number field
    Given user is on the product page
    When user clicks on order now button
    And user completes the username field as "Rick"
    And user clicks on confirm order button
    Then a browser alert: "Numărul de telefon este un cîmp obligatoriu" appears
