package com.licelapaz.des.llc;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        /*-----------------*/
        int dia;
          do {
              dia=pedirDia();
              if(dia>31 || dia<=0){
                  System.out.println("Día no válido, introduzca otro");
              }
          }while(dia>31 || dia<=0);
          /*-----------------*/
          /*-----------------*/
          int mes;
          do {
              mes=pedirMes();
              if(mes<=0 || mes>12){
                  System.out.println("Mes no válido, introduzca otro");
              }
          }while (mes<=0 || mes>12);
        /*-----------------*/
          int ano;
          do {
              ano=pedirAno();
              if (ano==0){
                  System.out.println("Año no válido, el año 0 no existe");
              }
          }while (ano==0);

        /*-----------------*/
          int  anoBisiesto=bisiesto(ano);
        /*-----------------*/
          comprobarFecha(dia,mes,ano);
    }

    private static int bisiesto(int ano) {
        int anoBisiesto;
        if((ano%4==0 && ano%100==0 && ano%400==0)|| ano%4==0 && ano%100!=0 ) {
            anoBisiesto=366;
            return anoBisiesto;
        }else {
            anoBisiesto=365;
        }
        return anoBisiesto;
    }
    private static void comprobarFecha(int dia, int mes, int ano) {
        if(mes==2 && dia>28 && ano==365){
            System.out.println("ERROR : FEBRERO NO TIENE MAS DE 28 DIAS Y EL AÑO NO ES BISIESTO");
        } else if (mes==2 && dia>29 && ano==366) {
            System.out.println("ERRO: FEBRERO NO TIENE MAS DE 29 DIAS, ES AÑO BISIESTO");
        }else if ((mes==4||mes==6 ||mes==9|| mes==11)&&dia>30){
            System.out.println("ERROR:EL MES SOLO TIENE 30 DIAS");
        }else {
            System.out.println("LA FECHA ES: "+dia+"-"+mes+"-"+"-"+ano);
        }
    }
    private static int pedirAno() {
        System.out.println("Introduzca el año: ");
        return leerDato();
    }
    private static int pedirMes() {
        System.out.println("Introduzca el mes: ");
        return leerDato();
    }
    private static int pedirDia() {
        System.out.println("Introduzca el dia: ");
        return leerDato();
    }
    private static int leerDato() {
        Scanner teclado = new Scanner(System.in);
        return teclado.nextInt();
    }
}
