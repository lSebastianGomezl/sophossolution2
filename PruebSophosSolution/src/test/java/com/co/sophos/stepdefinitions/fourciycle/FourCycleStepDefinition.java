package com.co.sophos.stepdefinitions.fourciycle;

import com.co.sophos.questions.fourcycle.FourCycleQuestion;
import com.co.sophos.questions.sevencycle.SevenCycleQuestion;
import com.co.sophos.tasks.ClickBtnSendCycleTask;
import com.co.sophos.tasks.fourcycle.ClickBtnFourCycleTask;
import com.co.sophos.tasks.fourcycle.EnterValueFourCycleTask;
import com.co.sophos.tasks.login.ClickBtnSendTask;
import com.co.sophos.tasks.login.FillPasswordFieldTask;
import com.co.sophos.tasks.login.FillUserFieldTask;
import com.co.sophos.tasks.onecycle.ClickBtnFirstCycleTask;
import com.co.sophos.tasks.onecycle.EnterValueFirstCycleTask;
import com.co.sophos.tasks.openthepage.OpenThePageTask;
import com.co.sophos.tasks.threecycle.ClickBtnThreeCycleTask;
import com.co.sophos.tasks.threecycle.EnterValueThreeCycleTask;
import com.co.sophos.tasks.twocycle.ClickBtnTwoCycleTask;
import com.co.sophos.tasks.twocycle.EnterValueTwoCycleTask;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class FourCycleStepDefinition {

    @Managed(driver = "Chrome")

    private WebDriver hisBrowser;

    private Actor Sebastian = Actor.named("Sebas");

    @Before
    public void setUp(){
        Sebastian.can(BrowseTheWeb.with(hisBrowser));
    }
    @Given("^Sebastian is on the test page$")
    public void sebastianIsOnTheTestPage() throws InterruptedException {
        Sebastian.wasAbleTo(
                OpenThePageTask.open(),
                FillUserFieldTask.on(),
                FillPasswordFieldTask.on(),
                ClickBtnSendTask.on()

        );
        Thread.sleep(3000);
        Sebastian.wasAbleTo(
                ClickBtnFirstCycleTask.on()
        );
        Sebastian.wasAbleTo(
                EnterValueFirstCycleTask.on(),
                ClickBtnSendCycleTask.on()
        );
        Thread.sleep(3000);
        Sebastian.wasAbleTo(
                ClickBtnTwoCycleTask.on()
        );
        Sebastian.wasAbleTo(
                EnterValueTwoCycleTask.on(),
                ClickBtnSendCycleTask.on()
        );
        Thread.sleep(3000);
        Sebastian.wasAbleTo(
                ClickBtnThreeCycleTask.on()
        );
        Sebastian.wasAbleTo(
                EnterValueThreeCycleTask.on(),
                ClickBtnSendCycleTask.on());
    }

    @When("^He selects the button exactly$")
    public void heSelectsTheButtonExactly() throws InterruptedException {
        Thread.sleep(3000);
        Sebastian.wasAbleTo(
                ClickBtnFourCycleTask.on()
        );
    }

    @When("^He adds the values around the button$")
    public void heAddsTheValuesAroundTheButton() {

        Sebastian.wasAbleTo(
                EnterValueFourCycleTask.on()
        );
    }

    @When("^He clicks the send button$")
    public void heClicksTheSendButton() {
        Sebastian.wasAbleTo(
                ClickBtnSendCycleTask.on()
        );
    }

    @Then("^he should see the Se encuentra en el ciclo cinco de diez$")
    public void heShouldSeeTheSeEncuentraEnElCicloCincoDeDiez() {
        System.out.println("El actor debera ver el titulo : \n " + SevenCycleQuestion.sevenCycleSuccessful().answeredBy(Sebastian));

    }


}
