package co.com.choucair.autoAPI.stepdefinitions;

import co.com.choucair.autoAPI.models.ObtenerInformacionEmpleados;
import co.com.choucair.autoAPI.questions.RespuestaTodosEmpleados;
import co.com.choucair.autoAPI.tasks.ListarTodosEmpleados;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.datatable.DataTable;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;

import java.util.List;
import java.util.Map;

import static co.com.choucair.autoAPI.utils.Constantes.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;
import static net.serenitybdd.screenplay.rest.questions.ResponseConsequence.seeThatResponse;

public class TodosEmpleadosStepDefinitions {


    @Dado("que se desea validar el mensaje successfully")
    public void queSeDeseaValidarElMensajeSuccessfully() {
        theActorInTheSpotlight().whoCan(CallAnApi.at(BASE_URL));
    }

    @Cuando("se consume el endpoint de listar los empleados")
    public void seConsumeElEndpointDeListarLosEmpleados() {
        theActorInTheSpotlight().attemptsTo(ListarTodosEmpleados.listarEmpleados());
    }

    @Entonces("se debe recibir el mensaje de successfully")
    public void seDebeRecibirElMensajeDeSuccessfully(DataTable dataListEmpleados) {
        List<Map<String,String>> message = dataListEmpleados.asMaps();
        theActorInTheSpotlight().should(
                seeThatResponse("El servicio respondió satisfactoriamente", response -> response.statusCode(200))
        );
        theActorInTheSpotlight().should(seeThat(
                RespuestaTodosEmpleados.elMensaje(message)
        ));
    }
}
