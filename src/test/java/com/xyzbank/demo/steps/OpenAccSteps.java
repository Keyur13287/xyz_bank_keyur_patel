package com.xyzbank.demo.steps;

import com.xyzbank.demo.pages.AddCustomerPage;
import com.xyzbank.demo.pages.BankManageLoginPage;
import com.xyzbank.demo.pages.OpenAccountPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class OpenAccSteps {
    @And("I click On Open Account Tab")
    public void iClickOnOpenAccountTab() {
        new BankManageLoginPage().clickOnOpenAccountTab();
    }

    @Then("I Search customer that is created first")
    public void iSearchCustomerThatIsCreatedFirst() {
        new OpenAccountPage().selectFromCustomerDropdown("Harry Potter");
    }

    @And("I Select currency Pound")
    public void iSelectCurrencyPound() {
        new OpenAccountPage().selectFromCurrencyDropdown("Pound");
    }

    @And("I click on process button")
    public void iClickOnProcessButton() {
        new OpenAccountPage().clickOnProcessBtn();
    }

    @And("I should verify message Account created successfully")
    public void iShouldVerifyMessageAccountCreatedSuccessfully() {
        Assert.assertEquals(new AddCustomerPage().getAlertSuccessText().substring(0,28),"Account created successfully");
    }
}
