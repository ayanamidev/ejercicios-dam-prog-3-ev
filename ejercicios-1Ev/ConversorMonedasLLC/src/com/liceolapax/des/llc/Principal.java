package com.liceolapax.des.llc;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        int opcion=1;
        do{
            menuOpciones();
             opcion= leerOpcion();
            if(opcion>=1 && opcion <=3){
                System.out.println("Escriba la cantidad:");
                int cantidad= leerOpcion();
                switch (opcion){
                    case 1: convertirDolares(cantidad);
                        break;
                    case 2: convertirLibras(cantidad);
                        break;
                    case 3: convertirYens(cantidad);
                        break;

                }

            } else if(opcion==0) {
                break;


            }else {
                System.out.println("ERROR: La opcion introducida no es válida.");
            }
        }while (opcion!=0);

    }

    private static void convertirYens(int cantidad) {
        double euros= cantidad*0.0075;
        System.out.println("La cantidad en euros es:"+ euros);
    }

    private static void convertirLibras(int cantidad) {
        double euros= cantidad*1.95;
        System.out.println("La cantidad en euros es:"+ euros);
    }

    private static void convertirDolares(int cantidad) {
        double euros = cantidad * 0.85;
        System.out.println("La cantidad en euros es:"+ euros);
    }

    private static int leerOpcion() {
        Scanner teclado = new Scanner(System.in);
        return  teclado.nextInt();
    }

    private static void menuOpciones() {
        System.out.println("CONVERSOR DE MONEDAS\n" +
                "1.Dólares\n" +
                "2.Libras\n" +
                "3.Yens\n" +
                "0.Salir\n" +
                "Escoja una opción:");
    }
}
