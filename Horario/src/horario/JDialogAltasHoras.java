/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package horario;

import Datos.Alta;
import Datos.ArrayAltas;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JRadioButtonMenuItem;

/**
 *
 * @author DAM2Alu1
 */
public class JDialogAltasHoras extends javax.swing.JDialog {

    /**
     * Creates new form JDialogAltasHoras
     */
    Calendar calendario = new GregorianCalendar();
    ArrayAltas lista = new ArrayAltas();
    public ArrayList<Alta> listaDefinitiva;
    JFramePrincipal padre;

    public JDialogAltasHoras(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        padre = (JFramePrincipal) parent;
        listaDefinitiva = padre.listaAltas;
        this.setTitle("ALTA HORAS");

    }
    //METODO QUE NOS DEVUELVE EL DIA SELECCIONADO

    public String diaSeleccionado() {
        String nombre = "";
        if (jRadioButtonLunes.isSelected()) {
            nombre = "Lunes";
        } else if (jRadioButtonMartes.isSelected()) {
            nombre = "Martes";
        } else if (jRadioButtonMiercoles.isSelected()) {
            nombre = "Miercoles";
        } else if (jRadioButtonJueves.isSelected()) {
            nombre = "Jueves";
        } else if (jRadioButtonViernes.isSelected()) {
            nombre = "Viernes";
        }
        return nombre;
    }

    //METODO QUE NOS DEVUELVE LA HORA SELECCIONADA
    public String horaSeleccionada() {
        String hora = " ";
        if (jCheckBox1.isSelected()) {
            hora = "8:25 9:20";
        } else if (jCheckBox2.isSelected()) {
            hora = "9:20 10:15";
        } else if (jCheckBox3.isSelected()) {
            hora = "11:40 12:35";
        } else if (jCheckBox4.isSelected()) {
            hora = "12:35 13:30";
        } else if (jCheckBox5.isSelected()) {
            hora = "10:15 11:10";
        } else if (jCheckBox6.isSelected()) {
            hora = "13:30 14:25";
        }
        return hora;
    }

   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupDias = new javax.swing.ButtonGroup();
        buttonGroupHoras = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jRadioButtonLunes = new javax.swing.JRadioButton();
        jRadioButtonMartes = new javax.swing.JRadioButton();
        jRadioButtonMiercoles = new javax.swing.JRadioButton();
        jRadioButtonJueves = new javax.swing.JRadioButton();
        jRadioButtonViernes = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButtonAnnadir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Día", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 18), new java.awt.Color(51, 51, 255))); // NOI18N

        buttonGroupDias.add(jRadioButtonLunes);
        jRadioButtonLunes.setText("Lunes");
        jRadioButtonLunes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonLunesActionPerformed(evt);
            }
        });

        buttonGroupDias.add(jRadioButtonMartes);
        jRadioButtonMartes.setText("Martes");

        buttonGroupDias.add(jRadioButtonMiercoles);
        jRadioButtonMiercoles.setText("Miercoles");

        buttonGroupDias.add(jRadioButtonJueves);
        jRadioButtonJueves.setText("Jueves");

        buttonGroupDias.add(jRadioButtonViernes);
        jRadioButtonViernes.setText("Viernes");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jRadioButtonLunes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jRadioButtonMartes)
                .addGap(18, 18, 18)
                .addComponent(jRadioButtonMiercoles)
                .addGap(18, 18, 18)
                .addComponent(jRadioButtonJueves)
                .addGap(18, 18, 18)
                .addComponent(jRadioButtonViernes)
                .addGap(34, 34, 34))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonLunes)
                    .addComponent(jRadioButtonMartes)
                    .addComponent(jRadioButtonMiercoles)
                    .addComponent(jRadioButtonJueves)
                    .addComponent(jRadioButtonViernes))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Hora", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 18), new java.awt.Color(51, 51, 255))); // NOI18N

        buttonGroupHoras.add(jCheckBox1);
        jCheckBox1.setText("8:25 9:20");

        buttonGroupHoras.add(jCheckBox2);
        jCheckBox2.setText("9:20 10:15");

        buttonGroupHoras.add(jCheckBox3);
        jCheckBox3.setText("11:40 12:35");

        buttonGroupHoras.add(jCheckBox4);
        jCheckBox4.setText("12:35 13:30");
        jCheckBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox4ActionPerformed(evt);
            }
        });

        buttonGroupHoras.add(jCheckBox5);
        jCheckBox5.setText("10.15 11:10");

        buttonGroupHoras.add(jCheckBox6);
        jCheckBox6.setText("13:30 14:25");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jCheckBox3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jCheckBox4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jCheckBox1)
                        .addGap(66, 66, 66)
                        .addComponent(jCheckBox2)
                        .addGap(52, 52, 52)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox6)
                    .addComponent(jCheckBox5))
                .addGap(60, 60, 60))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox1)
                    .addComponent(jCheckBox2)
                    .addComponent(jCheckBox5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox4)
                    .addComponent(jCheckBox6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox3))
                .addGap(9, 9, 9))
        );

        jLabel1.setText("Modulo");

        jButtonAnnadir.setText("Añadir");
        jButtonAnnadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAnnadirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonAnnadir, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAnnadir))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox4ActionPerformed

    private void jButtonAnnadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAnnadirActionPerformed
        // TODO add your handling code here:

        if (buttonGroupDias.getSelection() == null || buttonGroupHoras.getSelection() == null || jTextField1.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debes de rellenar todos los campos", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            LocalDate fecha = LocalDate.now();
            String fecha2 = String.valueOf(fecha);
            String horaMinutos = String.valueOf(calendario.getTime().getHours() + ":" + calendario.getTime().getMinutes());
            Alta alta = new Alta(diaSeleccionado(), horaSeleccionada(), jTextField1.getText(), fecha2, horaMinutos);
            listaDefinitiva.add(alta);
            this.dispose();
        }
        
        // padre.listaAltas.forEach(System.out::println); recorrer lista desde el padre
        padre.pasarListaAbotones();

    }//GEN-LAST:event_jButtonAnnadirActionPerformed

    private void jRadioButtonLunesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonLunesActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jRadioButtonLunesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupDias;
    private javax.swing.ButtonGroup buttonGroupHoras;
    private javax.swing.JButton jButtonAnnadir;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButtonJueves;
    private javax.swing.JRadioButton jRadioButtonLunes;
    private javax.swing.JRadioButton jRadioButtonMartes;
    private javax.swing.JRadioButton jRadioButtonMiercoles;
    private javax.swing.JRadioButton jRadioButtonViernes;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
