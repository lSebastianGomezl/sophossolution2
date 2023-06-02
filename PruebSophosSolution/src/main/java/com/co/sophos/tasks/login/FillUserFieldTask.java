package com.co.sophos.tasks.login;

import com.co.sophos.userinterface.loginpage.OpenLoginPageInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class FillUserFieldTask implements Task {

    final String USER = "609997";

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(USER).into(OpenLoginPageInterface.INPUT_NAME)
        );

    }

    public static FillUserFieldTask on(){
        return instrumented(FillUserFieldTask.class);
    }
}
