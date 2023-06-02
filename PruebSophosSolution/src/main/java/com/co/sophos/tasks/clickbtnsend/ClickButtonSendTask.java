package com.co.sophos.tasks.clickbtnsend;

import com.co.sophos.userinterface.firstcycle.TestPageInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ClickButtonSendTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(TestPageInterface.BTN_SEND)
        );
    }
    public static ClickButtonSendTask on(){
        return instrumented(ClickButtonSendTask.class);
    }
}
