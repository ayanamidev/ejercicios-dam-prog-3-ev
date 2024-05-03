package com.liceolapaz.des.llc;

import javax.crypto.spec.PSource;
import java.util.Scanner; //al poner scanner en el metodo de leer nombre importa este paquete automaticamente

public class Principal {
    //main para poder ejecutar el programa
    public static void main (String[]args){
        //ponerle un encabezado al metodo (primera en minuscula)
        ponerEncabezado(); //nombre del metodo y paretesis para los parametros que en este caso noo necesitamos ponerle ninguno.

        //pedirle el nombre al usuario
        pedirNombre();
        //Creamos una variable donde guardamos el resultado de leer nombre, metodo que lee el nombre que el susuario escribe por teclado
        String nombreUsuario= leerNombre(); //primero se declara la variable.

        //saludar al usuario
        saludarUsuario(nombreUsuario);



    }

    private static void saludarUsuario ( String nombreUsuario) {
        System.out.println("Hola " +
                ""  + nombreUsuario + "!");
    }

    private static String leerNombre() {
        Scanner teclado = new Scanner(System.in); //declaramos variable, y le indicamos la clasee scaner para que lea datos desde teclado
        String nombre = teclado.nextLine(); //creamos una variable donde vamos
        return nombre;
    }


    //
    private static void ponerEncabezado() {
        // sout + enter
        System.out.println("HOLA USUARIO");
    }

    private static void pedirNombre() {
        System.out.println("Escriba su nombre:");
    }



}
