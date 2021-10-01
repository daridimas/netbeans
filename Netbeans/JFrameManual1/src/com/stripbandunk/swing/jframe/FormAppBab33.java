/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stripbandunk.swing.jframe;

import java.awt.Image;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author dimas
 */
public class FormAppBab33 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        JFrame form = new JFrame();
        
        form.setSize(640, 480);
        form.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        form.setTitle("Aplikasi Penjualan");
        form.setLocationRelativeTo(null); // membuat aplikasi di tengah
        form.setExtendedState(JFrame.NORMAL);
        form.setResizable(false);
        
        ImageIcon icon = new ImageIcon(FormAppBab33.class.getResource("/com/stripbandunk/swing/jframe/logo.png"));
        Image image = icon.getImage();
        form.setIconImage(image);
        
        /**
         * NORMAL = membuat aplikasi berukuran normal sesuai canvas
         * ICONIFIED = aplikasi minimize saat pertama kali dibuka
         * MAXIMIZE_HORIZ = Aplikasi memenuhi kanan kiri layar saat pertama kali
         * dibuka
         * MAXIMIZE_VERT = Aplikasi memenuhi atas bawah layar saat pertama kali 
         * dibuka
         * MAXIMIZE_BOTH = Aplikasi akan full screen saat pertama kali dibuka
         */
        
        // WindowListener yang digunakan untuk mendeteksi aksi pada JFrame
        
        form.addWindowListener(new WindowListener() {
            @Override
            public void windowOpened(WindowEvent e) {
                // Metode ini dipanggil ketika form pertama kali terbuka
                System.out.println("JFrame Terbuka");
            }

            @Override
            public void windowClosing(WindowEvent e) {
                // Metode ini dipanggil ketika form 'akan tertutup'
                System.out.println("JFrame Akan Tertutup");
            }

            @Override
            public void windowClosed(WindowEvent e) {
                // Metode ini dipanggil ketika form 'telah tertutup'
                System.out.println("JFrame telah Tertutup");
            }

            @Override
            public void windowIconified(WindowEvent e) {
                // Metode ini dipanggil ketika form 'ter-minimize'
                System.out.println("JFrame minimize");
            }

            @Override
            public void windowDeiconified(WindowEvent e) {
                // Metode ini dipanggil ketika form 'terbuka kembali setelah minimize'
                System.out.println("JFrame un-minimize");
            }

            @Override
            public void windowActivated(WindowEvent e) {
                // Metode ini dipanggil ketika form 'sedang aktif'
                System.out.println("JFrame aktif");
            }

            @Override
            public void windowDeactivated(WindowEvent e) {
                // Metode ini dipanggil ketika form 'sedang tidak aktif'
                System.out.println("JFrame tidak aktif");
            }
        });
        
        form.setVisible(true);
        
        
    }
    
}
