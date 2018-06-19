/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializar;

import java.io.*;

public class PersistenciaUsuario {

    // Primero guardamos
    public static void guardar(Cliente c) throws Exception {
        // Paso 1: Generar el archivo donde se va a guardar
        // nustro serializado
        File file=new File("D:/Java/archivaldo.yomero");
        
        // Paso 2: Es indicar que lo vamos a generar para escribir en el
        FileOutputStream fos=new FileOutputStream(file);
        
        // Paso 3: Escribir un objeto en el
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(c);
        oos.close();
    }
}
