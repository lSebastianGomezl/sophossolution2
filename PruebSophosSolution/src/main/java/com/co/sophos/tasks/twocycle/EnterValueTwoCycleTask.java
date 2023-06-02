package com.co.sophos.tasks.twocycle;

import com.co.sophos.userinterface.firstcycle.TestPageInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class EnterValueTwoCycleTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("900").into(TestPageInterface.INPUT_NUMBER)
        );
    }
    public static EnterValueTwoCycleTask on(){
        return instrumented(EnterValueTwoCycleTask.class);
    }

}
