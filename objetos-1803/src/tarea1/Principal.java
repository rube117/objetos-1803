/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea1;

/**
 *
 * @author T-101
 */
public class Principal {

    public static void main(String[] args) {
        // E1
        Threadsito t1 = new Threadsito();
        t1.setName("Pancho");
        Threadsito t2 = new Threadsito();
        t2.setName("Petra");
        Threadsito t3 = new Threadsito();
        t3.setName("Pedro");

        Relojito reloj = new Relojito();

        // E2
        t1.start();
        t2.start();
        t3.start();
        reloj.start();
    }
}
