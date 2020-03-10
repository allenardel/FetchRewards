@ReferralsPage
Feature: Careers Functionality

  Background:
    Given user is on Referrals page

  Scenario: Clicking on the Careers link using locator

    When User clicks careers link
    Then User should be navigated to the careers page


  Scenario: Clicking on the Careers link using loop
    When User loops through all the links on the web page and clicks on careers link
    Then User should be navigated to the careers page


  Scenario: Using keyboard to locate  Careers link using the TAB key
    When User uses TAB key through all the links on the web page and pressing on careers link
    Then User should be navigated to the Careers page p


