package com.liceolapaz.des.llc;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        int opcion=1;
        do {
            menuOpciones();
             opcion= leerOpcion();
             if (opcion >= 1 && opcion <= 4){
                 System.out.println("Escriba el valor del primer operando:");
                 int primerOperando= leerOpcion();
                 System.out.println("Escriba el valor del segundo operando:");
                 int segundoOperando= leerOpcion();
                 switch (opcion){
                     case 1: suma(primerOperando,segundoOperando);
                         break;
                     case 2: resta(primerOperando,segundoOperando);
                         break;
                     case 3: producto(primerOperando,segundoOperando);
                         break;
                     case 4:division(primerOperando,segundoOperando);
                         break;
                 }
             } else if(opcion==0) {
                 break;

             }else{
                 System.out.println("ERROR: opcion introducida no válida.");
             }

        }while(opcion!=0);

    }

    private static void producto(int primerOperando, int segundoOperando) {
        int producto = primerOperando * segundoOperando;
        System.out.println("El resultado es:"+ producto);
    }

    private static void division(int primerOperando, int segundoOperando) {
        int division= primerOperando/segundoOperando;
        System.out.println("El resultado es:"+ division);
    }

    private static void resta(int primerOperando, int segundoOperando) {
        int resta= primerOperando-segundoOperando;
        System.out.println("El resultado es:"+ resta);
    }

    private static void suma(int primerOperando, int segundoOperando) {
        int suma = primerOperando + segundoOperando;
        System.out.println("El resultado es:"+ suma);
    }

    private static int leerOpcion() {
        Scanner teclado= new Scanner(System.in);
        return teclado.nextInt();
    }

    private static void menuOpciones() {
        System.out.println("CALCULADORA\n" +
                "1.Suma\n" +
                "2.Resta\n" +
                "3.Producto\n" +
                "4.División\n" +
                "0.Salir\n" +
                "Escoja una opción:");
    }
}
