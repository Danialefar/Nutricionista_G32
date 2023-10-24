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
import java.time.LocalDate;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author vvted
 */
public class ConsultaDieta extends javax.swing.JInternalFrame {

    private DefaultTableModel modelo;
    private DefaultTableModel model;

    public ConsultaDieta() {
        initComponents();
        modelo = (DefaultTableModel) jTdieta.getModel();
        model = (DefaultTableModel) jTdietaFinalizada.getModel();

        jBmodificar.setEnabled(false);
        jBfinalizar.setEnabled(false);
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
        jBmodificar = new javax.swing.JButton();
        jBfinalizar = new javax.swing.JButton();
        jCBnombre = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTdietaFinalizada = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setClosable(true);
        setTitle("Consulta Dieta");
        setPreferredSize(new java.awt.Dimension(1096, 505));

        jTdieta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Nombre", "Paciente", "Peso Inicial", "Peso Objetivo", "Fecha Inicial", "Fecha Final"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTdieta.getTableHeader().setReorderingAllowed(false);
        jTdieta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTdietaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTdieta);
        if (jTdieta.getColumnModel().getColumnCount() > 0) {
            jTdieta.getColumnModel().getColumn(0).setMinWidth(0);
            jTdieta.getColumnModel().getColumn(0).setPreferredWidth(0);
            jTdieta.getColumnModel().getColumn(0).setMaxWidth(0);
            jTdieta.getColumnModel().getColumn(1).setResizable(false);
            jTdieta.getColumnModel().getColumn(2).setMinWidth(300);
            jTdieta.getColumnModel().getColumn(2).setPreferredWidth(300);
            jTdieta.getColumnModel().getColumn(2).setMaxWidth(300);
            jTdieta.getColumnModel().getColumn(3).setResizable(false);
            jTdieta.getColumnModel().getColumn(4).setResizable(false);
            jTdieta.getColumnModel().getColumn(5).setResizable(false);
            jTdieta.getColumnModel().getColumn(6).setResizable(false);
        }

        jLabel3.setText("D.N.I. del Paciente");

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

        jBmodificar.setText("MODIFICAR");
        jBmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBmodificarActionPerformed(evt);
            }
        });

        jBfinalizar.setText("FINALIZAR DIETA");
        jBfinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBfinalizarActionPerformed(evt);
            }
        });

        jCBnombre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elija el nombre", "Dieta KETO", "Dieta MEDITERRÁNEA", "Dieta CALÓRICA", "Dieta VEGANA", "Dieta VEGETARIANA", "Dieta DASH", "Dieta ORNISH", "Dieta D.M.A." }));

        jTdietaFinalizada.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Nombre", "Paciente", "Peso Inicial", "Peso Objetivo", "Fecha Inicial", "Fecha Final"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTdietaFinalizada.getTableHeader().setReorderingAllowed(false);
        jTdietaFinalizada.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTdietaFinalizadaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTdietaFinalizada);
        if (jTdietaFinalizada.getColumnModel().getColumnCount() > 0) {
            jTdietaFinalizada.getColumnModel().getColumn(0).setMinWidth(0);
            jTdietaFinalizada.getColumnModel().getColumn(0).setPreferredWidth(0);
            jTdietaFinalizada.getColumnModel().getColumn(0).setMaxWidth(0);
            jTdietaFinalizada.getColumnModel().getColumn(1).setResizable(false);
            jTdietaFinalizada.getColumnModel().getColumn(2).setMinWidth(300);
            jTdietaFinalizada.getColumnModel().getColumn(2).setPreferredWidth(300);
            jTdietaFinalizada.getColumnModel().getColumn(2).setMaxWidth(300);
            jTdietaFinalizada.getColumnModel().getColumn(3).setResizable(false);
            jTdietaFinalizada.getColumnModel().getColumn(4).setResizable(false);
            jTdietaFinalizada.getColumnModel().getColumn(5).setResizable(false);
            jTdietaFinalizada.getColumnModel().getColumn(6).setResizable(false);
        }

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Dietas Finalizadas");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText(" Dietas Activas");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTpesoInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTpesoFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(113, 113, 113)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jCBnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTfechaFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jBmodificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBfinalizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 782, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(26, 26, 26)
                                .addComponent(jTdniBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jBbuscar))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 780, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTdniBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBbuscar))
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addGap(14, 14, 14)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTpesoInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4)
                    .addComponent(jTfechaFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBmodificar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTpesoFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5)
                    .addComponent(jCBnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBfinalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBbuscarActionPerformed
        buscar();
        jBmodificar.setEnabled(false);
        jBfinalizar.setEnabled(false);
        jTpesoInicial.setText("");
        jTpesoFinal.setText("");
        jTfechaFinal.setText("");
        jCBnombre.setSelectedIndex(0);
    }//GEN-LAST:event_jBbuscarActionPerformed

    private void jTfechaFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTfechaFinalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTfechaFinalActionPerformed

    private void jTdietaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTdietaMouseClicked
        int filaSelec = jTdieta.getSelectedRow();
        int opc = resultadoOpcion(modelo.getValueAt(filaSelec, 1) + "");
        if (filaSelec != -1) {
            jTpesoInicial.setText(modelo.getValueAt(filaSelec, 3) + "");
            jTpesoFinal.setText(modelo.getValueAt(filaSelec, 4) + "");
            jTfechaFinal.setText(modelo.getValueAt(filaSelec, 6) + "");
            jCBnombre.setSelectedIndex(opc);
            jBmodificar.setEnabled(true);
            jBfinalizar.setEnabled(true);
        }
    }//GEN-LAST:event_jTdietaMouseClicked

    private void jTdietaFinalizadaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTdietaFinalizadaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTdietaFinalizadaMouseClicked

    private void jBfinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBfinalizarActionPerformed
        int filaSelec = jTdieta.getSelectedRow();
        int id = Integer.parseInt(jTdieta.getValueAt(filaSelec, 0) + "");
        Dieta_Data dD = new Dieta_Data();
        if (filaSelec != -1) {
            dD.finalizarDieta(id);
            buscar();

            jTpesoInicial.setText("");
            jTpesoFinal.setText("");
            jTfechaFinal.setText("");
            jCBnombre.setSelectedIndex(0);
            jBmodificar.setEnabled(false);
            jBfinalizar.setEnabled(false);
        }
    }//GEN-LAST:event_jBfinalizarActionPerformed

    private void jBmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBmodificarActionPerformed
        Paciente_Data pD = new Paciente_Data();
        Dieta_Data dD = new Dieta_Data();
        int filaSelec = jTdieta.getSelectedRow();
        int id = Integer.parseInt(jTdieta.getValueAt(filaSelec, 0) + "");
        String nombre = jCBnombre.getSelectedItem().toString();
        Paciente paciente = pD.buscarPacientePorDni(Integer.parseInt(jTdniBuscar.getText() + ""));
        LocalDate fechaIni = LocalDate.parse(jTdieta.getValueAt(filaSelec, 5) + "");
        LocalDate fechaFin = LocalDate.parse(jTfechaFinal.getText());
        double pesoIni = Double.parseDouble(jTpesoInicial.getText());
        double pesoFin = Double.parseDouble(jTpesoFinal.getText());

        Dieta dieta = new Dieta(id, nombre, paciente, pesoIni, pesoFin, fechaIni, fechaFin);

        dD.modificarDieta(dieta);
        buscar();

        jTpesoInicial.setText("");
        jTpesoFinal.setText("");
        jTfechaFinal.setText("");
        jCBnombre.setSelectedIndex(0);
        jBmodificar.setEnabled(false);
        jBfinalizar.setEnabled(false);

    }//GEN-LAST:event_jBmodificarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBbuscar;
    private javax.swing.JButton jBfinalizar;
    private javax.swing.JButton jBmodificar;
    private javax.swing.JComboBox<String> jCBnombre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTdieta;
    private javax.swing.JTable jTdietaFinalizada;
    private javax.swing.JTextField jTdniBuscar;
    private javax.swing.JTextField jTfechaFinal;
    private javax.swing.JTextField jTpesoFinal;
    private javax.swing.JTextField jTpesoInicial;
    // End of variables declaration//GEN-END:variables
