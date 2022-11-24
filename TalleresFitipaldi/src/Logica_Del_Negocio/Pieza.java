/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica_Del_Negocio;

/**
 *
 * @author DAM2Alu1
 */
public class Pieza {
    
    private String pieza;

    public Pieza(String pieza) {
        this.pieza = pieza;
    }

    public String getPieza() {
        return pieza;
    }

    public void setPieza(String pieza) {
        this.pieza = pieza;
    }

    @Override
    public String toString() {
        return "Pieza{" + "pieza=" + pieza + '}';
    }
    
    
}
