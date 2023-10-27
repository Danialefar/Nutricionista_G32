/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nutricionista_g32;

import Nutricionista_G32_accesoDatos.Comida_Data;
import Nutricionista_G32_accesoDatos.Dieta_Data;
import Nutricionista_G32_accesoDatos.Historial_Data;
import Nutricionista_G32_accesoDatos.Paciente_Data;
import Nutricionista_G32_entidades.Comida;
import Nutricionista_G32_entidades.Dieta;
import Nutricionista_G32_entidades.Historial;
import Nutricionista_G32_entidades.Paciente;
import java.sql.Date;
import java.time.LocalDate;
import javax.swing.JOptionPane;

/**
 *
 * @author vvted
 */
public class MenuDieta extends javax.swing.JInternalFrame {

    /**
     * Creates new form MenuDieta
     */
    public MenuDieta() {
        initComponents();
        vista1();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTdniBuscar = new javax.swing.JTextField();
        jTpaciente = new javax.swing.JTextField();
        jTpesoFinal = new javax.swing.JTextField();
        jTfechaInicio = new javax.swing.JTextField();
        jTsemanas = new javax.swing.JTextField();
        jTfechaFinal = new javax.swing.JTextField();
        jTpesoInicio = new javax.swing.JTextField();
        jBguardar = new javax.swing.JButton();
        jRbuscar = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        jTidDieta = new javax.swing.JTextField();
        jCBnombreDieta = new javax.swing.JComboBox<>();

        setClosable(true);
        setTitle("Menú Dieta");

        jLabel1.setText("D.N.I. del Paciente");

        jLabel2.setText("Paciente");

        jLabel3.setText("Peso Inicial");

        jLabel4.setText("Peso objetivo a alcanzar");

        jLabel5.setText("Fecha de inicio");

        jLabel6.setText("Fecha de finalizaciòn estimada");

        jLabel7.setText("Duración en semanas");

        jTdniBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTdniBuscarKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTdniBuscarKeyReleased(evt);
            }
        });

        jTsemanas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTsemanasKeyReleased(evt);
            }
        });

        jBguardar.setText("GUARDAR");
        jBguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBguardarActionPerformed(evt);
            }
        });

        jRbuscar.setText("Buscar Paciente");
        jRbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRbuscarActionPerformed(evt);
            }
        });

        jLabel8.setText("Nombre de dieta");

        jCBnombreDieta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elija el nombre", "DIETA KETO", "DIETA MEDITERRANEA", "DIETA CALORICA", "DIETA VEGANA", "DIETA VEGETARIANA", "DIETA DASH", "DIETA ORNISH", "DIETA D.M.A." }));
        jCBnombreDieta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBnombreDietaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTdniBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTpesoInicio, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                            .addComponent(jTpesoFinal)
                            .addComponent(jTfechaInicio)
                            .addComponent(jTsemanas)
                            .addComponent(jTfechaFinal))
                        .addGap(49, 49, 49)
                        .addComponent(jRbuscar)
                        .addGap(31, 31, 31))
                    .addComponent(jCBnombreDieta, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBguardar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTpaciente))
                .addGap(22, 22, 22)
                .addComponent(jTidDieta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTdniBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRbuscar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTpaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTpesoInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTpesoFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTfechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTsemanas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTfechaFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTidDieta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCBnombreDieta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(jBguardar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTdniBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTdniBuscarKeyReleased

    }//GEN-LAST:event_jTdniBuscarKeyReleased

    private void jTdniBuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTdniBuscarKeyPressed

    }//GEN-LAST:event_jTdniBuscarKeyPressed

    private void jRbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRbuscarActionPerformed
        Paciente_Data pD = new Paciente_Data();
        Paciente paciente = new Paciente();
        try {
            int dni = Integer.parseInt(jTdniBuscar.getText());
            paciente = pD.buscarPacientePorDni(dni);
            if (paciente.isEstado() == false) {
                JOptionPane.showMessageDialog(null, "EL PACIENTE ESTÁ DADO DE BAJA, DEBERÁ ACTIVARLO NUEVAMENTE ");
                jTdniBuscar.setText("");
            } else {
                jTpaciente.setText(paciente.toString());
                vista2();
            }

        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "DEBE INGRESAR UN NÚMERO VÁLIDO");

        }
    }//GEN-LAST:event_jRbuscarActionPerformed

    private void jTsemanasKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTsemanasKeyReleased
        try {
            LocalDate fecha = LocalDate.now().plusDays(Integer.parseInt(jTsemanas.getText()) * 7);
            jTfechaFinal.setText(fecha + "");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "DEBE INGRESAR UN NUMERO PARA LA SEMANA");
        }
    }//GEN-LAST:event_jTsemanasKeyReleased

    private void jBguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBguardarActionPerformed
        Dieta_Data dD = new Dieta_Data();
        Paciente_Data pD = new Paciente_Data();
        Paciente paciente = new Paciente();
        try {
            double pesoInicial = Double.parseDouble(jTpesoInicio.getText());
            double pesoFinal = Double.parseDouble(jTpesoFinal.getText());
            int semana = Integer.parseInt(jTsemanas.getText());
            if (jTpesoInicio.getText().isEmpty() || jTpesoFinal.getText().isEmpty() || jTsemanas.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "NINGUN CAMPO PUEDE ESTAR VACÍO");
            } else if (jCBnombreDieta.getSelectedItem().toString().equals("elija el nombre")) {
                JOptionPane.showMessageDialog(this, "DEBE ELEGIR UN NOMBRE PARA LA DIETA");
            } else if (dD.buscarDietaPorPaciente(paciente.getId_paciente())) {
                JOptionPane.showMessageDialog(this, "EL PACIENTE TIENE UNA DIETA ACTIVA, DEBE FINALIZARLA");
                vista1();
            } else {

                int dni = Integer.parseInt(jTdniBuscar.getText());
                paciente = pD.buscarPacientePorDni(dni);
                Dieta dieta = new Dieta(jCBnombreDieta.getSelectedItem().toString(),
                        paciente, pesoInicial, pesoFinal, LocalDate.now(),
                        LocalDate.now().plusDays(Integer.parseInt(jTsemanas.getText()) * 7));

                dD.guardarDieta(dieta);

                Historial registro = new Historial(paciente, Double.parseDouble(jTpesoInicio.getText()), LocalDate.now());
                Historial_Data hD = new Historial_Data();
                hD.guardarHistorial(registro);

                vista1();
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "DEBE INGRESAR UN NUMERO VALIDO");
        }
    }//GEN-LAST:event_jBguardarActionPerformed

    private void jCBnombreDietaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBnombreDietaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCBnombreDietaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBguardar;
    private javax.swing.JComboBox<String> jCBnombreDieta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JRadioButton jRbuscar;
    private javax.swing.JTextField jTdniBuscar;
    private javax.swing.JTextField jTfechaFinal;
    private javax.swing.JTextField jTfechaInicio;
    private javax.swing.JTextField jTidDieta;
    private javax.swing.JTextField jTpaciente;
    private javax.swing.JTextField jTpesoFinal;
    private javax.swing.JTextField jTpesoInicio;
    private javax.swing.JTextField jTsemanas;
    // End of variables declaration//GEN-END:variables

    public void vista1() {
        jRbuscar.setEnabled(true);
        jTdniBuscar.setEnabled(true);
        jTpaciente.setEnabled(false);
        jTpesoInicio.setEnabled(false);
        jTpesoFinal.setEnabled(false);
        jTfechaInicio.setEnabled(false);
        jTfechaInicio.setEditable(false);
        jTsemanas.setEnabled(false);
        jTfechaFinal.setEnabled(false);
        jTfechaFinal.setEditable(false);
        jBguardar.setEnabled(false);
        jTidDieta.setVisible(false);
        jCBnombreDieta.setEnabled(false);
        jTdniBuscar.setText("");
        jTpaciente.setText("");
        jTpesoInicio.setText("");
        jTpesoFinal.setText("");
        jTfechaInicio.setText("");
        jTsemanas.setText("");
        jTfechaFinal.setText("");

    }

    public void vista2() {
        jRbuscar.setEnabled(true);
        jTdniBuscar.setEnabled(true);
        jTpaciente.setEnabled(true);
        jTpesoInicio.setEnabled(true);
        jTpesoFinal.setEnabled(true);
        jTfechaInicio.setEnabled(true);
        jTsemanas.setEnabled(true);
        jTfechaFinal.setEnabled(true);
        jBguardar.setEnabled(true);
        jCBnombreDieta.setEnabled(true);
        jTfechaInicio.setText(Date.valueOf(LocalDate.now()) + "");
        jTpesoInicio.setText("");
        jTpesoFinal.setText("");
        jTsemanas.setText("");
        jTfechaFinal.setText("");
    }

}
