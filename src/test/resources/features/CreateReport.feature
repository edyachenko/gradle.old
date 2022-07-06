Feature: Create report
  Background:
    Given User logs in to stage env
    Then User on the Home page

  Scenario: Verify Create button appearance
    When User navigates to Active Deals page
    Then Create Report Button is disabled
    When User selects deal report
    Then Create Report Button is enabled
    When User unselects "deal" report checkbox
    Then Create Report Button is disabled

  Scenario: Verify Item list in Create report
    When User navigates to "Active Deals" page
    Then Create Report Button is disabled
    When User selects View by "Advertiser"
    And User selects "advertiser" report
    And User selects View By "Deal"
    And User selects "deal" report checkbox
    And User clicks on Create Report Button
    Then Create Report pop up is displayed
    And User verifies that all selected deals are present in a list
    When User removes deal from the list
    Then Deal is removed from the list
    When User removes advertiser with all deals
    Then Advertiser is removed from the list

    Scenario: Verify One-time report pop up
      When User navigates to "Active Deals" page
      Then Create Report Button is disabled
      When User selects deal report
      And User clicks on Create Report Button
      Then Create Report pop up is displayed
      And Create one time report option is selected by default
      When User selects all dimension options
      Then All options are selected
      When User unchecks "Some" dimension option
      Then "Some"option is unchecked
      And User verifies that timeframe contains default values

    Scenario: Verify One-time report pop up
      When User navigates to "Active Deals" page
      Then Create Report Button is disabled
      When User selects deal report
      And User clicks on Create Report Button
      Then Create Report pop up is displayed
      When Create select Create a recurring report
      Then Options for recurring report are displayed
      When User selects all dimension options
      Then All options are selected
      And User verifies that timeframe contains default values
      When User selects Frequency tab
      Then default options for Frequency tab are displayed
      When User deselects Tuesday checkbox
      Then Tuesday checkbox is unchecked
      When User selects Monthly option
      Then Default options are displayed
      When User sets "On the" value to "31st"
      And Unchecks "January" month
      And Updates "Ends" section with "06/16/2024"



