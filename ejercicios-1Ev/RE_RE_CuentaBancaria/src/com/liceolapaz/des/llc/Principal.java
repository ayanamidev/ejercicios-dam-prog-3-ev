package com.liceolapaz.des.llc;

import java.util.Scanner;

public class Principal {

    private static int saldo=0;
    private static final int PREMIUM=2;
    private static final int NORMAL=1;
    private static final int SIN_CUENTA=0;
    private static int cuenta=  SIN_CUENTA;

    public static void main(String[] args) {
        while (true){
            menu();
            escogerOpcion();
        }

    }

    private static void escogerOpcion() {
        int opcion=leerOpcion();
        switch (opcion){
            case 1:crearCuenta();
                break;
            case 2:ingresarDinero();
                break;
            case 3:retirarDinero();
                break;
            case 4:consultarSaldo();
                break;
            case 0:System.exit(0);
                break;
        }
    }

    private static void consultarSaldo() {
        if (cuenta==SIN_CUENTA) {
            System.out.println("ERROR: tienes que crear una cuenta");
        }else {
            System.out.println("El saldo es : "+saldo);
        }

    }

    private static void ingresarDinero() {
        if (cuenta==SIN_CUENTA) {
            System.out.println("ERROR: tienes que crear una cuenta");
        }else {
            System.out.println("Escriba la cantidad:");
            int cantidad = leerOpcion();
            saldo += cantidad;
        }
    }

    private static void retirarDinero() {
        if (cuenta==SIN_CUENTA){
            System.out.println("ERROR: tienes que crear una cuenta");
        }else {
            System.out.println("Escriba la cantidad:");
            int cantidad=leerOpcion();
            if (cantidad>saldo&&cuenta==NORMAL){
                System.out.println("ERROR: en este tipo de cuenta el saldo no puede ser negativo");


            }else {
                saldo-=cantidad;
            }
        }
    }

    private static void crearCuenta() {
        menuSecundario();
        int opcion=leerOpcion();
        System.out.println("Escriba el saldo inicial:");
        saldo=leerOpcion();
        if (opcion==1){
            cuenta=NORMAL;
        } else if (opcion==2) {

        cuenta=PREMIUM;
        }else {

        }



    }

    private static void menuSecundario() {
        System.out.println("""
                TIPO CUENTA
                1.CUENTA NORMAL
                2.CUENTA PREMIUM
                0.CANCELAR
                ESCOJA UNA OPCION:
                """);
    }

    private static int leerOpcion() {
        return new Scanner(System.in).nextInt();
    }

    private static void menu() {
        System.out.println("""
                BANCO
                1.CREAR CUENTA
                2.INGRESAR DINERO
                3. RETIRAR DINERO
                4. CONSULTAR SALDO
                0.SALIR
                ESCOJA UNA OPCION
                """);
    }
}
