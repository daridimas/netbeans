/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stripbandunk.swing.frame;

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
        
        JFrame form = new JFrame(); // hanya memanggil Jframe
        
        form.setSize(640, 480); // Logikanya, ukurannya ditentukan dulu baru dimunculkan form
        form.setLocationRelativeTo(null); // posisi ditengah
        form.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); 
        
        // Do Nothing on close = click silang tidak terjadi apa2.
        // Hide on close = formnya hilang tapi aplikasi tidak tertutup
        // Dispose on close = formnya hilang, tapi jika ada form lain maka tidak hilang
        // Exit on close = form hilang dan aplikasi tertutup
        
        
        
        form.setVisible(true); // memunculkan form
        
    }
    
}
