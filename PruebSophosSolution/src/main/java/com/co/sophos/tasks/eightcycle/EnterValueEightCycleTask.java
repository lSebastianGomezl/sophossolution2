package com.co.sophos.tasks.eightcycle;

import com.co.sophos.userinterface.firstcycle.TestPageInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class EnterValueEightCycleTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("648").into(TestPageInterface.INPUT_NUMBER)
        );
    }
    public static EnterValueEightCycleTask on(){
        return instrumented(EnterValueEightCycleTask.class);
    }

}
