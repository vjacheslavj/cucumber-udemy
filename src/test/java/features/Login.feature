Feature: Application login
  #Feature - this is requirements
  #When - action
  #Then -
  #And -
  #But -

  Scenario: Home page default login
    Given user is on NetBanking landing page
    When user login into application with "jin" username and password "1234"
    Then home page is populated
    And cards are displayed are "true"

  Scenario: Home page default login
    Given user is on NetBanking landing page
    When user login into application with "john" username and password "4321"
    Then home page is populated
    And cards are displayed are "false"