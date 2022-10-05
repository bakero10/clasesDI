
import dto.Persona;
import java.awt.Dimension;
import java.io.IOException;
import java.util.Locale;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import org.netbeans.validation.api.builtin.stringvalidation.StringValidators;
import org.netbeans.validation.api.ui.ValidationGroup;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author DAM2Alu1
 */
public class JFrameMIO extends javax.swing.JFrame {

    /**
     * Creates new form JFrameMIO
     */
    NewJDialogMensaje jDialogMensaje;
    Persona persona;
    ValidationGroup group;
    JLabel saludo;
    
    public Persona getPersona(){
        return persona;
    }
    public void setPersona(Persona persona){
        this.persona = persona;
    }
    void actualizaCamposPersona(){
        jTextFieldNombre.setText(persona.getNombre());
        jTextFieldMail.setText(persona.getMail());
        jSpinnerEdad.setValue(persona.getEdad());
    }
    
    public JFrameMIO(){
        initComponents();
        group = validationPanelMensajes.getValidationGroup();
        // a continuación a este grupo se le añaden los campos a validar
        //a continuación a este grupo se le añaden los campos a validar
        group.add(jTextFieldNombre,StringValidators.REQUIRE_NON_EMPTY_STRING); 
        //se pueden añadir varias condiciones
        group.add(jTextFieldEdad,StringValidators.REQUIRE_NON_EMPTY_STRING);
        group.add(jTextFieldEdad,StringValidators.REQUIRE_VALID_INTEGER);
        //En este caso miramos que no sea vacío y sea una dirección de email
        group.add(jTextFieldMail,StringValidators.REQUIRE_NON_EMPTY_STRING,StringValidators.EMAIL_ADDRESS);
        saludo = new JLabel("Hola Frame Mio");
        //saludo.setMinimumSize(new Dimension(100,100));
        saludo.setBounds(10, 20, 100, 20);
        this.add(saludo);
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextFieldNombre = new javax.swing.JTextField();
        jLabel1Nombre = new javax.swing.JLabel();
        jButton1Mostrar = new javax.swing.JButton();
        jSpinnerEdad = new javax.swing.JSpinner();
        jLabelMail = new javax.swing.JLabel();
        jLabel1Edad = new javax.swing.JLabel();
        jTextFieldMail = new javax.swing.JTextField();
        boton = new javax.swing.JButton();
        jTextFieldEdad = new javax.swing.JTextField();
        validationPanel1 = new org.netbeans.validation.api.ui.swing.ValidationPanel();
        validationPanelMensajes = new org.netbeans.validation.api.ui.swing.ValidationPanel();
        jLabelTitulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("kk View");

        jLabel1Nombre.setText("Nombre");

        jButton1Mostrar.setText("Mostrar");
        jButton1Mostrar.setToolTipText("No vayas al otro hasta que hayas rellenado este");
        jButton1Mostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1MostrarActionPerformed(evt);
            }
        });

        jSpinnerEdad.setModel(new javax.swing.SpinnerNumberModel(18, 18, 99, 1));
        jSpinnerEdad.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinnerEdadStateChanged(evt);
            }
        });

        jLabelMail.setText("Mail");

        jLabel1Edad.setText("Edad");

        boton.setText("Edad");
        boton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonActionPerformed(evt);
            }
        });

        jTextFieldEdad.setEnabled(false);
        jTextFieldEdad.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldEdadFocusLost(evt);
            }
        });

        validationPanelMensajes.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                validationPanelMensajesStateChanged(evt);
            }
        });

        jLabelTitulo.setBackground(new java.awt.Color(0, 0, 0));
        jLabelTitulo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(204, 204, 204));
        jLabelTitulo.setText("MI KK VIEW ESTA SALIENDO CHACHI");
        jLabelTitulo.setOpaque(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1Nombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1Edad)
                            .addComponent(jLabelMail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(86, 86, 86)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSpinnerEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                            .addComponent(jTextFieldMail)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(validationPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1Mostrar)
                        .addGap(27, 27, 27)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTextFieldEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(boton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(validationPanelMensajes, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 408, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1Nombre)
                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1Edad, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinnerEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelMail, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1Mostrar)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(validationPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(validationPanelMensajes, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1MostrarActionPerformed
        // TODO add your handling code here:
        //System.out.println("Buenos dias "+ jTextFieldNombre.getText());
        persona = new Persona(jTextFieldNombre.getText(),(Integer)jSpinnerEdad.getValue(),jTextFieldMail.getText());
        jDialogMensaje = new NewJDialogMensaje(this,persona ,true);
        jDialogMensaje.setVisible(true);
    }//GEN-LAST:event_jButton1MostrarActionPerformed

    private void botonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonActionPerformed
       int edad=Integer.valueOf(JOptionPane.showInputDialog("Introduce la edad"));
        int opcion=JOptionPane.showConfirmDialog(rootPane, "La edad Introducida es "+edad,
        "Comprobación de edad",JOptionPane.YES_NO_OPTION, JOptionPane.CANCEL_OPTION );

        if(opcion==JOptionPane.YES_OPTION)
        JOptionPane.showMessageDialog(rootPane, "Edad correcta " + edad,
        "Guardado",  JOptionPane.INFORMATION_MESSAGE);
        jSpinnerEdad.setValue(edad);
    }//GEN-LAST:event_botonActionPerformed

    private void jSpinnerEdadStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinnerEdadStateChanged
        jTextFieldEdad.setText(String.valueOf(jSpinnerEdad.getValue()) );
    }//GEN-LAST:event_jSpinnerEdadStateChanged

    private void jTextFieldEdadFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldEdadFocusLost
        try {
            Integer edad=Integer.parseInt(jTextFieldEdad.getText());
            if(edad < 18 && edad>99)
                throw new IOException();
            jSpinnerEdad.setValue(Integer.valueOf(edad));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(rootPane, "El formato de la edad no es correcto","Alerta",JOptionPane.ERROR_MESSAGE);
            jTextFieldEdad.setText(String.valueOf(jSpinnerEdad.getValue()));
        }catch (IOException io) {
            JOptionPane.showMessageDialog(rootPane, "El valor no esta en el rango de edad","Alerta",JOptionPane.ERROR_MESSAGE);
            jTextFieldEdad.setText(String.valueOf(jSpinnerEdad.getValue()));
        }
        
        
    }//GEN-LAST:event_jTextFieldEdadFocusLost

    private void validationPanelMensajesStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_validationPanelMensajesStateChanged
        if(validationPanelMensajes.getProblem()==null)
            jButton1Mostrar.setEnabled(true);
        else
            jButton1Mostrar.setEnabled(false);
    }//GEN-LAST:event_validationPanelMensajesStateChanged

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
            java.util.logging.Logger.getLogger(JFrameMIO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameMIO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameMIO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameMIO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        
        
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Locale.setDefault(new Locale("es","ES"));
                new JFrameMIO().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton;
    private javax.swing.JButton jButton1Mostrar;
    private javax.swing.JLabel jLabel1Edad;
    private javax.swing.JLabel jLabel1Nombre;
    private javax.swing.JLabel jLabelMail;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JSpinner jSpinnerEdad;
    private javax.swing.JTextField jTextFieldEdad;
    private javax.swing.JTextField jTextFieldMail;
    public javax.swing.JTextField jTextFieldNombre;
    private org.netbeans.validation.api.ui.swing.ValidationPanel validationPanel1;
    private org.netbeans.validation.api.ui.swing.ValidationPanel validationPanelMensajes;
    // End of variables declaration//GEN-END:variables
}
