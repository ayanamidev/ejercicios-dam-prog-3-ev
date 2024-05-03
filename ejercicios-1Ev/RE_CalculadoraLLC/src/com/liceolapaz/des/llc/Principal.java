package com.liceolapaz.des.llc;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        while (true){
            //Escribir menu por pantalla
            menu();
            //Escoger una opcion
            int opcion=leerOpcion();
            opciones(opcion);
        }

    }

    private static void opciones(int opcion) {
        int primerOperando=0;
        int segundoOperando=0;
        int resultado=0;
        if (opcion==1 || opcion==2|| opcion==3||opcion==4){
            System.out.println("Escriba el valor del primer operando:");
             primerOperando=leerOpcion();
            System.out.println("Escriba el valor del segundo operando ");
             segundoOperando= leerOpcion();

        }
        switch (opcion){
            case 1:  resultado= primerOperando+segundoOperando;
                break;
            case 2: resultado= primerOperando+segundoOperando;
                break;
            case 3: resultado= primerOperando*segundoOperando;
                break;
            case 4:resultado=primerOperando/segundoOperando;
                break;
            case 0: System.exit(0);
                break;
            default:
                System.out.println("ERROR: Opcion introducida no valida.");
                return;

        }
        System.out.println("El resultado es: "+ resultado);
    }

    private static int leerOpcion() {
        Scanner teclado = new Scanner(System.in);
        return teclado.nextInt();
    }

    private static void menu() {
        System.out.println("""
                CALCULADORA
                1.SUMA
                2.RESTA
                3.PRODUCTO
                4.DIVISION
                0.SALIR
                ESCOJA UNA OPCIÓN:
                """);
    }
}
