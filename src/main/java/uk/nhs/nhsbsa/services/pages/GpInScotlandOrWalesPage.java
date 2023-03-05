package uk.nhs.nhsbsa.services.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import uk.nhs.nhsbsa.services.utility.Utility;

public class GpInScotlandOrWalesPage extends Utility {
    //It consists of all different page classes with their objects and methods
    private static final Logger log = LogManager.getLogger(GpInScotlandOrWalesPage.class.getName());

    public GpInScotlandOrWalesPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@id='radio-yes']")
    WebElement yesRadioButton;

    public void selectGpInScotlandOrWalesByClickingYesRadioButton(){
        log.info("Select GP in Scotland or Wales" + yesRadioButton.toString());
        clickOnElement(yesRadioButton);
    }
}
