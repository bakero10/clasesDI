/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;

/**
 *
 * @author DAM2Alu1
 */
public class Alta {
    private String dia;
    private String hora;
    private String modulo;
    private String fechaAlta;
    private String horaAlta;

    public Alta(String dia, String hora, String modulo, String fechaAlta, String horaAlta) {
        this.dia = dia;
        this.hora = hora;
        this.modulo = modulo;
        this.fechaAlta = fechaAlta;
        this.horaAlta = horaAlta;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getModulo() {
        return modulo;
    }

    public void setModulo(String modulo) {
        this.modulo = modulo;
    }

    public String getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(String fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public String getHoraAlta() {
        return horaAlta;
    }

    public void setHoraAlta(String horaAlta) {
        this.horaAlta = horaAlta;
    }

    @Override
    public String toString() {
        return "Alta{" + "dia=" + dia + ", hora=" + hora + ", modulo=" + modulo + ", fechaAlta=" + fechaAlta + ", horaAlta=" + horaAlta + '}';
    }
    
    
}
