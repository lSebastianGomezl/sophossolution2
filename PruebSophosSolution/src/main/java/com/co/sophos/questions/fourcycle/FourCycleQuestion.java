package com.co.sophos.questions.fourcycle;

import com.co.sophos.userinterface.firstcycle.TestPageInterface;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

public class FourCycleQuestion {

    public static Question<String> fourCycleSuccessful(){
        return actor -> TextContent.of(TestPageInterface.CHANGE_CICLO_FOUR).viewedBy(actor).asString();
    }
}
