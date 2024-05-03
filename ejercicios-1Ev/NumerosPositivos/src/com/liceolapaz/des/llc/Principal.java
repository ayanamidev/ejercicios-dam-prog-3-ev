package com.liceolapaz.des.llc;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        //pedir los numeros
        pedirNumero();
        //variable para almacenar numeros
       int [] numeros= new int [10];
       int i=0;
       while (i<numeros.length){
           numeros[i]=leerNumeros();
           if (numeros[i]<0){
               System.out.println("Los numeros tienen que ser positivos");
           } else if (numeros[i]==0) {
               System.out.println("Los numeros tienen que ser mayores a 0");

           }else {
               i++;
           }
       }
       escribirNumeros(numeros);
        System.out.println("Hasta la próxima!");
    }

    private static int leerNumeros() {
        Scanner teclado=new Scanner(System.in);
        return teclado.nextInt();
    }

    private static void pedirNumero() {
        System.out.println("Introduzca 10 números enteros positivos");
    }

    private static void escribirNumeros(int[] numeros) {
        System.out.println("Los números introducidos fueron:");
        for (int i= numeros.length-1; i>=0;i--){
            System.out.print(" "+numeros[i]);
        }
    }


}
