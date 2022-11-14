/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package talleresfitipaldi;

import Logica_Del_Negocio.Cliente;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Bakero
 */
public class JDialogClientes extends javax.swing.JDialog {

    /**
     * Creates new form JDialogClientes
     */
    ArrayList<Cliente> lista;
    JFramePrincipal padre;
    public JDialogClientes(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        padre = (JFramePrincipal) parent;
        lista = new ArrayList<>();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    public ArrayList<Cliente> rellenarLista(){
        Cliente c = new Cliente("Pepito","Palotes","654985655","18056987k","Opel","Vivaro","7965kij");
        Cliente c1 = new Cliente("Pablo","Pellote","654552655","180525417k","Renaul","Primastar","2640fyr");
        Cliente c2= new Cliente("Julieta","Labordeta","654562435","18021547p","Fiat","Panda","2568res");
        lista.add(c);
        lista.add(c1);
        lista.add(c2);
        for (Cliente cliente : lista) {
                 jComboBoxlistaClientes.addItem(cliente.getNombre()+" ---> " +cliente.getMarca());
             }
        return lista;
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jComboBoxlistaClientes = new javax.swing.JComboBox<>();
        jTextFieldMarca = new javax.swing.JTextField();
        jTextFieldTelefono = new javax.swing.JTextField();
        jTextFieldNombre = new javax.swing.JTextField();
        jTextFieldMatricula = new javax.swing.JTextField();
        jTextFieldModelo = new javax.swing.JTextField();
        jTextFieldApellidos = new javax.swing.JTextField();
        jTextFieldDNI = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jComboBoxlistaClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBoxlistaClientesMouseClicked(evt);
            }
        });
        jComboBoxlistaClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxlistaClientesActionPerformed(evt);
            }
        });

        jLabel1.setText("Apellidos");

        jLabel2.setText("Nombre");

        jLabel3.setText("Telefono");

        jLabel4.setText("DNI");

        jLabel5.setText("Modelo");

        jLabel6.setText("Matricula");

        jLabel7.setText("Marca");

        jButton1.setText("Alta");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Eliminar");

        jButton3.setText("Guardar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jComboBoxlistaClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextFieldTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel2))
                                        .addGap(12, 12, 12)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addComponent(jTextFieldMarca)))))
                                .addGap(47, 47, 47)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldMatricula)
                                    .addComponent(jTextFieldModelo)
                                    .addComponent(jTextFieldApellidos)
                                    .addComponent(jTextFieldDNI)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)))))
                .addGap(18, 18, 18))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jComboBoxlistaClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addGap(55, 55, 55))
        );

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
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         
        if(jTextFieldNombre.getText().isEmpty() || jTextFieldApellidos.getText().isEmpty() || 
           jTextFieldTelefono.getText().isEmpty() || jTextFieldDNI.getText().isEmpty() || 
           jTextFieldMatricula.getText().isEmpty() || jTextFieldModelo.getText().isEmpty()
                || jTextFieldMatricula.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Debes rellenar todos los campos","Error",JOptionPane.ERROR_MESSAGE);
        }
         else{
        Cliente c = new Cliente (jTextFieldNombre.getText(),jTextFieldApellidos.getText(),jTextFieldDNI.getText(),jTextFieldTelefono.getText(),jTextFieldMarca.getText(),jTextFieldModelo.getText(),jTextFieldMatricula.getText());
        lista.add(c);
        jComboBoxlistaClientes.removeAllItems();
             for (Cliente cliente : lista) {
                 jComboBoxlistaClientes.addItem(cliente.getNombre()+" ---> " +cliente.getMarca());
             }
         }
         jTextFieldNombre.setText("");
        jTextFieldApellidos.setText("");
        jTextFieldTelefono.setText("");
        jTextFieldDNI.setText("");
        jTextFieldModelo.setText("");
        jTextFieldMatricula.setText("");
        jTextFieldMarca.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBoxlistaClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxlistaClientesActionPerformed
         // TODO add your handling code here:
         System.out.println(jComboBoxlistaClientes.getSelectedItem());
      
    }//GEN-LAST:event_jComboBoxlistaClientesActionPerformed

    private void jComboBoxlistaClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBoxlistaClientesMouseClicked
        // TODO add your handling code here:
       // System.out.println(evt
        
    }//GEN-LAST:event_jComboBoxlistaClientesMouseClicked

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBoxlistaClientes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldApellidos;
    private javax.swing.JTextField jTextFieldDNI;
    private javax.swing.JTextField jTextFieldMarca;
    private javax.swing.JTextField jTextFieldMatricula;
    private javax.swing.JTextField jTextFieldModelo;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldTelefono;
    // End of variables declaration//GEN-END:variables
}
