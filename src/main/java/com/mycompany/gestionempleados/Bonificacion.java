package com.mycompany.gestionempleados;

// Clase para calcular bonificaciones de diferentes formas
public class Bonificacion {

    // Bonificacion fija sencilla
    public double aplicarBonificacion() {
        return 150.0;
    }

    // Bonificacion calculada como 12% del sueldo
    public double aplicarBonificacion(double sueldo) {
        return sueldo * 0.12;
    }

    // Bonificacion con porcentaje personalizado
    public double aplicarBonificacion(double sueldo, double porcentaje) {
        return sueldo * (porcentaje / 100);
    }
}