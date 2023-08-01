package co.com.choucair.autoAPI.stepdefinitions;

import co.com.choucair.autoAPI.models.ActualizoDatosEmpleado;
import co.com.choucair.autoAPI.tasks.Actualizar;
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
import static org.junit.Assert.assertEquals;

public class ActualizarInformacionStepDefinitions {

    @Dado("que se quiere actualizar la informacion")
    public void queSeQuiereActualizarLaInformacion() {
        theActorInTheSpotlight().whoCan(CallAnApi.at(URL_REGRES));
    }

    @Cuando("cuando se consuma el servicio de actualizar la informacion de usuario con id")
    public void cuandoSeConsumaElServicioDeActualizarLaInformacionDeUsuarioConId(DataTable dataActualizada) {
        List<Map<String,String>> actualizarinformacion = dataActualizada.asMaps();
        theActorInTheSpotlight().attemptsTo(Actualizar.laInformacion(actualizarinformacion));
    }
    @Entonces("se verifica que la informacion de {string}")
    public void seVerificaQueLaInformacionDe(String name) {
        theActorInTheSpotlight().should(
                seeThatResponse("El servicio respondió satisfactoriamente", response -> response.statusCode(200)
                ));
        ActualizoDatosEmpleado empleado = new ActualizoDatosEmpleado("morpheus","zion resident");
        //Verifico que nombre se actualice
        assertEquals(empleado.getName(),name);
    }
}
