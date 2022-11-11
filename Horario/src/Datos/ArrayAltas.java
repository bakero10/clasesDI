/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;

import java.util.ArrayList;

/**
 *
 * @author DAM2Alu1
 */
public class ArrayAltas {
    
    ArrayList<Alta> lista;
    
    public ArrayAltas (){                   // CONSTRUCTOR VACIO
        this.lista = new ArrayList();
    }

    public ArrayList<Alta> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Alta> lista) {
        this.lista = lista;
    }

    @Override
    public String toString() {
        return "ListaAltas{" + "lista=" + lista + '}';
    }
    
    
}
