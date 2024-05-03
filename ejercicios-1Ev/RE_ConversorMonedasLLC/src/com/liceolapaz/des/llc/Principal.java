package com.liceolapaz.des.llc;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        while (true){
            menu();
            opciones();
        }

    }

    private static void opciones() {
        int opcion=leerOpcion();
        int cantidad=0;
        double resultado=0;
        if (opcion==1||opcion==2||opcion==3){
            System.out.println("Escriba la cantidad:");
            cantidad=leerOpcion();
        }
        switch (opcion){
            case 1:resultado=cantidad*0.86;
                break;
            case 2:resultado=cantidad*1.19;
                break;
            case 3:resultado=cantidad*0.0075;
                break;
            case 0: System.exit(0);
                break;
            default:return;

        }
        System.out.println("La cantidad en euros es "+ resultado);
    }

    private static int leerOpcion() {
        Scanner teclado= new Scanner(System.in);
        return teclado.nextInt();
    }

    private static void menu() {
        System.out.println("""
                CONVERSOR DE MONEDAS
                1.DÓLARES
                2.LIBRAS
                3.YENS
                O.SALIR
                ESCOJA UNA OPCIÓN:
                """);
    }
}
