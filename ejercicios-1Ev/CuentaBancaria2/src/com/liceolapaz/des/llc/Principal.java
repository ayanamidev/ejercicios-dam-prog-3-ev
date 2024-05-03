package com.liceolapaz.des.llc;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        String cuenta=null;
        int saldo=0;
        int opcion;
        do {
            menuPrincipal();
            opcion=leerOpcion();
            switch (opcion){
                case 1:
                    menuSecundario();
                    int opcionDos= leerOpcion();
                    if (opcionDos==1 || opcionDos==2){

                        System.out.println("Escriba el saldo inicial:");
                        saldo=leerOpcion();
                        cuenta=tipoCuenta(opcionDos);

                    } else if (opcionDos==0) {
                        break;

                    }else {
                        System.out.println("ERROR");
                        break;
                    }

                break;
                case 2: ingresarDinero(cuenta,saldo);
                break;
                case 3: retirarDinero(cuenta,saldo);
                break;
                case 4: consultarSaldo(saldo,cuenta);
            }
        }while(opcion!=0);
    }

    private static String tipoCuenta(int opcionDos) {
        if (opcionDos==1){
            String  cuenta="normal";
            return cuenta;
        }else {
            String cuenta= "premium";
            return cuenta;
        }
    }


    private static void menuPrincipal() {
        System.out.println("BANCO\n" +
                "1.Crear cuenta\n" +
                "2.Ingresar dinero\n" +
                "3.Retirar dinero\n" +
                "4.Consultar saldo\n" +
                "0.Salir\n" +
                "Escoja una opción:");
    }
    private static int leerOpcion() {
        Scanner teclado= new Scanner(System.in);
        return teclado.nextInt();
    }




    private static void menuSecundario() {
        System.out.println("Tipo de cuenta\n" +
                "1.Cuenta normal\n" +
                "2.Cuenta premium\n" +
                "0.Cancelar\n" +
                "Escoja una opcion:");
    }

    private static void ingresarDinero(String cuenta, int saldo) {
        if (cuenta==null){
            System.out.println("ERROR: AUN NO SE HA CREADO UNA CUENTA");


        } else {
            System.out.println("Escriba la cantidad:");
            int cantidad=leerOpcion();
            if (cantidad<0){
                System.out.println("Error: la cantidad debe ser positiva");
            }else {
                saldo=saldo+cantidad;
                System.out.println("El saldo de la cuenta es " + saldo);
            }
        }

    }
    private static void retirarDinero(String cuenta, int saldo) {
        if (cuenta == null) {
            System.out.println("ERROR: AUN NO SE HA CREADO UNA CUENTA");


        } else {
            System.out.println("Escriba la cantidad:");
            int cantidad = leerOpcion();
            if (cantidad<0){
                System.out.println("Error: la cantidad debe ser positiva");
            }else {
                if (saldo<cantidad && cuenta=="normal"){
                    System.out.println("ERROR: la cuenta normal no permite tener saldo negativo.");
                }else {
                    saldo=saldo+cantidad;
                    System.out.println("El saldo de la cuenta es " + saldo);
                }
            }

        }
    }
    private static void consultarSaldo(int saldo, String cuenta) {
        if (cuenta== null){
            System.out.println("ERROR: AUN NO SE HA CREADO UNA CUENTA");
        }else {
            System.out.println("El saldo de la cuenta es " + saldo);
        }
    }

}
