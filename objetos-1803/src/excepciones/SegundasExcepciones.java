/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;

/**
 *
 * @author T-101
 */
public class SegundasExcepciones {

    public static void main(String[] args) {

        int a = 2;
        int b = 2;
        int arreglo[]={1,2};
        try
        {
        String numeroMalo = "4";
        int numeroBueno = Integer.parseInt(numeroMalo);

        System.out.println(a / b);
        System.out.println(numeroBueno * 2);
            System.out.println(arreglo[0]);
        }catch(NumberFormatException e)
        {
            System.out.println("¿podrías meter un número válido?");
        }catch(ArithmeticException e)
        {
            System.out.println("No se aceptan divisiones por cero");
        }catch(Exception e)
        {
            System.out.println("Este índice no existe "+e.getMessage());
        }

    }
}
