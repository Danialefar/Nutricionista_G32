package nutricionista_g32;

import Nutricionista_G32_accesoDatos.Paciente_Data;
import Nutricionista_G32_entidades.Paciente;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

public class RegistroConsultaPaciente extends javax.swing.JInternalFrame {

    public RegistroConsultaPaciente() {
        initComponents();

        jBeliminarRegistro.setEnabled(false);
        jBguardarRegistro.setEnabled(false);
        jBmodificarRegistro.setEnabled(false);
        jTfechaActual.setEnabled(false);
        jTapellidoPac.setEnabled(false);
        jTnombrePac.setEnabled(false);
        jTpesoControl.setEnabled(false);
        jTidPac.setEnabled(false);

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

        setClosable(true);

        jLabel1.setText("D.N.I Paciente");

        jBbuscarPac.setText("BUSCAR");
        jBbuscarPac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBbuscarPacActionPerformed(evt);
            }
        });

        jLabel2.setText("Peso Control");

        jLabel3.setText("Fecha Control");

        jLabel4.setText("id. Paciente");

        jLabel5.setText("Apellido");

        jLabel6.setText("Nombre");

        jBmodificarRegistro.setText("MODIFICAR");

        jBeliminarRegistro.setText("ELIMINAR");

        jBguardarRegistro.setText("GUARDAR");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBbuscarPac)
                        .addGap(25, 25, 25))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(jTfechaActual, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTpesoControl, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel6))
                                        .addGap(24, 24, 24)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTdniBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jTnombrePac)
                                                .addComponent(jTapellidoPac)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jTidPac, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(0, 327, Short.MAX_VALUE))))))))
                        .addGap(0, 23, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jBguardarRegistro)
                .addGap(72, 72, 72)
                .addComponent(jBmodificarRegistro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addComponent(jBeliminarRegistro)
                .addGap(64, 64, 64))
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
                    .addComponent(jTpesoControl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTfechaActual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBguardarRegistro)
                    .addComponent(jBmodificarRegistro)
                    .addComponent(jBeliminarRegistro))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBbuscarPacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBbuscarPacActionPerformed
        Paciente_Data pD = new Paciente_Data();
        Paciente paciente = new Paciente();
        try {
            int dni = Integer.parseInt(jTdniBuscar.getText());
            paciente = pD.buscarPacientePorDni(dni);
            if (paciente != null){
                if ( paciente.isEstado()==false){
                    JOptionPane.showMessageDialog(null, "EL PACIENTE ESTÁ DADO DE BAJA, DEBERÁ ACTIVARLO NUEVAMENTE ");
                 
                }else{
                    
                jBeliminarRegistro.setEnabled(true);
                jBguardarRegistro.setEnabled(true);
                jBmodificarRegistro.setEnabled(true);
                jTfechaActual.setEnabled(true);
                jTfechaActual.setEditable(false);
                jTfechaActual.setText(LocalDate.now().format(DateTimeFormatter.ISO_DATE));
                jTapellidoPac.setEnabled(true);
                jTnombrePac.setEnabled(true);
                jTpesoControl.setEnabled(true);
                jTidPac.setEnabled(false);
                jTapellidoPac.setText(paciente.getApellido_paciente());
                jTnombrePac.setText(paciente.getNombre_paciente());
                jTidPac.setText(paciente.getId_paciente()+"");
                
            }
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "DEBE INGRESAR UN NÚMERO DE DNI VÁLIDO ");
        }


    }//GEN-LAST:event_jBbuscarPacActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBbuscarPac;
    private javax.swing.JButton jBeliminarRegistro;
    private javax.swing.JButton jBguardarRegistro;
    private javax.swing.JButton jBmodificarRegistro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTapellidoPac;
    private javax.swing.JTextField jTdniBuscar;
    private javax.swing.JTextField jTfechaActual;
    private javax.swing.JTextField jTidPac;
    private javax.swing.JTextField jTnombrePac;
    private javax.swing.JTextField jTpesoControl;
    // End of variables declaration//GEN-END:variables
}
