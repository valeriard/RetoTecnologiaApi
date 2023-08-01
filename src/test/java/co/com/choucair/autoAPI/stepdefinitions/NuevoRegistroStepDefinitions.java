package co.com.choucair.autoAPI.stepdefinitions;

import co.com.choucair.autoAPI.models.ListaNuevosRegistros;
import co.com.choucair.autoAPI.questions.RespuestaTodosEmpleados;
import co.com.choucair.autoAPI.tasks.CrearNuevoRegistro;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;

import java.util.List;
import java.util.Map;

import static co.com.choucair.autoAPI.utils.Constantes.URL_REGRES;
import static net.serenitybdd.screenplay.actors.OnStage.*;
import static net.serenitybdd.screenplay.rest.questions.ResponseConsequence.seeThatResponse;

public class NuevoRegistroStepDefinitions {

    @Dado("que se desea crear un nuevo registro")
    public void queSeDeseaCrearUnNuevoRegistro() {
       theActorInTheSpotlight().whoCan(CallAnApi.at(URL_REGRES));
    }

    @Cuando("se consuma el endpoint de crear registro nuevo")
    public void seConsumaElEndpointDeCrearRegistroNuevo(DataTable nuevosRegistros) {
        List<Map<String,String>> nuevoRegistro = nuevosRegistros.asMaps();
        theActorInTheSpotlight().attemptsTo(CrearNuevoRegistro.con(nuevoRegistro));
    }

    @Entonces("se puede ver el nuevo usuario")
    public void sePuedeVerElNuevoUsuario() {
        theActorInTheSpotlight().should(
                seeThatResponse("El servicio respondió satisfactoriamente", response -> response.statusCode(201))
        );
    }

}
