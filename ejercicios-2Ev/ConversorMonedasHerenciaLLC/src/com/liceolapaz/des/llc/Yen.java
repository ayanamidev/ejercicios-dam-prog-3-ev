package com.liceolapaz.des.llc;

public class Yen extends Moneda{
    public Yen(double cantidad) {
        super(cantidad);
    }

    @Override
    protected Moneda cantidadEnEuros() {
        Dolar resultado=null;
        double conversion=getCantidad()*0.00779327499;
        resultado=new Dolar(conversion);
        return resultado;
    }
}
