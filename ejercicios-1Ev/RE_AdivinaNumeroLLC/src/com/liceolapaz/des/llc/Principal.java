package com.liceolapaz.des.llc;

import java.util.Random;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
      do {
          menu();
          int opcion= leerOpcion();
          int contador=0;
          int min=0;
          int max=0;
          int num=0;
          if (opcion==1||opcion==2){
              if (opcion==1){
                  contador=3;
                  min=1;
                  max=10;
              } else if (opcion==2) {
                  contador = 5;
                  min = 1;
                  max = 50;
              }
              Random random= new Random();
              int numero=numeroAleatorio(min,max);
              for (int i=0; i<contador;i++){
                  System.out.println("Escriba el numero:");
                  num=leerOpcion();
                  if (num==numero){
                      System.out.println("Has acertado el numero en "+ (i+1)+ "intentos.");
                      break;
                  } else if (num<numero) {
                      System.out.println("El numero a adivinar es mayor");
                  } else if (num>numero) {
                      System.out.println("El numero a adivinar es menor");
                  }


              }
              if (num!=numero){
                  System.out.println("No has acertado en el numero maximo de intentos. El numero era: "+ numero);
              }
          } else if (opcion==0) {
              System.exit(0);

          }else{
              System.out.println("Opcion introducida no válida.");
          }


      }while (true);

    }

    private static int numeroAleatorio(int min, int max) {
        Random random= new Random();
        int numeroAleatorio=random.nextInt(max-min+1)+min;
        return numeroAleatorio;
    }


    private static void menu() {
        System.out.println("""
                ADIVINE NÚMERO
                1.Del 1 al 10 (3 intentos)
                2.Del 1 al 50(5 intentos)
                0.Salir
                Escoja una opcion:
                
                """);
    }
    private static int leerOpcion() {
        Scanner teclado= new Scanner(System.in);
        return teclado.nextInt();
    }

}
