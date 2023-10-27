/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nutricionista_g32;

import Nutricionista_G32_accesoDatos.Dieta_Data;
import Nutricionista_G32_entidades.Reporte;
import javax.swing.table.DefaultTableModel;

public class ReporteDietaFinalizada extends javax.swing.JInternalFrame {

    private DefaultTableModel modelo;
    private DefaultTableModel model;

    public ReporteDietaFinalizada() {
        initComponents();
        modelo = (DefaultTableModel) jTablaReporteBP.getModel();
        model = (DefaultTableModel) jTablaReporteSP.getModel();

        Dieta_Data dD = new Dieta_Data();
        borrarFilas();
        borrarFilas1();
        for (Reporte report : dD.reporteDietasFinalizadasSinExitoBP()) {
            modelo.addRow(new Object[]{
                report.getPaciente().toString(),
                report.getPesoObjetivo(),
                report.getUltimoPesoRegistro(),
                report.getDiferencia(),});
        }
        
        for (Reporte report : dD.reporteDietasFinalizadasSinExitoSP()) {
            model.addRow(new Object[]{
                report.getPaciente().toString(),
                report.getPesoObjetivo(),
                report.getUltimoPesoRegistro(),
                report.getDiferencia(),});
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTablaReporteBP = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTablaReporteSP = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        setClosable(true);
        setTitle("REPORTE DIETAS FINALIZADAS NO EXITOSAS");

        jTablaReporteBP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Paciente", "Peso Objetivo", "Ultimo Peso Registrado", "Diferencia"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTablaReporteBP);
        if (jTablaReporteBP.getColumnModel().getColumnCount() > 0) {
            jTablaReporteBP.getColumnModel().getColumn(0).setMinWidth(350);
            jTablaReporteBP.getColumnModel().getColumn(0).setPreferredWidth(350);
            jTablaReporteBP.getColumnModel().getColumn(0).setMaxWidth(350);
        }

        jLabel1.setText("Listado de Dietas para Bajar de Peso  NO ALCANZADAS");

        jTablaReporteSP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Paciente", "Peso Objetivo", "Ultimo Peso Registrado", "Diferencia"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTablaReporteSP);
        if (jTablaReporteSP.getColumnModel().getColumnCount() > 0) {
            jTablaReporteSP.getColumnModel().getColumn(0).setMinWidth(350);
            jTablaReporteSP.getColumnModel().getColumn(0).setPreferredWidth(350);
            jTablaReporteSP.getColumnModel().getColumn(0).setMaxWidth(350);
        }

        jLabel2.setText("Listado de Dietas para Subir de Peso  NO ALCANZADAS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 904, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 904, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTablaReporteBP;
    private javax.swing.JTable jTablaReporteSP;
    // End of variables declaration//GEN-END:variables

    private void borrarFilas() {
        int f = jTablaReporteBP.getRowCount() - 1;
        for (; f >= 0; f--) {
            modelo.removeRow(f);
        }
    }
    private void borrarFilas1() {
        int f = jTablaReporteSP.getRowCount() - 1;
        for (; f >= 0; f--) {
            model.removeRow(f);
        }
    }

}
