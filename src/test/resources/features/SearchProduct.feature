Feature: Search a iphone

  @Sergiu
  Scenario: User try to search a product
    Given user is on the main page
    When user search a product
    Then the list of search products is displayed on the search result page
    And user is navigated on main page