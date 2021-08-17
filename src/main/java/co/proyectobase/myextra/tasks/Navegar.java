package co.proyectobase.myextra.tasks;

import co.proyectobase.myextra.interactions.Digitar;
import co.proyectobase.myextra.interactions.Escribir;
import co.proyectobase.myextra.model.Tecla;
import cucumber.api.java.bs.A;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

import static co.proyectobase.myextra.userinterface.MenuPage.*;
import static co.proyectobase.myextra.userinterface.SQLPage.TITULO_SQL_PAGE;

public class Navegar implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Escribir.elTexto("1").en(AMBIENTE_PRUEBAS));
        actor.attemptsTo(Digitar.laTecla(Tecla.ENTER.getTecla()));
        actor.attemptsTo(Escribir.elTexto("1").en(CONFIRMACION_AMBIENTE_PRUEBAS));
        actor.attemptsTo(Digitar.laTecla(Tecla.ENTER.getTecla()));
        actor.attemptsTo(Escribir.elTexto("1").en(SQL));
        actor.attemptsTo(Digitar.laTecla(Tecla.ENTER.getTecla()));
        actor.attemptsTo(Escribir.elTexto("1").en(TITULO_SQL_PAGE));
    }

    public static Navegar aUnMenu(){
        return Tasks.instrumented(Navegar.class);
    }
}
