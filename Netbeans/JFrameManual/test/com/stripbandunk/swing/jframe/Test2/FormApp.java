package com.stripbandunk.swing.jframe.Test2;


import java.awt.Image;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
        form.setSize(640, 480);
        form.setLocation(100, 100);
        form.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        form.setTitle("Aplikasi Penjualan");
        form.setLocationRelativeTo(null);
        // form.setExtendedState(JFrame.MAXIMIZED_BOTH); //Maximize vert horiz
        form.setResizable(false); // tidak bisa diubah2 ukurannya
        
        // ubah icon
        ImageIcon icon = new ImageIcon(FormApp.class.getResource("/com/stripbandunk/swing/jframe/Test2/Bank_Mandiri_logo.png")); //2 javax.swing
        Image image = icon.getImage(); //3 java.awt
        form.setIconImage(image); //1
        
        // WindowListener mendeteksi aksi pada JFrame
        form.addWindowListener(new WindowListener() {
            @Override
            public void windowOpened(WindowEvent e) {
                System.out.println("JFrame Terbuka");
            }

            @Override
            public void windowClosing(WindowEvent e) {
                System.out.println("JFrame Akan Tertutup");
            }

            @Override
            public void windowClosed(WindowEvent e) {
                System.out.println("JFrame Telah Tertutup");
            }

            @Override
            public void windowIconified(WindowEvent e) {
                System.out.println("JFrame Minimize");
            }

            @Override
            public void windowDeiconified(WindowEvent e) {
                System.out.println("JFrame Unminimize");
            }

            @Override
            public void windowActivated(WindowEvent e) {
                System.out.println("JFrame Aktif");
            }

            @Override
            public void windowDeactivated(WindowEvent e) {
                System.out.println("JFrame Tidak Aktif");
            }
            
        });
        
        
        form.setVisible(true);
    }
    
}
