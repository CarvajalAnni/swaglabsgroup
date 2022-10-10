package com.co.swaglabs.group.stepdefinitions;

import com.co.swaglabs.group.pages.LoginPage;
import com.co.swaglabs.group.steps.Login;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class SwaglabsStepDefinition {


    @Steps
    Login login;

    @Given("^that i enter the web site$")
    public void thatIEnterTheWebSite() {
        login.openPage();
    }


    @When("^i enter the credentials$")
    public void iEnterTheCredentials() {
        login.enterUsername();
        login.enterPassword();
        login.clickBtn();

    }

    @Then("^i should on the screen the login successfully$")
    public void iShouldOnTheScreenTheLoginSuccessfully() {

    }


}
