package com.co.sophos.tasks.ninecycle;

import com.co.sophos.userinterface.firstcycle.TestPageInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ClickBtnNineCycleTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(TestPageInterface.BTN_92),
               // WaitUntil.the(TestPageInterface.BTN_92, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(TestPageInterface.BTN_142)
        );
    }
    public static ClickBtnNineCycleTask on(){
        return instrumented(ClickBtnNineCycleTask.class);
    }


}
