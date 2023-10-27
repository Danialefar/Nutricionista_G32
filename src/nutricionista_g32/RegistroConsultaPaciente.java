package nutricionista_g32;

import Nutricionista_G32_accesoDatos.Dieta_Data;
import Nutricionista_G32_accesoDatos.Historial_Data;
import Nutricionista_G32_accesoDatos.Paciente_Data;
import Nutricionista_G32_entidades.Historial;
import Nutricionista_G32_entidades.Paciente;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class RegistroConsultaPaciente extends javax.swing.JInternalFrame {

    private DefaultTableModel modelo;

    private Paciente_Data Paciente_Data;

    public RegistroConsultaPaciente() {
        initComponents();

        modelo = (DefaultTableModel) jThistorial.getModel();

        jBeliminarRegistro.setEnabled(false);
        jBguardarRegistro.setEnabled(false);
        jBmodificarRegistro.setEnabled(false);
        jTfechaActual.setEnabled(false);
        jTapellidoPac.setEnabled(false);
        jTnombrePac.setEnabled(false);
        jTpesoControl.setEnabled(false);
        jTidPac.setEnabled(false);
        jThistorial.setEnabled(false);
        jBcambiarPeso.setEnabled(false);
        jBcambiarPeso.setEnabled(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTdniBuscar = new javax.swing.JTextField();
        jBbuscarPac = new javax.swing.JButton();
        jTpesoControl = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTidPac = new javax.swing.JTextField();
        jTapellidoPac = new javax.swing.JTextField();
        jTnombrePac = new javax.swing.JTextField();
        jBmodificarRegistro = new javax.swing.JButton();
        jBeliminarRegistro = new javax.swing.JButton();
        jBguardarRegistro = new javax.swing.JButton();
        jTfechaActual = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jThistorial = new javax.swing.JTable();
        jBcambiarPeso = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setClosable(true);
        setTitle("Registro | Consulta Paciente");
        setPreferredSize(new java.awt.Dimension(596, 450));

        jLabel1.setText("D.N.I. Paciente");

        jBbuscarPac.setText("BUSCAR");
        jBbuscarPac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBbuscarPacActionPerformed(evt);
            }
        });

        jLabel2.setText("Peso Control");

        jLabel3.setText("Fecha Control");

        jLabel4.setText("Id. Paciente");

        jLabel5.setText("Apellido/s");

        jLabel6.setText("Nombre/s");

        jBmodificarRegistro.setText("MODIFICAR");
        jBmodificarRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBmodificarRegistroActionPerformed(evt);
            }
        });

        jBeliminarRegistro.setText("ELIMINAR");
        jBeliminarRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBeliminarRegistroActionPerformed(evt);
            }
        });

        jBguardarRegistro.setText("GUARDAR");
        jBguardarRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBguardarRegistroActionPerformed(evt);
            }
        });

        jThistorial.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Fecha Control", "Peso Control"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jThistorial.getTableHeader().setReorderingAllowed(false);
        jThistorial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jThistorialMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jThistorial);
        if (jThistorial.getColumnModel().getColumnCount() > 0) {
            jThistorial.getColumnModel().getColumn(0).setMinWidth(0);
            jThistorial.getColumnModel().getColumn(0).setPreferredWidth(0);
            jThistorial.getColumnModel().getColumn(0).setMaxWidth(0);
            jThistorial.getColumnModel().getColumn(1).setResizable(false);
            jThistorial.getColumnModel().getColumn(2).setResizable(false);
        }

        jBcambiarPeso.setText("CAMBIAR PESO");
        jBcambiarPeso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBcambiarPesoActionPerformed(evt);
            }
        });

        jLabel7.setText("Seleccione un Registro para MODIFICAR o ELIMINAR");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTidPac, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTpesoControl, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jBcambiarPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTapellidoPac, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
                            .addComponent(jTnombrePac)
                            .addComponent(jTdniBuscar)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(jLabel3))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(343, 343, 343)
                                    .addComponent(jBbuscarPac))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(24, 24, 24)
                                    .addComponent(jTfechaActual, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBguardarRegistro)
                                .addGap(117, 117, 117)
                                .addComponent(jBmodificarRegistro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jBeliminarRegistro))))
                    .addComponent(jLabel2))
                .addContainerGap(63, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTdniBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBbuscarPac))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTidPac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTapellidoPac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTnombrePac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTpesoControl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBcambiarPeso))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTfechaActual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBguardarRegistro)
                    .addComponent(jBmodificarRegistro)
                    .addComponent(jBeliminarRegistro))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBbuscarPacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBbuscarPacActionPerformed
        borrarFilas();
        Paciente_Data pD = new Paciente_Data();
        Paciente paciente = new Paciente();
        Dieta_Data dD = new Dieta_Data();
        try {
            int dni = Integer.parseInt(jTdniBuscar.getText());
            paciente = pD.buscarPacientePorDni(dni);

            if (paciente != null) {
                if (paciente.isEstado() == false) {
                    JOptionPane.showMessageDialog(null, "El paciente está dado de baja, deberá activarlo nuevamente");
                    jTdniBuscar.setText("");
                        

                } else if (!dD.buscarDietaPorPaciente(paciente.getId_paciente())) {
                    JOptionPane.showMessageDialog(null, "El paciente no tiene una dieta asignada, debe registrar una dieta");
                    jBeliminarRegistro.setEnabled(false);
                    jBguardarRegistro.setEnabled(false);
                    jBmodificarRegistro.setEnabled(false);
                    jTfechaActual.setEnabled(false);
                    jTapellidoPac.setEnabled(false);
                    jTnombrePac.setEnabled(false);
                    jTpesoControl.setEnabled(false);
                    jTidPac.setEnabled(false);
                    jThistorial.setEnabled(false);
                    jTfechaActual.setText("");
                    jTapellidoPac.setText("");
                    jTnombrePac.setText("");
                    jTpesoControl.setText("");
                    jTidPac.setText("");
                    jTdniBuscar.setText("");
                } else {

                    jBeliminarRegistro.setEnabled(false);
                    jBguardarRegistro.setEnabled(true);
                    jBmodificarRegistro.setEnabled(false);
                    jTfechaActual.setEnabled(true);
                    jTfechaActual.setEditable(false);
                    jTfechaActual.setText(LocalDate.now().format(DateTimeFormatter.ISO_DATE));
                    jTapellidoPac.setEnabled(true);
                    jTnombrePac.setEnabled(true);
                    jTpesoControl.setEnabled(true);
                    jTidPac.setEnabled(false);
                    jBcambiarPeso.setEnabled(false);
                    jTapellidoPac.setText(paciente.getApellido_paciente());
                    jTnombrePac.setText(paciente.getNombre_paciente());
                    jTidPac.setText(paciente.getId_paciente() + "");

                    int id = Integer.parseInt(jTidPac.getText());
                    Historial hist = new Historial();
                    Historial_Data hD = new Historial_Data();

                    for (Historial hi : hD.cargarTabla(id)) {
                        modelo.addRow(new Object[]{
                            hi.getId_historial(),
                            hi.getFecha_registro(),
                            hi.getPeso_registro(),});
                    }
                    jThistorial.setEnabled(true);
                }

            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Debe ingresar un número de D.N.I. válido ");
        }


    }//GEN-LAST:event_jBbuscarPacActionPerformed

    private void jBguardarRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBguardarRegistroActionPerformed

        Paciente_Data pD = new Paciente_Data();
        Paciente pac = pD.buscarPacientePorId(Integer.parseInt(jTidPac.getText()));
        LocalDate fecha = LocalDate.now();
        Historial registro = new Historial(pac, Double.parseDouble(jTpesoControl.getText()), fecha);
        Historial_Data hD = new Historial_Data();
        
        
        
        hD.guardarHistorial(registro);

        jBeliminarRegistro.setEnabled(false);
        jBguardarRegistro.setEnabled(false);
        jBmodificarRegistro.setEnabled(false);
        jTfechaActual.setEnabled(false);
        jTapellidoPac.setEnabled(false);
        jTnombrePac.setEnabled(false);
        jTpesoControl.setEnabled(false);
        jTidPac.setEnabled(false);
        jThistorial.setEnabled(false);
        jTfechaActual.setText("");
        jTapellidoPac.setText("");
        jTnombrePac.setText("");
        jTpesoControl.setText("");
        jTidPac.setText("");
        jTdniBuscar.setText("");
        borrarFilas();
    }//GEN-LAST:event_jBguardarRegistroActionPerformed

    private void jBmodificarRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBmodificarRegistroActionPerformed
        int filaSelec = jThistorial.getSelectedRow();
        Historial_Data hD = new Historial_Data();
        if (filaSelec != -1) {

            int id = (Integer) modelo.getValueAt(filaSelec, 0);
            double peso = Double.parseDouble((String) modelo.getValueAt(filaSelec, 2));

            hD.modificarHistorial(peso, id);

            jBeliminarRegistro.setEnabled(false);
            jBguardarRegistro.setEnabled(false);
            jBmodificarRegistro.setEnabled(false);
            jTfechaActual.setEnabled(false);
            jTapellidoPac.setEnabled(false);
            jTnombrePac.setEnabled(false);
            jTpesoControl.setEnabled(false);
            jTidPac.setEnabled(false);
            jThistorial.setEnabled(false);
            jBcambiarPeso.setEnabled(false);
            jTfechaActual.setText("");
            jTapellidoPac.setText("");
            jTnombrePac.setText("");
            jTpesoControl.setText("");
            jTidPac.setText("");
            jTdniBuscar.setText("");
            borrarFilas();

        } else {
            JOptionPane.showMessageDialog(this, "Debe seleccionar un registro a modificar");
        }

    }//GEN-LAST:event_jBmodificarRegistroActionPerformed

    private void jBcambiarPesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBcambiarPesoActionPerformed
        try {
            int filaSelec = jThistorial.getSelectedRow();
            String pesoNuevo = (String) jTpesoControl.getText();
            Double peso = Double.parseDouble(pesoNuevo);
            if (filaSelec != -1) {
                if (peso >= 1 && peso <= 500) {
                    modelo.setValueAt(jTpesoControl.getText(), jThistorial.getSelectedRow(), 2);
                    jTpesoControl.setText("");
                    jBmodificarRegistro.setEnabled(true);
                    jBguardarRegistro.setEnabled(false);
                    jBeliminarRegistro.setEnabled(false);
                } else {
                    JOptionPane.showMessageDialog(this, "Debe ingresar un valor numérico entre 1 y 500");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Seleccione un historial del listado");
            }
        } catch (NumberFormatException nf) {
            JOptionPane.showMessageDialog(this, "Debe ingresar un número");
            jTpesoControl.setText("");

        }
    }//GEN-LAST:event_jBcambiarPesoActionPerformed

    private void jBeliminarRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBeliminarRegistroActionPerformed
        int filaSelec = jThistorial.getSelectedRow();
        Historial_Data hD = new Historial_Data();

        if (filaSelec != -1) {

            int id = (Integer) modelo.getValueAt(filaSelec, 0);

            hD.eliminarRegistro(id);

            jBeliminarRegistro.setEnabled(false);
            jBguardarRegistro.setEnabled(false);
            jBmodificarRegistro.setEnabled(false);
            jTfechaActual.setEnabled(false);
            jTapellidoPac.setEnabled(false);
            jTnombrePac.setEnabled(false);
            jTpesoControl.setEnabled(false);
            jTidPac.setEnabled(false);
            jThistorial.setEnabled(false);
            jTfechaActual.setText("");
            jTapellidoPac.setText("");
            jTnombrePac.setText("");
            jTpesoControl.setText("");
            jTidPac.setText("");
            jTdniBuscar.setText("");
            borrarFilas();

        } else {
            JOptionPane.showMessageDialog(this, "Debe ingresar un registro a eliminar");
        }
    }//GEN-LAST:event_jBeliminarRegistroActionPerformed

    private void jThistorialMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jThistorialMouseClicked
        jBcambiarPeso.setEnabled(true);
        jBeliminarRegistro.setEnabled(true);
        
    }//GEN-LAST:event_jThistorialMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBbuscarPac;
    private javax.swing.JButton jBcambiarPeso;
    private javax.swing.JButton jBeliminarRegistro;
    private javax.swing.JButton jBguardarRegistro;
    private javax.swing.JButton jBmodificarRegistro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTapellidoPac;
    private javax.swing.JTextField jTdniBuscar;
    private javax.swing.JTextField jTfechaActual;
    private javax.swing.JTable jThistorial;
    private javax.swing.JTextField jTidPac;
    private javax.swing.JTextField jTnombrePac;
    private javax.swing.JTextField jTpesoControl;
    // End of variables declaration//GEN-END:variables

    private void armarCabecera() {
        modelo.addColumn("ID_HISTORIAL");
        modelo.addColumn("FECHA CONTROL");
        modelo.addColumn("PESO CONTROL");
        jThistorial.setModel(modelo);
//        int columnIndexToHide = 0;
//        jThistorial.getColumnModel().getColumn(columnIndexToHide).setWidth(0);
    }

    private void borrarFilas() {
        int f = jThistorial.getRowCount() - 1;
        for (; f >= 0; f--) {
            modelo.removeRow(f);
        }
    }

}
