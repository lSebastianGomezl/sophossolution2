package com.co.sophos.tasks.sixcycle;

import com.co.sophos.userinterface.firstcycle.TestPageInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class EnterValueSixCycleTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("1016").into(TestPageInterface.INPUT_NUMBER)
        );
    }
    public static EnterValueSixCycleTask on(){
        return instrumented(EnterValueSixCycleTask.class);
    }

}
