package com.liceolapaz.des.llc;

import java.util.Scanner;

public class Conversor {
    public static void main(String[] args) {
        while (true) {
            menu();
            int opcion = leerOpcion();
            conversion(opcion);
        }


    }

    private static  String convertirADosDecimales(double valor){
       
    }

    private static void conversion(int opcion) {
        if (opcion==1||opcion==2||opcion==3){
            System.out.println("Escriba la cantidad: ");
            double cantidad=leerDouble();
            switch (opcion){
                case 1: {Moneda dolar=new Dolar(cantidad);
                    Moneda euros=dolar.cantidadEnEuros();
                    System.out.println("La cantidad en euros es: "+euros.getCantidad()+"\n\n\n");}
                break;
                case 2:{Moneda libra=new Libra(cantidad);
                    Moneda euros=libra.cantidadEnEuros();
                    System.out.println("La cantidad en euros es: "+euros.getCantidad()+"\n\n\n");}
                break;
                case 3:{
                    Moneda yen=new Yen(cantidad);
                    Moneda euro=yen.cantidadEnEuros();
                    System.out.println("La cantidad en euros es: "+euro.getCantidad()+"\n\n\n");
                }
                break;
            }

        }else if(opcion==0) {
            System.out.println("ADIOS!");
            System.exit(0);
        }else {
            System.out.println("Opción introducida no válida. ");
        }

    }

    private static void menu() {
        System.out.println("""
                CONVERSOR DE MONEDAS
                1. Dólares
                2. Libras
                3. Yens
                0. Salir
                Escoja una opción:
                """);
    }

    private static double leerDouble() {
        return new Scanner(System.in).nextInt();
    }

    private static int leerOpcion() {
        Scanner teclado=new Scanner(System.in);
        return teclado.nextInt();
    }
}
