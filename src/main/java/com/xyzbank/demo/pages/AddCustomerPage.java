package com.xyzbank.demo.pages;

import com.xyzbank.demo.utility.Utility;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class AddCustomerPage extends Utility {

    private static final Logger log = Logger.getLogger(AddCustomerPage.class);

    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='First Name']")
    WebElement fNameField;

    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Last Name']")
    WebElement lNameField;

    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Post Code']")
    WebElement postCodeField;

    @CacheLookup
    @FindBy(xpath = "//button[@type='submit']")
    WebElement addCustomerBtn;


    public void enterFName(String fName) {
        sendTextToElement(fNameField, fName);
        log.info("Enter first name " + fName);
    }

    public void enterLName(String lName) {
        sendTextToElement(lNameField, lName);
        log.info("Enter last name " + lName);
    }

    public void enterPostCode(String postCode) {
        sendTextToElement(postCodeField, postCode);
        log.info("Enter post code " + postCode);
    }


    public void clickOnAddCustomerBtn() {
        clickOnElement(addCustomerBtn);
        log.info("click on " + addCustomerBtn.toString());
    }

    public String getAlertSuccessText() {
        return getTextFromAlert();
    }

    public void clickOnOKButtonInAlert() {
        acceptAlert();
    }



}
