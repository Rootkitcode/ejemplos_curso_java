package com.mycompany.clase1;

public class variables_1 {

    public static void main(String[] args) {
        String saludar = "aprendices como estan"; // variable de tipo referencia
        System.out.println(saludar);
        System.out.println("hola, " + saludar.toUpperCase()); 
         
        var numero = 10; // primitivo

        Integer numero2 = 15; // variable de tipo referencia(object)
        var numero3 = numero2.doubleValue(); // la variable contiene métodos

        Boolean valor = true;
        if (valor) {
            System.out.println(numero3);
        }
    }
}



