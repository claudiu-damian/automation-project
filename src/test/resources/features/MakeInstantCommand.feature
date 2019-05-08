Feature: User can make a command without adding product to cart

  Background:
    Given user is on the main page
    And selects tablets subcategory
    When user enters a product

  @Claudiu
  Scenario: User can delete a product from the cart
    Given user is on the product page
    When user clicks on order now button
    And user clicks on confirm order button without completing name and number fields
    Then a browser alert appears