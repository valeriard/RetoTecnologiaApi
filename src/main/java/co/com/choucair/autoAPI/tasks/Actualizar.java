package co.com.choucair.autoAPI.tasks;

import co.com.choucair.autoAPI.models.ActualizoDatosEmpleado;
import co.com.choucair.autoAPI.models.ListaNuevosRegistros;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.rest.interactions.Put;

import java.util.List;
import java.util.Map;

import static co.com.choucair.autoAPI.utils.Constantes.*;

public class Actualizar implements Task {
    ActualizoDatosEmpleado actualizoDatosEmpleado;

    public static Actualizar laInformacion(List<Map<String,String>> actualizoDatosEmpleado) {
        return Tasks.instrumented(Actualizar.class,actualizoDatosEmpleado);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actualizoDatosEmpleado = new ActualizoDatosEmpleado("morpheus","zion resident");
        actor.attemptsTo(
                Put.to(ACTUALIZAR).with( request -> request.header(CONTENT_TYPE,APPLICATION_JSON)
                .body(actualizoDatosEmpleado))
        );
    }
}
