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
public class Imc {
    private Usuario usuario;
    public float CalculoIMC()
    {
        // Aquí se puede calcular el IMC
        return (float)(usuario.getPeso()/(usuario.getAltura()*usuario.getAltura()));
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
}
