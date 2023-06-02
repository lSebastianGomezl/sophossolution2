package com.co.sophos.questions;

import com.co.sophos.userinterface.firstcycle.TestPageInterface;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

public class LoginQuestion {

    public static Question<String> loginSuccessful(){
        return actor -> TextContent.of(TestPageInterface.VALIDATON_TITLE).viewedBy(actor).asString();
    }
}
