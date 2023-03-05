package uk.nhs.nhsbsa.services.cucumber.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import uk.nhs.nhsbsa.services.pages.*;
// It consists of different methods to implement each step of your feature files
public class MyStepdefs {

    @Given("^I am a citizen of the UK$")
    public void iAmACitizenOfTheUK() {
    }

    @When("^I put my circumstances into the Checker tool$")
    public void iPutMyCircumstancesIntoTheCheckerTool() {
    }

    @Then("^I click on start button$")
    public void iClickOnStartButton() throws InterruptedException {
        Thread.sleep(2000);
        new StartPage().clickOnStartButton();
    }

    @And("^I select Country I live in$")
    public void iSelectCountryILiveIn() throws InterruptedException {
        Thread.sleep(2000);
        new WhereYouLivePage().selectCountry("England");
    }

    @Then("^I click on next button$")
    public void iClickOnNextButton() {
        new WhereYouLivePage().clickOnNextButton();
    }

    @And("^I select yes radio button to find out my gp is in scotland or wales$")
    public void iSelectYesRadioButtonToFindOutMyGpIsInScotlandOrWales() {
        new GpInScotlandOrWalesPage().selectGpInScotlandOrWalesByClickingYesRadioButton();
    }

    @And("^I select England as my dental practice country$")
    public void iSelectEnglandAsMyDentalPracticeCountry() {
        new DentalPracticeCountryPage().selectDentalPracticeCountry();

    }
    @And("^I enter Day \"([^\"]*)\" Month \"([^\"]*)\" Year \"([^\"]*)\"$")
    public void iEnterDayMonthYear(String day, String month, String year) {
        new DateOfBirthPage().enterTextToDateOfBirthFields(day,month,year);
    }

    @And("^I select yes radio button of I live with my partner$")
    public void iSelectYesRadioButtonOfILiveWithMyPartner() {
        new PartnerPage().selectPartnerByClickingOnYesRadioButton();
    }

    @And("^I click on yes radio button to confirm that I claim benefits$")
    public void iClickOnYesRadioButtonToConfirmThatIClaimBenefits() {
        new ClaimBenefitTaxCreditsPage().selectYesRadioButtonForClaimBenefits();
    }

    @And("^I select yes we receive Universal credit payments$")
    public void iSelectYesWeReceiveUniversalCreditPayments() {
        new PaidUniversalCreditPage().selectPaidUniversalCreditFromTheOptions();
    }

    @And("^I select yes radio button to confirm 'As part of your joint Universal Credit'$")
    public void iSelectYesRadioButtonToConfirmAsPartOfYourJointUniversalCredit() {
        new UniversalCreditClaimPage().selectYesRadioButtonOnUniversalCreditClaim();
    }

    @And("^I select yes radio button of 'Did you and your partner have a combined take-home pay'$")
    public void iSelectYesRadioButtonOfDidYouAndYourPartnerHaveACombinedTakeHomePay() {
        new UniversalCreditTakeHomePayPage().SelectYesRadioButtonOnUniversalCreditTakeHomePay();
    }

    @Then("^I should get a result of whether I will get help or not$")
    public void iShouldGetAResultOfWhetherIWillGetHelpOrNot() {
        Assert.assertEquals("message not displayed","Based on what you've told us\n" +
                        "You get help with NHS costs",
                new ResultClaimingQualifyingUniversalCreditPage().getBasedOnWhatYouHaveToldUsText());
    }


    @And("^I select Country Northern Ireland$")
    public void iSelectCountryNorthernIreland() {
        new WhereYouLivePage().selectNorthernIreland();
    }

    @Then("^I should not get NHS help service as I live in Northern Ireland$")
    public void iShouldNotGetNHSHelpServiceAsILiveInNorthernIreland() {
        Assert.assertEquals("Error message not displayed","You cannot use this service because you live in Northern Ireland",
                new ServiceNotNorthernIrelandPage().verifyTextYouCannotUseThisService());
    }

}
