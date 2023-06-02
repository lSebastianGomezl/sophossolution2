package com.co.sophos.tasks.login;

import com.co.sophos.userinterface.loginpage.OpenLoginPageInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ClickBtnSendTask implements Task {



    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(OpenLoginPageInterface.BTN_SEND)
        );
    }

    public static ClickBtnSendTask on(){
        return instrumented(ClickBtnSendTask.class);
    }
}
