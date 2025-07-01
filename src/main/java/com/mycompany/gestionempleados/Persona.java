package com.mycompany.gestionempleados;

// Clase que representa a una persona con nombre y edad
public class Persona {
    private String nombreCompleto;
    private int edad;

    // Constructor para crear una persona con nombre y edad
    public Persona(String nombreCompleto, int edad) {
        this.nombreCompleto = nombreCompleto;
        this.edad = edad;
    }

    // Devuelve el nombre completo
    public String obtenerNombreCompleto() {
        return nombreCompleto;
    }

    // Cambia el nombre completo
    public void modificarNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    // Devuelve la edad
    public int obtenerEdad() {
        return edad;
    }

    // Cambia la edad
    public void modificarEdad(int edad) {
        this.edad = edad;
    }

    // Muestra la informacion de la persona
    public void mostrarInfo() {
        System.out.println("Nombre completo: " + nombreCompleto);
        System.out.println("Edad: " + edad + " anos");
    }
}