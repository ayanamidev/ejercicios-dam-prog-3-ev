package com.liceolapaz.des.llc;

import java.util.Date;

public class Empleado {

    private String dni;
    private  String nombre;
    private String apellido1;
    private String apellido2;
    private Date fecha;
    private double salario;
    private int departamento;
    private String dniJefe;

    public Empleado(String dni, String nombre, String apellido1, String apellido2, Date fecha, double salario, int departamento, String dniJefe) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.fecha = fecha;
        this.salario = salario;
        this.departamento = departamento;
        this.dniJefe = dniJefe;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

