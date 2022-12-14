/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package gestioningresosgastos;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;

/**
 *
 * @author Bakero
 */
public class JDialogIngresoGasto extends javax.swing.JDialog {

    /**
     * Creates new form JDialogIngresoGasto
     */
   jFrameCuadro padre;
   Calendar calendario = new GregorianCalendar();
   
   
    public JDialogIngresoGasto(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        padre = (jFrameCuadro) parent;
        jTextFieldImporte.setText("0.00");
    
        if(padre.jButtonAltaIngresoGastoApretado){
            padre = (jFrameCuadro) parent;
            this.setTitle("Ingreso y Gasto");
            itemsDe0();
        }
        else if(padre.jMenuItemIngresosApretado){
            padre = (jFrameCuadro) parent;
            this.setTitle("Ingreso");
            itemsDe0();
        }
        else if (padre.jMenuItemGastosApretado){
            padre = (jFrameCuadro) parent;
            this.setTitle("Gasto");
            itemsDe0();
        }
    }
    
    
    
    //METODO PARA RESETEAR LOS ITEMS SELECCIONADOS
    public void itemsDe0 (){
        padre.jButtonAltaIngresoGastoApretado = false;
        padre.jMenuItemGastosApretado = false;
        padre.jMenuItemIngresosApretado = false;
    }
    
    //METODO INSERTAR DATOS EN TABLAS
    public void insertarDatos(String [] registro,String tabla){
        padre.dtmIngresosGastos.addRow(registro);
        jTextFieldImporte.setText("0.00");
        jTextFieldConcepto.setText(" ");
        jSpinnerFecha.setValue(calendario.getTime());
        
        if(tabla.equalsIgnoreCase("tablaGasto")){
        padre.dtmTablaGastos.addRow(registro);
        jTextFieldImporte.setText("0.00");
        jTextFieldConcepto.setText(" ");
        jSpinnerFecha.setValue(calendario.getTime());
        }
        else if(tabla.equalsIgnoreCase("tablaIngreso")){
            padre.dtmTablaIngresos.addRow(registro);
        jTextFieldImporte.setText("0.00");
        jTextFieldConcepto.setText(" ");
        jSpinnerFecha.setValue(calendario.getTime());
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

        jLabelFecha = new javax.swing.JLabel();
        jLabelConcepto = new javax.swing.JLabel();
        jLabelImporte = new javax.swing.JLabel();
        jTextFieldImporte = new javax.swing.JTextField();
        jTextFieldConcepto = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jSpinnerFecha = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabelFecha.setText("Fecha");

        jLabelConcepto.setText("Concepto");

        jLabelImporte.setText("Importe");

        jButton1.setText("Aceptar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jSpinnerFecha.setModel(new javax.swing.SpinnerDateModel());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelConcepto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextFieldConcepto, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(122, 122, 122))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabelImporte)
                                .addGap(116, 116, 116)
                                .addComponent(jTextFieldImporte, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(456, 456, 456))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(172, 172, 172))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelFecha)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSpinnerFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(435, 435, 435))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelFecha)
                    .addComponent(jSpinnerFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelConcepto)
                    .addComponent(jTextFieldConcepto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelImporte)
                    .addComponent(jTextFieldImporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(50, 50, 50))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
       //PONEMOS BIEN EL FORMATO DE LA FECHA
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String fecha = sdf.format(jSpinnerFecha.getValue());
        
        if(this.getTitle().equals("Ingreso y Gasto")){
            System.out.println("Ingreso y gasto");
            try {
                if(Double.valueOf(jTextFieldImporte.getText()) < 0){      // SI EL IMPORTE ES MENOR DE 0
                    String [] lista = {fecha,jTextFieldConcepto.getText(),"",jTextFieldImporte.getText()};
                    insertarDatos(lista, "tablaGasto");
                }
               else if(Double.valueOf(jTextFieldImporte.getText()) > 0){
                    String [] lista = {fecha,jTextFieldConcepto.getText(),jTextFieldImporte.getText(),""};
                    insertarDatos(lista, "tablaIngreso");
                }
               else{
                    JOptionPane.showMessageDialog(null, "No puedes introducir 0 euros","Error importe",JOptionPane.ERROR_MESSAGE);
               }                
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error de introduccion","Error",JOptionPane.ERROR_MESSAGE);
            }
        }
        
        else if (this.getTitle().equals("Ingreso")){
            System.out.println("Ingreso y gasto2");
            try {
                if(Double.valueOf(jTextFieldImporte.getText()) > 0){
                    String [] lista = {fecha,jTextFieldConcepto.getText(),jTextFieldImporte.getText(),""};
                    insertarDatos(lista, "tablaIngreso");
                }
                else{
                    JOptionPane.showMessageDialog(null, "No puedes introducir importes menores que 0","Error",JOptionPane.ERROR_MESSAGE);
                }                
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Solo puedes introducir numeros positivos y negativos","Error",JOptionPane.INFORMATION_MESSAGE);
            }
        }
        
        else if(this.getTitle().equals("Gasto")){
            System.out.println("Ingreso y gasto3");
            try {
                if(Double.valueOf(jTextFieldImporte.getText()) > 0){
                    String [] lista = {fecha,jTextFieldConcepto.getText(),"","-"+jTextFieldImporte.getText()};
                    insertarDatos(lista, "tablaGasto");
                }
                else{
                    JOptionPane.showMessageDialog(null, "No se puede introducir importes mayores de 0","Error",JOptionPane.ERROR_MESSAGE);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Solo puedes introducir numeros positivos y negativos","Error",JOptionPane.ERROR_MESSAGE);
            }
        }
        padre.balance();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        jSpinnerFecha.setValue(calendario.getTime());
        jTextFieldImporte.setText("0.00");
        jTextFieldConcepto.setText("");
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(JDialogIngresoGasto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDialogIngresoGasto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDialogIngresoGasto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDialogIngresoGasto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDialogIngresoGasto dialog = new JDialogIngresoGasto(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabelConcepto;
    private javax.swing.JLabel jLabelFecha;
    private javax.swing.JLabel jLabelImporte;
    private javax.swing.JSpinner jSpinnerFecha;
    private javax.swing.JTextField jTextFieldConcepto;
    private javax.swing.JTextField jTextFieldImporte;
    // End of variables declaration//GEN-END:variables
}
