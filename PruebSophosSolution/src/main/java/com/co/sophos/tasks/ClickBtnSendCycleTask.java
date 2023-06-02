package com.co.sophos.tasks;

import com.co.sophos.userinterface.firstcycle.TestPageInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ClickBtnSendCycleTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {


        actor.attemptsTo(
                Click.on(TestPageInterface.BTN_SEND)
        );
    }
    public static ClickBtnSendCycleTask on(){
        return instrumented(ClickBtnSendCycleTask.class);
    }


}
