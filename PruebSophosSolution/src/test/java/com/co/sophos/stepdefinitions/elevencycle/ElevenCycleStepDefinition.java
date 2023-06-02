package com.co.sophos.stepdefinitions.elevencycle;

import com.co.sophos.questions.sevencycle.SevenCycleQuestion;
import com.co.sophos.tasks.ClickBtnSendCycleTask;
import com.co.sophos.tasks.eightcycle.ClickBtnEightCycleTask;
import com.co.sophos.tasks.eightcycle.EnterValueEightCycleTask;
import com.co.sophos.tasks.elevencycle.ClickBtnElevenCycleTask;
import com.co.sophos.tasks.elevencycle.EnterValueElevenCycleTask;
import com.co.sophos.tasks.fivecycle.ClickBtnFiveCycleTask;
import com.co.sophos.tasks.fivecycle.EnterValueFiveCycleTask;
import com.co.sophos.tasks.fourcycle.ClickBtnFourCycleTask;
import com.co.sophos.tasks.fourcycle.EnterValueFourCycleTask;
import com.co.sophos.tasks.login.ClickBtnSendTask;
import com.co.sophos.tasks.login.FillPasswordFieldTask;
import com.co.sophos.tasks.login.FillUserFieldTask;
import com.co.sophos.tasks.ninecycle.ClickBtnNineCycleTask;
import com.co.sophos.tasks.ninecycle.EnterValueNineCycleTask;
import com.co.sophos.tasks.onecycle.ClickBtnFirstCycleTask;
import com.co.sophos.tasks.onecycle.EnterValueFirstCycleTask;
import com.co.sophos.tasks.openthepage.OpenThePageTask;
import com.co.sophos.tasks.sevencycle.ClickBtnSevenCycleTask;
import com.co.sophos.tasks.sevencycle.EnterValueSevenCycleTask;
import com.co.sophos.tasks.sixcycle.ClickBtnSixCycleTask;
import com.co.sophos.tasks.sixcycle.EnterValueSixCycleTask;
import com.co.sophos.tasks.tencycle.ClickBtnTenCycleTask;
import com.co.sophos.tasks.tencycle.EnterValueTenCycleTask;
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

public class ElevenCycleStepDefinition {

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
        Thread.sleep(3000);
        Sebastian.wasAbleTo(
                ClickBtnFourCycleTask.on()
        );
        Sebastian.wasAbleTo(
                EnterValueFourCycleTask.on(),
                ClickBtnSendCycleTask.on()
        );
        Thread.sleep(3000);
        Sebastian.wasAbleTo(
                ClickBtnFiveCycleTask.on()
        );
        Sebastian.wasAbleTo(
                EnterValueFiveCycleTask.on(),
                ClickBtnSendCycleTask.on()
        );
        Thread.sleep(3000);
        Sebastian.wasAbleTo(
                ClickBtnSixCycleTask.on()
        );
        Sebastian.wasAbleTo(
                EnterValueSixCycleTask.on(),
                ClickBtnSendCycleTask.on()
        );
        Thread.sleep(3000);
        Sebastian.wasAbleTo(
                ClickBtnSevenCycleTask.on()
        );
        Sebastian.wasAbleTo(
                EnterValueSevenCycleTask.on(),
                ClickBtnSendCycleTask.on()
        );
        Thread.sleep(3000);
        Sebastian.wasAbleTo(
                ClickBtnEightCycleTask.on()
        );
        Sebastian.wasAbleTo(
                EnterValueEightCycleTask.on(),
                ClickBtnSendCycleTask.on()
        );
        Thread.sleep(3000);
        Sebastian.wasAbleTo(
                ClickBtnNineCycleTask.on()
        );
        Sebastian.wasAbleTo(
                EnterValueNineCycleTask.on(),
                ClickBtnSendCycleTask.on()
        );
        Thread.sleep(3000);
        Sebastian.wasAbleTo(
                ClickBtnTenCycleTask.on()
        );
        Sebastian.wasAbleTo(
                EnterValueTenCycleTask.on(),
                ClickBtnSendCycleTask.on()
        );
    }

    @When("^He selects the button exactly$")
    public void heSelectsTheButtonExactly() throws InterruptedException {
        Thread.sleep(3000);
        Sebastian.wasAbleTo(
                ClickBtnElevenCycleTask.on()
        );
    }

    @When("^He adds the values around the button$")
    public void heAddsTheValuesAroundTheButton() {
        Sebastian.wasAbleTo(
                EnterValueElevenCycleTask.on()
        );
    }

    @When("^He clicks the send button$")
    public void heClicksTheSendButton() {
        Sebastian.wasAbleTo(
                ClickBtnSendTask.on()
        );
    }

    @Then("^he should see the éxito$")
    public void heShouldSeeTheÉxito() {
        System.out.println("El actor debera ver el titulo : \n " + SevenCycleQuestion.sevenCycleSuccessful().answeredBy(Sebastian));
    }



}
