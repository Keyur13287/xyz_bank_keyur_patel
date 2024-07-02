package com.xyzbank.demo.steps;

import com.xyzbank.demo.pages.BankManageLoginPage;
import com.xyzbank.demo.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class HomeSteps {
    @Given("I click On Bank Manager Login Tab")
    public void iClickOnBankManagerLoginTab() {
        new HomePage().clickOnBankManagerLoginTab();
    }

    @And("I click On Add Customer Tab")
    public void iClickOnAddCustomerTab() {
        new BankManageLoginPage().clickOnAddCustomerTab();
    }

    @Given("I click on Customer Login Tab")
    public void iClickOnCustomerLoginTab() {
        new HomePage().clickOnCustomerLoginTab();
    }
}
