# It consists of functional test cases in the form of cucumber feature files written in gherkin format
Feature:  NHSBSA help functionality
  As a user I would like to know what help I can get with paying for nhs costs online services.

  Scenario: Verify user is able to get help for NHS cost online services
    Given I am a citizen of the UK
    When  I put my circumstances into the Checker tool
    And   I click on start button
    And   I select Country I live in
    And   I click on next button
    And   I select yes radio button to find out my gp is in scotland or wales
    And   I click on next button
    And   I select England as my dental practice country
    And   I click on next button
    And   I enter Day "01" Month "01" Year "1991"
    And   I click on next button
    And   I select yes radio button of I live with my partner
    And   I click on next button
    And   I click on yes radio button to confirm that I claim benefits
    And   I click on next button
    And   I select yes we receive Universal credit payments
    And   I click on next button
    And   I select yes radio button to confirm 'As part of your joint Universal Credit'
    And   I click on next button
    And   I select yes radio button of 'Did you and your partner have a combined take-home pay'
    And   I click on next button
    Then  I should get a result of whether I will get help or not

  Scenario: Verify user is unable to get help for NHS cost online services when select Northern Ireland
    Given I am a citizen of the UK
    When  I put my circumstances into the Checker tool
    And   I click on start button
    And   I select Country Northern Ireland
    And   I click on next button
    Then  I should not get NHS help service as I live in Northern Ireland




















