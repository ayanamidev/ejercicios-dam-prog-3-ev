package com.liceolapaz.des.llc;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

            menuOpciones();
             int opcion= leerOpcion();
            switch (opcion){
                case 1: calcularPotencia();
                    break;
                case 2: calcularRaiz();
                    break;
                case 3:
                    break;
                default:
                    System.out.println("ERROR:Opcion introducida no valida");
            }



    }

    private static void calcularRaiz() {
        System.out.println("Introduzca el operando:" );
        int operando= leerOpcion();
        double raiz= Math.sqrt(operando);
              System.out.println("El resultao de la operación es: "+ raiz);
        

    }

    private static void calcularPotencia() {
        System.out.println("Introduzca el valor de la base: ");
        int base = leerOpcion();
        System.out.println("Introduzca el valor del exponente: ");
        int exponente= leerOpcion();
        double potencia =Math.pow(base, exponente);
        System.out.println("El resultao de la operación es: "+ potencia);



    }

    private static int leerOpcion() {
        Scanner teclado= new Scanner(System.in);
        return teclado.nextInt();
    }

    private static void menuOpciones() {
        System.out.println("POTENCIAS Y RAICES CUADRADAS\n" +
                "1.Potencia\n" +
                "2.Raiz Cuadrada\n" +
                "3.Salir\n" +
                "Escoja una opcion:");
        }
    }

