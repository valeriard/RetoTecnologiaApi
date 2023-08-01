package co.com.choucair.autoAPI.stepdefinitions.configuraciones;

import co.com.choucair.autoAPI.tasks.ActualizarEdad;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;

import java.util.List;
import java.util.Map;

import static co.com.choucair.autoAPI.utils.Constantes.BASE_URL;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class ActualizarInformacionEmpleado {
    @Dado("que se quiere actualizar la informacion")
    public void queSeQuiereActualizarLaInformacion() {
        theActorInTheSpotlight().whoCan(CallAnApi.at(BASE_URL));
    }

    @Cuando("cuando se consuma el servicio de actualizar la edad al empleado con id")
    public void cuandoSeConsumaElServicioDeActualizarLaEdadAlEmpleadoConId(DataTable data) {
        List<Map<String,String>> dataEmpleado = data.asMaps();
        theActorInTheSpotlight().attemptsTo(ActualizarEdad.delEmpleado(dataEmpleado));
    }

    @Entonces("se valida que la edad se  satisfactoriamente")
    public void seValidaQueLaEdadSeSatisfactoriamente(io.cucumber.datatable.DataTable dataTable) {

    }


}
