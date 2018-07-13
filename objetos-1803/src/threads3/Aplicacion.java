/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threads3;

import java.time.LocalTime;

/**
 *
 * @author T-101
 */
public class Aplicacion {

    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            public void run() {
                while (true) {
                    LocalTime tiempo = LocalTime.now();
                    int hora = tiempo.getHour();
                    int minuto = tiempo.getMinute();
                    int segundo = tiempo.getSecond();
                    System.out.println("La hora es: " + hora + ":" + minuto + ":" + segundo);
                    try {
                        // E4
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {

                    }

                }
            }
        });
        t1.start();

    }
}
