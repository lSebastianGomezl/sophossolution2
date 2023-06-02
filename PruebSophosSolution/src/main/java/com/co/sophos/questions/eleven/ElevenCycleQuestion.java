package com.co.sophos.questions.eleven;

import com.co.sophos.userinterface.firstcycle.TestPageInterface;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

public class ElevenCycleQuestion {

    public static Question<String> elevenCycleSuccessful(){
        return actor -> TextContent.of(TestPageInterface.CHANGE_CICLO_ELEVEN).viewedBy(actor).asString();
    }
}
