package uk.nhs.nhsbsa.services.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import uk.nhs.nhsbsa.services.utility.Utility;

public class UniversalCreditClaimPage extends Utility {
    //It consists of all different page classes with their objects and methods
    private static final Logger log = LogManager.getLogger(UniversalCreditClaimPage.class.getName());

    public UniversalCreditClaimPage(){
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//label[@id='label-yes']")
    WebElement yesRadioButton;

    public void selectYesRadioButtonOnUniversalCreditClaim(){
        log.info("Select universal credit claim" + yesRadioButton.toString());
        clickOnElement(yesRadioButton);
    }
}
