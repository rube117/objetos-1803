/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ete;

/**
 *
 * @author T-101
 */
public class Cliente {

    private String nombre;
    private Tarjeta tarjetas;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Tarjeta getTarjetas() {
        return tarjetas;
    }

    public void setTarjetas(Tarjeta tarjetas) {
        this.tarjetas = tarjetas;
    }

    public Cliente(String nombre, Tarjeta tarjetas) {
        this.nombre = nombre;
        this.tarjetas = tarjetas;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", tarjetas=" + tarjetas + '}';
    }

}
