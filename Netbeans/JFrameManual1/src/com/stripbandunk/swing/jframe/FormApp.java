/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stripbandunk.swing.jframe;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

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
        form.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        form.setTitle("Aplikasi Penjualan");
        form.setLocationRelativeTo(null); // membuat aplikasi di tengah
        form.setExtendedState(JFrame.NORMAL);
        form.setResizable(false);
        
        ImageIcon icon = new ImageIcon(FormAppBab32.class.getResource("/com/stripbandunk/swing/jframe/logo.png"));
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
        
        
        form.setVisible(true);
    }
    
}
