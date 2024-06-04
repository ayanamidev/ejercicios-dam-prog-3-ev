package com.liceolapaz.des;

import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class index2 {
    public static void main(String[] args) {
        while (true){
            menu();
            int opcion=leerInt();
            switch (opcion){
                case 1:
                    System.out.println("Escriba la ruta del fichero: ");
                    String ruta=leerString();
                    String contenido=leerFicheroTexto(ruta);
                    if (contenido!=null){
                        System.out.println(contenido);
                    }else {
                        System.out.println("Vuelva a intentarlo.");
                    }
                    break;
                case 2:subMenu();
                int opcion2=leerInt();
                switch (opcion2){
                    case 1:
                        System.out.println("Escriba la ruta del fichero origen:");
                        String rutaOrigen=leerString();
                        System.out.println("Escriba la ruta del fichero destino:");
                        String rutaDestino=leerString();
                        String contenidoOrigen=leerFicheroTexto(rutaOrigen);
                        if (contenidoOrigen!=null){
                            escribirFicheroTexto(contenidoOrigen,rutaDestino);
                        }
                        break;
                    case 2: System.out.println("Escriba la ruta del fichero origen:");
                        String rutaOrigenBinario=leerString();
                        System.out.println("Escriba la ruta del fichero destino:");
                        String rutaDestinoBinario=leerString();
                        byte[]contenidoBinario=leerFicheroBinario(rutaOrigenBinario);
                        if (contenidoBinario != null) {
                            escribirFicheroBinario(contenidoBinario,rutaDestinoBinario);

                        }
                        break;
                    case 0:
                        System.out.println("Volviendo al menud principal...");
                        break;
                    default:
                        System.out.println("Opcion incorrceta.");
                        break;

                }
                    break;
                case 3:
                    System.out.println("Escriba la ruta del directorio:");
                    String rutaDirectorio=leerString();
                    listarDirectorio(rutaDirectorio);
                    break;
                case 0:System.exit(0);
                    break;
                default:
                    System.out.println("Escriba un numero correcto:");
                    break;
            }
        }

    }

    private static void listarDirectorio(String rutaDirectorio) {
        File diectorio=new File(rutaDirectorio);

        if (diectorio.isDirectory()){
            String[]ficheros=diectorio.list();
            for (int i=0;i<ficheros.length;i++){
                File fichero=new File(diectorio,ficheros[i]);
                long bytes=fichero.length();
                System.out.println(ficheros[i]+"\t"+ String.format("%.2f",(bytes/1024.0))+"KB");

            }

        }else {
            System.out.println("La ruta no es un directorio.");
        }
    }

    private static void escribirFicheroBinario(byte[] contenidoBinario, String rutaDestinoBinario) {
        File ficheroBinario=new File(rutaDestinoBinario);
        if (ficheroBinario.isFile()){
            try {
                FileOutputStream fos=new FileOutputStream(ficheroBinario);
                BufferedOutputStream bos=new BufferedOutputStream(fos);
                bos.write(contenidoBinario);
                bos.close();
                fos.close();
            } catch (FileNotFoundException e) {
                System.out.println("No se ha encontrado el fichero");;
            } catch (IOException e) {
                System.out.println("Error al copiar archivo.");;
            }
        }else {
            System.out.println("El fichero destino no existe.");
        }
    }

    private static byte[] leerFicheroBinario(String ruta) {
        File rutaBinario=new File(ruta);
        if (rutaBinario.isFile()){
            try {
                FileInputStream fis=new FileInputStream(rutaBinario);
                BufferedInputStream bis=new BufferedInputStream(fis);
                byte[]buffer=new byte[1024];
                byte[]contenidoBinario=new byte[(int)rutaBinario.length()];
                int posicion=bis.read(buffer);
                int posicon=0;
                while (posicion!=-1){
                    for (int i=0;i<posicion;i++){
                        contenidoBinario[posicion]=buffer[i];
                        i++;

                    }
                    posicion=bis.read(buffer);
                }
                if (posicion==0){
                    return null;

                }else {
                    return contenidoBinario;
                }


            } catch (FileNotFoundException e) {
                System.out.println("No se ha encontrado el fichero.");
                return null;
            } catch (IOException e) {
                System.out.println("Error al leer el fichero");
                return null;
            }

        }else {
            System.out.println("No se ha encontrado el fichero origen");
            return null;
        }
    }

    private static void escribirFicheroTexto(String contenido, String ruta) {

        File rutaDestino=new File(ruta);

        if (rutaDestino.isFile()){
            try {
                FileWriter fw=new FileWriter(rutaDestino);
                BufferedWriter bw=new BufferedWriter(fw);
                PrintWriter pw=new PrintWriter(bw);
                pw.println(contenido);
                pw.close();
                fw.close();
                bw.close();

            } catch (IOException e) {
                System.out.println("Error al escribir el fichero.");
            }

        }else {
            System.out.println("La ruta destino no es un fichero.");
        }
    }

    private static void subMenu() {
        System.out.println("""
                Tipo de fichero a copiar
                1. Fichero de texto
                2. Fichero binario
                0. Cancelar
                Escoja una opción:
                """);
    }

    private static String leerFicheroTexto(String ruta) {
        File fichero=new File(ruta);

        if (fichero.isFile()){

            try {
                FileReader fr=new FileReader(fichero);
                BufferedReader br=new BufferedReader(fr);
                String linea=br.readLine();
                String contenido=null;
                while (linea!=null){
                    contenido=linea+"\n";
                    linea=br.readLine();
                }
                br.close();
                fr.close();
                return contenido;


            } catch (FileNotFoundException e) {
                System.out.println("La ruta no es un fichero");
                return null;
            } catch (IOException e) {
                System.out.println("Error al leer el arhivo");
                return null;
            }

        }else {
            System.out.println("No existe el fichero.");
            return null;
        }
    }

    private static String leerString() {
        return new Scanner(System.in).nextLine();
    }

    private static int leerInt() {
        Scanner scanner=new Scanner(System.in);
        try{
            return scanner.nextInt();
        }catch (InputMismatchException e){

            return -1;
        }
    }

    private static void menu() {
        System.out.println("""
                FICHEROS
                1. Leer fichero de texto
                2. Copiar fichero
                3. Listar archivos de directorio
                0. Salir
                Escoja una opción:""");
    }
}
