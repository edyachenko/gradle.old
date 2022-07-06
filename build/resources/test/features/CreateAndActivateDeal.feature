@regression
Feature: Creation and Activation of deals


  Scenario: Create and Activate Deal
    Given User logs in to stage env
    When User fills down name into Name field
    And User sets the value of CPM field to "2"
    And User selects advertiser "Nike" from dropdown menu
    And User selects DSP "Criteo" from DSP dropdown menu
    When User clicks on the Activate button
    Then User see Activate this deal tab
    When User sets seat id "1234"
    And User clicks Activate button in Activate this deal tab
    Then User is redirected to Active deals page and chart is loaded
    When User searchs Activated deal in the bottom table
    Then User should see the search result

  Scenario: Activation of the Deal without DSP (Negative scenario)
    Given User logs in to stage env
    When User sets the value of CPM field to "3"
    And User selects advertiser "Clarity" from dropdown menu
    When User clicks on the Activate button
    Then User should see Warning message about missing mandatory field "DSP" displayed
    When User clicks Cancel button in Warning pop-up message
    And User selects DSP "DV360" from DSP dropdown menu
    And User clicks on the Activate button
    Then User see Activate this deal tab

  Scenario: Activation of the Deal without CPM (Negative scenario)
    Given User logs in to stage env
    And User selects advertiser "La Sportiva" from dropdown menu
    And User selects DSP "The Trade Desk" from DSP dropdown menu
    When User clicks on the Activate button
    Then User should see Warning message about missing mandatory field "CPM" displayed
    When User clicks Cancel button in Warning pop-up message
    And User sets the value of CPM field to "4"
    And User clicks on the Activate button
    Then User see Activate this deal tab

  Scenario: Activation of the Deal without Advertiser (Negative scenario)
    Given User logs in to stage env
    When User sets the value of CPM field to "1"
    And User selects DSP "DV360" from DSP dropdown menu
    When User clicks on the Activate button
    Then User should see Warning message about missing mandatory field "Advertiser" displayed
    When User clicks Cancel button in Warning pop-up message
    And User selects advertiser "PGA" from dropdown menu
    And User clicks on the Activate button
    Then User see Activate this deal tab