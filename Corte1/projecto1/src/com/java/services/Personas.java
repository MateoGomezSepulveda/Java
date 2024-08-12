package com.java.services;

public class Personas {
    String nombre;
    int edad;

    Personas(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    public static void main(String[] args) {
        Personas persona1 = new Personas("Ana", 25);
        Personas persona2 = new Personas("Carlos", 40);
        
        System.out.println("Persona 1: " + persona1.nombre + ", Edad: " + persona1.edad);
        System.out.println("Persona 2: " + persona2.nombre + ", Edad: " + persona2.edad);
    }
}
