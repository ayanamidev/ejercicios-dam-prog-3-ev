package des.liceolapaz.com.llc;

import java.util.Scanner;

public class Princiapal {
    public static void main(String[] args) {
        System.out.println("Introdcue 10 numeros positivos:");
        int[] numeroPositivos = new int[10]; /*Declaro el array*/
        int i = 0;
        while (i < 10) {
            numeroPositivos[i] = leerPantalla();
            if (numeroPositivos[i] < 0) {
                System.out.println("El numero tiene que ser positivo.");
            } else {
                i++;
            }
        }

        int[] numeroOrdenado = ordenarNumero(numeroPositivos);
        System.out.print("Los números introducidos fueron: ");
        for (int j = 0; j < numeroOrdenado.length; j++) {
            System.out.print(numeroOrdenado[j] + " ");
        }

    }

    private static int[] ordenarNumero(int[] numeroPositivos) {
        int[]numeroOrdenados=new int[numeroPositivos.length];
        for (int i=0;i<numeroOrdenados.length;i++){
            int max=-1;   /*vamos a comparar todos los numeros del array con max, es por ello que max no puede ser ningun numero que este dentro del array*/
            int posicion=-1; /**/
            for (int j=0;j<numeroOrdenados.length;j++){
                if (numeroPositivos[j]>max){
                    max=numeroPositivos[j];
                    posicion=j;

                }
            }
            numeroOrdenados[i]=max;
            numeroPositivos[posicion]=-1;
        }
        return numeroOrdenados;
    }

    /*private static int[] ordenarNumero(int[] numeroPositivos) {
        int[]numeros = new int[10]; //10 9 8 7 6 5 4 3 2 1
        int posicion=-0;             //0 1 2 3 4 5 6 7 8 9 10
        for(int i=0;i<10;i++){
            for (int j=0;j<10;j++){
                if (numeroPositivos[i]>numeroPositivos[j]){
                    posicion++;
                    numeros[posicion]=numeroPositivos[i];
                } else {
                    numeros[posicion]=numeroPositivos[i];
                }

            }
            posicion=0;
        }
        return numeros;
    }*/
    private static int leerPantalla() {
        Scanner teclado=new Scanner(System.in);
        return teclado.nextInt();
    }
}
