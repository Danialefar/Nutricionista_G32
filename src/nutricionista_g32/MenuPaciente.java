
package nutricionista_g32;

import Nutricionista_G32_accesoDatos.Paciente_Data;
import Nutricionista_G32_entidades.Paciente;
import javax.swing.JOptionPane;


public class MenuPaciente extends javax.swing.JInternalFrame {

    
    public MenuPaciente() {
        initComponents();

        jBnuevo.setEnabled(true);
        jBbuscar.setEnabled(true);
        jBeliminar.setEnabled(false);
        jBmodificar.setEnabled(false);
        jBguardar.setEnabled(false);
        jTdni.setEnabled(true);
        jTapellido.setEnabled(false);
        jTnombre.setEnabled(false);
        jTdireccion.setEnabled(false);
        jTnroTelefono.setEnabled(false);
        jRestado.setSelected(false);
        jTidPaciente.setVisible(false);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTdni = new javax.swing.JTextField();
        jTapellido = new javax.swing.JTextField();
        jTnombre = new javax.swing.JTextField();
        jTdireccion = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTnroTelefono = new javax.swing.JTextField();
        jRestado = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jBbuscar = new javax.swing.JButton();
        jBnuevo = new javax.swing.JButton();
        jBmodificar = new javax.swing.JButton();
        jBeliminar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jBguardar = new javax.swing.JButton();
        jTidPaciente = new javax.swing.JTextField();

        setClosable(true);
        setForeground(java.awt.Color.orange);
        setTitle("MENU PACIENTE");
        setPreferredSize(new java.awt.Dimension(596, 396));

        jLabel1.setText("DNI");

        jLabel2.setText("Apellido");

        jLabel3.setText("Nombre");

        jLabel4.setText("Dirección");

        jTnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTnombreActionPerformed(evt);
            }
        });

        jLabel5.setText("Telefono");

        jTnroTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTnroTelefonoActionPerformed(evt);
            }
        });

        jRestado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRestadoActionPerformed(evt);
            }
        });

        jLabel6.setText("Estado");

        jBbuscar.setText("BUSCAR");
        jBbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBbuscarActionPerformed(evt);
            }
        });

        jBnuevo.setText("NUEVO");
        jBnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBnuevoActionPerformed(evt);
            }
        });

        jBmodificar.setText("MODIFICAR");
        jBmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBmodificarActionPerformed(evt);
            }
        });

        jBeliminar.setText("ELIMINAR");
        jBeliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBeliminarActionPerformed(evt);
            }
        });

        jLabel7.setText("(calle - altura - barrio - ciudad - provincia)");

        jBguardar.setText("GUARDAR");
        jBguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBguardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTdireccion, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7)
                                    .addComponent(jTnroTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jBguardar))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 177, Short.MAX_VALUE)
                                .addComponent(jTidPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTnombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTdni, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jRestado, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTapellido, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(80, 80, 80))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(332, 431, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBbuscar)
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jBnuevo)
                        .addGap(33, 33, 33)
                        .addComponent(jBmodificar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBeliminar)
                        .addGap(34, 34, 34))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTdni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBbuscar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTapellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTnroTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTidPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jRestado)))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBnuevo)
                    .addComponent(jBmodificar)
                    .addComponent(jBeliminar)
                    .addComponent(jBguardar))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRestadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRestadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRestadoActionPerformed

    private void jTnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTnombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTnombreActionPerformed

    private void jTnroTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTnroTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTnroTelefonoActionPerformed

    private void jBnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBnuevoActionPerformed
        jBnuevo.setEnabled(false);
        jBbuscar.setEnabled(false);
        jBeliminar.setEnabled(false);
        jBmodificar.setEnabled(false);
        jBguardar.setEnabled(true);
        jTdni.setEnabled(true);
        jTapellido.setEnabled(true);
        jTnombre.setEnabled(true);
        jTdireccion.setEnabled(true);
        jTnroTelefono.setEnabled(true);
        jRestado.setSelected(true);
    }//GEN-LAST:event_jBnuevoActionPerformed

    private void jBguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBguardarActionPerformed
        try {
//            int dni = Integer.parseInt(jTdni.getText());
//            int telefono = Integer.parseInt(jTnroTelefono.getText());
            boolean estado = false;
            if (jRestado.isSelected()) {
                estado = true;
            }

            if (jTapellido.getText().isEmpty() || jTnombre.getText().isEmpty() || jTdireccion.getText().isEmpty()
                    || jTnroTelefono.getText().isEmpty() || jTdni.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "NINGUN CAMPO PUEDE ESTAR VACÍO");
            } else if (Integer.parseInt(jTdni.getText()) < 1000000 || Integer.parseInt(jTdni.getText()) > 60000000) {
                JOptionPane.showMessageDialog(null, "DEBE INGRESAR UN DNI VÁLIDO");
            } else if (jTnroTelefono.getText().length() != 10) {
                JOptionPane.showMessageDialog(null, "DEBE INGRESAR UN TELEFONO VÁLIDO");
            } else {

                Paciente paciente = new Paciente(jTapellido.getText(), jTnombre.getText(), Integer.parseInt(jTdni.getText()), jTdireccion.getText(), jTnroTelefono.getText(), jRestado.isSelected());
                Paciente_Data pD = new Paciente_Data();
                pD.guardarPaciente(paciente);

                jBnuevo.setEnabled(true);
                jBbuscar.setEnabled(true);
                jBeliminar.setEnabled(false);
                jBmodificar.setEnabled(false);
                jBguardar.setEnabled(false);
                jTdni.setEnabled(true);
                jTapellido.setEnabled(false);
                jTnombre.setEnabled(false);
                jTdireccion.setEnabled(false);
                jTnroTelefono.setEnabled(false);
                jRestado.setEnabled(false);
                jTnroTelefono.setText("");
                jTdni.setText("");
                jTapellido.setText("");
                jTnombre.setText("");
                jTdireccion.setText("");
                jTnroTelefono.setText("");
            }

        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "DEBE INGRESAR UN NÚMERO VÁLIDO");
        }

    }//GEN-LAST:event_jBguardarActionPerformed

    private void jBbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBbuscarActionPerformed
        Paciente_Data pD = new Paciente_Data();
        Paciente paciente = new Paciente();
        try {
            int dni = Integer.parseInt(jTdni.getText());
            paciente = pD.buscarPacientePorDni(dni);
            if (paciente != null) {
                jBmodificar.setEnabled(true);
                jTapellido.setText(paciente.getApellido_paciente());
                jTnombre.setText(paciente.getNombre_paciente());
                jTdireccion.setText(paciente.getDireccion_paciente());
                jTnroTelefono.setText(paciente.getTelef_paciente());
                jTidPaciente.setText(paciente.getId_paciente() + "");
                jBnuevo.setEnabled(false);
                jBeliminar.setEnabled(true);
                jTapellido.setEnabled(true);
                jTnombre.setEnabled(true);
                jTdireccion.setEnabled(true);
                jTnroTelefono.setEnabled(true);
                jRestado.setEnabled(true);
                if (paciente.isEstado()) {
                    jRestado.setSelected(true);
                } else {
                    jRestado.setSelected(false);
                }
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "DEBE INGRESAR UN NÚMERO DE DNI VÁLIDO ");
        }
    }//GEN-LAST:event_jBbuscarActionPerformed

    private void jBeliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBeliminarActionPerformed
        if (jRestado.isSelected() == false) {
            JOptionPane.showMessageDialog(null, "EL PACIENTE YA ESTÁ DADO DE BAJA");
            jTdni.setText("");
            jTapellido.setText("");
            jTnombre.setText("");
            jTdireccion.setText("");
            jTnroTelefono.setText("");
            jBnuevo.setEnabled(true);
            jBbuscar.setEnabled(true);
            jBeliminar.setEnabled(false);
            jBmodificar.setEnabled(false);
            jBguardar.setEnabled(false);
            jTdni.setEnabled(true);
            jTapellido.setEnabled(false);
            jTnombre.setEnabled(false);
            jTdireccion.setEnabled(false);
            jTnroTelefono.setEnabled(false);
            jRestado.setSelected(false);
        } else {
            Paciente_Data pD = new Paciente_Data();
            Paciente paciente = new Paciente();
            try {
                int dni = Integer.parseInt(jTdni.getText());
                pD.bajaPaciente(dni);

                jBnuevo.setEnabled(true);
                jBbuscar.setEnabled(true);
                jBeliminar.setEnabled(false);
                jBmodificar.setEnabled(false);
                jBguardar.setEnabled(false);
                jTdni.setEnabled(true);
                jTapellido.setEnabled(false);
                jTnombre.setEnabled(false);
                jTdireccion.setEnabled(false);
                jTnroTelefono.setEnabled(false);
                jRestado.setEnabled(false);
                jRestado.setSelected(false);
                jTdni.setText("");
                jTapellido.setText("");
                jTnombre.setText("");
                jTdireccion.setText("");
                jTnroTelefono.setText("");

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "EL DNI INGRESADO NO ES VÁLIDO ");
            }
        }
    }//GEN-LAST:event_jBeliminarActionPerformed

    private void jBmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBmodificarActionPerformed
        try {
            int id = Integer.parseInt(jTidPaciente.getText());
            int dni = Integer.parseInt(jTdni.getText());
            String apellido = jTapellido.getText();
            String nombre = jTnombre.getText();
            String direccion = jTdireccion.getText();
            String telefono = jTnroTelefono.getText();
            boolean est;
            if (jRestado.isSelected()) {
                est = true;
            } else {
                est = false;
            }
            if (jTapellido.getText().isEmpty() || jTnombre.getText().isEmpty() || jTdireccion.getText().isEmpty()
                    || jTnroTelefono.getText().isEmpty() || jTdni.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "NINGUN CAMPO PUEDE ESTAR VACÍO");
            } else if (dni < 1000000 || dni > 60000000) {
                JOptionPane.showMessageDialog(null, "DEBE INGRESAR UN DNI VÁLIDO");
            } else if (jTnroTelefono.getText().length() != 10) {
                JOptionPane.showMessageDialog(null, "DEBE INGRESAR UN TELEFONO VÁLIDO");
            } else {
                Paciente paciente = new Paciente(id, apellido, nombre, dni, direccion, telefono, est);
                Paciente_Data pD = new Paciente_Data();

                pD.modificarPaciente(paciente);

                jBnuevo.setEnabled(true);
                jBbuscar.setEnabled(true);
                jBeliminar.setEnabled(false);
                jBmodificar.setEnabled(false);
                jBguardar.setEnabled(false);
                jTdni.setEnabled(true);
                jTapellido.setEnabled(false);
                jTnombre.setEnabled(false);
                jTdireccion.setEnabled(false);
                jTnroTelefono.setEnabled(false);
                jRestado.setEnabled(false);
                jRestado.setSelected(false);
                jTdni.setText("");
                jTapellido.setText("");
                jTnombre.setText("");
                jTdireccion.setText("");
                jTnroTelefono.setText("");
            }
            }catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "DEBE INGRESAR UN DNI VÁLIDO ");
        }
    }//GEN-LAST:event_jBmodificarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBbuscar;
    private javax.swing.JButton jBeliminar;
    private javax.swing.JButton jBguardar;
    private javax.swing.JButton jBmodificar;
    private javax.swing.JButton jBnuevo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JRadioButton jRestado;
    private javax.swing.JTextField jTapellido;
    private javax.swing.JTextField jTdireccion;
    private javax.swing.JTextField jTdni;
    private javax.swing.JTextField jTidPaciente;
    private javax.swing.JTextField jTnombre;
    private javax.swing.JTextField jTnroTelefono;
    // End of variables declaration//GEN-END:variables
}
