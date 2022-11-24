/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package talleresfitipaldi;

import Logica_Del_Negocio.Coche;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Bakero
 */
public class JDialogReparaciones extends javax.swing.JDialog {

    /**
     * Creates new form JDialogReparaciones
     */
    JFramePrincipal padre;
    JDialogAlmacen jDialogAlmacen;
    
    DefaultTableModel dtmTodos;
    DefaultTableModel dtmJuan;
    DefaultTableModel dtmPepe;
    
    String cabecera [] = {"Coche","Mecanico"};
    
    public JDialogReparaciones(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        padre = (JFramePrincipal)parent;
        this.setTitle("Gestión de Reparaciones");
        
        
        //INTRODUCIMOS LAS CABECERAS DE LAS TABLAS//
        dtmTodos = new DefaultTableModel(cabecera,0); //METEMOS EN EL JFRAME LA TABLA INGRESOS CON....(EL STRING DE LA CABECERA Y CON 0 FILAS POR DEFECTO)
        dtmJuan = new DefaultTableModel(cabecera,0);
        dtmPepe = new DefaultTableModel(cabecera,0);
       insertarDatos();
        //PONEMOS LA VENTANA QUE QUEREMOS MOSTRAR CUANDO ARRANQUEMOS EL PROGRAMA
        jTable1.setModel(dtmTodos);
        //PONEMOS EL RADIOBUTTON VER TODO POR DEFECTO
        jRadioButtonGeneral.setSelected(true);
    }
    
     //METODO INSERTAR DATOS EN TABLAS
    public void insertarDatos(){
        for (Coche coche : padre.listaCoche) {
            String datos []={coche.getMarca()+" - " + coche.getModelo()+" - " + coche.getMatricula(),coche.getMecanico()};
            dtmTodos.addRow(datos);
            if(coche.getMecanico().equals("Juan")){
                String datos2 []={coche.getMarca()+" - " + coche.getModelo()+" - " + coche.getMatricula(),coche.getMecanico()};
            dtmJuan.addRow(datos);
            }
            if(coche.getMecanico().equals("Pepe")){
                String datos3 []={coche.getMarca()+" - " + coche.getModelo()+" - " + coche.getMatricula(),coche.getMecanico()};
            dtmPepe.addRow(datos);
            }
        }
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroupReparaciones = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldEstado = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButtonAlmacen = new javax.swing.JButton();
        jRadioButtonJuan = new javax.swing.JRadioButton();
        jRadioButtonGeneral = new javax.swing.JRadioButton();
        jRadioButtonPepe = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Estado");

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
        jScrollPane1.setViewportView(jTable1);

        jButtonAlmacen.setText("Almacen");
        jButtonAlmacen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlmacenActionPerformed(evt);
            }
        });

        buttonGroupReparaciones.add(jRadioButtonJuan);
        jRadioButtonJuan.setText("Juan");
        jRadioButtonJuan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonJuanActionPerformed(evt);
            }
        });

        buttonGroupReparaciones.add(jRadioButtonGeneral);
        jRadioButtonGeneral.setText("General");
        jRadioButtonGeneral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonGeneralActionPerformed(evt);
            }
        });

        buttonGroupReparaciones.add(jRadioButtonPepe);
        jRadioButtonPepe.setText("Pepe");
        jRadioButtonPepe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonPepeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jRadioButtonJuan)
                        .addGap(65, 65, 65)
                        .addComponent(jRadioButtonPepe))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(jTextFieldEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButtonGeneral)
                    .addComponent(jButtonAlmacen))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonJuan)
                    .addComponent(jRadioButtonGeneral)
                    .addComponent(jRadioButtonPepe))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAlmacen))
                .addGap(0, 73, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButtonGeneralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonGeneralActionPerformed
        // TODO add your handling code here:
        jTable1.setModel(dtmTodos);
    }//GEN-LAST:event_jRadioButtonGeneralActionPerformed

    private void jRadioButtonPepeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonPepeActionPerformed
        // TODO add your handling code here:
        jTable1.setModel(dtmPepe);
    }//GEN-LAST:event_jRadioButtonPepeActionPerformed

    private void jRadioButtonJuanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonJuanActionPerformed
        // TODO add your handling code here:
        jTable1.setModel(dtmJuan);
    }//GEN-LAST:event_jRadioButtonJuanActionPerformed

    private void jButtonAlmacenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlmacenActionPerformed
        // TODO add your handling code here:
        jDialogAlmacen = new JDialogAlmacen(this, true);
        jDialogAlmacen.show();
        
    }//GEN-LAST:event_jButtonAlmacenActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroupReparaciones;
    private javax.swing.JButton jButtonAlmacen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton jRadioButtonGeneral;
    private javax.swing.JRadioButton jRadioButtonJuan;
    private javax.swing.JRadioButton jRadioButtonPepe;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldEstado;
    // End of variables declaration//GEN-END:variables
}
