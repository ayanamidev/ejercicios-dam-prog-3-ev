package com.liceolapaz.des.llc;


import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        do {
            menu();
            int opcion=leerInt();
            switch (opcion){
                case 1:
                    pedirRuta();
                    String ruta=leerString();
                    String contenido=leeerFicheroTexto(ruta);
                    if (contenido!=null){ 

                        System.out.println(contenido);   
                    }

                    break;
                case 2:
                    escribirSubmenu();
                    int opcionSubmenu=leerInt();
                    switch (opcionSubmenu){
                        case 0: System.exit(0);
                            break;
                        case 1:
                            pedirRutaOrigen();
                            String rutaOrigen=leerString();
                            pedirRutaDestino();
                            String rutaDestino=leerString();
                            String contenidoTexto=leeerFicheroTexto(rutaOrigen);
                            if (contenidoTexto!=null){
                                escribirFicheroTexto(rutaDestino,contenidoTexto);

                            }
                            break;
                        case 2:
                            pedirRutaOrigen();
                            String rutaOrigenBinario=leerString();
                            pedirRutaDestino();
                            String rutaDestinoBinario=leerString();
                            byte []contenidoBinario= leerFicheroBinario(rutaOrigenBinario);
                            if (contenidoBinario!=null){
                                escribirFicheroBinario(rutaDestinoBinario,contenidoBinario);
                            }

                            break;
                        default:
                            System.out.println("Opcion no valida");
                            break;
                    }

                    break;
                case 3: pedirRutaDirectorio();
                String rutaDirectorio=leerString();
                listarArchivos(rutaDirectorio);
                    break;
                case 0:System.exit(0);
                    break;
                default:
                    System.out.println("Opcion no válida");
                    break;
            }
        }while (true);

    }

    private static void listarArchivos(String rutaDirectorio) {

        File directorio=new File(rutaDirectorio);
        if (directorio.isDirectory()){

            System.out.println();

            String [] nombreFichero=directorio.list();

            for (int i=0;i<nombreFichero.length;i++){
                File fichero= new File(directorio,nombreFichero[i]);
                double tamanhoEnKB=nombreFichero[i].length()/1024.0;
                System.out.println(nombreFichero[i]+ "\t"+ String.format("%.2f",tamanhoEnKB)+ "KBs" );
            }



        }else {
            System.out.println("La ruta "+ rutaDirectorio+ " no es un directorio");
        }
    }

    private static void pedirRutaDirectorio() {
        System.out.println("Escriba la ruta del directorio: ");
    }

    private static void escribirFicheroBinario(String rutaDestinoBinario, byte[] contenidoBinario) {

        File fichero = new File(rutaDestinoBinario);

        try {
            FileOutputStream fos=new FileOutputStream(fichero);
            BufferedOutputStream bos= new BufferedOutputStream(fos);
            bos.write(contenidoBinario);
            bos.close();
            fos.close();

        } catch (FileNotFoundException e) {
            System.out.println("La ruta "+rutaDestinoBinario+ " no existe");

        }catch (IOException e){
            System.out.println("Error al escribir el fichero");
        }

    }

    private static byte[] leerFicheroBinario(String rutaOrigenBinario) {
        File fichero= new File(rutaOrigenBinario);
        if (fichero.isFile()){
            try {
                FileInputStream fis=new FileInputStream(fichero);
                BufferedInputStream bis=new BufferedInputStream(fis);
                int bytesleidos=0;
                byte[] buffer=new byte[1024];
                byte [] contenido=new byte[ (int)fichero.length()];
                int posicion=0;
                bytesleidos=bis.read(buffer);
                while (bytesleidos!=-1){
                    for (int i=0;i<bytesleidos;i++){
                        contenido[posicion]=buffer[i];
                        posicion++;
                    }
                    bytesleidos=bis.read(buffer);

                }
                bis.close();
                fis.close();
                return contenido;


            }catch (FileNotFoundException e){
                System.out.println("La ruta "+ rutaOrigenBinario+" no existe");
                return null;
            } catch (IOException e) {
                System.out.println("Error al leer el fichero");
                return null;
            }


        }else {
            System.out.println("La ruta "+rutaOrigenBinario+" no es un fichero");
            return null;
        }
    }

    private static void escribirFicheroTexto(String rutaDestino, String contenidoTexto) {
        File fichero=new File(rutaDestino);
        try{
            FileWriter fw=new FileWriter(fichero);
            BufferedWriter bw=new BufferedWriter(fw);
            PrintWriter pw=new PrintWriter(bw);
            pw.print(contenidoTexto);
        }catch (IOException e){
            System.out.println("Error al escribir el fichero");
        }
    }

    private static void pedirRutaDestino() {
        System.out.println("Escriba la ruta destino:");
    }

    private static void pedirRutaOrigen() {
        System.out.println("Escriba la ruta origen:");
    }

    private static void escribirSubmenu() {
        System.out.println("""
                Tipo de fichero a copiar
                1. Fichero de texto
                2. Fichero binario
                0. Cancelar
                Escoja una opción:
                
                """);
    }

    private static String leeerFicheroTexto( String ruta) {

        File fichero=new File(ruta);
        /*crea un nuevo objeto File que representa un archivo o directorio en el sistema de archivos, utilizando la ruta especificada.*/
        if (fichero.isFile()){
            /*
            FileReader fr;
            BufferedReader br;
            */
            try{
                String contenido= null;

               FileReader fr =new FileReader(fichero);
               BufferedReader br=new BufferedReader(fr);
               String linea=br.readLine();
               while (linea!=null){

                   if (contenido==null){
                       contenido=linea;
                   }else {
                       contenido += "\n" + linea ;
                   }

                   linea=br.readLine();
               }

               fr.close();
               br.close();
               return contenido;


            }catch (FileNotFoundException e){
                System.out.println("La ruta "+ ruta+ " no existe");
                return null;
            }catch (IOException e){
                return null;

            }

            /*
            }finally {
                fr.close();
                }
            */

        }else {
            System.out.println("La ruta "+ ruta+ " no es un fichero");
            return null;
        }

    }

    private static void pedirRuta() {
        System.out.println("Escriba la ruta:");
    }

    private static String leerString() {
        return new Scanner(System.in).nextLine();
    }

    private static int leerInt() {
        try {
            return new Scanner(System.in).nextInt();
        }catch (InputMismatchException ex){
            return -1;
        }

    }

    private static void menu() {
        System.out.println("""
                FICHEROS
                1. Leer fichero de texto
                2.Copiar fichero
                3. Listar archivos de directorio
                0. Salir
                Escoja una opcion:
                """);
    }
}
