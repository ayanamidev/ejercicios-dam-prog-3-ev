package org.liceolapaz.des.llc;

import java.util.Random;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
            int opcion=1;
            do {
                menuOpciones();
                //Leer opcion del usuario
                 opcion = leerNumero();
                opciones(opcion);
            }while(opcion!=0);





    }




    private static void menuOpciones() {
        System.out.println("ADIVINA EL NÚMERO\n" +
                "1.Del 1 al 10 (3 intentos)\n" +
                "2.Del 1 al 50 (5 intentos)\n" +
                "0.Salir\n" +
                "Escoja una opción:");
    }
    private static void opciones(int opcion) {

        switch (opcion){
            case 1: opcionUno();
                break;
            case 2: opcionDos();
                break;
            case 0:
                break;

            default:
                System.out.println("El número introducido no es válido.");
        }

    }
    private static int leerNumero() {
        Scanner teclado = new Scanner(System.in);
        return teclado.nextInt();
    }
    private static void pedirNumero() {
        System.out.println("Escriba el número:");
    }



        private static int generarNumeroAleatorio(int min,int max){
            Random random= new Random();
            return random.nextInt(max-min +1);
        }

    private static void opcionUno() {
        //Generamos el numero aleatorio entre 1 y 10
        int numeroAleatorio= generarNumeroAleatorio(1,10);
        //Creamos un bucle while con 3 intentos para que el susuario pueda insertar un nuevo numero 3 veces
        int contador=0;
        while(contador<3){
            contador++;
            System.out.println("Escriba el número:");
            int numeroUsuario= leerNumero();
            if (numeroUsuario==numeroAleatorio){
                System.out.println("Has acertado el número en "+contador+" intentos");
                break;
            }else if(numeroAleatorio<numeroUsuario){
                System.out.println("El número a adivinar es menor.");
            }else if(numeroAleatorio>numeroUsuario){
                System.out.println("El número a adivinar es mayor");
            }
            if(contador==3 && numeroAleatorio!=numeroUsuario){

                System.out.println("“No ha acertado en el número máximo de intentos. El número era\n" +
                        numeroAleatorio);

            }
        }


    }
    private static void opcionDos() {
        //Generamos el numero aleatorio entre 1 y 50
        int numeroAleatorio= generarNumeroAleatorio(1,50);
        //Creamos un bucle while con 5 intentos para que el susuario pueda insertar un nuevo numero 3 veces
        int contador=0;
        while(contador<5){
            contador++;
            System.out.println("Escriba el número:");
            int numeroUsuario= leerNumero();
            if (numeroUsuario==numeroAleatorio){
                System.out.println("Has acertado el número en "+contador+" intentos");
                break;
            }else if(numeroAleatorio<numeroUsuario){
                System.out.println("El número a adivinar es menor.");
            }else if(numeroAleatorio>numeroUsuario){
                System.out.println("El número a adivinar es mayor");
            }
            if(contador==5 && numeroAleatorio!=numeroUsuario){

                System.out.println("“No ha acertado en el número máximo de intentos. El número era\n" +
                        numeroAleatorio);

            }
        }
    }

}
