/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imc;

/**
 *
 * @author ruben
 */
public class Usuario {

    // Entrada de valores Peso y Altura
    private float peso;
    private float altura;
    private String Nombre;

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    // Probando 1
    public Usuario() {

    }

    // Probando 2
    public Usuario(float peso) {
        this.peso = peso;
    }

    public Usuario(float peso, float altura) {
        this.peso = peso;
        this.altura = altura;
    }

    public Usuario(float altura, String Nombre) {
        this.altura = altura;
        this.Nombre = Nombre;
    }

    public Usuario(String Nombre, float altura) {
        this.altura = altura;
        this.Nombre = Nombre;
    }

    @Override
    public String toString() {
        return "Usuario{" + "peso=" + peso + ", altura=" + altura + ", Nombre=" + Nombre + '}';
    }
}
