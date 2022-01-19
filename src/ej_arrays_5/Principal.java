/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej_arrays_5;

import numeros.Numero;

/**
 *
 * @author dam
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nClientes;
        
        nClientes = Numero.pedirNumero("introduce el numero de clientes", 1);
        
        Empresa miEmpresa = new Empresa(nClientes);
        
        miEmpresa.pedirClientes();
        
        miEmpresa.informe();
    }
    
}
