package com.xyzbank.demo.steps;

import com.xyzbank.demo.pages.AccountPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class AccountSteps {
    @And("I click on Deposit Tab")
    public void iClickOnDepositTab() {
        new AccountPage().clickOnDepositTab();
    }

    @Then("I Enter amount {string}")
    public void iEnterAmount(String amt) {
        new AccountPage().enterAmount(amt);
    }

    @And("I click on Deposit Button")
    public void iClickOnDepositButton() {
        new AccountPage().clickOnDepositWithdrawBtn();
    }

    @Then("I should verify message Deposit Successful")
    public void iShouldVerifyMessageDepositSuccessful() {
        Assert.assertEquals(new AccountPage().getDepositWithdrawSuccessMsg(),"Deposit Successful", "Deposit success msg not displayed");
    }

    @And("I click on Withdrawal Tab")
    public void iClickOnWithdrawalTab() {
        new AccountPage().clickOnWithdrawTab();
    }

    @And("I click on Withdraw Button")
    public void iClickOnWithdrawButton() {
        new AccountPage().clickOnDepositWithdrawBtn();
    }

    @Then("I should verify message Transaction successful")
    public void iShouldVerifyMessageTransactionSuccessful() {
        Assert.assertEquals(new AccountPage().getDepositWithdrawSuccessMsg(),"Transaction successful", "Withdraw success msg not displayed");
    }
}
