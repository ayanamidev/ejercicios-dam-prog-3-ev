package com.liceolapaz.des.llc;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        menu();
        int opcion=leerOpcion();
        switch (opcion){
            case 1:potencia();
                break;
            case 2:raiz();
                break;
            case 3:
                break;
            default:
                break;
        }
    }

    private static void raiz() {
        System.out.println("Introduzca el operando:");
        double operando=leerValores();
        double resultado= Math.sqrt(operando);
        System.out.println("El resultado es: "+ resultado);

    }

    private static void potencia() {
        System.out.print("Introduzca el valor de la base: ");
        double base=leerValores();
        System.out.println("Introduzca el valor del exponente: ");
        double exponente=leerValores();
        double resultado= Math.pow(base,exponente);
        System.out.println("El resultado es: "+ resultado);
    }

    private static double leerValores() {
        Scanner teclado = new Scanner(System.in);
        return teclado.nextDouble();
    }


    //Escribir menu
    private static void menu() {
        System.out.print("""
                POTENCIAS Y RAICES CUADRADAS
                1.POTENCIA
                2.RAIZ CUADRADA
                3.SALIR
                ESCOJA UNA OPCION:
                """);
    }


    //Leer opcion o numeros enteros
    private static int leerOpcion() {
        Scanner teclado= new Scanner(System.in);
        return  teclado.nextInt();
    }

}
