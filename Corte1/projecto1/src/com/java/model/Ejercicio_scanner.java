package com.java.model;

import java.util.Scanner;


public class Ejercicio_scanner {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduzca su nombre por favor: ");

        String nombre_usuario = entrada.nextLine();

        System.out.println("Introduzca su edad por favor: ");

        int edad = entrada.nextInt();

        System.out.println("Hola " + nombre_usuario + "! usted tiene " + edad + " años.");        
    }
}
