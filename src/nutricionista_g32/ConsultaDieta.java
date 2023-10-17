/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nutricionista_g32;

import Nutricionista_G32_accesoDatos.Dieta_Data;
import Nutricionista_G32_accesoDatos.Paciente_Data;
import Nutricionista_G32_entidades.Dieta;
import Nutricionista_G32_entidades.Paciente;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author vvted
 */
public class ConsultaDieta extends javax.swing.JInternalFrame {

    private DefaultTableModel model = new DefaultTableModel();

    public boolean inCelEditable(int f, int c) {
        return false;
    }

    public ConsultaDieta() {
        initComponents();
        armarCabecera();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTdieta = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jTdniBuscar = new javax.swing.JTextField();
        jBbuscar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTpesoInicial = new javax.swing.JTextField();
        jTpesoFinal = new javax.swing.JTextField();
        jTfechaFinal = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jCBnombre = new javax.swing.JComboBox<>();

        setClosable(true);
        setPreferredSize(new java.awt.Dimension(1096, 605));

        jTdieta.setModel(new javax.swing.table.DefaultTableModel(
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
        jTdieta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTdietaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTdieta);

        jLabel3.setText("DNI Paciente");

        jBbuscar.setText("BUSCAR");
        jBbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBbuscarActionPerformed(evt);
            }
        });

        jLabel1.setText("Peso Inicial");

        jLabel2.setText("Peso Final");

        jLabel4.setText("Fecha Final");

        jLabel5.setText("Nombre Dieta");

        jTfechaFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTfechaFinalActionPerformed(evt);
            }
        });

        jButton1.setText("jButton1");

        jButton2.setText("jButton2");

        jCBnombre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jTdniBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(180, 180, 180)
                        .addComponent(jBbuscar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 815, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTpesoInicial)
                                    .addComponent(jTpesoFinal, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE))
                                .addGap(118, 118, 118)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTfechaFinal))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jCBnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton1)
                                    .addComponent(jButton2))
                                .addGap(105, 105, 105)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTdniBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBbuscar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4)
                            .addComponent(jTpesoInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTfechaFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addGap(31, 31, 31))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2)
                                .addComponent(jLabel5)
                                .addComponent(jCBnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTpesoFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBbuscarActionPerformed
        try {
            int dni = Integer.parseInt(jTdniBuscar.getText());
            if (jTdniBuscar.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "DEBE INGRESAR UN DNI PARA BUSCAR");
            } else {
                Paciente_Data pD = new Paciente_Data();
                Paciente paciente = new Paciente();
                int id = pD.buscarPacientePorDni(dni).getId_paciente();
                Dieta_Data dD = new Dieta_Data();
                for (Dieta dieta : dD.listarDietasPorPaciente(id)) {
                    borrarFila();
                    model.addRow(new Object[]{
                        dieta.getId_dieta(),
                        dieta.getNombre_dieta(),
                        dieta.getPaciente().toString(),
                        dieta.getPeso_incial(),
                        dieta.getPeso_final(),
                        dieta.getFecha_inicial(),
                        dieta.getFecha_final(),});

                }
            }
            }catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "DEBE INGRESAR UN NÚMERO VÁLIDO PARA EL DNI");
        }
    }//GEN-LAST:event_jBbuscarActionPerformed

    private void jTfechaFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTfechaFinalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTfechaFinalActionPerformed

    private void jTdietaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTdietaMouseClicked
        int filaSelec = jTdieta.getSelectedRow();
        if(filaSelec!=-1){
            
        jTpesoInicial.setText((String) model.getValueAt(filaSelec, 3 ));
        jTpesoFinal.setText((String) model.getValueAt(filaSelec, 4));
        jTfechaFinal.setText((String) model.getValueAt(filaSelec, 6));
        jCBnombre.setSelectedIndex(1);
        }
    }//GEN-LAST:event_jTdietaMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBbuscar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jCBnombre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTdieta;
    private javax.swing.JTextField jTdniBuscar;
    private javax.swing.JTextField jTfechaFinal;
    private javax.swing.JTextField jTpesoFinal;
    private javax.swing.JTextField jTpesoInicial;
    // End of variables declaration//GEN-END:variables
private void armarCabecera() {
        model.addColumn("Id");
        model.addColumn("Nombre");
        model.addColumn("Paciente");
        model.addColumn("Peso Inicial");
        model.addColumn("Peso Objetivo");
        model.addColumn("Fecha Inicio");
        model.addColumn("Fecha Final");

        jTdieta.setModel(model);

    }

    private void borrarFila() {

        int f = jTdieta.getRowCount() - 1;
        for (; f >= 0; f--) {
            model.removeRow(f);
        }
    }

}
