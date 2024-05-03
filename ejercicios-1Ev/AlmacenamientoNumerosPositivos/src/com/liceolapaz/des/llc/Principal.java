package com.liceolapaz.des.llc;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        int []numeroPositivos= pedirNumeros();
        ordenInverso(numeroPositivos);
    }

    private static void ordenInverso(int[] numeroPositivos) {
        for (int i=numeroPositivos.length-1;i>=0;i--){
            System.out.println(numeroPositivos[i]);


        }
    }

    private static int[] pedirNumeros() {
        System.out.println("Escriba 10 numeros positivos enteros:");
        int[]numeroPositivos=new int [10];
        int i=0;
        while (i<numeroPositivos.length){
            numeroPositivos[i]=leerNumero();
            if (numeroPositivos[i]>0){
                i++;
            }else {
                System.out.println("ERROR:el numero no es positivo ");
            }

        }
        return numeroPositivos;
    }

    private static int leerNumero() {
        Scanner teclado=new Scanner(System.in);
        return teclado.nextInt();
    }
}
