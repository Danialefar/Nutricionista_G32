/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nutricionista_g32;

import Nutricionista_G32_accesoDatos.Comida_Data;
import Nutricionista_G32_accesoDatos.Dieta_Data;
import Nutricionista_G32_accesoDatos.Dieta_Comida_Data;
import Nutricionista_G32_accesoDatos.Historial_Data;
import Nutricionista_G32_accesoDatos.Paciente_Data;
import Nutricionista_G32_entidades.Comida;
import Nutricionista_G32_entidades.Dieta;
import Nutricionista_G32_entidades.Dieta_Comida;
import Nutricionista_G32_entidades.Historial;
import Nutricionista_G32_entidades.Paciente;
import Nutricionista_G32_entidades.TiposComida;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author vvted
 */
public class MenuDietaComida extends javax.swing.JInternalFrame {
      private final DefaultTableModel modelo = new DefaultTableModel() {
        @Override
        public boolean isCellEditable(int f, int c) {
            return false;
        }
    };
      
    /**
     * Creates new form MenuDietaComida
     */
    public MenuDietaComida() {
  
        initComponents();
        armarCabecera();
        for (TiposComida cate : TiposComida.values()) {

            jChorario.addItem(cate);

        }
        jChorario.setEnabled(false);
        jTbuscarComida.setEnabled(false);
        jTcomida.setEnabled(false);
        jBseleccionar.setEnabled(false);
        jBfinalizar.setEnabled(false);
        jTplan.setEnabled(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jBbuscar = new javax.swing.JButton();
        jTdni = new javax.swing.JTextField();
        jLnombre = new javax.swing.JLabel();
        jLtipoDieta = new javax.swing.JLabel();
        jLidDieta = new javax.swing.JLabel();
        jChorario = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jTbuscarComida = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTcomida = new javax.swing.JTable();
        jBseleccionar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTplan = new javax.swing.JTextArea();
        jBfinalizar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        jLabel6.setText("cuando busca verifica que el paciente exista");

        setClosable(true);

        jLabel1.setText(" DNI Paciente:");

        jBbuscar.setText("Buscar");
        jBbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBbuscarActionPerformed(evt);
            }
        });

        jLnombre.setText("Nombre del Paciente");

        jLtipoDieta.setText("Tipo de Dieta");

        jLidDieta.setText("IdDieta no visible");

        jChorario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jChorarioActionPerformed(evt);
            }
        });

        jLabel5.setText("Buscar Comida");

        jTbuscarComida.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTbuscarComidaKeyReleased(evt);
            }
        });

        jTcomida.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTcomida);

        jBseleccionar.setText("Seleccionar");
        jBseleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBseleccionarActionPerformed(evt);
            }
        });

        jTplan.setColumns(20);
        jTplan.setRows(5);
        jScrollPane2.setViewportView(jTplan);

        jBfinalizar.setText("Finalizar");
        jBfinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBfinalizarActionPerformed(evt);
            }
        });

        jLabel7.setText("cuando busca verifica que el paciente exista");

        jLabel8.setText("y tenga una dieta activa. Si todo es correscto");

        jLabel9.setText("carga en el Label el nombre, apellido y la dieta");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(jLabel1)
                        .addGap(12, 12, 12)
                        .addComponent(jTdni, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jBbuscar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(235, 235, 235)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLnombre, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                                    .addComponent(jLtipoDieta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addComponent(jLidDieta)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(275, 275, 275)
                        .addComponent(jBseleccionar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 618, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(286, 286, 286)
                        .addComponent(jBfinalizar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(jLabel5)
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jChorario, 0, 203, Short.MAX_VALUE)
                            .addComponent(jTbuscarComida))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jBbuscar)
                    .addComponent(jTdni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLnombre)
                    .addComponent(jLabel7))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLidDieta)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLtipoDieta)
                    .addComponent(jLabel9))
                .addGap(26, 26, 26)
                .addComponent(jChorario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTbuscarComida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jBseleccionar)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jBfinalizar)
                .addContainerGap(87, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBbuscarActionPerformed
      Paciente_Data pD = new Paciente_Data();
        Paciente paciente = new Paciente();
        Dieta_Data dD = new Dieta_Data();
        try {
            int dni = Integer.parseInt(jTdni.getText());
            paciente = pD.buscarPacientePorDni(dni);

            if (paciente != null) {
                if (paciente.isEstado() == false) {
                    JOptionPane.showMessageDialog(null, "EL PACIENTE ESTÁ DADO DE BAJA, DEBERÁ ACTIVARLO NUEVAMENTE ");
                    jTdni.setText("");
                        

                } else if (!dD.buscarDietaPorPaciente(paciente.getId_paciente())) {
                    JOptionPane.showMessageDialog(null, "EL PACIENTE NO TIENE UNA DIETA ASIGNADA, DEBE REGISTRAR UNA DIETA");
                   
                    jTdni.setText("");
                } else {
                    jTplan.setEnabled(true);
                    jTplan.setEditable(false);
                    jChorario.setEnabled(true);
                    jTbuscarComida.setEnabled(true);
                    jTcomida.setEnabled(true);
                    jBseleccionar.setEnabled(true);
                    jBfinalizar.setEnabled(true);
                    jLnombre.setText(paciente.getApellido_paciente()+" " +paciente.getNombre_paciente());
                    for(Dieta d:dD.listarDietasNOFinalizadasPorPaciente(paciente.getId_paciente())){
                        jLtipoDieta.setText(d.getNombre_dieta());
                        jLidDieta.setText(d.getId_dieta()+"");
                        
                    }
                    
                  
                }

            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "DEBE INGRESAR UN NÚMERO DE DNI VÁLIDO ");
            jTdni.setText("");
        }
    }//GEN-LAST:event_jBbuscarActionPerformed

    private void jTbuscarComidaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTbuscarComidaKeyReleased
        borrarFilas();
        Comida_Data cD = new Comida_Data();

        for (Comida comid : cD.listarComidas()) {
            if (comid.getNombre_comida().toUpperCase().startsWith(jTbuscarComida.getText().toUpperCase())) {

                modelo.addRow(new Object[]{
                    comid.getId_comida(),
                    comid.getNombre_comida(),
                    comid.getCalorias_comida(),
                    comid.getDetalle_comida(),});
            }
        }
    }//GEN-LAST:event_jTbuscarComidaKeyReleased

    private void jChorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jChorarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jChorarioActionPerformed

    private void jBseleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBseleccionarActionPerformed
        
        //**** INSERT EB LA TABLA
        int filaSelec = jTcomida.getSelectedRow();
        
        if ((filaSelec != -1) && (jTbuscarComida.getText()!=null)) {
        
        int iddieta=Integer.parseInt(jLidDieta.getText());
        int idcomida=(int) modelo.getValueAt(filaSelec, 0);
        Comida comida=new Comida(idcomida);
        Dieta dieta=new Dieta(iddieta);
        TiposComida tipo=(TiposComida) jChorario.getSelectedItem();
        Dieta_Comida dc=new Dieta_Comida(comida,dieta,tipo);
        Dieta_Comida_Data dcd=new Dieta_Comida_Data();
        dcd.guardarDietaComida(dc);
        //********
        
        String detalle=modelo.getValueAt(filaSelec, 3)+"";
        jTplan.setText(tipo+ ": "+detalle +'\n');
        
        jTbuscarComida.setText("");
        
        }else {
            JOptionPane.showMessageDialog(null, "NO SELECCIONO UNA COMIDA");
        }      
    }//GEN-LAST:event_jBseleccionarActionPerformed

    private void jBfinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBfinalizarActionPerformed
        borrarFilas();
        jChorario.setEnabled(false);
        jTbuscarComida.setEnabled(false);
        jTcomida.setEnabled(false);
        jBseleccionar.setEnabled(false);
        jBfinalizar.setEnabled(false);
        jTplan.setEnabled(false);
        jTdni.setText("");
        jTplan.setText("");
    }//GEN-LAST:event_jBfinalizarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBbuscar;
    private javax.swing.JButton jBfinalizar;
    private javax.swing.JButton jBseleccionar;
    private javax.swing.JComboBox<TiposComida> jChorario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLidDieta;
    private javax.swing.JLabel jLnombre;
    private javax.swing.JLabel jLtipoDieta;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTbuscarComida;
    private javax.swing.JTable jTcomida;
    private javax.swing.JTextField jTdni;
    private javax.swing.JTextArea jTplan;
    // End of variables declaration//GEN-END:variables
  private void armarCabecera() {
        modelo.addColumn("ID");
        modelo.addColumn("NOMBRE");
        modelo.addColumn("CALORIAS");
        modelo.addColumn("DETALLE");
        jTcomida.setModel(modelo);
    }

    private void borrarFilas() {
        int f = jTcomida.getRowCount() - 1;
        for (; f >= 0; f--) {
            modelo.removeRow(f);
        }
    }
}
