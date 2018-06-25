/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entregable5arreglos;

/**
 *
 * @author ruben
 */
public class Mostrar {
    public static void main(String[] args) {
        Arreglos a=new Arreglos();
        a.nombre[0]="Rubén";
        a.nombre[1]="Iván";
        a.nombre[2]="Juan";
        a.nombre[3]="Diego";
        a.nombre[4]="Carlos";
        
        a.edad[0]=20;
        a.edad[1]=21;
        a.edad[2]=23;
        a.edad[3]=15;
        a.edad[4]=24;
        
        for(int v=0;v<5;v++)
        {
            System.out.println("Nombre: "+a.nombre[v]+" Edad: "+a.edad[v]+"\n");
        }
    }
}
