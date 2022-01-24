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

        System.out.println("CIF \t NOMBRE \t FECHA_FACTURA \t "
                + "IMPORTE_BRUTO \t FECHA_VENCIMIENTO \t IMPORTE_NETO");

        for (int nCli = 0; nCli < clientes.length; nCli++) {
            Fecha vencimiento = new Fecha(clientes[nCli].getFechaFactura().getDia(),
                    clientes[nCli].getFechaFactura().getMes(), clientes[nCli].getFechaFactura().getAno());

            vencimiento.calcularVencimiento(clientes[nCli].getDiasVencimiento());

            System.out.print(clientes[nCli].getCIF());
            System.out.print("\t" + clientes[nCli].getNombre());
            System.out.print("\t\t" + (clientes[nCli].getFechaFactura()).fechaCompleta());
            System.out.print("\t" + clientes[nCli].getImporte());
            System.out.print("\t" + vencimiento.fechaCompleta());

        }
    }

    /**
     *
     * @param valor Del elemento a buscar
     * @return
     */
    public int busqueda(int valor) {
        int pos = 0;
        boolean encontrado = false;
        while (!encontrado && pos < descuentos.length) {
            if (valor > descuentos[pos].getLimite()) {
                pos++;
            } else {
                encontrado = true;
            }
        }
        if (!encontrado) {
            pos = -1;
        }
        return pos;
    }
}
