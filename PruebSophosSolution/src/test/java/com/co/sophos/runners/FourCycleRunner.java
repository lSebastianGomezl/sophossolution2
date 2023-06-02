package com.co.sophos.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(

        features = "src/test/resources/feature/fourcycle.feature",
        glue = "com.co.sophos.stepdefinitions.fourciycle",
        tags = "@AnswerFourTestCorrectly",
        snippets = SnippetType.CAMELCASE
)
public class FourCycleRunner {
}
