package com.liceolapaz.des.llc;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        while (true){
            menu();
            int opcion=leerOpcion();
            switch (opcion){
                case 0: System.exit(0);
                    break;
                case 1: calcularDNI();
                    break;
            }
        }
    }

    private static void calcularDNI() {
        System.out.println("Escribe los numeros del DNI:");
        String numerosDNI =leerNumeros();

        if(esNumeroDeNueveDigitos(numerosDNI)){
            int numeros= Integer.parseInt(numerosDNI);
            int resultado=numeros%23; /*lo divido entre 23 por el enunciado, que te dice que tienes que hacer eso*/
            String[]letras={"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};
            String letra= letras[resultado];
            System.out.println("Tu DNI es:" + numerosDNI+letra);


        }else {
            System.out.println("La entrada no contiene 8 digitos");
        }

    }

    private static String leerNumeros() {
        Scanner teclado = new Scanner(System.in);
        return teclado.next();
    }

    private static int leerOpcion() {
        Scanner teclado= new Scanner(System.in);
        return  teclado.nextInt();
    }

    private static void menu() {
        System.out.println("""
                CALCULAR LETRA DNI
                1.Calcular
                0.salir
                ESCOJA UNA OPCIÓN:
                """);
    }
    public static boolean esNumeroDeNueveDigitos(String numerosDNI ) {
        return numerosDNI.matches("\\d{8}");
    }
}
