/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nutricionista_g32;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
//import javax.swing.JDesktopPane;

/**
 *
 * @author vvted
 */
public class PantallaPrincipal extends javax.swing.JFrame {

    
    
    public PantallaPrincipal() {
        initComponents();
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImageIcon icon=new ImageIcon(getClass().getResource("/imag/NUTRIC-FOTO3.png"));
        Image image= icon.getImage();
        escritorio = new javax.swing.JDesktopPane(){
            public void paintComponent(Graphics g){
                g.drawImage(image,0,0,getWidth(),getHeight(),this);
            }
        };
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuPaciente = new javax.swing.JMenuItem();
        jMregistroConsulta = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuComida = new javax.swing.JMenuItem();
        jMlistarComidas = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuDieta = new javax.swing.JMenuItem();
        jMConsultaDieta = new javax.swing.JMenuItem();
        jMenuReporte = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuDietaComida = new javax.swing.JMenuItem();
        jMConsDietaComida = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        escritorio.setPreferredSize(new java.awt.Dimension(1900, 1377));

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 900, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        jMenu1.setText("Paciente");

        jMenuPaciente.setText("Menú Paciente");
        jMenuPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuPacienteActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuPaciente);

        jMregistroConsulta.setText("Registro | Consulta Paciente");
        jMregistroConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMregistroConsultaActionPerformed(evt);
            }
        });
        jMenu1.add(jMregistroConsulta);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Comida");

        jMenuComida.setText("Menú Comida");
        jMenuComida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuComidaActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuComida);

        jMlistarComidas.setText("Lista Comida");
        jMlistarComidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMlistarComidasActionPerformed(evt);
            }
        });
        jMenu2.add(jMlistarComidas);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Dieta");

        jMenuDieta.setText("Menú Dieta");
        jMenuDieta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuDietaActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuDieta);

        jMConsultaDieta.setText("Consulta Dieta");
        jMConsultaDieta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMConsultaDietaActionPerformed(evt);
            }
        });
        jMenu3.add(jMConsultaDieta);

        jMenuReporte.setText("Reporte Dieta Finalizada");
        jMenuReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuReporteActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuReporte);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Dieta Comida");

        jMenuDietaComida.setText("Menú Dieta Comida");
        jMenuDietaComida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuDietaComidaActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuDietaComida);

        jMConsDietaComida.setText("Consulta Dieta Comida");
        jMConsDietaComida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMConsDietaComidaActionPerformed(evt);
            }
        });
        jMenu4.add(jMConsDietaComida);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuPacienteActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        MenuPaciente mp= new MenuPaciente();
        mp.setVisible(true);
        escritorio.add(mp);
        escritorio.moveToFront(mp);
    }//GEN-LAST:event_jMenuPacienteActionPerformed

    private void jMenuComidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuComidaActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        MenuComida mc= new MenuComida();
        mc.setVisible(true);
        escritorio.add(mc);
        escritorio.moveToFront(mc);
                                   
    }//GEN-LAST:event_jMenuComidaActionPerformed

    private void jMregistroConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMregistroConsultaActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        RegistroConsultaPaciente rcp= new RegistroConsultaPaciente();
        rcp.setVisible(true);
        escritorio.add(rcp);
        escritorio.moveToFront(rcp);
    }//GEN-LAST:event_jMregistroConsultaActionPerformed

    private void jMenuDietaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuDietaActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        MenuDieta md= new MenuDieta();
        md.setVisible(true);
        escritorio.add(md);
        escritorio.moveToFront(md);
              
    }//GEN-LAST:event_jMenuDietaActionPerformed

    private void jMConsultaDietaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMConsultaDietaActionPerformed
         escritorio.removeAll();
        escritorio.repaint();
        ConsultaDieta cd= new ConsultaDieta();
        cd.setVisible(true);
        escritorio.add(cd);
        escritorio.moveToFront(cd);
    }//GEN-LAST:event_jMConsultaDietaActionPerformed

    private void jMenuDietaComidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuDietaComidaActionPerformed
         escritorio.removeAll();
        escritorio.repaint();
        MenuDietaComida mdc= new MenuDietaComida();
        mdc.setVisible(true);
        escritorio.add(mdc);
        escritorio.moveToFront(mdc);
    }//GEN-LAST:event_jMenuDietaComidaActionPerformed

    private void jMConsDietaComidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMConsDietaComidaActionPerformed
         escritorio.removeAll();
        escritorio.repaint();
        ConsultaDietaComida cdc= new ConsultaDietaComida();
        cdc.setVisible(true);
        escritorio.add(cdc);
        escritorio.moveToFront(cdc);
    }//GEN-LAST:event_jMConsDietaComidaActionPerformed

    private void jMlistarComidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMlistarComidasActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        ListaMenu lm= new ListaMenu();
        lm.setVisible(true);
        escritorio.add(lm);
        escritorio.moveToFront(lm);
    }//GEN-LAST:event_jMlistarComidasActionPerformed

    private void jMenuReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuReporteActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        ReporteDietaFinalizada rdf= new ReporteDietaFinalizada();
        rdf.setVisible(true);
        escritorio.add(rdf);
        escritorio.moveToFront(rdf);
    }//GEN-LAST:event_jMenuReporteActionPerformed

    /**,
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenuItem jMConsDietaComida;
    private javax.swing.JMenuItem jMConsultaDieta;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuComida;
    private javax.swing.JMenuItem jMenuDieta;
    private javax.swing.JMenuItem jMenuDietaComida;
    private javax.swing.JMenuItem jMenuPaciente;
    private javax.swing.JMenuItem jMenuReporte;
    private javax.swing.JMenuItem jMlistarComidas;
    private javax.swing.JMenuItem jMregistroConsulta;
    // End of variables declaration//GEN-END:variables
}
