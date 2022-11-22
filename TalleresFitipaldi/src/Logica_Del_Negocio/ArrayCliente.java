/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica_Del_Negocio;

import java.util.ArrayList;

/**
 *
 * @author Bakero
 */
public class ArrayCliente {
   
    ArrayList<Cliente> lista;
    
    public ArrayCliente (){                   // CONSTRUCTOR VACIO
        this.lista = new ArrayList();
    }
    
    public ArrayList<Cliente> getLista() {
        return lista;
    }
    
    public void setLista(ArrayList<Cliente> lista) {
        this.lista = lista;
    }

    @Override
    public String toString() {
        return "ArrayCliente{" + "lista=" + lista + '}';
    }
    
    
}
