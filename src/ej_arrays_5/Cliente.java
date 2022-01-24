/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej_arrays_5;

import fechas.Fecha;

/**
 *
 * @author dam
 */
public class Cliente {

    private String CIF;
    private String nombre;
    private Fecha fechaFactura;
    private int DiasDeVencimiento;
    private float importe;

    public Cliente() {
    }

    public Cliente(String CIF, String nombre, Fecha fechaFactura, int DiasDeVencimiento, float importe) {
        this.CIF = CIF;
        this.nombre = nombre;
        this.fechaFactura = fechaFactura;
        this.DiasDeVencimiento = DiasDeVencimiento;
        this.importe = importe;
    }

    public String getCIF() {
        return CIF;
    }

    public String getNombre() {
        return nombre;
    }

    public Fecha getFechaFactura() {
        return fechaFactura;
    }

    public int getDiasVencimiento() {
        return DiasDeVencimiento;
    }

    public float getImporte() {
        return importe;
    }
    
    public void grabar(String CIF, String nombre, Fecha fechaFactura, int DiasDeVencimiento, float importe) {
        this.CIF = CIF;
        this.nombre = nombre;
        this.fechaFactura = fechaFactura;
        this.DiasDeVencimiento = DiasDeVencimiento;
        this.importe = importe;
    }

}
