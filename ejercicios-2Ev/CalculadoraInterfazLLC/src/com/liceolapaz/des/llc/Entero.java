package com.liceolapaz.des.llc;

//La clase Entero extiende de la clase Numero y tenemos que implemntar todos sus metodos
public class Entero extends Numero{
    private int valor;


    //Creamos un constructor con parametro, al crear el objeto debemos dar una variable de tipo int
    public Entero(int valor) { //constructor
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

    @Override
    protected Numero suma(Numero operando) {
       Entero resultado;
       resultado=null;
        //Hay que comprobar que el operando de tipo Numero sea tipo Enmtero
        if (operando instanceof Entero){

            //Como la variable es de tipo Entero, la transformamos en tipo Entero
            Entero op= (Entero) operando;

            int result =getValor() + op.getValor();
            resultado=new Entero(result);

        }else {
            System.out.println("El operando tiene que ser un número entero");
        }
        return resultado;
    }

    @Override
    protected Numero resta(Numero operando) {

        Entero resultado;

        resultado=null;

        if (operando instanceof Entero){
            Entero op= (Entero) operando;

            int result =getValor() - op.getValor();
            resultado=new Entero(result);

        }else {
            System.out.println("El operando tiene que ser un número entero");
        }

        return resultado;
    }

    @Override
    protected Numero producto(Numero operando) {
        Entero resultado;

        resultado=null;

        if (operando instanceof Entero){
            Entero op= (Entero) operando;

            int result =getValor() * op.getValor();
            resultado=new Entero(result);

        }else {
            System.out.println("El operando tiene que ser un número entero");
        }

        return resultado;
    }

    @Override
    protected Numero division(Numero operando) {
        Entero resultado;

        resultado=null;

        if (operando instanceof Entero){
            Entero op= (Entero) operando;

            if (op.getValor()!=0){
                int result =getValor() / op.getValor();
                resultado=new Entero(result);
            }else {
                System.out.println("ERROR:no puedes dividir entre 0");
            }


        }else {
            System.out.println("El operando tiene que ser un número entero");
        }

        return resultado;
    }

    @Override
    protected String mostrar() {
        return ""+valor;
    }
}
