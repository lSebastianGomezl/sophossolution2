package com.co.sophos.questions.threecycle;

import com.co.sophos.userinterface.firstcycle.TestPageInterface;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

public class ThreeCycleQuestion {

    public static Question<String> threeCycleSuccessful(){
        return actor -> TextContent.of(TestPageInterface.CHANGE_CICLO_THREE).viewedBy(actor).asString();
    }
}
