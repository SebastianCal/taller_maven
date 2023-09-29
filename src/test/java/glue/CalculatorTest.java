package glue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class CalculatorTest {

    private int numero_01;
    private int numero_02;
    private int numero_03;
    private int numero_04;
    private int resultado;
    private int resultado_div;

    @Given("Ingreso a basic calculator multiplicacion")
    public void ingreso_a_basic_calculator_multiplicacion() {
        // Configuración inicial para la multiplicación
    }

    @When("ingreso {int} y multiplico por {int}")
    public void ingreso_numero_y_multiplico_por_numero(int numero1, int numero2) {
        this.numero_01 = numero1;
        this.numero_02 = numero2;
        this.resultado = numero_01 * numero_02;
    }

    @Then("me deberia dar {int}")
    public void me_deberia_dar_resultado(int expectedResult) {
        Assert.assertEquals(expectedResult, resultado);
    }

    @Given("Ingreso a basic calculator divison")
    public void ingreso_a_basic_calculator_division() {
        // Configuración inicial para la división
    }

    @When("ingreso {int} y divido por {int}")
    public void ingreso_numero_y_divido_por_numero(int numero1, int numero2) {
        this.numero_03 = numero1;
        this.numero_04 = numero2;
        this.resultado_div = numero_03 / numero_04;
    }

    @Then("me deberia dar {int}")
    public void me_deberia_dar_resultado_div(int expectedResult) {
        Assert.assertEquals(expectedResult, resultado_div);
    }
}