private void armarCabecera() {
        modelo.addColumn("Id");
        modelo.addColumn("Nombre");
        modelo.addColumn("Paciente");
        modelo.addColumn("Peso Inicial");
        modelo.addColumn("Peso Objetivo");
        modelo.addColumn("Fecha Inicio");
        modelo.addColumn("Fecha Final");

        jTdieta.setModel(modelo);

    }

    private void borrarFila() {

        int f = jTdieta.getRowCount() - 1;
        for (; f >= 0; f--) {
            modelo.removeRow(f);

        }
    }

    private void borrarFila1() {

        int f = jTdietaFinalizada.getRowCount() - 1;
        for (; f >= 0; f--) {
            model.removeRow(f);

        }
    }

    private int resultadoOpcion(String nombre) {
        int resultado = 0;
        switch (nombre) {
            case "DIETA KETO":
                resultado = 1;
                break;
            case "DIETA MEDITERRÁNEA":
                resultado = 2;
                break;
            case "DIETA CALÓRICA":
                resultado = 3;
                break;
            case "DIETA VEGANA":
                resultado = 4;
                break;
            case "DIETA VEGETARIANA":
                resultado = 5;
                break;
            case "DIETA DASH":
                resultado = 6;
                break;
            case "DIETA ORNISH":
                resultado = 7;
                break;
            case "DIETA D.M.A ":
                resultado = 8;
                break;

        }

        return resultado;
    }

    private void buscar() {
        borrarFila1();
        borrarFila();

        try {
            int dni = Integer.parseInt(jTdniBuscar.getText());
            if (jTdniBuscar.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Debe ingresar un D.N.I. para buscar");
            } else {
                Paciente_Data pD = new Paciente_Data();
                Paciente paciente = new Paciente();
                int id = pD.buscarPacientePorDni(dni).getId_paciente();
                Dieta_Data dD = new Dieta_Data();
                for (Dieta dieta : dD.listarDietasNOFinalizadasPorPaciente(id)) {

                    modelo.addRow(new Object[]{
                        dieta.getId_dieta(),
                        dieta.getNombre_dieta(),
                        dieta.getPaciente().toString(),
                        dieta.getPeso_incial(),
                        dieta.getPeso_final(),
                        dieta.getFecha_inicial(),
                        dieta.getFecha_final(),});

                }

                for (Dieta diet : dD.listarDietasFinalizadasPorPaciente(id)) {

                    model.addRow(new Object[]{
                        diet.getId_dieta(),
                        diet.getNombre_dieta(),
                        diet.getPaciente().toString(),
                        diet.getPeso_incial(),
                        diet.getPeso_final(),
                        diet.getFecha_inicial(),
                        diet.getFecha_final(),});

                }
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Debe ingresar un número válido para el D.N.I.");
        }

    }
}
