package com.xyzbank.demo.pages;

import com.xyzbank.demo.utility.Utility;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Utility {

    private static final Logger log = Logger.getLogger(HomePage.class);

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Bank Manager Login']")
    WebElement bankManagerLoginTab;


    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Customer Login']")
    WebElement customerLoginTab;


    public void clickOnBankManagerLoginTab() {
        log.info("click on " + bankManagerLoginTab.toString());
        clickOnElement(bankManagerLoginTab);
    }


    public void clickOnCustomerLoginTab() {
        log.info("click on " + customerLoginTab.toString());
        clickOnElement(customerLoginTab);
    }





}
