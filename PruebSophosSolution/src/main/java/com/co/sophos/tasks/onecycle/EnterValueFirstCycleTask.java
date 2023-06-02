package com.co.sophos.tasks.onecycle;

import com.co.sophos.userinterface.firstcycle.TestPageInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class EnterValueFirstCycleTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("719").into(TestPageInterface.INPUT_NUMBER)
        );
    }
    public static EnterValueFirstCycleTask on(){
        return instrumented(EnterValueFirstCycleTask.class);
    }

}
