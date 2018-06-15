/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericos;

import java.util.ArrayList;

/**
 *
 * @author T-101
 */
public class GeneradorCuestionario {

    private Cuestionario cuestionario;

    public GeneradorCuestionario() {
        cuestionario = new Cuestionario();

        // Generamos las opciones
        Opcion o11 = new Opcion();
        o11.setTitulo("Mizcalco");
        o11.setCorrecta(false);

        Opcion o21 = new Opcion();
        o21.setTitulo("Texcoco");
        o21.setCorrecta(false);

        Opcion o31 = new Opcion();
        o31.setTitulo("Madrid");
        o31.setCorrecta(true);

        Opcion o41 = new Opcion();
        o41.setTitulo("Ecatepec");
        o41.setCorrecta(false);

        // Ejercicio Opciones
        Opcion o12 = new Opcion();
        o12.setTitulo("2 lados");
        o12.setCorrecta(false);

        Opcion o22 = new Opcion();
        o22.setTitulo("6 lados");
        o22.setCorrecta(true);

        Opcion o32 = new Opcion();
        o32.setTitulo("4 lados");
        o32.setCorrecta(false);

        Opcion o42 = new Opcion();
        o42.setTitulo("8 lados");
        o42.setCorrecta(false);

        // Sigue la pregunta.
        Pregunta p11 = new Pregunta();
        p11.setTitulo("¿Cuál es la capital de España?");
        // Antes generamos el ArrayList con las opciones de arriba.
        ArrayList<Opcion> opcionesp11 = new ArrayList<>();
        opcionesp11.add(o11);
        opcionesp11.add(o21);
        opcionesp11.add(o31);
        opcionesp11.add(o41);

        // Ejercicio Pregunta
        Pregunta p12 = new Pregunta();
        p12.setTitulo("¿Cuántos lados tiene un cubo?");
        // Antes generamos el ArrayList con las opciones de arriba.
        ArrayList<Opcion> opcionesp12 = new ArrayList<>();
        opcionesp12.add(o12);
        opcionesp12.add(o22);
        opcionesp12.add(o32);
        opcionesp12.add(o42);

        // Ahora si este ArrayList lo agregamos a la primer pregunta
        p11.setOpciones(opcionesp11);
        p12.setOpciones(opcionesp12);

        // El cuestionario
        
        ArrayList<Pregunta> preguntas = new ArrayList<>();
        preguntas.add(p11);
        preguntas.add(p12);
        cuestionario.setPreguntas(preguntas);

    }

    public Cuestionario getCuestionario() {
        return cuestionario;
    }

    public void setCuestionario(Cuestionario cuestionario) {
        this.cuestionario = cuestionario;
    }

}
