/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;

/**
 *
 * @author T-101
 */
public class EmpresaX {

    public static void main(String[] args) {
        Planta p1 = new Planta();
        Planta p2 = new Planta();

        Honorarios h1 = new Honorarios();
        Honorarios h2 = new Honorarios();
        Honorarios h3 = new Honorarios();

        Proyecto pro1 = new Proyecto();

        Trabajador[] trabajadores = {p1, p2, h1, h2, h3, pro1,new Proyecto()};

        for (Trabajador t : trabajadores) {
            t.pagar();
        }

    }
}
