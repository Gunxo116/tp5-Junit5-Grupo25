package com.ulp;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraParametrizadaTest {

    @ParameterizedTest
    @CsvSource({
        "8.0, 7.0, 15.0",
        "2.0, 0.0, 2.0",
        "10.0, -1.0, 9.0"
    })
    public void testSumaParametrizada(double a, double b, double resultadoEsperado) {
        Calculadora calc = new Calculadora();
        double resultadoObtenido = calc.sumar(a, b);
        assertEquals(resultadoEsperado, resultadoObtenido, 0.001);
    }
}
