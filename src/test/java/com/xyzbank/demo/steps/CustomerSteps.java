package com.xyzbank.demo.steps;

import com.xyzbank.demo.pages.CustomerLoginPage;
import com.xyzbank.demo.pages.CustomerPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class CustomerSteps {
    @Then("I should verify Logout Tab displayed.")
    public void iShouldVerifyLogoutTabDisplayed() {
        Assert.assertEquals(new CustomerPage().getLogoutBtnText(), "Logout", "Logout button not displayed");
    }

    @And("I click on Logout")
    public void iClickOnLogout() {
        new CustomerPage().clickOnLogoutBtn();
    }

    @Then("I should verify Name text displayed.")
    public void iShouldVerifyNameTextDisplayed() {
        Assert.assertEquals(new CustomerLoginPage().getYourNameText(), "Your Name :", "Your Name text not displayed");
    }
}
