package uk.nhs.nhsbsa.services.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import uk.nhs.nhsbsa.services.utility.Utility;

public class PaidUniversalCreditPage extends Utility {
    //It consists of all different page classes with their objects and methods
    private static final Logger log = LogManager.getLogger(PaidUniversalCreditPage.class.getName());

    public PaidUniversalCreditPage(){
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(id = "yes-universal")
    WebElement paidUniversalCredit;

    public void selectPaidUniversalCreditFromTheOptions(){
        log.info("Select paid universal credit" + paidUniversalCredit.toString());
        clickOnElement(paidUniversalCredit);
    }

}
