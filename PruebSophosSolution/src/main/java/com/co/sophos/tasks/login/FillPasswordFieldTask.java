package com.co.sophos.tasks.login;

import com.co.sophos.userinterface.loginpage.OpenLoginPageInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class FillPasswordFieldTask implements Task {

    final String PASSWORD = "10df2f32286b7120My0zLTc5OTkwNg==30e0c83e6c29f1c3";

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(PASSWORD).into(OpenLoginPageInterface.INPUT_PASSWORD)
        );

    }

    public static FillPasswordFieldTask on(){
        return instrumented(FillPasswordFieldTask.class);
    }
}
