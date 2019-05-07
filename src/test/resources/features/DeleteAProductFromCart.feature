Feature: Add to cart
  Background:
    Given user is on the main page
    And selects tablets subcategory
    When user enters a product
    And clicks on the add to cart button
    Then the product is displayed in the user's cart
    @Claudiu
  Scenario: User can delete a product from the cart
    Given is on the Cart page
    When user clicks on the delete from cart button
    Then a message saying that there are no products in cart appears