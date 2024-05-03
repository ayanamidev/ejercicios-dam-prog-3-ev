package com.liceolapaz.des.llc;

public abstract class Numero {

    // Esto seria un interfaz pero hicimos clase abstracta porque lo dijo jesus

    //Todos los metodos de la clase abstracta tienen un parametro de tipo Numero, porque es la clase de donde surgen las clases hijas racional y entero, asi que cualquiera variable de tipo racional o entero nos valdria porque las 2 exttienden de la clase numero
    protected abstract Numero suma(Numero operando);
    protected abstract Numero resta(Numero operando);
    protected  abstract Numero producto(Numero operando);
    protected abstract Numero division(Numero operando);
    protected abstract String mostrar();
}