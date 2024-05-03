package com.liceolapaz.des.llc;

import java.lang.runtime.SwitchBootstraps;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Escribir menu por pantalla
        escribirMenu();
        //pedimos la opción al ususario
        pedirOpcion();
        //leemos opcion y guardamos mensaje
        int mensaje = leerMensaje();
        //Escribir mensaje dependiendo de la opción
        escribirMensaje(mensaje);




    }

    private static void escribirMensaje(int mensaje) {
        switch (mensaje){
            case 0:
                System.out.println("Hasta la próxima!");
                System.exit(0);
            case 1:
                System.out.println("Opción 1 escogida.");;
                    break;
            case 2:
                System.out.println("Opción 2 escpgida");;
                    break;
            case 3:
                System.out.println("Opción 3 escpgida");;
                break;
            default:
                System.out.println("Opcion inválida.");
                break;

        }
    }

    private static int leerMensaje() {
        Scanner teclado = new Scanner(System.in);
        return teclado.nextInt();
    }

    private static void pedirOpcion() {
        System.out.println("Escriba una opción:");
    }

    private static void escribirMenu() {
        System.out.println("MENÚ OPCIONES\n" +
                "1. Opción 1\n" + //dale a enter al acabar la frase para que salga el mas y las comillas diercatmente
                "2. Opción 2\n" +
                "3. Opción 3\n" +
                "0. Salir\n");
    }
}
