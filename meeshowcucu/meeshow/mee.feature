Feature: Search on meeshow website and verify search.

  @Search
  Scenario: Search on meeshow  website and verify it.
    Given I open the chrome browser
    And I navigating to meeshow website
    Then I click at search textbox
    And I enter "tshirt" in search textbox
    And I click at Search button
                                                    