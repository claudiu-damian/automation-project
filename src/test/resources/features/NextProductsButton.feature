Feature: 'Următoarele produse' button

  @Andrei
  Scenario: 'Următoarele produse' button is displayed only when on the page are more than 60 products
    Given user is on the main page
    And selects laptops subcategory
    Then clicks on  if there are over  products