package co.com.choucair.autoAPI.tasks;

import co.com.choucair.autoAPI.models.ActualizoDatosEmpleado;
import io.cucumber.datatable.DataTable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Put;

import java.util.List;
import java.util.Map;

import static co.com.choucair.autoAPI.utils.Constantes.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ActualizarEdad implements Task {
    ActualizoDatosEmpleado actualizarDatos;

    public ActualizarEdad(ActualizoDatosEmpleado actualizarDatos) {
        this.actualizarDatos = actualizarDatos;
    }

    public static ActualizarEdad delEmpleado(List<Map<String,String>> dataEdad ){
        return instrumented(ActualizarEdad.class, dataEdad);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        String body = "[[{id=25, edad=29}]]";
        actor.attemptsTo(
                Put.to(ACTUALIZAR+actualizarDatos.getId()).with(
                        request -> request.header(CONTENT_TYPE, APPLICATION_JSON)
                        .body(body)
                )
        );

    }
}
