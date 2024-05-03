package com.liceolapaz.des.llc;

public class Libra extends Moneda{
    public Libra(double cantidad) {
        super(cantidad);
    }


    @Override
    protected Moneda cantidadEnEuros() {
        Libra resultado=null;
        double conversion=getCantidad()* 1.1029861;
         resultado=new Libra(conversion);
         return resultado;

    }
}
