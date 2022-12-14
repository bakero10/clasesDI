
import java.util.Enumeration;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author DAM2Alu1
 */
public class JFrameColores extends javax.swing.JFrame {
    String colores[]={"Rojo","Verde","Azul"};
    /**
     * Creates new form JFrameColores
     */
    public JFrameColores() {
        initComponents();
        for(int i=0;i<colores.length;i++)
            buttonGroupColores.add(new JRadioButton(colores[i]));
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupColores = new javax.swing.ButtonGroup();
        jPanelColores = new javax.swing.JPanel();
        jRadioButtonRojo = new javax.swing.JRadioButton();
        jRadioButtonVerde = new javax.swing.JRadioButton();
        jRadioButtonAzul = new javax.swing.JRadioButton();
        jButtonAceptar = new javax.swing.JButton();
        jLabelResultado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelColores.setBackground(new java.awt.Color(255, 255, 255));
        jPanelColores.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder("")));
        jPanelColores.setToolTipText(org.openide.util.NbBundle.getMessage(JFrameColores.class, "JFrameColores.jPanelColores.toolTipText")); // NOI18N

        buttonGroupColores.add(jRadioButtonRojo);
        jRadioButtonRojo.setText(org.openide.util.NbBundle.getMessage(JFrameColores.class, "JFrameColores.jRadioButtonRojo.text")); // NOI18N

        buttonGroupColores.add(jRadioButtonVerde);
        jRadioButtonVerde.setText(org.openide.util.NbBundle.getMessage(JFrameColores.class, "JFrameColores.jRadioButtonVerde.text")); // NOI18N

        buttonGroupColores.add(jRadioButtonAzul);
        jRadioButtonAzul.setText(org.openide.util.NbBundle.getMessage(JFrameColores.class, "JFrameColores.jRadioButtonAzul.text")); // NOI18N

        jButtonAceptar.setText(org.openide.util.NbBundle.getMessage(JFrameColores.class, "JFrameColores.jButtonAceptar.text")); // NOI18N
        jButtonAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAceptarActionPerformed(evt);
            }
        });

        jLabelResultado.setText(org.openide.util.NbBundle.getMessage(JFrameColores.class, "JFrameColores.jLabelResultado.text")); // NOI18N

        javax.swing.GroupLayout jPanelColoresLayout = new javax.swing.GroupLayout(jPanelColores);
        jPanelColores.setLayout(jPanelColoresLayout);
        jPanelColoresLayout.setHorizontalGroup(
            jPanelColoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelColoresLayout.createSequentialGroup()
                .addGroup(jPanelColoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelColoresLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanelColoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButtonAzul)
                            .addComponent(jRadioButtonVerde)
                            .addComponent(jRadioButtonRojo)))
                    .addGroup(jPanelColoresLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButtonAceptar))
                    .addGroup(jPanelColoresLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabelResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanelColoresLayout.setVerticalGroup(
            jPanelColoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelColoresLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jRadioButtonRojo)
                .addGap(18, 18, 18)
                .addComponent(jRadioButtonVerde)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButtonAzul)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonAceptar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelResultado, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(jPanelColores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jPanelColores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAceptarActionPerformed
            // TODO add your handling code here:
            
            Enumeration e = buttonGroupColores.getElements();
            while(e.hasMoreElements()){
                JRadioButton r = (JRadioButton) e.nextElement();
                if(r.isSelected())
                    jLabelResultado.setText(r.getText());
            }
    }//GEN-LAST:event_jButtonAceptarActionPerformed

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
            java.util.logging.Logger.getLogger(JFrameColores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameColores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameColores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameColores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameColores().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupColores;
    private javax.swing.JButton jButtonAceptar;
    private javax.swing.JLabel jLabelResultado;
    private javax.swing.JPanel jPanelColores;
    private javax.swing.JRadioButton jRadioButtonAzul;
    private javax.swing.JRadioButton jRadioButtonRojo;
    private javax.swing.JRadioButton jRadioButtonVerde;
    // End of variables declaration//GEN-END:variables
}
