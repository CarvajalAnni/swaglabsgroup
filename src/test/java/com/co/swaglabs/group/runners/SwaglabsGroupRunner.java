package com.co.swaglabs.group.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/swaglabsgroup.feature",
        glue = "com.co.swaglabs.group.stepdefinitions",
        snippets = SnippetType.CAMELCASE
)
public class SwaglabsGroupRunner {
}
