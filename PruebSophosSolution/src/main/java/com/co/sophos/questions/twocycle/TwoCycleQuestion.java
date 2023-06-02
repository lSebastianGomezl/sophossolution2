package com.co.sophos.questions.twocycle;

import com.co.sophos.userinterface.firstcycle.TestPageInterface;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

public class TwoCycleQuestion {

    public static Question<String> twoCycleSuccessful(){
        return actor -> TextContent.of(TestPageInterface.CHANGE_CICLO_TWO).viewedBy(actor).asString();
    }
}
