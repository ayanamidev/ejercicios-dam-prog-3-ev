package com.liceolapaz.des.llc;

import com.liceolapaz.des.llc.Numero;

public class Complejo extends Numero {

    private int real;
    private int imaginaria;

    public Complejo(int real,int imaginaria) {
        this.real = real;
        this.imaginaria=imaginaria;
    }
    

    public int getReal() {
        return real;
    }

    public void setReal(int real) {
        this.real = real;
    }

    public int getImaginaria() {
        return imaginaria;
    }

    public void setImaginaria(int imaginaria) {
        this.imaginaria = imaginaria;
    }

    @Override
    protected Numero suma(Numero operando) {
        Complejo resultado=null;
        if (operando instanceof Complejo){
            Complejo op=(Complejo) operando;
            int a=getReal();
            int ai=getImaginaria();
            int b=op.getReal();
            int bi=op.getImaginaria();
            int real=a+b;
            int imaginaria=ai+bi;
            resultado=new Complejo(real,imaginaria);
        }
        return null;
    }

    @Override
    protected Numero resta(Numero operando) {
        Complejo resultado=null;
        if (operando instanceof Complejo){
            Complejo op=(Complejo) operando;
            int a=getReal();
            int ai=getImaginaria();
            int b=op.getReal();
            int bi=op.getImaginaria();
            int real=a-b;
            int imaginaria=ai-bi;
            resultado=new Complejo(real,imaginaria);

        }
        return null;
    }

    @Override
    protected Numero producto(Numero operando) {
        Complejo resultado=null;
        if (operando instanceof Complejo){
            Complejo op=(Complejo) operando;
            int a=getReal();
            int ai=getImaginaria();
            int b=op.getReal();
            int bi=op.getImaginaria();
            int real=(a*b)-(ai*bi);
            int imaginaria=(a*bi)+(b*ai);
            resultado=new Complejo(real,imaginaria);

        }
        return null;
    }

    @Override
    protected Numero division(Numero operando) {
        Complejo resultado=null;
        if (operando instanceof Complejo){
            Complejo op=(Complejo) operando;
            int a=getReal();
            int ai=getImaginaria();
            int b=op.getReal();
            int bi=op.getImaginaria();
            int real=((a*b)+(ai+bi))/(b*b)+(bi*bi);
            int imaginaria=((ai*b)-(a*bi))/(b*b)+(bi*bi);
            resultado=new Complejo(real,imaginaria);

        }
        return null;
    }

    @Override
    protected String mostrar() {
        return null;
    }
}
