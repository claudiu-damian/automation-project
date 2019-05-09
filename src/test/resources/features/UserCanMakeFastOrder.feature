Feature: User can make fast order

  Background:
    Given user is on the main page
    And selects tablets subcategory
    When user enters a product

  @Claudiu
  Scenario Outline: User can make fast order by completing correctly name and phone number fields
    Given user is on the product page
    When user clicks on order now button
    And user completes the username field as "Rick"
    And user completes the phone number field with "<number>"
    And user clicks on confirm order button
    Then a confirmation message with some instructions appears

    Examples:
      | number    |
      | 125687    |
      | 125359856 |