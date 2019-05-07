Feature: Add to cart
  @Claudiu
  Scenario: User can add to cart a product from a subcategory
    Given user is on the main page
    And selects tablets subcategory
    When user enters a product
    And clicks on the add to cart button
    Then the product is displayed in the user's cart