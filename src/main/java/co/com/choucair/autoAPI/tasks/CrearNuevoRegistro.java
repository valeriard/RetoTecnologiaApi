package co.com.choucair.autoAPI.tasks;

import co.com.choucair.autoAPI.models.ListaNuevosRegistros;
import io.cucumber.datatable.DataTable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Post;


import java.util.List;
import java.util.Map;

import static co.com.choucair.autoAPI.utils.Constantes.*;
import static net.serenitybdd.screenplay.Tasks.*;

public class CrearNuevoRegistro implements Task {

    ListaNuevosRegistros nuevoEmpleado ;

    public static CrearNuevoRegistro con(List<Map<String,String>> nuevoEmpleado){
        return instrumented(CrearNuevoRegistro.class, nuevoEmpleado);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {

        nuevoEmpleado = new ListaNuevosRegistros("Valeria","leader");
        //nuevoEmpleado = new ListaNuevosRegistros(nuevoEmpleado.getName(), nuevoEmpleado.getJob());
        //nuevoEmpleado = new ListaNuevosRegistros("Valeria","leader");

        actor.attemptsTo(Post.to(CREAR).with(request -> request.header(CONTENT_TYPE,APPLICATION_JSON)
                .body(nuevoEmpleado)));
    }
}
