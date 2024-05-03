package com.liceolapaz.des.llc;

import java.awt.desktop.AboutEvent;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Pedir número del 1 al 10 a buscar al usuario
        pedirNumero();
        //Leer numero y guardarlo en una variable
        int numero = leerNumeroEntero();
        //Pedir numero maximo de intentos
        pedirMaximoIntentos();
        //Leer numero maximo de intentos y guardarlo
        int numeroMaximo = leerNumeroEntero();
        //Generar numeros aleatorios
        int i = 0;
        while (i < numeroMaximo) {
            //Generar numero aleatorio y guardarlo
            int numeroAleatorio = generarNumeroAleatorio(1, 10);
            //Escribir por pantalla el numero aleatorio generado
            System.out.println("El número aleatorio generado es: " + numeroAleatorio);
            //Sumar intento
            i++;
            if (numeroAleatorio == numero) {
                System.out.println("Felicidades, se ha generado tu número en " + i + " intentos.");

                break; //salir del bucle
            }
                //Si no encontramos el numero
                 if (numeroMaximo == i) {
                    System.out.println("Número no encontrado en " + i+" intento(s).");
                }




        }

    }



    //Método para generar numero aleatorio (copiar y pegar y añadir como parametros un min y un max
    private static int generarNumeroAleatorio(int min,int max){
        Random random= new Random();
        return random.nextInt(max-min +1);
    }


    private static void pedirMaximoIntentos() {
        System.out.print("Escriba el número máximo de intentos:");
    }

    private static int leerNumeroEntero() {
        Scanner teclado= new Scanner(System.in);
        return teclado.nextInt();
    }

    private static void pedirNumero() {
        System.out.print("Escriba un número del 1 al 10:");
    }
}
