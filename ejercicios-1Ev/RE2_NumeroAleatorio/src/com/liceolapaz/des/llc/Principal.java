package com.liceolapaz.des.llc;

import java.util.Random;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        do {
            menu();
            int opcion=leerOpcion();
            escogerOpcion(opcion);
        }while (true);

    }

    private static int leerOpcion() {
        Scanner teclado = new Scanner(System.in);
        return teclado.nextInt();
    }

    private static void escogerOpcion(int opcion) {
        switch (opcion){
            case 0: System.exit(0);
             break;
            case 1: opcionUno();
                break;
            case 2: opcionDos();
                break;
            default:
                System.out.println("opcion incorrecta");
                break;
        }
    }

    private static void opcionDos() {
        int numeroAleatorio=generarNumeroAleatorio(1,50);
        comparar(5, numeroAleatorio);
    }

    private static void opcionUno() {
        int numeroAleatorio=generarNumeroAleatorio(1,10);
        comparar(3, numeroAleatorio);
    }
    private static void comparar(int contador, int numeroAleatorio){
        int num=0;
        for (int i=0;i<contador;i++){
            System.out.println("Escoja un numero:");
             num=leerOpcion();
            if (num==numeroAleatorio){
                System.out.println("Has acertado el numero en "+ (i+1)+ " intentos.");
                break;
            } else if (num<numeroAleatorio) {
                System.out.println("El numero a adivinar es mayor");
            } else if (num>numeroAleatorio) {
                System.out.println("El numero a adivinar es menor");
            }


        }
        if (num!=numeroAleatorio){
            System.out.println("No has acertado en el numero maximo de intentos. El numero era: "+ numeroAleatorio);
        }

        }

    private static int generarNumeroAleatorio(int min,int max){
        Random random= new Random();
        return random.nextInt(max-min +1);
    }


    private static void menu() {
        System.out.println("""
                ADIVINA EL NÚMERO
                1.Del 1 al 10 (3 intentos)
                2.Del 1 al 50 (5 intentos)
                0.Salir
                Escoja una opción:""");
    }
}
