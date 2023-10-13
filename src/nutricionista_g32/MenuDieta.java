/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nutricionista_g32;

import Nutricionista_G32_accesoDatos.Comida_Data;
import Nutricionista_G32_accesoDatos.Paciente_Data;
import Nutricionista_G32_entidades.Comida;
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
        jBmodificar = new javax.swing.JButton();
        jBeliminar = new javax.swing.JButton();
        jRbuscar = new javax.swing.JRadioButton();

        setClosable(true);

        jLabel1.setText("DNI Paciente");

        jLabel2.setText("Paciente");

        jLabel3.setText("Peso Inicial");

        jLabel4.setText("Peso Objetivo a Alcanzar");

        jLabel5.setText("Fecha Inicio");

        jLabel6.setText("Fecha Finalizaciòn Estimada");

        jLabel7.setText("Duración en Semanas");

        jTdniBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTdniBuscarKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTdniBuscarKeyReleased(evt);
            }
        });

        jBguardar.setText("GUARDAR");

        jBmodificar.setText("MODIFICAR");

        jBeliminar.setText("ELIMINAR");

        jRbuscar.setText("Buscar Paciente");
        jRbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRbuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6))
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTpaciente)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTdniBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTpesoInicio, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                                    .addComponent(jTpesoFinal)
                                    .addComponent(jTfechaInicio)
                                    .addComponent(jTsemanas)
                                    .addComponent(jTfechaFinal))
                                .addGap(49, 49, 49)
                                .addComponent(jRbuscar)
                                .addGap(0, 72, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBguardar)
                        .addGap(108, 108, 108)
                        .addComponent(jBmodificar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBeliminar)
                        .addGap(98, 98, 98))))
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
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBguardar)
                    .addComponent(jBmodificar)
                    .addComponent(jBeliminar))
                .addContainerGap(63, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTdniBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTdniBuscarKeyReleased

    }//GEN-LAST:event_jTdniBuscarKeyReleased

    private void jTdniBuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTdniBuscarKeyPressed
       
    }//GEN-LAST:event_jTdniBuscarKeyPressed

    private void jRbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRbuscarActionPerformed
        Paciente_Data pD = new Paciente_Data();
        Paciente paciente = new Paciente ();
        try {
            int dni = Integer.parseInt(jTdniBuscar.getText());
            paciente = pD.buscarPacientePorDni(dni);
            jTpaciente.setText(paciente.toString());
            vista2();
            
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "DEBE INGRESAR UN NÚMERO VÁLIDO");

    }                                      
    }//GEN-LAST:event_jRbuscarActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBeliminar;
    private javax.swing.JButton jBguardar;
    private javax.swing.JButton jBmodificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JRadioButton jRbuscar;
    private javax.swing.JTextField jTdniBuscar;
    private javax.swing.JTextField jTfechaFinal;
    private javax.swing.JTextField jTfechaInicio;
    private javax.swing.JTextField jTpaciente;
    private javax.swing.JTextField jTpesoFinal;
    private javax.swing.JTextField jTpesoInicio;
    private javax.swing.JTextField jTsemanas;
    // End of variables declaration//GEN-END:variables

public void vista1 (){
jRbuscar.setEnabled(true);
jTdniBuscar.setEnabled(true);
jTpaciente.setEnabled(false);
jTpesoInicio.setEnabled(false);
jTpesoFinal.setEnabled(false);
jTfechaInicio.setEnabled(false);
jTsemanas.setEnabled(false);
jTfechaFinal.setEnabled(false);
jBguardar.setEnabled(false);
jBmodificar.setEnabled(false);
jBeliminar.setEnabled(false);
jTdniBuscar.setText("");
jTpaciente.setText("");
jTpesoInicio.setText("");
jTpesoFinal.setText("");
jTfechaInicio.setText("");
jTsemanas.setText("");
jTfechaFinal.setText("");
}

public void vista2 (){
jRbuscar.setEnabled(true);
jTdniBuscar.setEnabled(true);
jTpaciente.setEnabled(true);
jTpesoInicio.setEnabled(true);
jTpesoFinal.setEnabled(true);
jTfechaInicio.setEnabled(true);
jTsemanas.setEnabled(true);
jTfechaFinal.setEnabled(true);
jBguardar.setEnabled(true);
jBmodificar.setEnabled(false);
jBeliminar.setEnabled(false);
jTfechaInicio.setText(Date.valueOf(LocalDate.now())+"");
jTpesoInicio.setText("");
jTpesoFinal.setText("");
jTsemanas.setText("");
jTfechaFinal.setText("");
}

}
