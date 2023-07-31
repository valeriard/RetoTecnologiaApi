package co.com.choucair.autoAPI.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import java.util.List;
import java.util.Map;

import static net.serenitybdd.rest.SerenityRest.lastResponse;

public class RespuestaTodosEmpleados implements Question <Boolean> {
       List<Map<String, String>> mensaje;

    public RespuestaTodosEmpleados(List<Map<String, String>> message) {
        this.mensaje = message;
    }

    public static RespuestaTodosEmpleados elMensaje(List<Map<String, String>> mensaje){
        return new RespuestaTodosEmpleados(mensaje);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        if (lastResponse().statusCode() != 200) {
            return false;
        }

        String message = lastResponse().jsonPath().get("message");
        return message.equals(mensaje.get(0).get("mensaje"));
    }
}
