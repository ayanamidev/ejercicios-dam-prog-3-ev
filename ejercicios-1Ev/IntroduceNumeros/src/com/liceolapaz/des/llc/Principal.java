package com.liceolapaz.des.llc;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        System.out.println("Introduce 10 numeros enteros:");
        int [] numeros= leerNumeros();
        do {
            System.out.println("Escribe el número a buscar:");
            int numeroBuscar =leerdato();
            int repeticiones=0;
            for (int i=0; i<numeros.length; i++){
                if (numeroBuscar==numeros[i]){
                    repeticiones++;
                }
            }
            if (repeticiones==0){
                System.out.println("El numero "+ numeroBuscar+ " no aparece en el array. ");
            }else {
                if (repeticiones==1){
                    System.out.println("El numero "+numeroBuscar+" aparece 1 vez.");
                }else {
                    System.out.println("El numero "+numeroBuscar+" aparece "+ repeticiones+" veces.");
                }
            }
            System.out.println("Quieres buscar otro numero (S/N)");
            String respuesta=leerRespuesta().toLowerCase();
            if (respuesta.equals("n")){
                System.exit(0);
            }
        }while (true);




    }

    private static String leerRespuesta() {
        Scanner teclado = new Scanner(System.in);
        return teclado.next();
    }

    private static int[] leerNumeros() {
        int[]numero= new int[10];
        for (int i=0; i<numero.length; i++){
            numero[i]= leerdato();
        }
        return numero;
    }

    private static int leerdato() {
        Scanner teclado= new Scanner(System.in);
        return teclado.nextInt();
    }
}
