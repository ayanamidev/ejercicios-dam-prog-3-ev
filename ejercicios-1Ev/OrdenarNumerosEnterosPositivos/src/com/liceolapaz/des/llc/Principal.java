package com.liceolapaz.des.llc;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
         int[] numeroPositivos=solicitarNumeros();
         int [] numeorOrdenado=ordenDescendente(numeroPositivos);
         mostrarNumeros(numeorOrdenado);
    }

    private static void mostrarNumeros(int[] numeorOrdenado) {
        for (int i=0; i<numeorOrdenado.length;i++){
            System.out.println(numeorOrdenado[i]);
        }
    }

    private static int[] ordenDescendente(int []numerosPositivos) {
        int[]numeroOrdenado= new int[numerosPositivos.length];
        for (int i=0; i<numeroOrdenado.length;i++){
            int  numeroMaxmo=-1;
            int posicionMaxima=-1;
            for (int j=0; j<numerosPositivos.length;j++){
                if (numerosPositivos[j]>numeroMaxmo){
                    numeroMaxmo=numerosPositivos[j];
                    posicionMaxima=j;
                }
            }
            numeroOrdenado[i]=numerosPositivos[posicionMaxima];
            numerosPositivos[posicionMaxima]=-1;
        }
        return numeroOrdenado;
    }

    private static int[] solicitarNumeros() {
        int [] numerosPositivos= new int[10];
        System.out.println("Ingrese 10 numeros positivos:");
        for (int i =0;i<numerosPositivos.length;i++){
            numerosPositivos[i]=leerNumeros();
        }
        return numerosPositivos;
    }

    private static int leerNumeros() {
        Scanner teclado= new Scanner(System.in);
        return teclado.nextInt();
    }
}
