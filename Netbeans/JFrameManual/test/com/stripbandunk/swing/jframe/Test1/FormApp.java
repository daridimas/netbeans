/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stripbandunk.swing.jframe.Test1;

import java.awt.Image;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

/**
 *
 * @author dimas
 */
public class FormApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        JFrame form = new JFrame();
        form.setSize(640, 480); // harus mengubah ukuran sebelum muncul
        // form.setLocation(100, 100); // lokasi munculnya form
        form.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); // Aplikasi akan berhenti ketika ditutup
        
        form.setTitle("Aplikasi Penjualan");
        form.setLocationRelativeTo(null); // lokasi munculnya form di tengah
        
        form.setExtendedState(JFrame.MAXIMIZED_BOTH); // pertama kali keluar akan full screen
        form.setResizable(false); //tombol resize hilang dan tidak bisa cursor resize
        
        ImageIcon icon = new ImageIcon(FormApp.class.getResource("/com/stripbandunk/swing/jframe/Bank_Mandiri_logo.png"));
        Image image = icon.getImage(); // mengubah icon menjadi image
        form.setIconImage(image); // menetapkan image pada form
        
        form.addWindowListener(new WindowListener() {
            @Override
            public void windowOpened(WindowEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void windowClosing(WindowEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void windowClosed(WindowEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void windowIconified(WindowEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void windowDeiconified(WindowEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void windowActivated(WindowEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void windowDeactivated(WindowEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
        
        form.setVisible(true); // untuk menampilkan formnya   
        
    }
    
}
