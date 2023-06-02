package com.co.sophos.tasks.sevencycle;

import com.co.sophos.userinterface.firstcycle.TestPageInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class EnterValueSevenCycleTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("703").into(TestPageInterface.INPUT_NUMBER)
        );
    }
    public static EnterValueSevenCycleTask on(){
        return instrumented(EnterValueSevenCycleTask.class);
    }

}
