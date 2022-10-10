package com.co.swaglabs.group.steps;

import com.co.swaglabs.group.pages.LoginPage;
import net.thucydides.core.annotations.Step;

public class Login {

    private String user =System.getProperty("username");
    private String password =System.getProperty("password");
    LoginPage loginPage;

    @Step
    public void openPage(){
        loginPage.open();
    }

    @Step
    public void enterUsername(){
        loginPage.getDriver().findElement(loginPage.getTXT_USERNAME()).sendKeys(user);
    }

    @Step
    public void enterPassword(){
        loginPage.getDriver().findElement(loginPage.getTXT_PASSWORD()).sendKeys(password);
    }

    @Step
    public void clickBtn(){
        loginPage.getDriver().findElement(loginPage.getBTN_LOGIN()).click();
    }
}
