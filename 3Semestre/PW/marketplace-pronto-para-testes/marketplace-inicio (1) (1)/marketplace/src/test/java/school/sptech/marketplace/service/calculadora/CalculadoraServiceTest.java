package school.sptech.marketplace.service.calculadora;
//Nome: Vinicius A Nunes
//RA: 01221125
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraServiceTest {
    @Test
    @DisplayName("When the value of the product is valid, the tax value of the product must be returned.")
    void whenProductValueIsValidMustReturnProductTaxValue() {
        CalculadoraService service = new CalculadoraService();
        Double valorImposto = service.calcularImposto(100);

        assertEquals(18, valorImposto);
    }
}