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

    public Coche(String Marca, String Modelo, String Matricula) {
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.Matricula = Matricula;
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

    @Override
    public String toString() {
        return "Coche{" + "Marca=" + Marca + ", Modelo=" + Modelo + ", Matricula=" + Matricula + '}';
    }
    
     
}
