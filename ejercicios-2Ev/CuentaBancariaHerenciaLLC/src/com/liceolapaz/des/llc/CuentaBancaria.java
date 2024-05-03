package com.liceolapaz.des.llc;

public abstract class CuentaBancaria {

    private double saldo;

    public CuentaBancaria() {
    }

    public CuentaBancaria(double saldo) {

        this.saldo = saldo;
    }


    public void ingresarDinero(double cantidad){
        if (cantidad<=0){
            System.out.println("La cantidad sebe ser positiva");
        }else {
            saldo = saldo + cantidad;
        }

    };
    public void retirarDinero(double cantidad){
        if (cantidad<=0){
            System.out.println("La cantidad debe ser psotiva");
        }else {
            saldo = saldo - cantidad;
        }

    };
/**/
    public double getSaldo() {
        return saldo;
    }
}
