package com.liceolapaz.des.llc;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        int cuenta=0;
        int saldo=0;
        while (true){
            menu();
            int opcion=leerOpcion();
            switch (opcion){
                case 1:
                    menuSecundario();
                    int opcionDos=leerOpcion();
                    if (opcionDos==1||opcionDos==2){
                        System.out.println("Escriba el saldo inicial¨:");
                        saldo=leerOpcion();
                        cuenta=crearCuenta(opcionDos,cuenta);
                        System.out.println(cuenta);

                    } else if (opcionDos==0) {

                    }else {
                        System.out.println("ERROR:OPCION NO VALIDA");
                    }

                    break;
                case 2: ingresarDinero(cuenta,saldo);
                    break;
                case 3: retirarDinero(cuenta,saldo);
                    break;
                case 4:consultarSaldo(saldo,cuenta);
                    break;
                case 0:System.exit(0);
                    break;
            }
        }

    }

    private static void consultarSaldo(int saldo,int cuenta) {
        if (cuenta==0){
            System.out.println("ERROR: NO TIENE UNA CUENTA CREADA");
        }else{
            System.out.println("El saldo de la cuenta es: "+saldo);
        }

    }

    private static void retirarDinero(int cuenta, int saldo) {
        if (cuenta==0){
            System.out.println("ERROR: NO TIENE UNA CUENTA CREADA");
        }else {
            System.out.println("Escriba la cantidad:");
            int cantidad=leerOpcion();
            if ((cantidad>saldo)&&cuenta==1){
                System.out.println("ERROR: no puede tener saldo negativo en una cuenta normal");
            }else {
                saldo-=cantidad;
                System.out.println("El saldo de la cuenta es: "+saldo);
            }

        }
    }

    private static void ingresarDinero(int cuenta,int saldo) {
        if (cuenta==0){
            System.out.println("ERROR: NO TIENE UNA CUENTA CREADA");
        }else {
            System.out.println("Escriba la cantidad:");
            int cantidad=leerOpcion();
            if (cantidad<0){
                System.out.println("ERROR:la cantidad debe ser positiva");
            }else {
                saldo+=cantidad;
                System.out.println("El saldo de la cuenta es: "+saldo);

            }
        }
    }

    private static int crearCuenta(int opcionDos, int cuenta) {
        if (opcionDos==1){
            cuenta=1;
        } else if(opcionDos==2) {
            cuenta=2;
        }
        System.out.println(cuenta);
        return cuenta;
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
        Scanner teclado=new Scanner(System.in);
        return teclado.nextInt();
    }

    private static void menu() {
        System.out.println("""
                BANCO
                1.CREAR CUENTA
                2.INGRESAR DINERO
                3.RETIRAR DINERO
                4.CONSULTAR SALDO
                0.SALIR
                ESCOJA UNA OPCIÓN
                """);
    }
}
