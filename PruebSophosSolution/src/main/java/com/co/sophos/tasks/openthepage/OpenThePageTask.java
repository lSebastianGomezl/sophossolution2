package com.co.sophos.tasks.openthepage;

import com.co.sophos.userinterface.loginpage.OpenLoginPageInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OpenThePageTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.browserOn(new OpenLoginPageInterface())
        );

    }
    public static OpenThePageTask open(){
        return instrumented(OpenThePageTask.class);
    }
}
