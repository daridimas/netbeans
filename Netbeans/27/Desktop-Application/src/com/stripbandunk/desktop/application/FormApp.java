/*
 *  Copyright (c) 2011-2012, StripBandunk and/or its affiliates. All rights reserved.
 *  STRIPBANDUNK PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.stripbandunk.desktop.application;

import com.stripbandunk.desktop.application.dialog.DialogLogin;
import com.stripbandunk.jglasspane.helper.GraphicHelper;
import com.stripbandunk.jglasspane.transition.image.FadeImageTransition;
import com.stripbandunk.jglasspane.transition.image.creator.ComponentImageCreator;
import java.awt.CardLayout;

/**
 *
 * @author echo
 */
public class FormApp extends javax.swing.JFrame {

    /**
     * Creates new form FormApp
     */
    public FormApp() {
        initComponents();

        setGlassPane(jGlassPane1);
        getGlassPane().setVisible(true);

        jGlassPane1.addGlassPaneComponent(imageTransitionComponent1);

        imageTransitionComponent1.setImageCreator(new ComponentImageCreator(jPanel1));
    }
    
    public void login(){
        DialogLogin dialog = new DialogLogin();
        dialog.setLocationRelativeTo(this);
        dialog.setVisible(true);
    }

    public void logout(){
        // proses yang diperlukan ketika logout
        
        // panggil login()
        login();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jGlassPane1 = new com.stripbandunk.jglasspane.JGlassPane();
        imageTransitionComponent1 = new com.stripbandunk.jglasspane.component.ImageTransitionComponent();
        jPanel1 = new javax.swing.JPanel();
        panelWelcome1 = new com.stripbandunk.desktop.application.panel.PanelWelcome();
        panelKategori1 = new com.stripbandunk.desktop.application.panel.PanelKategori();
        panelBarang1 = new com.stripbandunk.desktop.application.panel.PanelBarang();
        panelPengguna1 = new com.stripbandunk.desktop.application.panel.PanelPengguna();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Aplikasi Manajemen Barang");

        jPanel1.setLayout(new java.awt.CardLayout());
        jPanel1.add(panelWelcome1, "welcome");
        jPanel1.add(panelKategori1, "kategori");
        jPanel1.add(panelBarang1, "barang");
        jPanel1.add(panelPengguna1, "pengguna");

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        jMenu1.setText("File");

        jMenuItem4.setText("Keluar Pengguna");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuItem5.setText("Tutup Aplikasi");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Data Master");

        jMenuItem1.setText("Kategori");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuItem2.setText("Barang");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Hak Akses");

        jMenuItem3.setText("Pengguna");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem3);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-650)/2, (screenSize.height-430)/2, 650, 430);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:

        System.exit(0);

    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:

        FadeImageTransition transition = new FadeImageTransition();
        transition.setCoordinate(GraphicHelper.getLocation(jPanel1, jGlassPane1));

        imageTransitionComponent1.setTransition(transition);
        imageTransitionComponent1.start();

        CardLayout layout = (CardLayout) jPanel1.getLayout();
        layout.show(jPanel1, "kategori");

        panelKategori1.reload();

    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:

        FadeImageTransition transition = new FadeImageTransition();
        transition.setCoordinate(GraphicHelper.getLocation(jPanel1, jGlassPane1));

        imageTransitionComponent1.setTransition(transition);
        imageTransitionComponent1.start();

        CardLayout layout = (CardLayout) jPanel1.getLayout();
        layout.show(jPanel1, "barang");

        panelBarang1.reload();

    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        FadeImageTransition transition = new FadeImageTransition();
        transition.setCoordinate(GraphicHelper.getLocation(jPanel1, jGlassPane1));

        imageTransitionComponent1.setTransition(transition);
        imageTransitionComponent1.start();

        CardLayout layout = (CardLayout) jPanel1.getLayout();
        layout.show(jPanel1, "pengguna");

        panelPengguna1.reload();

    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        
        FadeImageTransition transition = new FadeImageTransition();
        transition.setCoordinate(GraphicHelper.getLocation(jPanel1, jGlassPane1));

        imageTransitionComponent1.setTransition(transition);
        imageTransitionComponent1.start();

        CardLayout layout = (CardLayout) jPanel1.getLayout();
        layout.show(jPanel1, "welcome");
        
        logout();
        
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                FormApp app = new FormApp();
                app.setVisible(true);
                app.login();
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.stripbandunk.jglasspane.component.ImageTransitionComponent imageTransitionComponent1;
    private com.stripbandunk.jglasspane.JGlassPane jGlassPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JPanel jPanel1;
    private com.stripbandunk.desktop.application.panel.PanelBarang panelBarang1;
    private com.stripbandunk.desktop.application.panel.PanelKategori panelKategori1;
    private com.stripbandunk.desktop.application.panel.PanelPengguna panelPengguna1;
    private com.stripbandunk.desktop.application.panel.PanelWelcome panelWelcome1;
    // End of variables declaration//GEN-END:variables
}
