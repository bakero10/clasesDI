/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package horario;

import Datos.Alta;
import Datos.ArrayAltas;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.StyledEditorKit;

/**
 *
 * @author DAM2Alu1
 */
public class JDialogListado extends javax.swing.JDialog {

    /**
     * Creates new form JDialogListado
     */
    DefaultTableModel dtm;
    Alta alta;
    JFramePrincipal padre;

    String[] cabecera = {"Día", "Hora", "Modulo", "Fecha Alta", "Hora Alta"};
    ArrayList<Alta> listaAltas;

    public JDialogListado(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        padre = (JFramePrincipal) parent;
        listaAltas = padre.listaAltas;
        this.setTitle("LISTADO LOG");
        dtm = new DefaultTableModel(cabecera, 0);
        this.setModal(false);

        // METODO PARA DECIRLE QUE LAS CELDAS DE LA TABLA NO SEAN EDITABLES
        dtm = new DefaultTableModel(cabecera, 0) {
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return false;
            }
        };

        // INTRODUCCION DE DATOS EN LA TABLA 
        for (Alta ob1 : listaAltas) {
            String dato1 = ob1.getDia();
            String dato2 = ob1.getHora();
            String dato3 = ob1.getModulo();
            String dato4 = ob1.getFechaAlta();
            String dato5 = ob1.getHoraAlta();
            String[] datos = {dato1, dato2, dato3, dato4, dato5};
            dtm.addRow(datos);

        }
        jTable1.setModel(dtm);  //INTRODUCIMOS EL DTM EN LA TABLA

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jScrollPane1.setBorder(null);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        String[] datos;
        if (evt.getClickCount() == 2) {
            if (JOptionPane.showConfirmDialog(null, "¿Desea borrar el registro?", "Confirmacion", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE) == 0) {
                int filaSeleccionada = jTable1.rowAtPoint(evt.getPoint());
                padre.listaAltas.remove(filaSeleccionada);
                dtm.removeRow(filaSeleccionada);
//               for (Alta listaAlta : listaAltas) {
//                   System.out.println(listaAlta);
//               }
                padre.elminiarTexto();
                padre.pasarListaAbotones();
            }
        }
    }//GEN-LAST:event_jTable1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
