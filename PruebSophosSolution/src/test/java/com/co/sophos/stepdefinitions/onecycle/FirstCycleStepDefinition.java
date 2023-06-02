package com.co.sophos.stepdefinitions.onecycle;

import com.co.sophos.questions.twocycle.TwoCycleQuestion;
import com.co.sophos.tasks.ClickBtnSendCycleTask;
import com.co.sophos.tasks.login.ClickBtnSendTask;
import com.co.sophos.tasks.login.FillPasswordFieldTask;
import com.co.sophos.tasks.login.FillUserFieldTask;
import com.co.sophos.tasks.onecycle.ClickBtnFirstCycleTask;
import com.co.sophos.tasks.onecycle.EnterValueFirstCycleTask;
import com.co.sophos.tasks.openthepage.OpenThePageTask;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class FirstCycleStepDefinition {

    @Managed(driver = "Chrome")

    private WebDriver hisBrowser;

    private Actor Sebastian = Actor.named("Sebas");

    @Before
    public void setUp(){
        Sebastian.can(BrowseTheWeb.with(hisBrowser));
    }

    @Given("^Sebastian is on the test page$")
    public void sebastianIsOnTheTestPage() {
        Sebastian.wasAbleTo(
                OpenThePageTask.open(),
                FillUserFieldTask.on(),
                FillPasswordFieldTask.on(),
                ClickBtnSendTask.on()
        );
    }

    @When("^He selects the button exactly$")
    public void heSelectsTheButtonExactly() throws InterruptedException {
        Thread.sleep(3000);
        Sebastian.wasAbleTo(
                ClickBtnFirstCycleTask.on()
        );
    }

    @When("^He adds the values around the button$")
    public void heAddsTheValuesAroundTheButton() {
        Sebastian.wasAbleTo(
                EnterValueFirstCycleTask.on()
        );
    }

    @When("^He clicks the send button$")
    public void heClicksTheSendButton() {
        Sebastian.wasAbleTo(
                ClickBtnSendCycleTask.on()
        );
    }

    @Then("^he should see the Se encuentra en el ciclo dos de diez$")
    public void heShouldSeeTheSeEncuentraEnElCicloDosDeDiez() {
        System.out.println("El actor debera ver el titulo : \n " + TwoCycleQuestion.twoCycleSuccessful().answeredBy(Sebastian));

    }


}
