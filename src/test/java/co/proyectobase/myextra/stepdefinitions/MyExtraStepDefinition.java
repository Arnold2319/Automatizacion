package co.proyectobase.myextra.stepdefinitions;

import co.proyectobase.myextra.questions.LaRespuesta;
import co.proyectobase.myextra.tasks.Abrir;
import co.proyectobase.myextra.tasks.Loguearse;
import co.proyectobase.myextra.tasks.Navegar;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.junit.Before;
import org.openqa.selenium.WebDriver;


import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class MyExtraStepDefinition {

    @Managed(driver = "chrome")
    private WebDriver suNavegador;
    private Actor rafa = Actor.named("Rafa");


    @Before public void setup(){
        rafa.can(BrowseTheWeb.with(suNavegador));
    }

    @Dado("^que Raga desea realizar consultas en AS400, Rafa abre my extra$")
    public void que_Rafa_desea_realizar_consulta_en_AS_Rafa_abre_my_extra(){
        rafa.attemptsTo(Abrir.myExtra());
    }
    @Cuando("^él ingreso sus credenciales$")
    public void el_ingresa_sus_credenciales(){
        rafa.attemptsTo(Loguearse.enMyExtra(null));
    }

    @Cuando("^Navega en un menu$")
    public void navega_en_un_Menu(){
        rafa.attemptsTo(Navegar.aUnMenu());
    }

    @Entonces("^verifica que inicio sesion correctamente.$")
    public void verifica_que_inicio_sesion_Correctamente(){
        rafa.should(seeThat(LaRespuesta.es(),equalTo("Introducir sentencia SQL")));
    }

}
