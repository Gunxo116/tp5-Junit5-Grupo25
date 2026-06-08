package com.ulp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DivisionTest {

    @Test
    public void testDivisionCero() {
        Calculadora calc = new Calculadora();
        assertThrows(ArithmeticException.class, () -> {
            calc.dividir(10.0, 0.0);
        });
    }
}
