package com.ulp;

public class Main {

    public static void main(String[] args) {
        System.out.println("Proyecto de Calculadora con JUnit 5 - Grupo 25");
        
        Calculadora calc = new Calculadora();
        System.out.println("Suma (8 + 7): " + calc.sumar(8.0, 7.0));
        System.out.println("Resta (10 - 4): " + calc.restar(10.0, 4.0));
        System.out.println("Multiplicación (5 * 6): " + calc.multiplicar(5.0, 6.0));
        try {
            System.out.println("División (10 / 2): " + calc.dividir(10.0, 2.0));
            System.out.println("División por cero (10 / 0):");
            calc.dividir(10.0, 0.0);
        } catch (ArithmeticException e) {
            System.out.println("Error esperado: " + e.getMessage());
        }
    }
}
