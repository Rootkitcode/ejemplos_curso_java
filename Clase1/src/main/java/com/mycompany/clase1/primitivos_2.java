package com.mycompany.clase1;

public class primitivos_2 {

    public static void main(String[] args) {
        byte numeroByte = 127;
        System.out.println("numero byte " + numeroByte);
        System.out.println("corresponde a byte: " + Byte.BYTES);
        System.out.println("corresponde a bits: " + Byte.SIZE);
        System.out.println("tamaño maximo: " + Byte.MAX_VALUE);
        System.out.println("tamaño minimo: " + Byte.MIN_VALUE);

        double numeroDouble = 1234E20;
        System.out.println("numero Double " + numeroDouble);
        System.out.println("corresponde a byte: " + Double.BYTES);
        System.out.println("corresponde a bits: " + Double.SIZE);
        System.out.println("tamaño maximo: " + Double.MAX_VALUE);
        System.out.println("tamaño minimo: " + Double.MIN_VALUE);
    }
}
