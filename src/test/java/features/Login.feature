Feature: Application login
  #Feature - this is requirements
  #When - action
  #Then -
  #And -
  #But -

  Scenario: Home page default login
    Given user is on NetBanking landing page
    When user login into application with username and password
    Then home page is populated
    And cards are displayed
