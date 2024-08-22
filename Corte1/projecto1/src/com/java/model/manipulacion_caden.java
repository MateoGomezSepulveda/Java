package com.java.model;

public class manipulacion_caden {
    public static void main(String[] args) {
        String frase = " Hoy es un estupendo dia para aprender a programar el java ";
        
        // Corrección del método substring
        String frase_resumen = frase.substring(1, 29) + " irnos a la playa y olvidarnos de todo..." + frase.substring(29, 58);
        
        System.out.println("Frase resumida: " + frase_resumen);
    }    
}
