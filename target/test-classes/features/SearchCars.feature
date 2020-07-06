@Search-Cars
Feature: Acceptance testing to validate Search cars is working
  In order to validate that 
  the search cars page is working fine
  we will do the acceptance testing

  @Search-Cars_Positive
  Scenario: Validate Search cars page
    Given I am on the Home page "https://www.carsguide.com.au" of CarsGuide website
    When I move to menu
      | Menu     |
      | buy+sale |
      | reviews  |
    And click on "Search Cars" link
    And select carbrand as "BMW" from AnyMake dropdown
    And select carmodel as "1Series" from AnyModel dropdown
    And select location as "ACT - All" from AnyLocation dropdown
    And select price as "$1,000" from Price(max) dropdown
    And click on "Find_My_Next_Car" button
    Then I should see list of searched cars
    And the page title should be "Bmw 1 Series Under 1000 for Sale"
