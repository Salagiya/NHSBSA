$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("nhshelp.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "# It consists of functional test cases in the form of cucumber feature files written in gherkin format"
    }
  ],
  "line": 2,
  "name": "NHSBSA help functionality",
  "description": "As a user I would like to know what help I can get with paying for nhs costs online services.",
  "id": "nhsbsa-help-functionality",
  "keyword": "Feature"
});
formatter.before({
  "duration": 4361286500,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "Verify user is able to get help for NHS cost online services",
  "description": "",
  "id": "nhsbsa-help-functionality;verify-user-is-able-to-get-help-for-nhs-cost-online-services",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "I am a citizen of the UK",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I put my circumstances into the Checker tool",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I click on start button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I select Country I live in",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I click on next button",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I select yes radio button to find out my gp is in scotland or wales",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I click on next button",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I select England as my dental practice country",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I click on next button",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I enter Day \"01\" Month \"01\" Year \"1991\"",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I click on next button",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I select yes radio button of I live with my partner",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I click on next button",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "I click on yes radio button to confirm that I claim benefits",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "I click on next button",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "I select yes we receive Universal credit payments",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "I click on next button",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "I select yes radio button to confirm \u0027As part of your joint Universal Credit\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "I click on next button",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "I select yes radio button of \u0027Did you and your partner have a combined take-home pay of £935 or less in your last Universal Credit period\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "I click on next button",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "I should get a result of whether I will get help or not",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.iAmACitizenOfTheUK()"
});
formatter.result({
  "duration": 86889400,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iPutMyCircumstancesIntoTheCheckerTool()"
});
formatter.result({
  "duration": 25300,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iClickOnStartButton()"
});
formatter.result({
  "duration": 2463664700,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iSelectCountryILiveIn()"
});
formatter.result({
  "duration": 2046120100,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iClickOnNextButton()"
});
formatter.result({
  "duration": 505037000,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iSelectYesRadioButtonToFindOutMyGpIsInScotlandOrWales()"
});
formatter.result({
  "duration": 49324600,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iClickOnNextButton()"
});
formatter.result({
  "duration": 408937800,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iSelectEnglandAsMyDentalPracticeCountry()"
});
formatter.result({
  "duration": 35260200,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iClickOnNextButton()"
});
formatter.result({
  "duration": 465362500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "01",
      "offset": 13
    },
    {
      "val": "01",
      "offset": 24
    },
    {
      "val": "1991",
      "offset": 34
    }
  ],
  "location": "MyStepdefs.iEnterDayMonthYear(String,String,String)"
});
formatter.result({
  "duration": 143105300,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iClickOnNextButton()"
});
formatter.result({
  "duration": 383508600,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iSelectYesRadioButtonOfILiveWithMyPartner()"
});
formatter.result({
  "duration": 49244300,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iClickOnNextButton()"
});
formatter.result({
  "duration": 365299700,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iClickOnYesRadioButtonToConfirmThatIClaimBenefits()"
});
formatter.result({
  "duration": 41300500,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iClickOnNextButton()"
});
formatter.result({
  "duration": 380115700,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iSelectYesWeReceiveUniversalCreditPayments()"
});
formatter.result({
  "duration": 37222400,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iClickOnNextButton()"
});
formatter.result({
  "duration": 470973500,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iSelectYesRadioButtonToConfirmAsPartOfYourJointUniversalCredit()"
});
formatter.result({
  "duration": 37604200,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iClickOnNextButton()"
});
formatter.result({
  "duration": 407377400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "935",
      "offset": 89
    }
  ],
  "location": "MyStepdefs.iSelectYesRadioButtonOfDidYouAndYourPartnerHaveACombinedTakeHomePayOf£OrLessInYourLastUniversalCreditPeriod(int)"
});
formatter.result({
  "duration": 33002600,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iClickOnNextButton()"
});
formatter.result({
  "duration": 416225000,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iShouldGetAResultOfWhetherIWillGetHelpOrNot()"
});
formatter.result({
  "duration": 36520500,
  "status": "passed"
});
formatter.after({
  "duration": 686409300,
  "status": "passed"
});
formatter.before({
  "duration": 1963020500,
  "status": "passed"
});
formatter.scenario({
  "line": 29,
  "name": "Verify user is unable to get help for NHS cost online services when select Northern Ireland",
  "description": "",
  "id": "nhsbsa-help-functionality;verify-user-is-unable-to-get-help-for-nhs-cost-online-services-when-select-northern-ireland",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 30,
  "name": "I am a citizen of the UK",
  "keyword": "Given "
});
formatter.step({
  "line": 31,
  "name": "I put my circumstances into the Checker tool",
  "keyword": "When "
});
formatter.step({
  "line": 32,
  "name": "I click on start button",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "I select Country Northern Ireland",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "I click on next button",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "I should not get NHS help service as I live in Northern Ireland",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.iAmACitizenOfTheUK()"
});
formatter.result({
  "duration": 21200,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iPutMyCircumstancesIntoTheCheckerTool()"
});
formatter.result({
  "duration": 13100,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iClickOnStartButton()"
});
formatter.result({
  "duration": 2492487300,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iSelectCountryNorthernIreland()"
});
formatter.result({
  "duration": 37636000,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iClickOnNextButton()"
});
formatter.result({
  "duration": 421529700,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iShouldNotGetNHSHelpServiceAsILiveInNorthernIreland()"
});
formatter.result({
  "duration": 30330300,
  "status": "passed"
});
formatter.after({
  "duration": 680475900,
  "status": "passed"
});
});