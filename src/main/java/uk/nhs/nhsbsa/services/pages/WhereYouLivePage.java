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

public class WhereYouLivePage extends Utility {
    //It consists of all different page classes with their objects and methods

    private static final Logger log = LogManager.getLogger(WhereYouLivePage.class.getName());

    public WhereYouLivePage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//label[@id='label-england']")
    WebElement selectEngland;

    @CacheLookup
    @FindBy(xpath = "//input[@id='radio-scotland']")
    WebElement selectScotland;

    @CacheLookup
    @FindBy(xpath = "//input[@id='radio-wales']")
    WebElement selectWales;

    @CacheLookup
    @FindBy(xpath = "//input[@id='radio-nire']")
    WebElement northernIreland;

    @CacheLookup
    @FindBy(xpath = "//input[@id='next-button']")
    WebElement nextButton;

    public void selectCountry(String country){
       if(country.equalsIgnoreCase("England")){
           clickOnElement(selectEngland);
       } else if(country.equalsIgnoreCase("Scotland")){
            clickOnElement(selectScotland);
        }else if(country.equalsIgnoreCase("Wales")){
            clickOnElement(selectWales);
       }
    }

    public void selectNorthernIreland(){
        log.info("Select Northern Ireland" + northernIreland.toString());
        clickOnElement(northernIreland);
    }
    public void clickOnNextButton(){
        log.info("Click on next button" + nextButton.toString());
        clickOnElement(nextButton);
    }
}
