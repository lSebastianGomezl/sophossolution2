package com.co.sophos.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(

        features = "src/test/resources/feature/sivencycle.feature",
        glue = "com.co.sophos.stepdefinitions.sevencycle",
        tags = "@AnswerCycleSevenCorrectly",
        snippets = SnippetType.CAMELCASE
)
public class SevenCycleRunner {
}
