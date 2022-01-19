/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej_arrays_5;

import fechas.Fecha;
import numeros.Numero;
import textos.Texto;

/**
 *
 * @author dam
 */
public class Empresa {

    Cliente[] clientes;
    Descuento[] descuentos;

    public Empresa(int nClientes) {
        clientes = new Cliente[nClientes];
        descuentos = new Descuento[]{
            new Descuento(30, 0.1f),
            new Descuento(90, 0.07f),
            new Descuento(120, 0.05f),
            new Descuento(180, 0.02f),
            new Descuento(Integer.MAX_VALUE, 0f)};
    }

    public void pedirClientes() {
        String nombre, cif;
        int dven;
        Fecha fecha;
        float importe;

        for (int nCliente = 0; nCliente < clientes.length; nCliente++) {
            cif = Texto.pedirString("introduce el cif");
            nombre = Texto.pedirString("introduce el nombre");
            dven = Numero.pedirNumero("introduce el numero de dias de vencimiento", 0);
            fecha = Texto.pedirFecha("introduce la fecha");
            importe = Numero.pedirNumeroReal("introduce el importe", 0);

            clientes[nCliente] = new Cliente(cif, nombre, fecha, dven, importe);
        }
    }

    public void informe() {
        Fecha FHoy = new Fecha();

        System.out.println("\t\t\t\t informe de facturas");

        System.out.println("fecha:" + FHoy.fechaCompletaLetra());

        System.out.println("CIF \t NOMBRE \t FECHA FACTURA\t IMPORTE BRUTO \t FECHA VENCIMIENTO\t IMPORTE NETO");

        for (int ncli = 0; ncli < clientes.length; ncli++) {
            Fecha vencimiento = new Fecha(
                    clientes[ncli].getFechaFactura().getDia(),
                    clientes[ncli].getFechaFactura().getMes(),
                    clientes[ncli].getFechaFactura().getAno());
            
            vencimiento.calcularVencimiento(clientes[ncli].getDiasDeVencimiento());
            
            System.out.println(clientes[ncli].getCIF());
            System.out.println("\t" + clientes[ncli].getNombre());
            System.out.println("\t" + clientes[ncli].getFechaFactura());

        }
    }
}
