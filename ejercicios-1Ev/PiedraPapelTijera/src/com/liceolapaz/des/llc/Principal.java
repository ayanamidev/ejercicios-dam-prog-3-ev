package com.liceolapaz.des.llc;

import java.util.Random;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        while (true){
            menu();
            int opcion=leerOpcion();
            switch (opcion){
                case 0:System.exit(0);
                    break;
                case 1: jugar();
                    break;
            }
        }
    }

    private static void jugar() {
        System.out.println("Introduzca piedra, papel o tijera.");
        Scanner teclado= new Scanner(System.in);
        String opcion=teclado.next().toLowerCase();
/*Para 3 opciones o mas mejor usar un switch*/
        int resultadoAleatorio;
     switch (opcion){
         case "piedra":  resultadoAleatorio=aleatorio();
         if(resultadoAleatorio==1){
             System.out.println("Empataste.");
         } else if (resultadoAleatorio==2) {
             System.out.println("Perdiste.");
         } else if (resultadoAleatorio==3) {
             System.out.println("Ganaste. ");
         }
             break;

         case "papel":resultadoAleatorio=aleatorio();
         if (resultadoAleatorio==1){
             System.out.println("Ganaste.");
         } else if (resultadoAleatorio==2) {
             System.out.println("Empataste.");
         }else if (resultadoAleatorio==3)
             System.out.println("Perdiste.");
             break;

         case "tijera": resultadoAleatorio=aleatorio();
         if (resultadoAleatorio==1){
             System.out.println("Perdiste.");
         } else if (resultadoAleatorio==2) {
             System.out.println("Ganaste.");
         } else if (resultadoAleatorio==3) {
             System.out.println("Empataste");
         }
             break;
         default:
             System.out.println("ERROR: NO INTRODUCISTE UNA OPCIÓN CORRECTA.");
             break;
     }
    }

    private static int aleatorio() {
        /*Aqui estamos usando la clase Random que tine Java y tenemos que inicializarla*/
       return new Random().nextInt(3)+1;
    }

    private static int leerOpcion() {
        Scanner teclado=new Scanner(System.in);
        return teclado.nextInt();
    }

    private static void menu() {
        System.out.println("PIEDRA,PAPEL,TIJERA");
        System.out.println("""
                Escoja una opcion:
                0.SALIR
                1.JUGAR""");
    }
}
