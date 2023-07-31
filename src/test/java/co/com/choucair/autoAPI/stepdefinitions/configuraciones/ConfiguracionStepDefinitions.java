package co.com.choucair.autoAPI.stepdefinitions.configuraciones;

import io.cucumber.java.Before;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;

import static co.com.choucair.autoAPI.utils.Constantes.ACTOR;
import static co.com.choucair.autoAPI.utils.Constantes.BASE_URL;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ConfiguracionStepDefinitions {
    @Before
    public void setUpStage(){
        OnStage.setTheStage(new OnlineCast());
        theActorCalled(ACTOR);
        //theActorCalled(ACTOR).whoCan(CallAnApi.at(BASE_URL));
        //theActorInTheSpotlight().whoCan(CallAnApi.at(BASE_URL));
    }
}
