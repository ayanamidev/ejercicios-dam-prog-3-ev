package com.liceolapaz.des.llc;

public class Racional extends Numero{
    private int numerador;
    private int denominador;


    public Racional(int numerador,int denominador) {
        this.numerador = numerador;
        this.denominador=denominador;
    }

    public int getNumerador() {
        return numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    @Override
    protected Numero suma(Numero operando) {

        Racional resultado=null;

        if(operando instanceof Racional){
            Racional op=(Racional) operando;
            int numerador= (getNumerador()*op.getDenominador())+(getDenominador()*op.getNumerador());
            int denominador=getDenominador()*op.getDenominador();
            resultado=new Racional(numerador,denominador);
        }else {
            System.out.println("El operando tiene que ser un numero racional");
        }
        return resultado;
    }

    @Override
    protected Numero resta(Numero operando) {

        Racional resultado=null;

        if(operando instanceof Racional){
            Racional op=(Racional) operando;
            int numerador= (getNumerador()*op.getDenominador())-(getDenominador()*op.getNumerador());
            int denominador=getDenominador()*op.getDenominador();
            resultado=new Racional(numerador,denominador);
        }else {
            System.out.println("El operando tiene que ser un numero racional");
        }
        return resultado;
    }

    @Override
    protected Numero producto(Numero operando) {
        Racional resultado=null;

        if(operando instanceof Racional){
            Racional op=(Racional) operando;
            int numerador= getNumerador()*op.getNumerador();
            int denominador=getDenominador()*op.getDenominador();
            resultado=new Racional(numerador,denominador);
        }else {
            System.out.println("El operando tiene que ser un numero racional");
        }
        return resultado;
    }

    @Override
    protected Numero division(Numero operando) {
        Racional resultado=null;

        if(operando instanceof Racional){
            Racional op=(Racional) operando;
            int numerador= getNumerador()*op.getDenominador();
            int denominador=op.getNumerador()*getDenominador();
            resultado=new Racional(numerador,denominador);
        }else {
            System.out.println("El operando tiene que ser un numero racional");
        }
        return resultado;
    }

    @Override
    protected String mostrar() {
        return getNumerador()+"/"+getDenominador();
    }
}
