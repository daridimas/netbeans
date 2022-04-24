/*
 *  Copyright (c) 2011-2012, StripBandunk and/or its affiliates. All rights reserved.
 *  STRIPBANDUNK PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.stripbandunk.swingx.jxtreetable;

import com.stripbandunk.swingx.jxtreetable.entity.Barang;
import com.stripbandunk.swingx.jxtreetable.entity.Kategori;
import com.stripbandunk.swingx.jxtreetable.node.BarangNode;
import com.stripbandunk.swingx.jxtreetable.node.KategoriNode;
import java.util.ArrayList;
import java.util.List;
import org.jdesktop.swingx.treetable.DefaultMutableTreeTableNode;
import org.jdesktop.swingx.treetable.DefaultTreeTableModel;

/**
 *
 * @author echo
 */
public class FormUtama extends javax.swing.JFrame {

    private DefaultTreeTableModel treeTableModel;

    /**
     * Creates new form FormUtama
     */
    public FormUtama() {
        initComponents();

        DefaultMutableTreeTableNode root = new DefaultMutableTreeTableNode();

        List<String> columns = new ArrayList<>();
        columns.add("Kode");
        columns.add("Nama");
        columns.add("Harga");
        columns.add("Stok");

        treeTableModel = new DefaultTreeTableModel(root, columns);

        for (int i = 0; i < 10; i++) {
            Kategori kategori = new Kategori("000" + i, "Minuman " + i);
            KategoriNode kategoriNode = new KategoriNode(kategori);
            root.add(kategoriNode);
            
            for(int j = 0; j < 20; j++){
                Barang barang = new Barang("111" + j, "Jus " + j, 10000L, 100);
                BarangNode barangNode = new BarangNode(barang);
                kategoriNode.add(barangNode);
            }
            
        }
        
        jXTreeTable1.setTreeTableModel(treeTableModel);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jXTreeTable1 = new org.jdesktop.swingx.JXTreeTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("JXTreeTable");

        jScrollPane1.setViewportView(jXTreeTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 484, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 319, Short.MAX_VALUE)
                .addContainerGap())
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-506)/2, (screenSize.height-361)/2, 506, 361);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(FormUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new FormUtama().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private org.jdesktop.swingx.JXTreeTable jXTreeTable1;
    // End of variables declaration//GEN-END:variables
}
