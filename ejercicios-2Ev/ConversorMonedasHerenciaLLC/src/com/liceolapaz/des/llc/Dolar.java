package com.liceolapaz.des.llc;

public class Dolar extends Moneda{

    public Dolar(double cantidad) {
        super(cantidad);
    }


    @Override
    protected Moneda cantidadEnEuros() {
        Dolar resultado=null;
        double conversion=getCantidad()*0.883509299;
         resultado=new Dolar(conversion);
         return resultado;
    }
}
