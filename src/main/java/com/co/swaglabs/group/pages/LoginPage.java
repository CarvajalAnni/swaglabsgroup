package com.co.swaglabs.group.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;


@DefaultUrl("https://www.saucedemo.com/")
public class LoginPage extends PageObject {

    By TXT_USERNAME = By.xpath("//input[@id='user-name']");
    By TXT_PASSWORD = By.xpath("//input[@id='password']");
    By BTN_LOGIN = By.xpath("//input[@id='login-button']");


    public By getTXT_USERNAME() {
        return TXT_USERNAME;
    }

    public By getTXT_PASSWORD() {
        return TXT_PASSWORD;
    }

    public By getBTN_LOGIN() {
        return BTN_LOGIN;
    }

}
