package com.co.sophos.stepdefinitions;

import com.co.sophos.questions.LoginQuestion;
import com.co.sophos.tasks.login.ClickBtnSendTask;
import com.co.sophos.tasks.login.FillPasswordFieldTask;
import com.co.sophos.tasks.login.FillUserFieldTask;
import com.co.sophos.tasks.openthepage.OpenThePageTask;
import cucumber.api.java.Before;
import cucumber.api.java.en.*;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

import org.openqa.selenium.WebDriver;

import javax.swing.event.CaretListener;

public class LoginStepDefinition {

    @Managed(driver = "Chrome")

    private WebDriver hisBrowser;

    private Actor Sebastian = Actor.named("Sebas");

    @Before
    public void setUp(){
        Sebastian.can(BrowseTheWeb.with(hisBrowser));
    }

    @Given("^Sebastian is on the login page$")
    public void sebastianIsOnTheLoginPage() {
        Sebastian.wasAbleTo(
                OpenThePageTask.open()
        );
    }

    @When("^he enters his username and password$")
    public void heEntersHisUsernameAndPassword() {
        Sebastian.wasAbleTo(
                FillUserFieldTask.on(),
                FillPasswordFieldTask.on()
        );
    }

    @When("^click the send button$")
    public void clickTheSendButton() {
        Sebastian.wasAbleTo(
                ClickBtnSendTask.on()
        );
    }

    @Then("^He should see the home page Prueba de automatización$")
    public void heShouldSeeTheHomePagePruebaDeAutomatización() {
        System.out.println("El actor debera ver el titulo : \n " + LoginQuestion.loginSuccessful().answeredBy(Sebastian).equals("Prueba de automatización"));
    }



}
