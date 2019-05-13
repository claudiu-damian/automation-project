Feature: Order items by price

  Background:
  Given user is on the main page
  And selects tablets subcategory
  @Andrei
  Scenario: Products are order by price in ascending order when is clicked on "preț: mare spre mic" button
    When User clicks on alphabetic sort
    Then Items are ordered in ascending order by alphabet
