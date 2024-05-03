package com.liceolapaz.des.llc;

import java.util.Scanner;

public class Cajero {

    public static void main(String[] args) {

        //Creo una variable de tipo CuentaBnacaria vacia, porque  tanto si la cuenta sea premium o normal, las dos extienden de CuentaBancaria y podemos guardar el objeto en una variable tipo CuentaBnacaria
        CuentaBancaria cuenta=null;
        while (true){
            menu();
            int opcion=leerOpcion();
            switch (opcion){
                case 1:   System.out.println("""
                    Tipo de cuenta
                    1. Cuenta normal
                    2. Cuenta Premium
                    0. Cancelar
                    Escoja una opción:
                    """);
                    int opcionDos=leerOpcion();
                    switch (opcionDos){
                        case 1:
                        case 2:
                            System.out.println("Escriba el saldo inicial: ");
                            double saldo =leerDouble();
                            if (opcionDos==1){
                                cuenta=new CuentaNormal(saldo);


                            }else {
                                cuenta=new CuentaPremium(saldo);


                            }
                        case 0:
                            break;
                        default:
                            System.out.println("ERROR: Opción introducida no válida.");
                            break;
                    }
                    break;
                case 2:{
                    if(cuenta==null){
                        System.out.println("No tienes una cuenta bancaria");
                    }else {
                        System.out.println("Introduzca la cantidad: ");
                        double cantidad = leerDouble();
                        cuenta.ingresarDinero(cantidad);
                    }
                    break;}
                case 3:
                    if (cuenta==null){
                        System.out.println("No tienes una cuenta bancaria");
                    }else {
                        System.out.println("Introduzca la cantidad: ");
                        double cantidad = leerDouble();
                        cuenta.retirarDinero(cantidad);
                    }
                    break;
                case 4:
                    if (cuenta!=null){
                        System.out.println("El saldo es: "+cuenta.consultarSaldo());
                    }else {
                        System.out.println("No tienes una cuenta bancaria.");
                    }
                    break;
                case 0:System.exit(0);
                    break;
            }
        }



    }

    private static double leerDouble() {
        return new Scanner(System.in).nextDouble();
    }

    private static int leerOpcion() {
        return new Scanner(System.in).nextInt();

    }

    private static void menu() {
        System.out.println("""
                BANCO
                 1. Crear cuenta
                 2. Ingresar dinero
                 3. Retirar dinero
                 4. Consultar saldo
                 0. Salir
                Escoja una opción:""");
    }
}
