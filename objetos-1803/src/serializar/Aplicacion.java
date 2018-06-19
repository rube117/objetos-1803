/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializar;

/**
 *
 * @author T-101
 */
public class Aplicacion {
    public static void main(String[] args) throws Exception {
        // Pues a usar noestro modelo
        Cliente c=new Cliente();
        c.setEdad(20);
        c.setNombre("Rubén");
        c.setSueldo(7500);
        
        PersistenciaUsuario.guardar(c);
        System.out.println("Guardado con éxito!!");
    }
}
