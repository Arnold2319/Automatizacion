package co.proyectobase.myextra.questions;

import co.proyectobase.myextra.interactions.Leer;
import co.proyectobase.myextra.userinterface.SQLPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class LaRespuesta implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return Leer.elTextoEn(SQLPage.TITULO);
    }

    public static LaRespuesta es(){
        return new LaRespuesta();
    }
}
