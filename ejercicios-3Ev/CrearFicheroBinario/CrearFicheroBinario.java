import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class CrearFicheroBinario {
    public static void main(String[] args) {
        System.out.println("Escriba el nombre del fichero: ");
        String nombreArchivo = leerString();
        String rutaArchivoBinario="C:\\Users\\laura\\Desktop\\"+nombreArchivo+".bin";
        byte[] datosBinarios = {0x48, 0x65, 0x6C, 0x6C, 0x6F, 0x20, 0x57, 0x6F, 0x72, 0x6C, 0x64};
        crearArchivoBinario(rutaArchivoBinario,datosBinarios);

    }

    private static String leerString() {
        return new Scanner(System.in).nextLine();

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
}
