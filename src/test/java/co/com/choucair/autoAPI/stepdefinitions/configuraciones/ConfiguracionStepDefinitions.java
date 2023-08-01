package co.com.choucair.autoAPI.stepdefinitions.configuraciones;

import io.cucumber.java.Before;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import static co.com.choucair.autoAPI.utils.Constantes.ACTOR;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;


public class ConfiguracionStepDefinitions {
    @Before
    public void setUpStage(){
        OnStage.setTheStage(new OnlineCast());
        theActorCalled(ACTOR);

    }
}
