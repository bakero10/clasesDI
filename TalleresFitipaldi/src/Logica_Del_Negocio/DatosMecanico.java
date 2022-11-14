/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica_Del_Negocio;

/**
 *
 * @author Bakero
 */
public class DatosMecanico {
    
    private String usuario;
    private String contraseña;

    public DatosMecanico(String usuario, String contraseña) {
        this.usuario = usuario;
        this.contraseña = contraseña;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    @Override
    public String toString() {
        return "Mecanico{" + "usuario=" + usuario + ", contrase\u00f1a=" + contraseña + '}';
    }
    
    
}
