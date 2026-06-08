package com.ulp;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.TestInfo;

public class CalculadoraTest {

    public static Calculadora calc;

    @BeforeAll
    public static void setUpClass() {
        calc = new Calculadora();
        System.out.println("Bienvenido a las pruebas de la Calculadora");
    }

    @BeforeEach
    public void setUp(TestInfo testInfo) {
        String nombreMetodo = testInfo.getTestMethod().map(m -> m.getName()).orElse("desconocido");
        System.out.println("Ejecutando metodo: " + nombreMetodo);
    }

    @AfterEach
    public void tearDown() {
        System.out.println("Prueba finalizada, campos en 0");
    }

    @AfterAll
    public static void tearDownClass() {
        System.out.println("La operación ha finalizado");
    }

    @Test
    public void testSumar() {
        double resultado = calc.sumar(8.0, 7.0);
        assertEquals(15.0, resultado, 0.001);
    }

    @Test
    public void testRestar() {
        double resultado = calc.restar(10.0, 4.0);
        assertEquals(6.0, resultado, 0.001);
    }
}
