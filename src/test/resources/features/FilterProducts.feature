Feature: Filter

 // @Andrei
  Scenario: User can filter products
    Given user is on the main page
    And selects tablets subcategory
    When selects filter by name "Acer"
    Then filtered array of items is displayed

