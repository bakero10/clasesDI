/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package garaje;

/**
 *
 * @author DAM2Alu1
 */
public class DatosCamion {
    
    private String longitud;
    private String mercancia;

    public DatosCamion(String longitud, String mercancia) {
        this.longitud = longitud;
        this.mercancia = mercancia;
    }

    public String getLongitud() {
        return longitud;
    }

    public void setLongitud(String longitud) {
        this.longitud = longitud;
    }

    public String getMercancia() {
        return mercancia;
    }

    public void setMercancia(String mercancia) {
        this.mercancia = mercancia;
    }

    @Override
    public String toString() {
        return "DatosCamion{" + "longitud=" + longitud + ", mercancia=" + mercancia + '}';
    }
    
    
}
