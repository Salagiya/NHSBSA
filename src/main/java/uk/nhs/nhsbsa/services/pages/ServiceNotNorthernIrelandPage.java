package uk.nhs.nhsbsa.services.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import uk.nhs.nhsbsa.services.utility.Utility;

public class ServiceNotNorthernIrelandPage extends Utility {
    //It consists of all different page classes with their objects and methods
    private static final Logger log = LogManager.getLogger(ServiceNotNorthernIrelandPage.class.getName());

    public ServiceNotNorthernIrelandPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//h1[@id='result-heading']")
    WebElement getText;

    public String verifyTextYouCannotUseThisService(){
        log.info("Verify you cannot use this service text" + getText.getText());
        return getTextFromElement(getText);
    }


}
