package com.co.sophos.userinterface.loginpage;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("https://tasks.evalartapp.com/automatization/")
public class OpenLoginPageInterface extends PageObject {


    /*-------LOCALIZADORES LOGIN -------*/

    public static Target INPUT_NAME = Target.the("Campo de usuario")
            .locatedBy("//input[@name=\"username\"]");

    public static Target INPUT_PASSWORD = Target.the("Campo de contraseña")
            .locatedBy("//input[@name=\"password\"]");

    public static Target BTN_SEND = Target.the("Boton de enviar")
            .locatedBy("//button[@type=\"submit\"]");



}
