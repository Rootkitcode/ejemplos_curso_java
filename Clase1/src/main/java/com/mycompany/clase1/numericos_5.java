package com.mycompany.clase1;

public class numericos_5 {
    
    public static void main(String[] args) {
        int numeroDecimal = 400;
        System.out.println("el numero " + numeroDecimal + " es en binario  "
                + Integer.toBinaryString(numeroDecimal));
        
        int numeroBinario = 0b10010101;
        System.out.println("numero binario es en decimal " + Integer.toString(numeroBinario));
        
        int numeroHex = 0x1e;
        int numero = 12;
        System.out.println("Número decimal " + Integer.toString(numeroHex));
        System.out.println("Número Hexdecimal " + Integer.toHexString(numero));
    }
    
}
