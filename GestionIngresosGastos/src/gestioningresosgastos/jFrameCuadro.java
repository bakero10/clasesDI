/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gestioningresosgastos;

import java.awt.Color;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Bakero
 */
public class jFrameCuadro extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    
    // DECLARAMOS LA VARIABLE FILAS DE MANERA GLOBAL PARA PODER MODIFICAR Y/O ACTUALIZAR
    jFrameCuadro jTablePadre;
    JDialogIngresoGasto jDialogIngresosGastos;
    
    boolean jButtonAltaIngresoGastoApretado = false;
    boolean jMenuItemIngresosApretado = false;
    boolean jMenuItemGastosApretado = false;
    
    DefaultTableModel dtmIngresosGastos;
    DefaultTableModel dtmTablaIngresos;
    DefaultTableModel dtmTablaGastos;
    
    String cabeceraTabla [] = {"Fecha","Concepto","Ingreso","Gasto"}; //ESTO SALDRA EN LA CABECERA DE LA TABLA
    public jFrameCuadro() {
        initComponents();
        this.setTitle("Programa de Gestión de Ingresos y Gastos");
        jDialogIngresosGastos = new JDialogIngresoGasto(this, true);  //DIALOG ES UNA NUEVA VENTANA DIALOG Y LE DECIMOS QUE...(EL PADRE ES ESTE ,Y QUE ES UNA VENTANA MODAL ''TRUE'';
        dtmIngresosGastos = new DefaultTableModel(cabeceraTabla,0); //METEMOS EN EL JFRAME LA TABLA INGRESOS CON....(EL STRING DE LA CABECERA Y CON 0 FILAS POR DEFECTO)
        dtmTablaIngresos = new DefaultTableModel(cabeceraTabla,0);
        dtmTablaGastos = new DefaultTableModel(cabeceraTabla,0);
        //PONEMOS LA VENTANA QUE QUEREMOS MOSTRAR CUANDO ARRANQUEMOS EL PROGRAMA
        jTable1.setModel(dtmIngresosGastos);
        //PONEMOS EL RADIOBUTTON VER TODO POR DEFECTO
        jRadioButtonTodo.setSelected(true);
        
        
       
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
        jTextFieldBalance = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jRadioButtonTodo = new javax.swing.JRadioButton();
        jRadioButtonIngresos = new javax.swing.JRadioButton();
        jRadioButtonGastos = new javax.swing.JRadioButton();
        jButtonAñadir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItemIngresos = new javax.swing.JMenuItem();
        jMenuItemGastos = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        buttonGroup1.add(jRadioButtonTodo);
        jRadioButtonTodo.setText("Tabla");
        jRadioButtonTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonTodoActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButtonIngresos);
        jRadioButtonIngresos.setText("Ingresos");
        jRadioButtonIngresos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonIngresosActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButtonGastos);
        jRadioButtonGastos.setText("Gastos");
        jRadioButtonGastos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonGastosActionPerformed(evt);
            }
        });

        jButtonAñadir.setText("Añadir Importe");
        jButtonAñadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAñadirActionPerformed(evt);
            }
        });

        jLabel1.setText("Balance");

        jMenu1.setText("Movimientos");

        jMenuItemIngresos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ADD, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItemIngresos.setText("Ingresos");
        jMenuItemIngresos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemIngresosActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemIngresos);

        jMenuItemGastos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_SUBTRACT, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItemGastos.setText("Gastos");
        jMenuItemGastos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemGastosActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemGastos);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jRadioButtonTodo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jRadioButtonIngresos)
                                .addGap(148, 148, 148)
                                .addComponent(jRadioButtonGastos))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonAñadir, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(jTextFieldBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(128, 128, 128))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 636, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(61, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonTodo)
                    .addComponent(jRadioButtonGastos)
                    .addComponent(jRadioButtonIngresos))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAñadir)
                    .addComponent(jTextFieldBalance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButtonTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonTodoActionPerformed
        // TODO add your handling code here:
        jTable1.setModel(dtmIngresosGastos);
    }//GEN-LAST:event_jRadioButtonTodoActionPerformed

    private void jRadioButtonIngresosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonIngresosActionPerformed
        // TODO add your handling code here:
        jTable1.setModel(dtmTablaIngresos);
    }//GEN-LAST:event_jRadioButtonIngresosActionPerformed

    private void jRadioButtonGastosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonGastosActionPerformed
        // TODO add your handling code here:
        jTable1.setModel(dtmTablaGastos);
    }//GEN-LAST:event_jRadioButtonGastosActionPerformed

    private void jButtonAñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAñadirActionPerformed
        // TODO add your handling code here:
        jButtonAltaIngresoGastoApretado = true;
        actualizarDatos();
    }//GEN-LAST:event_jButtonAñadirActionPerformed

    private void jMenuItemIngresosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemIngresosActionPerformed
        // TODO add your handling code here:
        jMenuItemIngresosApretado = true;
        actualizarDatos();
    }//GEN-LAST:event_jMenuItemIngresosActionPerformed

    private void jMenuItemGastosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemGastosActionPerformed
        // TODO add your handling code here:
        jMenuItemGastosApretado = true;
        actualizarDatos();
    }//GEN-LAST:event_jMenuItemGastosActionPerformed

    /**
     * @param args the command line arguments
     */
    
    //CUANDO SE APRETE EL BOTON SE INICIARA EL JDIALOG
    public void actualizarDatos(){
        if(jButtonAltaIngresoGastoApretado){
            jDialogIngresosGastos = new JDialogIngresoGasto(this, true);
            jDialogIngresosGastos.setVisible(true);
        }
        else if(jMenuItemIngresosApretado){
            jDialogIngresosGastos = new JDialogIngresoGasto(this, true);
            jDialogIngresosGastos.setVisible(true);
        }
        else if(jMenuItemGastosApretado){
            jDialogIngresosGastos = new JDialogIngresoGasto(this, true);
            jDialogIngresosGastos.setVisible(true);
        }
        
    }
    
    public void balance(){
        int filas = jTable1.getRowCount();
        Double totalGastos= 0.00;
        Double totalIngresos=0.00;
        
        for(int i=0;i<filas;i++){
            if(jTable1.getValueAt(i, 2).toString().isEmpty()){
                Double contador = 0.00;
                totalGastos += contador;
            }
            else{
                Double contador = Double.valueOf((String)jTable1.getValueAt(i, 2));
                totalGastos += contador;
            }
            if(jTable1.getValueAt(i, 3).toString().isEmpty()){
                Double contador = 0.00;
                totalGastos += contador;
            }
            else{
                Double contador = Double.valueOf((String) jTable1.getValueAt(i, 3));
                totalIngresos += contador;
                
            }
        }
        if((totalGastos + totalIngresos) < 0){
            jTextFieldBalance.setText(String.valueOf(totalGastos+totalIngresos));
            jTextFieldBalance.setForeground(Color.red);
        }
        else{
            jTextFieldBalance.setText(String.valueOf(totalGastos+totalIngresos));
            jTextFieldBalance.setForeground(Color.green);
        }
        
    }
    
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
            java.util.logging.Logger.getLogger(jFrameCuadro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jFrameCuadro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jFrameCuadro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jFrameCuadro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jFrameCuadro().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButtonAñadir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItemGastos;
    private javax.swing.JMenuItem jMenuItemIngresos;
    private javax.swing.JRadioButton jRadioButtonGastos;
    private javax.swing.JRadioButton jRadioButtonIngresos;
    private javax.swing.JRadioButton jRadioButtonTodo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldBalance;
    // End of variables declaration//GEN-END:variables
}
