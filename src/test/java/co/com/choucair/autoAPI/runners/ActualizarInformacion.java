package co.com.choucair.autoAPI.runners;


import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/actualizar_informacion.feature",
        glue = "co.com.choucair.autoAPI.stepdefinitions",
        snippets = SnippetType.CAMELCASE
)
public class ActualizarInformacion {
}
