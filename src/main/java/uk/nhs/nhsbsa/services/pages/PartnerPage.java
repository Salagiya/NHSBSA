package uk.nhs.nhsbsa.services.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import uk.nhs.nhsbsa.services.utility.Utility;

public class PartnerPage extends Utility {
    //It consists of all different page classes with their objects and methods
    private static final Logger log = LogManager.getLogger(PartnerPage.class.getName());

    public PartnerPage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(name= "partner")
    WebElement selectPartner;

    public void selectPartnerByClickingOnYesRadioButton(){
        log.info("Select partner" + selectPartner.toString());
        clickOnElement(selectPartner);
    }
}
