package co.com.choucair.autoAPI.stepdefinitions;

import co.com.choucair.autoAPI.tasks.Eliminar;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;
import static net.serenitybdd.screenplay.rest.questions.ResponseConsequence.seeThatResponse;
import java.util.List;
import java.util.Map;

import static co.com.choucair.autoAPI.utils.Constantes.URL_REGRES;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class EliminarRegistroStepDefinitions {


    @Dado("que se quiere eliminar un registro en regres")
    public void queSeQuiereEliminarUnRegistroEnRegres() {
        theActorInTheSpotlight().whoCan(CallAnApi.at(URL_REGRES));
    }

    @Cuando("se consuma el endpoint delete un usario")
    public void seConsumaElEndpointDeleteUnUsario(DataTable dataTable) {
        List<Map<String,String>> borrarRegistro = dataTable.asMaps();
        theActorInTheSpotlight().attemptsTo(Eliminar.registro(borrarRegistro));
    }

    @Entonces("se valida que la respuesta sea un doscientos cuatro")
    public void seValidaQueLaRespuestaSeaUnDoscientosCuatro() {
        theActorInTheSpotlight().should(seeThatResponse("El servicio respondió satisfactoriamente", response -> response.statusCode(204)));
    }

}
