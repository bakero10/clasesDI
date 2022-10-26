/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conversor;

/**
 *
 * @author DAM2Alu1
 */
public class Divisa {
    private double cantidad;
    private String nombre;

    public Divisa(double cantidad, String nombre) {
        this.cantidad = cantidad;
        this.nombre = nombre;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Divisa{" + "cantidad=" + cantidad + ", nombre=" + nombre + '}';
    }
    
    
}
