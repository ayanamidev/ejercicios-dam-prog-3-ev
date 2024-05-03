package com.liceolapaz.des.llc;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Pedir numeros al usuario
        pedirNumeros();
        // Crear una variable, para guardar el resultado del método para leer  numeros de teclado .
        //Creamos una variable  array porque vamos a  guardar en una misma variable mas de un número.
        int [] numeros= new int [10];
        //Creamos un bucle do while para leer todos los números por teclado que escriba el usuario.
        int contador= 0;
        do {
            /**Leer numeros y guardarlos en cada posicion del array, como son 10 numeros
             * los que vamos a leer, necesitamso recorres las 10 posiciones del array
             * gracias al bucle que ira incrementando el contador*/
            numeros[contador]= leerNumero();
            contador ++;

        }
        while (contador <10);
        //Sumar números. Creamos una variable donde guardaremos el resultado del método que suma números.
        int resultado = sumarNumeros(numeros);

        //Escribir resultado
        escribirResultado(resultado);



    }

    private static void escribirResultado(int resultado) {
        System.out.println("La suma de los números es:"+resultado );
    }

    private static int sumarNumeros(int[] numeros) { //para recorrer las posiciones de un array se usa normalmente el bucle for
        int resultado= 0; //inicializamos una variable
        for (int posicion = 0; posicion < numeros.length ; posicion++) { //numeros.length (la extension del array. )
            resultado= resultado + numeros[posicion];

        }



        return resultado;
    }

    private static int leerNumero() {
        Scanner teclado = new Scanner(System.in);
        return teclado.nextInt();
    }


    private static void pedirNumeros() {
        System.out.println("Escriba 10 números enteros:");
    }
}
