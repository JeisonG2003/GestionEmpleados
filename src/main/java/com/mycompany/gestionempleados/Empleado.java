package com.mycompany.gestionempleados;

// Empleado es una persona que ademas tiene sueldo mensual
public class Empleado extends Persona {
    private double sueldoMensual;

    // Crea un empleado con nombre, edad y sueldo
    public Empleado(String nombreCompleto, int edad, double sueldoMensual) {
        super(nombreCompleto, edad);  // Llamamos al constructor de Persona
        this.sueldoMensual = sueldoMensual;
    }

    // Devuelve el sueldo
    public double obtenerSueldoMensual() {
        return sueldoMensual;
    }

    // Cambia el sueldo
    public void modificarSueldoMensual(double sueldoMensual) {
        this.sueldoMensual = sueldoMensual;
    }

    // Muestra la informacion del empleado, incluye sueldo
    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.printf("Sueldo mensual: $%.2f%n", sueldoMensual);
    }
}