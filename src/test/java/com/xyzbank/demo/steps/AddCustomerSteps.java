package com.xyzbank.demo.steps;

import com.xyzbank.demo.pages.AddCustomerPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class AddCustomerSteps {


    @And("I click On Add Customer Button")
    public void iClickOnAddCustomerButton() {
        new AddCustomerPage().clickOnAddCustomerBtn();
    }

    @Then("I enter First Name {string}")
    public void iEnterFirstName(String fName) {
        new AddCustomerPage().enterFName(fName);
    }

    @And("I enter LastName {string}")
    public void iEnterLastName(String lName) {
        new AddCustomerPage().enterLName(lName);
    }

    @And("I enter PostCode {string}")
    public void iEnterPostCode(String postCode) {
        new AddCustomerPage().enterPostCode(postCode);
    }

    @And("I should verify message Customer added successfully")
    public void iShouldVerifyMessageCustomerAddedSuccessfully() {
        Assert.assertEquals(new AddCustomerPage().getAlertSuccessText().substring(0,27),"Customer added successfully");
    }

    @Then("I click on ok button on popup.")
    public void iClickOnOkButtonOnPopup() {
        new AddCustomerPage().clickOnOKButtonInAlert();
    }
}
