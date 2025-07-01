package com.mycompany.gestionempleados;

// Clase principal para probar nuestro programa
public class GestionEmpleados {

    public static void main(String[] args) {
        // Crear un empleado con datos de ejemplo
        Empleado empleado1 = new Empleado("Jeison Garcia", 25, 1200.0);

        // Mostrar sus datos
        empleado1.mostrarInfo();

        // Crear el objeto para calcular bonificaciones
        Bonificacion bonificacion = new Bonificacion();

        // Calcular varias bonificaciones
        double bonifFija = bonificacion.aplicarBonificacion();
        double bonif12 = bonificacion.aplicarBonificacion(empleado1.obtenerSueldoMensual());
        double bonif25 = bonificacion.aplicarBonificacion(empleado1.obtenerSueldoMensual(), 25);

        // Mostrar los resultados
        System.out.println("Bonificacion fija: $" + bonifFija);
        System.out.println("Bonificacion 12%: $" + bonif12);
        System.out.println("Bonificacion 25%: $" + bonif25);
    }
}