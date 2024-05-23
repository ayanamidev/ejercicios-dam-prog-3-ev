package com.liceolapaz.des;

import java.io.*;
import java.util.Scanner;




public class index {
    public static void main(String[] args) throws IOException {
        menu();
        int opcion=leerInt();
        switch (opcion) {
            case 1:System.out.println("Escriba la ruta del fichero: "); 
            String ruta=leerString();
            String contenido=leerFichero(ruta);
                if (contenido!=null){
                    System.out.println(contenido); /*El contenido se escribe por pantalla */

                }else { /*Importante acordarse de gestionar que el contenido no sea null*/
                    System.out.println("El fichero no tiene contenido,esta vacío.");
                }
                
                break;
            case 2: submenu();
                    int opcion2=leerInt();
                    switch (opcion2){
                        case 1:
                            System.out.println("Escriba la ruta del fichero origen: ");
                            String rutaOrigen=leerString();
                            System.out.println("Escriba la ruta del fichero destino:");
                            String rutaDestino=leerString();
                            String contenidoOrigen=leerFichero(rutaOrigen);
                            if (contenidoOrigen!=null){
                                copiarFicheroTexto(rutaDestino,contenidoOrigen);

                            }else {
                                System.out.println("El fichero origen esta vacío.");
                            }
                            break;
                        case 2:
                            System.out.println("Escriba la ruta del fichero origen: ");
                            String rutaOrigenBinario=leerString();
                            System.out.println("Escriba la ruta del fichero destino:");
                            String rutaDestinoBinario=leerString();
                            byte[]contenidoBinario=leerFicheroBinario(rutaOrigenBinario);
                            if (contenidoBinario!=null){
                                copiarFicheroBinario(rutaDestinoBinario,contenidoBinario);
                            }



                            break;
                    }

                break;
            case 3:
                break;
            case 4:
                System.out.println("Escriba el nombre del fichero: ");
                String nombreArchivo = leerString();
                String rutaArchivoBinario="C:\\Users\\laura\\Desktop\\"+nombreArchivo+".bin";
                byte[] datosBinarios = {0x48, 0x65, 0x6C, 0x6C, 0x6F, 0x20, 0x57, 0x6F, 0x72, 0x6C, 0x64};
                crearArchivoBinario(rutaArchivoBinario,datosBinarios);
                break;
        
            default:
                break;
        }
    }

    private static void copiarFicheroBinario(String rutaDestinoBinario, byte[] contenidoBinario) {
        File fichero=new File(rutaDestinoBinario);
        if (fichero.isFile()){

            try{
                FileOutputStream fos=new FileOutputStream(fichero);//crea o abre un ficheor binario
                BufferedOutputStream bos=new BufferedOutputStream(fos);
                bos.write(contenidoBinario);
                bos.close();
            }catch (FileNotFoundException e){
                System.out.println("Error al abrir el archivo");
            }catch (IOException ex){
                System.out.println("Error al escribir el fichero");
            }



        }else {
            System.out.println("El fichero destino no existe");
        }


    }

    private static byte[] leerFicheroBinario(String rutaOrigenBinario) {
        File fichero=new File(rutaOrigenBinario);
        if (fichero.isFile()){

            try {
                FileInputStream fis=new FileInputStream(fichero);//INPUT!!! operaciones de lectura de datos
                BufferedInputStream bis=new BufferedInputStream(fis);
                byte []buffer=new byte[1024];
                byte[]contenidoBinario=new byte[(int)fichero.length()];
                //La clase file utiliza por default el dato long para representar el tamaño de un archivo
                //Si queremos usar lenght hay que hacer un cast explicito a int
                int bytesleidos=bis.read(buffer);

                    int posicion=0;
                    while (bytesleidos!=-1){
                        for (int i=0;i<bytesleidos;i++){
                            contenidoBinario[posicion]=buffer[i];
                            posicion++;

                        }
                        bytesleidos=bis.read();

                    }
                    if (posicion==0){
                        System.out.println("El fichero esta vacío.");
                        return null;
                    }else {
                        return contenidoBinario;
                    }





            } catch (FileNotFoundException e) { //el archivo que se intenta abrir no se encuentra en la ubicacion especifica
                //Sale del FileInputStream
                System.out.println("La ruta "+ rutaOrigenBinario+" no existe");
                return null;

            } catch (IOException e) { //problema al leer el fichero
                //Sale del metodo .read() de BufferedInputStream
                System.out.println("Error al leer el fichero");
                return null;
            }

        }else {
            System.out.println("La ruta "+rutaOrigenBinario+" no es un fichero");
            return  null;
        }
    }



