package com.xyzbank.demo.pages;

import com.xyzbank.demo.utility.Utility;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class OpenAccountPage extends Utility {

    private static final Logger log = Logger.getLogger(OpenAccountPage.class);


    @CacheLookup
    @FindBy(id = "userSelect")
    WebElement customerDropdown;

@CacheLookup
    @FindBy(id = "currency")
    WebElement currencyDropdown;

@CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Process']")
    WebElement processBtn;


    public void selectFromCustomerDropdown(String val) {
        selectByVisibleTextFromDropDown(customerDropdown, val);
        log.info("select " + val);
    }

    public void selectFromCurrencyDropdown(String val) {
        selectByVisibleTextFromDropDown(currencyDropdown, val);
        log.info("select " + val);
    }

    public void clickOnProcessBtn() {
        clickOnElement(processBtn);
        log.info("Click on " + processBtn.toString());
    }



}
