package com.xyzbank.demo.pages;

import com.xyzbank.demo.utility.Utility;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class CustomerLoginPage extends Utility {

    private static final Logger log = Logger.getLogger(CustomerLoginPage.class);

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Login']")
    WebElement loginBtn;

    @CacheLookup
    @FindBy(xpath = "//label[normalize-space()='Your Name :']")
    WebElement yourNameText;


    public void clickOnLoginBtn() {
        clickOnElement(loginBtn);
        log.info("click on " + loginBtn.toString());
    }

    public String getYourNameText() {
        log.info("get text " + yourNameText.toString());
        return getTextFromElement(yourNameText);
    }

}
