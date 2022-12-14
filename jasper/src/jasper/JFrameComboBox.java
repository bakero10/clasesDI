/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package jasper;

import bbdd.ConexionBBDD;
import java.util.HashMap;
import java.util.Map;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author DAM2Alu1
 */
public class JFrameComboBox extends javax.swing.JFrame {

    /**
     * Creates new form JFrameComboBox
     */
    DefaultComboBoxModel dcbm;
    ConexionBBDD conexion;
    public JFrameComboBox() {
        initComponents();
        dcbm = new DefaultComboBoxModel();
        conexion = new ConexionBBDD("192.168.101.112", "3306", "world","root", "root");
        String sql = "SELECT Name FROM country";
        conexion.selectSQL(sql, dcbm);
        jComboBoxPaises.setModel(dcbm);
        conexion.cerrar();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBoxPaises = new javax.swing.JComboBox<>();
        jButtonImprimir = new javax.swing.JButton();
        jButtonImprimirCiudad = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jComboBoxPaises.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButtonImprimir.setText("Imprimir Pais");
        jButtonImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonImprimirActionPerformed(evt);
            }
        });

        jButtonImprimirCiudad.setText("Imprimir Ciudades");
        jButtonImprimirCiudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonImprimirCiudadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jComboBoxPaises, 0, 203, Short.MAX_VALUE)
                    .addComponent(jButtonImprimir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonImprimirCiudad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(129, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(jComboBoxPaises, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonImprimir)
                .addGap(18, 18, 18)
                .addComponent(jButtonImprimirCiudad)
                .addContainerGap(82, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonImprimirActionPerformed
        // TODO add your handling code here:
         try{
            String fileJasper = "informes/pais.jasper";
            Map parameters = new HashMap();
            parameters.put("PAIS",jComboBoxPaises.getSelectedItem());
            conexion = new ConexionBBDD("192.168.101.112", "3306", "world","root", "root");
            JasperPrint print = 
            JasperFillManager.fillReport(fileJasper,parameters,conexion.getConnection());
            JasperViewer jviewer = new JasperViewer(print,false);
            jviewer.setVisible(true);       
            conexion.cerrar();
        }catch(Exception ex){
             ex.printStackTrace();
            JOptionPane.showMessageDialog(null,"Se produjo un error al leer el archivo .jasper");
        } 

    }//GEN-LAST:event_jButtonImprimirActionPerformed

    private void jButtonImprimirCiudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonImprimirCiudadActionPerformed
        // TODO add your handling code here:
         try{
            String fileJasper = "informes/CiudadesPais.jasper";
            Map parameters = new HashMap();
            parameters.put("PAIS",jComboBoxPaises.getSelectedItem());
            conexion = new ConexionBBDD("192.168.101.112", "3306", "world","root", "root");
            JasperPrint print = 
            JasperFillManager.fillReport(fileJasper,parameters,conexion.getConnection());
            JasperViewer jviewer = new JasperViewer(print,false);
            jviewer.setVisible(true);       
            conexion.cerrar();
        }catch(Exception ex){
             ex.printStackTrace();
            JOptionPane.showMessageDialog(null,"Se produjo un error al leer el archivo .jasper");
        }
    }//GEN-LAST:event_jButtonImprimirCiudadActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFrameComboBox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameComboBox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameComboBox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameComboBox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameComboBox().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonImprimir;
    private javax.swing.JButton jButtonImprimirCiudad;
    private javax.swing.JComboBox<String> jComboBoxPaises;
    // End of variables declaration//GEN-END:variables
}
