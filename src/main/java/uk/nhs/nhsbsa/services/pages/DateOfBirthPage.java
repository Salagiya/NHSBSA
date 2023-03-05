package uk.nhs.nhsbsa.services.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import uk.nhs.nhsbsa.services.utility.Utility;


public class DateOfBirthPage extends Utility {
    //It consists of all different page classes with their objects and methods
    private static final Logger log = LogManager.getLogger(DateOfBirthPage.class.getName());

    public DateOfBirthPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(id = "dob-day")
    WebElement day;

    @CacheLookup
    @FindBy(id = "dob-month")
    WebElement month;

    @CacheLookup
    @FindBy(id = "dob-year")
    WebElement year;

    public void enterTextToDateOfBirthFields(String dobDay,String dobMonth,String dobYear){
        log.info("Enter text to date of birth field" + day.toString());
        sendTextToElement(day,dobDay);
        sendTextToElement(month,dobMonth);
        sendTextToElement(year,dobYear);
    }
}
