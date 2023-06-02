package com.co.sophos.tasks.sevencycle;

import com.co.sophos.userinterface.firstcycle.TestPageInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ClickBtnSevenCycleTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(TestPageInterface.SCROLL_91)
        );
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        actor.attemptsTo(
                //,
               // WaitUntil.the(TestPageInterface.BTN_92, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(TestPageInterface.BTN_194)
        );
    }
    public static ClickBtnSevenCycleTask on(){
        return instrumented(ClickBtnSevenCycleTask.class);
    }


}