    private static void crearArchivoBinario(String rutaArchivoBinario, byte [] datosBinarios) {
        BufferedOutputStream bos=null;
        try{
            FileOutputStream fos=new FileOutputStream(rutaArchivoBinario);//crea el arhico si no existe y para escribir datos en el
            bos=new BufferedOutputStream(fos);//utilizmaos un buffer porque mejora el rendimiento
            bos.write(datosBinarios);
            bos.close();//IMPORTANTISIMO, SI NO SE CIERRA NO ESCRIBE NADA

        }catch (FileNotFoundException e){
            //El nombre del archivo es invalido/el directorio no existe/no hay permisos parar crear o abrir el archivo
            System.out.println("Error al crear el archivo");
        } catch (IOException e) {
            System.out.println("Error al escribir datos en el fichero: "+e.getMessage());
            if (bos!=null){
                try{
                    bos.write(new byte[0]);
                }catch (IOException ex){
                    System.out.println("Error al borrar el contenido del archivo");

                }
            }



        }
    }

    private static void copiarFicheroTexto(String rutaDestino, String contenidoOrigen) throws IOException {
        File fichero=new File(rutaDestino);
        if (fichero.isFile()){
            try{
                FileWriter fileWriter=new FileWriter(fichero); /*No es util para escribir en un fichero, no proporciona saltos de linea*/
                //FileWriter maneja la  creacion y apertura del archivo
                BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);//Saltos de linea manuales
                //BufferedWriter usa un bufer mejorando el rendimiento
                PrintWriter printWriter=new PrintWriter(bufferedWriter);//Proporciona saltos de liena automaticos
                //PrintWriter proporciona metodos para escribir el texto formateado

                printWriter.print(contenidoOrigen);
                printWriter.close();//IMPORTANTE CERRAR PRINTWRITTER!
                //Cuando escribes un archivo con printWritter los datos se almacenan en un bufer interno.
                //El bufer se vacia y los datos se escribe en el archivo solo cuando se cierra el flujo de salida
                //Si no lo cierras los datos permaneceran en el bufer y no se escribiran en el archivo
            }catch (IOException e){
                System.out.println("Error al escribir fichero.");
            }




        }else{
            System.out.println("La ruta "+fichero+" no es un fichero.");
        }


    }

    private static void submenu() {

        System.out.println("""
                Tipo de fichero a copiar
                1. Fichero de texto
                2. Fichero binario
                0. Cancelar
                Escoja una opción:
                """);
    }

    private static String leerFichero(String ruta) {
        File fichero=new File(ruta);

        /*isFile() comprueba si el objeto File es un fichero, si es un fichero devueleve true */

        if (fichero.isFile()) {

            /*Cuando creamos un archivo Filereader el codigo aparece subrayado en rojo, esto indica que hay que manejar la excepcion
             * FileNotFoundException (subclase de IOException)con un try-catch
             */
            try{
             FileReader fileReader=new FileReader(fichero);  /* Filereader contiene un metodo para leer llamado read(),
             pero solo lee un caracter del archivo a la vez y devuelve un entero que representa el codigo Unicode.
             Usamos Filereader para crear un flujo de caracteres desde un archivo*/ 
             BufferedReader bufferedReader=new BufferedReader(fileReader);
             /*BufferedReader proporciona metodos para leer un flujo de caracteres, matrices de caracteres o lineas completas de texto de
              manera eficiente, funciona como una envoltura alrrededor de otro Reader.
              BufferedReader utiliza un bufer interno para almacenar los caracteres almacenados en Filereader y con los metodos
              BufferedReader los leemos, por tanto BufferedReader espera un objeto tipo Reader como parametro*/

              String linea=bufferedReader.readLine();/*EL IDE nos indica que este metodo arroja una excepcion tipo
              IOException por lo cual hay que manejarla */
              String contenido=null;
              while (linea!=null) {/*BufferedReader tiene un puneto interno que indica la posicion actual en el archivo,
                cada vez que se llama a readLine el puntero se mueve al comienzo de la siguiente linea.
                ReadLine() devueñve null cuando se llega al final del archivo */
                if(contenido==null){
                    contenido=linea;
                }else{
                    contenido+="\n"+linea;
                }
                linea=bufferedReader.readLine();
                
              }
              /*Es buena practica cerrarlos al terminar de usarlos para liberar recursos del sistema y evitar 
               * problemas de memoria y recursos
               */
              bufferedReader.close();
              fileReader.close();
              return contenido;

            }catch(FileNotFoundException e){ /* manejo para FileReader */
                /*FileNotFoundException: el fcihero que se intenta abrir no se encuentra en la ruta especificada */

                System.out.println("La ruta "+ ruta+ " no existe.");
                return null;

            }catch(IOException e){/*manejo para readdline() del bufferReader*/
                System.out.println("Soy yo el problema reina ");
                return null;

            }
            
            
            
        }else{
            System.out.println("La ruta "+ruta+" no es un fichero");
            return null;
        }
        
    }

    private static String leerString() {
        return new Scanner(System.in).nextLine();
        
    }

    private static int leerInt() {
        return new Scanner(System.in).nextInt();
    }

    private static void menu() {
        System.out.println("""
            FICHEROS
            1. Leer fichero de texto
            2. Copiar fichero
            3. Listar archivos de directorio
            0. Salir
            Escoja una opción:
                """);
    }
}
