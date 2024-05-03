package com.liceolapaz.des.llc;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        menu();
        int opcion=leerInt();
        switch (opcion){
            case 1:triangulo();
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 0:
                break;
        }
    }

    private static void triangulo() {
        System.out.println("Escriba el valor de la base del triangulo: ");
        int lado=leerInt();
        System.out.println("Escriba el valor de la altura del triangulo");
        int altura=leerInt();
        Triangulo triangulo=new Triangulo()

    }

    private static int leerInt() {
        return new Scanner(System.in).nextInt();
    }

    private static void menu() {
        System.out.println("""
                FIGURAS GEOMÉTRICAS
                1. Triángulo
                2. Rectángulo
                3. Cuadrado
                4. Pentágono
                0. Salir
                Escoja una opción:""");
    }
}
