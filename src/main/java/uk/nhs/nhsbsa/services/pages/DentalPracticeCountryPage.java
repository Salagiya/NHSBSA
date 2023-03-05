package uk.nhs.nhsbsa.services.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import uk.nhs.nhsbsa.services.utility.Utility;

import java.util.List;

public class DentalPracticeCountryPage extends Utility {
    //It consists of all different page classes with their objects and methods
    private static final Logger log = LogManager.getLogger(DentalPracticeCountryPage.class.getName());

    public DentalPracticeCountryPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//label[@id='label-england']")
    WebElement selectCountryForDental;

    public void selectDentalPracticeCountry() {
        log.info("Select dental practice country" + selectCountryForDental.toString());
        clickOnElement(selectCountryForDental);

    }
}
