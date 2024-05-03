package com.liceolapaz.des.llc;

import java.io.File;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        do {
            menu();
            int opcion=leerOpcion();
            switch (opcion){
                case 1: pedirRuta();
                    String ruta=leerString();
                    leerFichero(ruta);
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 0: System.exit(0);
                    break;
                default:
                    break;
            }
        }while (true);


    }

    private static void leerFichero(String ruta) {

        File fichero=new File(ruta);
        if (fichero.isFile()){

        }else {
            System.out.println("La ruta "+ruta+"no es un fichero");
            return null;
        }
    }

    private static void pedirRuta() {
        System.out.println("Introduzca la ruta del fichero: ");

    }

    private static String leerString() {

        return new Scanner(System.in).nextLine();
    }

    private static int leerOpcion() {

        try {
            return new Scanner(System.in).nextInt();
        }catch (InputMismatchException e){/*se suele poner e, x (a la excepcion)*/
            return -1; //podemos poner un -1 asi luego en el switch ya pone el mensaje de error
        }


    }

    private static void menu() {
        System.out.println("""
                GESTOR EMPLEADOS
                1. Importar empleados
                2. Añadir empleado
                3. Modificar empleado
                4. Eliminar empleado
                5. Exportar empleados
                0. Salir
                Escoja una opción:
                """);
    }
}
