package com.liceolapaz.des.llc;

public abstract class Moneda {
   protected double cantidad;

   public Moneda(double cantidad) {
      this.cantidad = cantidad;
   }

   public double getCantidad() {
      return cantidad;

   }

   public void setCantidad(double cantidad) {
      this.cantidad = cantidad;
   }

   protected abstract Moneda cantidadEnEuros();



}
