package com.java.model;

public class Calculo {
    public static void main(String[] args) {
        
        double num1 = 5.85f;

        // Operacion usando Math
        int resultado = (int)Math.round(num1); // si no se pone el int a lado del Math marca error por que no lo esta transformando a entero

        System.out.println("Resultado: " + resultado);

        
    }
}
