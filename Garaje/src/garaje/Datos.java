/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package garaje;

/**
 *
 * @author DAM2Alu1
 */
public class Datos {

    /**
     * @param args the command line arguments
     */
    private String nombre;
    private String apellidos;
    private String telefono;
    private String fecha;
    private String dni;
    private String tipo;
    private String modelo;
    private String matricula;

    public Datos(String nombre, String apellidos, String telefono, String fecha, String dni, String tipo, String modelo, String matricula) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.fecha = fecha;
        this.dni = dni;
        this.tipo = tipo;
        this.modelo = modelo;
        this.matricula = matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Datos{" + "nombre=" + nombre + ", apellidos=" + apellidos + ", telefono=" + telefono + ", fecha=" + fecha + ", dni=" + dni + ", tipo=" + tipo + ", modelo=" + modelo + ", matricula=" + matricula + '}';
    }

    
    

    
    
    
}
