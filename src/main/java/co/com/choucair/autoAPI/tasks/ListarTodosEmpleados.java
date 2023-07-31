package co.com.choucair.autoAPI.tasks;

import co.com.choucair.autoAPI.models.ObtenerInformacionEmpleados;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Get;

import static co.com.choucair.autoAPI.utils.Constantes.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ListarTodosEmpleados implements Task {

    public static ListarTodosEmpleados listarEmpleados(){
        return instrumented(ListarTodosEmpleados.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Get.resource(EMPLEADOS).with(
                        request -> request.relaxedHTTPSValidation()
                        .header(CONTENT_TYPE, APPLICATION_JSON)
                        .header(ACCEPT, APPLICATION_JSON)
                )
        );
    }
}
