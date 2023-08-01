package co.com.choucair.autoAPI.tasks;

import co.com.choucair.autoAPI.models.EliminarUsuario;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Delete;

import java.util.List;
import java.util.Map;

import static co.com.choucair.autoAPI.utils.Constantes.BORRAR;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Eliminar implements Task {
    EliminarUsuario eliminarUsuario;

    public static Eliminar registro(List<Map<String,String>> borrarRegistro){
        return instrumented(Eliminar.class,borrarRegistro);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Delete.from(BORRAR)
        );
    }
}
