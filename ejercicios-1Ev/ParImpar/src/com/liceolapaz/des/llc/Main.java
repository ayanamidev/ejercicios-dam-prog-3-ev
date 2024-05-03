package com.liceolapaz.des.llc;

import javax.xml.transform.Source;
import java.util.Scanner;

public class Main {
    //escribir main y  crear el metodo main automatico
    public static void main(String[] args) {

        //Pedir un numero al usuario
        pedirNumero();
        //creamos una variable donde vamos a guardar el resultado del metodo. Creamos metodo que indique que vamos a leer desde teclado y retornamos el valor del teclado.
        int numeroUsuario= leerNumero();
        // Comprobar si es par o impar y guardar mensaje
        String mensaje= comprobarNumero(numeroUsuario);
        // Escribir mensaje
        System.out.println(mensaje);

    }


    private static void pedirNumero() {
        System.out.println("Escriba un número :");
    } //void significa que el metodo no tiene valor de retorno


    private static int leerNumero(){
        Scanner teclado = new Scanner(System.in); //indicamos que vamos a leer desde un teclado con system.in
        return teclado.nextInt(); //retornamos el resultado que guardaremos arriba en una variable.



    }

    //los parametros que pasamos al metodo funcionan como variables dentro de este
    private static String comprobarNumero(int numeroUsuario) {
        String mensaje = (numeroUsuario==0)?
                "El número 0 no es par ni impar.":
                (numeroUsuario%2 ==0)?
                        "El número es par.": "El número es impar.."; //uso de operador java, si es true se ejecuta la primera
        return mensaje;
    }
}
