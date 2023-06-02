package com.co.sophos.userinterface.firstcycle;

import net.serenitybdd.screenplay.targets.Target;

public class TestPageInterface {

    /*-------Localizador respuesta pregunta -----*/

    public static Target VALIDATON_TITLE = Target.the("Titulo de validacion a la pregunta Complete el siguiente formulario")
            .locatedBy("//h1[contains(text(), \"Prueba de automatización\")]");
    public static Target CHANGE_CICLO_TWO = Target.the("Titulo de validacion cambio al segundo ciclo")
            .locatedBy("//p[contains(text(), \"Se encuentra en el ciclo 2 de 11\")]");
    public static Target CHANGE_CICLO_THREE = Target.the("Titulo de validacion cambio al segundo ciclo")
            .locatedBy("//p[contains(text(), \"Se encuentra en el ciclo 3 de 11\")]");
    public static Target CHANGE_CICLO_FOUR = Target.the("Titulo de validacion cambio al segundo ciclo")
            .locatedBy("//p[contains(text(), \"Se encuentra en el ciclo 4 de 11\")]");
    public static Target CHANGE_CICLO_FIVE = Target.the("Titulo de validacion cambio al segundo ciclo")
            .locatedBy("//p[contains(text(), \"Se encuentra en el ciclo 5 de 11\")]");
    public static Target CHANGE_CICLO_SIX = Target.the("Titulo de validacion cambio al segundo ciclo")
            .locatedBy("//p[contains(text(), \"Se encuentra en el ciclo 6 de 11\")]");
    public static Target CHANGE_CICLO_SEVEN = Target.the("Titulo de validacion cambio al segundo ciclo")
            .locatedBy("//p[contains(text(), \"Se encuentra en el ciclo 7 de 11\")]");
    public static Target CHANGE_CICLO_EIGHT = Target.the("Titulo de validacion cambio al segundo ciclo")
            .locatedBy("//p[contains(text(), \"Se encuentra en el ciclo 8 de 11\")]");
    public static Target CHANGE_CICLO_NINE = Target.the("Titulo de validacion cambio al segundo ciclo")
            .locatedBy("//p[contains(text(), \"Se encuentra en el ciclo 9 de 11\")]");
    public static Target CHANGE_CICLO_TEN = Target.the("Titulo de validacion cambio al segundo ciclo")
            .locatedBy("//p[contains(text(), \"Se encuentra en el ciclo 10 de 11\")]");
    public static Target CHANGE_CICLO_ELEVEN = Target.the("Titulo de validacion cambio al segundo ciclo")
            .locatedBy("//p[contains(text(), \"Felicidades, has terminado la prueba exitosamente\")]");

    /*---------- Input number ------------*/

    public static Target INPUT_NUMBER = Target.the("Campo para colocar")
            .locatedBy("//input[@type=\"number\"]");

    /*------------------- Localizador botones ----------------------- */
    public static Target BTN_92 = Target.the("Boton cyclo 1")
            .locatedBy("//button[@value=\"92\"]");
    public static Target BTN_163 = Target.the("Boton cyclo 2")
            .locatedBy("//button[@value=\"163\"]");
    public static Target BTN_139 = Target.the("Boton cyclo 3")
            .locatedBy("//button[@value=\"139\"]");
    public static Target BTN_33 = Target.the("Boton cyclo 4")
            .locatedBy("//button[@value=\"33\"]");
    public static Target BTN_193 = Target.the("Boton cyclo 5")
            .locatedBy("//button[@value=\"193\"]");
    public static Target BTN_179 = Target.the("Boton cyclo 6")
            .locatedBy("//button[@value=\"179\"]");
    public static Target BTN_194 = Target.the("Boton cyclo 7")
            .locatedBy("//button[@value=\"194\"]");
    public static Target BTN_164 = Target.the("Boton cyclo 8")
            .locatedBy("//button[@value=\"164\"]");
    public static Target BTN_142 = Target.the("Boton cyclo 9")
            .locatedBy("//button[@value=\"142\"]");
    public static Target BTN_183 = Target.the("Boton cyclo 10")
            .locatedBy("//button[@value=\"183\"]");
    public static Target BTN_29 = Target.the("Boton cyclo 11")
            .locatedBy("//button[@value=\"29\"]");

    /*----------------Localizador de boton Enviar-------------------*/

    public static Target BTN_SEND = Target.the("Boton de enviar")
            .locatedBy("//button[@type=\"submit\"]");

    public static Target SCROLL_157 = Target.the("Boton de enviar")
            .locatedBy("//button[@value=\"157\"]");
    public static Target SCROLL_66= Target.the("Boton de enviar")
            .locatedBy("//button[@value=\"66\"]");
    public static Target SCROLL_91= Target.the("Boton de enviar")
            .locatedBy("//button[@value=\"91\"]");
    public static Target SCROLL_139= Target.the("Boton de enviar")
            .locatedBy("//button[@value=\"139\"]");
    public static Target SCROLL_166= Target.the("Boton de enviar")
            .locatedBy("//button[@value=\"166\"]");


}
