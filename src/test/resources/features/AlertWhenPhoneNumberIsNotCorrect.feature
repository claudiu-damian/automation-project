Feature: An alert appears when user makes fast command with completing number field wrong

  Background:
    Given user is on the main page
    And selects tablets subcategory
    When user enters a product

  @Claudiu
  Scenario Outline: An alert appears when user enters a wrong format number
    Given user is on the product page
    When user clicks on order now button
    And user completes the username field as "Rick"
    And user completes the phone number field with "<number>"
    And user clicks on confirm order button
    Then a browser alert: "Numărul de telefon trebuie să conțină 6 sau 9 cifre" appears

    Examples:
      | number     |
      | 5          |
      | 1253       |
      | 14235      |
      | 1425236    |
      | 7456984126 |