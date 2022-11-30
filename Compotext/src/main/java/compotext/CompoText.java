/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package compotext;

import java.awt.Color;
import java.io.Serializable;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 *
 * @author DAM2Alu1
 */
public class CompoText extends JTextField implements Serializable{  //hace falta saber a que queremos extenderlo y implementar Serializable
    //ATRIBUTOS                                                     
    Color colorFondo;
    Color colorDefecto;
    int numCaracteres;
    
    //CONSTRUCTOR  CON ALT+SHIFT+F SE ORGANIZA
    public CompoText() {
        super();        //LLAMAMOS AL PADRE QUE EN ESTE CASO ES JTEXTFIELD
        colorDefecto = getBackground();
        super.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                analizaContenido();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                analizaContenido();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                analizaContenido();
            }

            private void analizaContenido() {
                if (getText().length() >= numCaracteres) {
                    setBackground(colorFondo);
                } else {
                    setBackground(colorDefecto);
                }
            }
        });

    }
    
    //GENERAMOS LOS GETTERS Y SETTERS
    public Color getColorFondo() {
        return colorFondo;
    }

    public void setColorFondo(Color colorFondo) {
        this.colorFondo = colorFondo;
    }

    public int getNumCaracteres() {
        return numCaracteres;
    }

    public void setNumCaracteres(int numCaracteres) {
        this.numCaracteres = numCaracteres;
    }
    
    
}
