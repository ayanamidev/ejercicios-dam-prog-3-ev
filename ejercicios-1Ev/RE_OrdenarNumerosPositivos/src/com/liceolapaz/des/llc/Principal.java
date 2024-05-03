package com.liceolapaz.des.llc;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        int [] numeros=pedirNumeros();
        ordenarNumeros(numeros);

    }

    private static void ordenarNumeros(int []numeros) {
        int[]numerosOrednados=new int[numeros.length];
        for (int i=0;i<numerosOrednados.length;i++){
            int numeroMaximo=-1;
            int posicionMaxima=-1;
            for (int j=0;j<numeros.length;j++){
                if (numeros[j]>numeroMaximo){
                    numeroMaximo=numeros[j];
                    posicionMaxima=j;
                }
            }
            numerosOrednados[i]=numeros[posicionMaxima];
            numeros[posicionMaxima]=-1;
        }
        for (int i=0;i<numerosOrednados.length;i++){
            System.out.println(numerosOrednados[i]);
        }
    }

    private static int[] pedirNumeros() {
        int []numeros=new int[10];
        for (int i=0; i<numeros.length;i++){
            numeros[i]=leerNumero();
        }
        return numeros;
    }

    private static int leerNumero() {
        Scanner teclado= new Scanner(System.in);
        return teclado.nextInt();
    }
}
