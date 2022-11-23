/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica_Del_Negocio;

/**
 *
 * @author Bakero
 */
public class Coche {
    private String Marca;
    private String Modelo;
    private String Matricula;
    private String Mecanico;

    public Coche(String Marca, String Modelo, String Matricula, String Mecanico) {
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.Matricula = Matricula;
        this.Mecanico = Mecanico;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public String getMatricula() {
        return Matricula;
    }

    public void setMatricula(String Matricula) {
        this.Matricula = Matricula;
    }

    public String getMecanico() {
        return Mecanico;
    }

    public void setMecanico(String Mecanico) {
        this.Mecanico = Mecanico;
    }

    @Override
    public String toString() {
        return "Coche{" + "Marca=" + Marca + ", Modelo=" + Modelo + ", Matricula=" + Matricula + ", Mecanico=" + Mecanico + '}';
    }
    
    
    
    
     
}
