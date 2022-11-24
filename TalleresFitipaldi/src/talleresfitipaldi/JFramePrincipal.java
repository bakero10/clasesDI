/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

package talleresfitipaldi;

import Logica_Del_Negocio.ArrayCliente;
import Logica_Del_Negocio.Cliente;
import Logica_Del_Negocio.Coche;
import Logica_Del_Negocio.Mecanico;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.UIManager;

/**
 *
 * @author Bakero
 */ 
public class JFramePrincipal extends javax.swing.JFrame {

    /** Creates new form JFramePrincipal */
     JDialogClientes jdialogclientes;
     JDialogVehiculos jDialogVehiculos;
     JDialogReparaciones jdialogReparaciones;
     
     ArrayList<Mecanico> listaMecanicos = new ArrayList<>();
     ArrayList<Cliente> lista;
     ArrayList<Coche> listaCoche;
     ArrayList<String> listaPiezas;
     boolean aplicacionIniciada = false;
     
    public ArrayList<Cliente> ArrayPapa = new ArrayCliente().getLista();
    public JFramePrincipal() {
        initComponents();
        
        Mecanico mecanico2 = new Mecanico ("Juan","juan");
        Mecanico mecanico3 = new Mecanico ("Pepe","pepe");
        Mecanico mecanico4 = new Mecanico("Admin","Bakero");
        
        listaMecanicos.add(mecanico2);
        listaMecanicos.add(mecanico3);
        listaMecanicos.add(mecanico4);
        
        
        
        this.setTitle("Talleres Fitipaldi");
        lista = new ArrayList();
        listaCoche = new ArrayList();
        listaPiezas = new ArrayList<>();
        
        Cliente c = new Cliente("Pepito", "Palotes", "18053624G", "654985655", "Opel", "Vivaro", "7965kij","Juan");
        Cliente c1 = new Cliente("Pablo", "Pellote", "18049865H", "654552655", "Renaul", "Primastar", "2640fyr","Pepe");
        Cliente c2 = new Cliente("Julieta", "Labordeta", "18046857P", "654562435", "Fiat", "Panda", "2568res","Juan");
        lista.add(c);
        lista.add(c1);
        lista.add(c2);
        
        //RELLENAMOS LISTA PARA COMBOBOX ALMACEN
        
        String [] piezas = {"Retrovisor","Luna","turbo","rueda","filtro","Tubo de escape","Limpiaparabrisas","Intermitentes","Frenos","Parachoques"};
        for (String pieza : piezas) {
            listaPiezas.add(pieza);
        }
        
        
        for (Cliente cliente : lista) {
            Coche coche = new Coche(cliente.getMarca(),cliente.getModelo(),cliente.getMatricula(),cliente.getMecanico());
            listaCoche.add(coche);
        }
         if(!aplicacionIniciada){
            this.dispose();
            JDialogPantallaInicio jDialogPantallaInicio = new JDialogPantallaInicio(this, true);
            jDialogPantallaInicio.setVisible(true);
        }
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButtonNocturno = new javax.swing.JButton();
        jButtonClientes = new javax.swing.JButton();
        jButtonReparaciones = new javax.swing.JButton();
        jButtonVehiculos = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setPreferredSize(new java.awt.Dimension(600, 400));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonNocturno.setText("Nocturno");
        jPanel1.add(jButtonNocturno, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, 160, 50));

        jButtonClientes.setText("Clientes");
        jButtonClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClientesActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 130, 50));

        jButtonReparaciones.setText("Reparaciones");
        jButtonReparaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonReparacionesActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonReparaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 280, 130, 50));

        jButtonVehiculos.setText("Vehiculos");
        jButtonVehiculos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVehiculosActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonVehiculos, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 280, 130, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/67233-mecanica.jpg"))); // NOI18N
        jLabel1.setPreferredSize(new java.awt.Dimension(600, 400));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 400));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClientesActionPerformed
        // TODO add your handling code here:
        
        jdialogclientes = new JDialogClientes(this, true);
        jdialogclientes.show();
       
    }//GEN-LAST:event_jButtonClientesActionPerformed

    private void jButtonVehiculosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVehiculosActionPerformed
        // TODO add your handling code here:
        jDialogVehiculos = new JDialogVehiculos(this, true);
        jDialogVehiculos.show();
        
        
    }//GEN-LAST:event_jButtonVehiculosActionPerformed

    private void jButtonReparacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonReparacionesActionPerformed
        // TODO add your handling code here:
        jdialogReparaciones = new JDialogReparaciones(this, true);
        jdialogReparaciones.show();
    }//GEN-LAST:event_jButtonReparacionesActionPerformed

    /**
     * @param args the command line arguments
     */
    public Image getIconImage() {
   Image retValue = Toolkit.getDefaultToolkit().
         getImage(ClassLoader.getSystemResource("Imagen/mecanico.png"));
   return retValue;
}
    
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
           UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFramePrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonClientes;
    private javax.swing.JButton jButtonNocturno;
    private javax.swing.JButton jButtonReparaciones;
    private javax.swing.JButton jButtonVehiculos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

}
