package com.xyzbank.demo.pages;

import com.xyzbank.demo.utility.Utility;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class BankManageLoginPage  extends Utility {

    private static final Logger log = Logger.getLogger(BankManageLoginPage.class);


    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Add Customer']")
    WebElement addCustomerTab;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Open Account']")
    WebElement openAccountTab;




    public void clickOnAddCustomerTab() {
        log.info("click on " + addCustomerTab.toString());
        clickOnElement(addCustomerTab);
    }

    public void clickOnOpenAccountTab() {
        log.info("click on " + openAccountTab.toString());
        clickOnElement(openAccountTab);
    }

}
