package com.liceolapaz.de.llc;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingresa una cadena de texto:");
        String input = teclado.nextLine();

        int contadorVocales = contarVocales(input);

        System.out.println("El número de vocales en la cadena es: " + contadorVocales);

    }

    private static int contarVocales(String input) {
        int contador = 0;

        // Convertir la cadena a minúsculas para simplificar la comparación
        input = input.toLowerCase();

        for (int i = 0; i < input.length(); i++) {
            char caracter = input.charAt(i);
                      /*.charAt(i): Es un método de la clase String en Java que devuelve el carácter en la posición especificada por i.
            La indexación de caracteres en una cadena comienza desde 0, por lo que i representa la posición del carácter que quieres obtener. */

            // Verificar si el caracter es una vocal
            if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {
                contador++;
            }
        }

        return contador;


    }
}
