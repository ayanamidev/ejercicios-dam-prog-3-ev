package com.liceolapaz.des.llc;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        int opcion;
        String tipoCuenta= null ;
        double saldoCuenta=0;
        do{

            menuOpciones();
             opcion = leerOpcion();
            switch (opcion){
                case 1: menuSecundario();
                    int opcionDos = leerOpcion();
                    switch (opcionDos){
                        case 1:
                            saldoCuenta = saldoInicial();
                            tipoCuenta="NORMAL";
                            break;
                            case 2:  saldoCuenta = saldoInicial();
                                tipoCuenta="PREMIUM";
                                break;
                        case 0:
                            System.exit(0);
                            break;
                        default:
                            System.out.println("ERROR: opcion introducida no valida.");
                            break;

                        }



                    break;
                case 2: ingresarDinero(saldoCuenta, tipoCuenta);
                    break;
                case 3: retirarDinero(saldoCuenta,tipoCuenta);
                    break;
                case 4: consultarSaldo(saldoCuenta, tipoCuenta);
            }
        }while(opcion!=0);


    }

    private static void consultarSaldo(double saldoCuenta, String tipoCuenta) {
        if(tipoCuenta== null){
            System.out.println("No ha creado una cuenta. No hay saldo que consultar.");

        }else {
            System.out.println("El saldo de la cuenta es:"+ saldoCuenta);
        }

    }

    private static void retirarDinero(double saldoCuenta, String tipoCuenta) {
        if (tipoCuenta==null) {
            System.out.println("ERROR:no hay una cuenta activa");
        }else {
            System.out.println("Escriba la cantidad que desea retirar:");
            Scanner teclado= new Scanner(System.in);
            double cantidadRetirada= teclado.nextDouble();
            if(tipoCuenta=="NORMAL"){
                if (cantidadRetirada>saldoCuenta){
                    System.out.println("ERROR: con el tipo de cuenta normal no puede tener saldo negativo");
                }else{
                    saldoCuenta= saldoCuenta-cantidadRetirada;
                    System.out.println("El saldo de la cuentas es: "+ saldoCuenta);
                }
            }else {
                saldoCuenta= saldoCuenta-cantidadRetirada;
                System.out.println("El saldo de la cuentas es: "+ saldoCuenta);
            }


        }

    }

    private static void ingresarDinero(double saldoCuenta, String tipoCuenta) {
        if (tipoCuenta==null){
            System.out.println("ERROR:no hay una cuenta activa");
        }else {
            System.out.println("Escriba la cantidad:");
            Scanner teclado= new Scanner(System.in);
           double cantidadIngresada= teclado.nextDouble();
           if (cantidadIngresada<=0){
               System.out.println("ERROR:la cantidad debe ser positiva");

           }else {
               double saldoActual= saldoCuenta + cantidadIngresada;
               System.out.println("El saldo de la cuentas es: "+ cantidadIngresada);
           }

        }


    }




    private static double saldoInicial() {
        System.out.println("Escriba el saldo inicial");
        Scanner teclado= new Scanner(System.in);
        return teclado.nextDouble();
    }

    private static void menuSecundario() {
        System.out.println("Tipo cuenta\n" +
                "1.Cuenta normal\n" +
                "2.Cuenta premium\n" +
                "0.Cancelar\n" +
                "Escoja una opcion:");

    }

    private static int leerOpcion() {
        Scanner teclado= new Scanner(System.in);
        return teclado.nextInt();
    }

    private static void menuOpciones() {
        System.out.println("BANCO\n" +
                "1.Crear cuenta\n" +
                "2.Ingresar dinero\n" +
                "3.Retirar dinero\n" +
                "4.Concultar saldo\n" +
                "0.Salir\n" +
                "Escoja una opcion:");
    }

}
