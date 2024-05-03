package com.liceolapa.des.llc;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        int opcion;
        do{
            menuOpciones();
             opcion= leerOpcion();
            switch (opcion){
                case 1: calcularTriangulo();
                    break;
                case 2: calcularRectangulo();
                    break;
                case 3: calcularCuadrado();
                    break;
                case 4:calcularPentagono();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("ERROR:la opcion introducida no es valida.");
                    break;


            }
        }while (opcion!=0);

        
    }

    private static void calcularPentagono() {
        System.out.println("Escriba el valor de del lado:");
        double lado= leerValor();
        System.out.println("Escriba el valor del apotema:");
        double apotema= leerValor();
        double perimetro= lado+5;
        double area= (perimetro*apotema)/2;
        System.out.println("El area es "+ area + "y el perimetro es: "+ perimetro);

    }

    private static void calcularCuadrado() {
        System.out.println("Escriba el valor de del lado:");
        double lado = leerValor();
        double area = lado * lado;
        double perimetro= lado + lado + lado + lado;
        System.out.println("El area es: " + area + "y el perimetro es: "+ perimetro);
    }

    private static void calcularRectangulo() {
        System.out.println("Escriba el valor de la base:");
        double base = leerValor();
        System.out.println("Escriba el valor de la altura:");
        double altura = leerValor();
        double area= base * altura;
        double perimetro= base+base+altura+altura;
        System.out.println( "El area es:" + area + " y el perimetro es:" + perimetro);
    }

    private static void calcularTriangulo() {
        System.out.println("Escriba el valor de la base:");
        double base = leerValor();
        System.out.println("Escriba el valor de la altura:");
        double altura = leerValor();
        System.out.println("Escriba el valor de los lados:");
        double[]lados= new double[3];
        int i=0;
        while(i!=3){

            lados[i]= leerValor();
            i++;
        }
        double perimetro= lados[0]+lados[1]+lados[2];
        double area= (base*altura)/2;

        System.out.println("El area es:" + area +  " y el perimetro es:" + perimetro);



    }

    private static double leerValor() {
        Scanner teclado=new Scanner(System.in);
        return teclado.nextDouble();
    }

    private static int leerOpcion() {
        Scanner teclado=new Scanner(System.in);
        return teclado.nextInt();
    }

    private static void menuOpciones() {
        System.out.println("FIGURAS GEOMÉTRICAS\n" +
                "1.Triangulo\n" +
                "2.Rectangulo\n" +
                "3.Cuadrado\n" +
                "4.Pentagono\n" +
                "0.Salir\n" +
                "Escoja una opcion:");
        
    }
}
