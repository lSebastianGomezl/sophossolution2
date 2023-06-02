package com.co.sophos.tasks.fivecycle;

import com.co.sophos.userinterface.firstcycle.TestPageInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class EnterValueFiveCycleTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("1020").into(TestPageInterface.INPUT_NUMBER)
        );
    }
    public static EnterValueFiveCycleTask on(){
        return instrumented(EnterValueFiveCycleTask.class);
    }

}
