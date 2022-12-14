
import com.jtattoo.plaf.texture.TextureLookAndFeel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComponent;
import javax.swing.KeyStroke;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author DAM2Alu1
 */
public class JFrameFocus extends javax.swing.JFrame {

    /**
     * Creates new form JFrame
     */
    DefaultComboBoxModel dcm;
    public JFrameFocus() {
        initComponents();
        ActionListener a = new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                System.out.println("No copies");
            }
        };
        getRootPane().registerKeyboardAction(a, KeyStroke.getKeyStroke("alt C"), JComponent.WHEN_IN_FOCUSED_WINDOW);
        dcm = new DefaultComboBoxModel();
        for(UIManager.LookAndFeelInfo lafi : UIManager.getInstalledLookAndFeels())
            dcm.addElement(lafi);
        jComboBoxLaF.setModel(dcm);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextFieldNum1 = new javax.swing.JTextField();
        jTextFieldNum2 = new javax.swing.JTextField();
        jTextFieldResultado = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBoxLaF = new javax.swing.JComboBox<>();
        jButtonPrueba = new javax.swing.JButton();
        jCheckBoxPrueba = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextFieldNum1.setText(org.openide.util.NbBundle.getMessage(JFrameFocus.class, "JFrameFocus.jTextFieldNum1.text")); // NOI18N
        jTextFieldNum1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldNum1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldNum1FocusLost(evt);
            }
        });
        jTextFieldNum1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldNum1KeyReleased(evt);
            }
        });

        jTextFieldNum2.setText(org.openide.util.NbBundle.getMessage(JFrameFocus.class, "JFrameFocus.jTextFieldNum2.text")); // NOI18N
        jTextFieldNum2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldNum2FocusLost(evt);
            }
        });
        jTextFieldNum2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldNum2KeyReleased(evt);
            }
        });

        jTextFieldResultado.setText(org.openide.util.NbBundle.getMessage(JFrameFocus.class, "JFrameFocus.jTextFieldResultado.text")); // NOI18N

        jLabel1.setText(org.openide.util.NbBundle.getMessage(JFrameFocus.class, "JFrameFocus.jLabel1.text")); // NOI18N

        jLabel2.setText(org.openide.util.NbBundle.getMessage(JFrameFocus.class, "JFrameFocus.jLabel2.text")); // NOI18N

        jComboBoxLaF.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxLaF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxLaFActionPerformed(evt);
            }
        });

        jButtonPrueba.setText(org.openide.util.NbBundle.getMessage(JFrameFocus.class, "JFrameFocus.jButtonPrueba.text")); // NOI18N
        jButtonPrueba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPruebaActionPerformed(evt);
            }
        });

        jCheckBoxPrueba.setText(org.openide.util.NbBundle.getMessage(JFrameFocus.class, "JFrameFocus.jCheckBoxPrueba.text")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jComboBoxLaF, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButtonPrueba))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextFieldNum1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldNum2, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextFieldResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBoxPrueba))
                        .addGap(34, 34, 34))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNum1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldNum2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(71, 71, 71)
                .addComponent(jComboBoxLaF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonPrueba)
                    .addComponent(jCheckBoxPrueba))
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldNum1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNum1KeyReleased
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            Integer resultado;
            resultado = Integer.valueOf(jTextFieldNum1.getText())+Integer.valueOf(jTextFieldNum2.getText());
            jTextFieldResultado.setText(resultado.toString());
        }
    }//GEN-LAST:event_jTextFieldNum1KeyReleased

    private void jTextFieldNum1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldNum1FocusGained
        // TODO add your handling code here:
        jTextFieldNum1.setText("");
    }//GEN-LAST:event_jTextFieldNum1FocusGained
    public void actualizar(){
        int resultado = (Integer.valueOf(jTextFieldNum1.getText()) + Integer.valueOf(jTextFieldNum2.getText()) );
        jTextFieldResultado.setText(String.valueOf(resultado));
    }
    private void jTextFieldNum1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldNum1FocusLost
        // TODO add your handling code here:
        if(jTextFieldNum1.getText().isEmpty())
            jTextFieldNum1.setText(Integer.toString(0));
        actualizar();
    }//GEN-LAST:event_jTextFieldNum1FocusLost

    private void jTextFieldNum2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldNum2FocusLost
        // TODO add your handling code here:
        actualizar();
        jTextFieldNum1.requestFocus();
    }//GEN-LAST:event_jTextFieldNum2FocusLost

    private void jTextFieldNum2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNum2KeyReleased
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER)
            actualizar();
    }//GEN-LAST:event_jTextFieldNum2KeyReleased

    private void jComboBoxLaFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxLaFActionPerformed
        // TODO add your handling code here:
        UIManager.LookAndFeelInfo lafi = UIManager.getInstalledLookAndFeels()[jComboBoxLaF.getSelectedIndex()];
        try {
            UIManager.setLookAndFeel(lafi.getClassName());
            SwingUtilities.updateComponentTreeUI(this);
        } catch (Exception e) {
            System.out.println("Oskaras 'el corrector' dice que hay un error");
        }
    }//GEN-LAST:event_jComboBoxLaFActionPerformed

    private void jButtonPruebaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPruebaActionPerformed
        // TODO add your handling code here:
        try {
            UIManager.setLookAndFeel(TextureLookAndFeel.class.getCanonicalName());
            SwingUtilities.updateComponentTreeUI(this);
        } catch (Exception e) {
           
        }
    }//GEN-LAST:event_jButtonPruebaActionPerformed

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
            java.util.logging.Logger.getLogger(JFrameFocus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameFocus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameFocus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameFocus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameFocus().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonPrueba;
    private javax.swing.JCheckBox jCheckBoxPrueba;
    private javax.swing.JComboBox<String> jComboBoxLaF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextFieldNum1;
    private javax.swing.JTextField jTextFieldNum2;
    private javax.swing.JTextField jTextFieldResultado;
    // End of variables declaration//GEN-END:variables
}
