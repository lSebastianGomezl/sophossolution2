package com.co.sophos.tasks.ninecycle;

import com.co.sophos.userinterface.firstcycle.TestPageInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class EnterValueNineCycleTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("497").into(TestPageInterface.INPUT_NUMBER)
        );
    }
    public static EnterValueNineCycleTask on(){
        return instrumented(EnterValueNineCycleTask.class);
    }

}
