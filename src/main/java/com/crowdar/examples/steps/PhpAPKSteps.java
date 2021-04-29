package com.crowdar.examples.steps;

import com.crowdar.core.Injector;
import com.crowdar.core.PageSteps;
import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.HomeConstants;
import com.crowdar.examples.pages.ApiDemoHome;
import com.crowdar.examples.pages.PhpAPKHome;
import com.crowdar.examples.services.HomeService;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

/**
 * This class handles the steps in the features files and connects with the service in case of having business logic.
 * Otherwise, if it is a simple action, like clicking a button and it has nothing related to business logic, is correct to put here.
 */
public class PhpAPKSteps extends PageSteps {

    @Given("el usuario se encuentra en la home de la app")
    public void elUsuarioSeEncuentraEnLaHomeDeLaApp() {

    }

    @When("el usuario tapea el icono VISA")
    public void elUsuarioTapeaElIconoVISA() {
        Injector._page(PhpAPKHome.class).tapVisaButon();
    }

    @And("el usuario completa los datos desde (.*) hasta (.*)")
    public void elUsuarioCompletaLosDatosDesdeHasta(String from, String to) {
        Injector._page(PhpAPKHome.class).ingresarDestinos(from, to);
    }

    @And("el usuario completa el campo nombre: (.*), apellido (.*), email (.*), celular (.*), notas (.*)")
    public void elUsuarioCompletaElCampoNombreApellidoApellidoEmailEmailCelularCelularNotasNotas(String fName, String lName, String email, String phone, String notes) {
        Injector._page(PhpAPKHome.class).completeFormData(fName, lName, email, phone, notes);
    }

    @And("el usuario tapea el boton submit")
    public void elUsuarioTapeaElBoton() {
        Injector._page(PhpAPKHome.class).tapSubmit();
    }

    @Then("el usuario verifica que se realizo correctamente la reserva")
    public void elUsuarioVerificaQueSeRealizoCorrectamenteLaReserva() {
        Injector._page(PhpAPKHome.class).check();
    }
}
