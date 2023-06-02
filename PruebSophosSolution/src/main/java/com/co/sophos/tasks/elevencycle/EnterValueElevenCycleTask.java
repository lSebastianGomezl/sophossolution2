package com.co.sophos.tasks.elevencycle;

import com.co.sophos.userinterface.firstcycle.TestPageInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class EnterValueElevenCycleTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("1140").into(TestPageInterface.INPUT_NUMBER)
        );
    }
    public static EnterValueElevenCycleTask on(){
        return instrumented(EnterValueElevenCycleTask.class);
    }

}
