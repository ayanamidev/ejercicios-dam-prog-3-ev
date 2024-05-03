package com.liceolapaz.des.llc;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        System.out.println("""
                CALCULADORA
                1.Suma
                2.Resta
                3.Producto
                4.Division
                0.Salir
                Escoja una opción:
                """);

        int opcion = leerOpcion();
        if (opcion==1||opcion==2||opcion==3||opcion==4){
            escribirSubmenu();
            int opcionSubmenu=leerOpcion();
            switch (opcionSubmenu){
                case 1: pedirOperando();
                int operando=leerOpcion();
                pedirSegundoOperando();
                int segundoOperando=leerOpcion();

                Entero entero1=new Entero(operando);
                Entero entero2=new Entero(segundoOperando);
                switch (opcion){
                    case 1:
                    {Numero resultado= entero1.suma(entero2);
                        System.out.println("El resultado es: "+ resultado.mostrar());}
                        break;
                    case 2:
                    {Numero resultado=entero1.resta(entero2);
                        System.out.println("El resultado es: "+resultado.mostrar());}
                        break;
                    case 3:
                    {Numero resultado=entero1.producto(entero2);
                        System.out.println("El resultado es: "+resultado.mostrar());}
                        break;
                    case 4:
                    {Numero resultado= entero1.division(entero2);
                    if (resultado!=null){
                        System.out.println("El resultado es: "+resultado.mostrar());}
                    }
                        break;

                }


                    break;
                case 2:
                    pedirPrimerNumerador();
                    int numerador1=leerOpcion();
                    pedirPrimerDenominador();
                    int denominador1=leerOpcion();
                    pedirSegundoNumerador();
                    int numerador2=leerOpcion();
                    pedirSegundoDenominador();
                    int denominador2=leerOpcion();
                    Racional racional1=new Racional(numerador1,denominador1);
                    Racional racional2=new Racional(numerador2,denominador2);

                    switch (opcion){
                        case 1:{
                            Numero resultado=racional1.suma(racional2);
                            System.out.println("El resultado es: "+resultado.mostrar());}

                            break;
                        case 2:{ Numero resultado=racional1.resta(racional2);
                            System.out.println("El resultado es: "+resultado.mostrar());}
                            break;
                        case 3:{
                            Numero resultado=racional1.producto(racional2);
                            System.out.println("El resultado es: "+resultado.mostrar());
                            break;
                        }
                        case 4:{
                            Numero resultado=racional1.division(racional2);
                            System.out.println("El resultado es: "+resultado.mostrar());
                        }
                            break;
                        case 0:
                            break;
                    }

                    break;
                case 3:
                    pedirParteReal();
                    int parteReal1=leerOpcion();
                    pedirParteImaginaria();
                    int parteImaginaria1=leerOpcion();
                    pedirParteRealDos();
                    int parteReal2=leerOpcion();
                    pedirParteImaginariaDos();
                    int parteImaginaria2=leerOpcion();
                    Complejo operano1=new Complejo(parteReal1,parteImaginaria1);
                    Complejo operando2=new Complejo(parteReal2,parteImaginaria2);
                    switch (opcion){
                        case 1:
                            break;
                    }
                    break;
                case 0:
                    System.exit(0);
                    break;
            }
        }
    }

    private static void pedirParteImaginariaDos() {
        System.out.println("Escriba la parte imaginaria del segundo operando:");
    }

    private static void pedirParteRealDos() {
        System.out.println("Escriba la parte real del segundo operando:");
    }

    private static void pedirParteImaginaria() {
        System.out.println("Escriba la parte imaginaria del primer operando:");
    }

    private static void pedirParteReal() {
        System.out.println("Escriba la parte real del primer operando:");
    }

    private static void pedirSegundoDenominador() {
        System.out.println("Esrciba el denominador del segundo operando: ");
    }

    private static void pedirSegundoNumerador() {
        System.out.println("Escriba el nominador del segundo operando: ");
    }

    private static void pedirPrimerDenominador() {
        System.out.println("Escriba el denominador del primer operando: ");
    }

    private static void pedirPrimerNumerador() {
        System.out.println("Escriba el numerador del primer operando: ");
    }

    private static void pedirSegundoOperando() {
        System.out.println("Escriba el segundo operando");
    }

    private static void pedirOperando() {
        System.out.println("Escriba el primer operando");

    }

    private static void escribirSubmenu() {
        System.out.println("""
                Tipo de números
                1. Números enteros
                2. Números racionales
                3. Números complejos
                0. Cancelar
                Escoja una opción:
                """);
    }

    private static int leerOpcion() {
        Scanner teclado= new Scanner(System.in);
        return teclado.nextInt();
    }
}
