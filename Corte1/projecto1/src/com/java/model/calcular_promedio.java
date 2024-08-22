package com.java.model;

import java.util.Scanner;

public interface calcular_promedio {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
         
        System.out.println("Ingrese el primer número:");

        int numero1 = Integer.parseInt(entrada.nextLine());

        System.out.println("Ingrese el segundo número:");

        int numero2 = Integer.parseInt(entrada.nextLine());

        System.out.println("Ingrese el tercero:");

        int numero3 = Integer.parseInt(entrada.nextLine());

        int Resultado = (numero1+numero2+numero3) / 3;

        System.out.println("El promedio de los numeros es: "+Resultado);        

    }
}
