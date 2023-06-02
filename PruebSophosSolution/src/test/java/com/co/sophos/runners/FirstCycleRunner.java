package com.co.sophos.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(

        features = "src/test/resources/feature/firstcycle.feature",
        glue = "com.co.sophos.stepdefinitions.onecycle",
        tags = "@AnswerFirstTestCorrectly",
        snippets = SnippetType.CAMELCASE
)
public class FirstCycleRunner {
}
