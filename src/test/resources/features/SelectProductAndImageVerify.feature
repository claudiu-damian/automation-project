Feature: Select Vonino Navo P and watch its pictures

  Background:
    Given user is on the main page
    And selects tablets subcategory
    When user enters a product

  @Sergiu
  Scenario: User try slide pictures of product
    Given user on page with Vonino Navo P
    When user select to see picture of product
    Then the pictures of product are visible on the page
    And user is navigated on main page