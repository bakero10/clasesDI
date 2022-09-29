/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;

/**
 *
 * @author DAM2Alu1
 */
public class Persona {
    String Nombre;
    Integer edad;
    String mail;
   
    public Persona(String Nombre, Integer edad, String mail) {
        this.Nombre = Nombre;
        this.edad = edad;
        this.mail = mail;
    }
    
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    
    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer Nombre) {
        this.edad = edad;
    }
    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
}
