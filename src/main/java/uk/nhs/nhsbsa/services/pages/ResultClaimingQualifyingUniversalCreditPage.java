package uk.nhs.nhsbsa.services.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import uk.nhs.nhsbsa.services.utility.Utility;

public class ResultClaimingQualifyingUniversalCreditPage extends Utility {
    //It consists of all different page classes with their objects and methods

    private static final Logger log = LogManager.getLogger(ResultClaimingQualifyingUniversalCreditPage.class.getName());

    public ResultClaimingQualifyingUniversalCreditPage(){
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//h2[@class=\"heading-large\"]")
    WebElement verifyText;

    public String getBasedOnWhatYouHaveToldUsText(){
        log.info("Verify based on what text" + verifyText.getText());
       return getTextFromElement(verifyText);
    }


}
