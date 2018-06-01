/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos;

import com.sun.javafx.scene.layout.region.Margins;

/**
 *
 * @author T-101
 */
public class Arreglos1 {

    public static void main(String[] args) {
        int[] valores = {1, -20, 4};

        for (int i = 0; i < valores.length; i++) {
            System.out.println(valores[i]);
        }

        // Este ciclo FOR es el mejorado y se recomienda siempre
        for (int v : valores) {
            System.out.println(v);
        }

        // Segunda forma de inicializar los arreglos
        int otro[] = new int[4];
        for (int valor : otro) {
            System.out.println(valor);
        }

    }
}
