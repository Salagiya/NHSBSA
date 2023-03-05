package uk.nhs.nhsbsa.services.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import uk.nhs.nhsbsa.services.utility.Utility;

public class UniversalCreditTakeHomePayPage extends Utility {
    //It consists of all different page classes with their objects and methods

    private static final Logger log = LogManager.getLogger(UniversalCreditTakeHomePayPage.class.getName());

    public UniversalCreditTakeHomePayPage(){
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//label[@id='label-yes']")
    WebElement yesRadioButton;

    public void SelectYesRadioButtonOnUniversalCreditTakeHomePay(){
        log.info("Select Universal take home pay" + yesRadioButton.toString());
        clickOnElement(yesRadioButton);
    }
}
