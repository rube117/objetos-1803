/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ete;

import java.util.ArrayList;

/**
 *
 * @author T-101
 */
public class GeneradorTarjetas {

    private ArrayList<Cliente> clientes;

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public GeneradorTarjetas() {
        clientes = new ArrayList<>();

        Tarjeta tr1 = new Tarjeta(1234, "Banamex", 32000);
        Tarjeta tr2 = new Tarjeta(5678, "HSBC", 17500);
        Tarjeta tr3 = new Tarjeta(8765, "Scotia", 19600);
        Tarjeta tr4 = new Tarjeta(4321, "Bancomer", 48000);

        Cliente c1 = new Cliente("Juan", tr1);
        Cliente c2 = new Cliente("Ana", tr2);
        Cliente c3 = new Cliente("Pedro", tr3);
        Cliente c4 = new Cliente("Irma", tr4);

        clientes.add(c1);
        clientes.add(c2);
        clientes.add(c3);
        clientes.add(c4);

    }

}
