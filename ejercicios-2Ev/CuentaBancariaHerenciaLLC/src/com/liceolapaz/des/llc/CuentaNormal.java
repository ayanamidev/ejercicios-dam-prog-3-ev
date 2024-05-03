package com.liceolapaz.des.llc;

public class CuentaNormal extends CuentaBancaria{
    public CuentaNormal() {
    }

    public CuentaNormal(double saldo) {
        super(saldo);
    }

/*
    @Override
    public void ingresarDinero(double cantidad) {
        super.ingresarDinero(cantidad); //llamamos al metodo del padre, pero esto seria sobreescribirlo

    } */

    @Override
    public void retirarDinero(double cantidad) {
       if (getSaldo() < cantidad){
           System.out.println("No tienes suficiente saldo.");
       }else {
           super.retirarDinero(cantidad);
       }


    }

    /*
    @Override
    public double consultarSaldo() {
        return super.consultarSaldo();
    }

     */
}
