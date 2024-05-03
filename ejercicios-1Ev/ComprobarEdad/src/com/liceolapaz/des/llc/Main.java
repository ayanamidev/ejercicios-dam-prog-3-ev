package com.liceolapaz.des.llc;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Pedir año de nacimiento
        pedirAnho();
        //Leer el año de nacimiento y guardarlo en una variable
        int anho= leerAnho();
        //Comprobar el año y guardar mensaje
        String mensaje =comprobarAnhoNacimiento(anho);
        //Escribir mensaje
        escribirMensaje(mensaje);
    }

    private static void escribirMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    private static String comprobarAnhoNacimiento(int anho) {
        String mensaje;

        int edad= 2023 - anho;
        if(anho >2023){
            mensaje= "No puedes haber nacido en el futuro.";
        }else if (edad<150){
            mensaje = "No puedes tener tantos años.";
        } else if (edad >= 18){
            mensaje= "Tienes permiso para entrar.";
        }else{
            mensaje = "No puedes pasar.";
        }
        return mensaje;

    }

    private static int leerAnho() {
        Scanner teclado = new Scanner(System.in);
       return teclado.nextInt();
    }


    private static void pedirAnho() {
        System.out.println("Escriba su año de nacimiento:");
    }

}
