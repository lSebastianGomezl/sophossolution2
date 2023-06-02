package com.co.sophos.questions.sevencycle;

import com.co.sophos.userinterface.firstcycle.TestPageInterface;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

public class SevenCycleQuestion {

    public static Question<String> sevenCycleSuccessful(){
        return actor -> TextContent.of(TestPageInterface.CHANGE_CICLO_FIVE).viewedBy(actor).asString();
    }
}
