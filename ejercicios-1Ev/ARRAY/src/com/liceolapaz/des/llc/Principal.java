package com.liceolapaz.des.llc;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        System.out.println("Cuantos numeros vas a querer meter en el array?");
        int cantidad= leerNumero();
        int[]numeros=new int [cantidad];
        System.out.println("Escriba los numeros:");
        for (int i =0; i<numeros.length;i++){
            numeros[i]=leerNumero();
        }
        int suma=0;
        for (int i =0; i <numeros.length;i++){
            suma= suma+numeros[i];
        }
        int media= suma / numeros.length;

        int minimo=Integer.MAX_VALUE; /*Escoger un valor mas grande parae contrar el minimo*/
        for (int i =0;i<numeros.length;i++){
            if (numeros[i]<minimo){
                minimo=numeros[i];
        }


        }
        int maximo= Integer.MIN_VALUE;
        for (int i=0; i < numeros.length;i++){
            if (numeros[i]>maximo){
                maximo=numeros[i];
            }

        }



    }

    private static int leerNumero() {
        Scanner teclado= new Scanner(System.in);
        return teclado.nextInt();
    }
}
