package com.xyzbank.demo.steps;

import com.xyzbank.demo.pages.CustomerLoginPage;
import com.xyzbank.demo.pages.OpenAccountPage;
import io.cucumber.java.en.And;

public class CustomerLoginSteps {
    @And("I Search customer that is created")
    public void iSearchCustomerThatIsCreated() {
        new OpenAccountPage().selectFromCustomerDropdown("Hermoine Granger");
    }

    @And("I click on Login Button")
    public void iClickOnLoginButton() {
        new CustomerLoginPage().clickOnLoginBtn();
    }
}
