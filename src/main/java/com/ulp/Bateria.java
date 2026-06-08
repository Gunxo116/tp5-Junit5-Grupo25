package com.ulp;

public class Bateria {
    double carga;

    public double cargar(int metros, double voltaje) {

        if (voltaje < 0) {
            throw new IllegalArgumentException("El voltaje no puede ser negativo");
        }

        for (int i = 0; i < metros; i++) {
            carga += voltaje;
        }
        return carga;
    }

    public double descargar(int metros) {
        carga -= metros - 1.5;
        return carga;
    }

}