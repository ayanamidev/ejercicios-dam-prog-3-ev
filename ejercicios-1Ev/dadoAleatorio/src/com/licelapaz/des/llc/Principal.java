package com.licelapaz.des.llc;

import java.util.Random;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        menu();
        int opcion= leerOpcion();
        while (true){
            switch (opcion){
                case 0: System.exit(0);
                    break;
                case 1: jugar();
                    break;
                default:
                    System.out.println("La opcion no es valida ");
                    break;
            }
        }
    }

    private static void jugar() {
        Random random= new Random();
        int numeroAleatorio= random.nextInt(6)+1; /*Le puedes sumar el numero aqui o luego*/
        System.out.println("El numero es:"+ numeroAleatorio);

    }

    private static int leerOpcion() {
        Scanner teclado = new Scanner(System.in);
        return teclado.nextInt();
    }

    private static void menu() {
        System.out.println("""
                0.Salir
                1.Jugar
                ESCOJA UNA OPCIÓN
                
                """);
    }
}
