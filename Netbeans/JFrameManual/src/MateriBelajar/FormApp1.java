/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MateriBelajar;

import java.awt.Image;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author dimas
 */
public class FormApp1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        JFrame form = new JFrame(); // hanya memanggil Jframe
        
        form.setSize(640, 480); // Logikanya, ukurannya ditentukan dulu baru dimunculkan form
        
        form.setTitle("Aplikasi Penjualan Anda"); // menambahkan judul
        form.setLocationRelativeTo(null); // posisi ditengah
        form.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); 
        
        /**
         * Do Nothing on close = click silang tidak terjadi apa2.
         * Hide on close = formnya hilang tapi aplikasi tidak tertutup
         * Dispose on close = formnya hilang, tapi jika ada form lain maka tidak hilang
         * Exit on close = form hilang dan aplikasi tertutup
        */
        
        
        //form.setExtendedState(JFrame.NORMAL);
        /**
         * normal
         * iconified = minimize saat apikasi dibuka
         * maximize_horiz = akan maximize secara horizontal saat aplikasi dibuka
         * maximize_vert = akan maximize secara vertikal saat aplikasi dibuka
         * maximize_both = akan maximize horizontal dan vertical atau full screen
        */
        
        form.setResizable(false); // agar tidak bisa diubah-ubah ukurannya
        
        // dibawah ini cara mengubah icon aplikasi
        ImageIcon icon = new ImageIcon(FormApp1.class.getResource("/MateriBelajar/logo.png")); // menarik url gambar dan memasukkannya ke icon
        Image image = icon.getImage(); //konversi icon ke image
        form.setIconImage(image); // Jframe menerapkan iconImage
        
        form.addWindowListener(new WindowListener() {
            @Override
            public void windowOpened(WindowEvent e) {
                // metode akan dieksekusi ketika windows pertama kali terbuka
                System.out.println("JFrame Terbuka");
            }

            @Override
            public void windowClosing(WindowEvent e) {
                // metode akan dieksekusi ketika windows akan tertutup
                System.out.println("JFrame akan Tertutup");
            }

            @Override
            public void windowClosed(WindowEvent e) {
                // metode akan dieksekusi ketika windows sudah tertutup
                System.out.println("JFrame Telah Tertutup");
            }

            @Override
            public void windowIconified(WindowEvent e) {
                // metode akan dieksekusi ketika sebuah window di minime
                System.out.println("JFrame minimize");
            }

            @Override
            public void windowDeiconified(WindowEvent e) {
                // metode akan dieksekusi ketika sebuah windows unminimize
                System.out.println("JFrame un-minimize");
            }

            @Override
            public void windowActivated(WindowEvent e) {
                // metode akan dieksekusi ketika window aktif
                System.out.println("JFrame aktif");
            }

            @Override
            public void windowDeactivated(WindowEvent e) {
                // metode akan dieksekusi ketika window tidak aktif
                System.out.println("JFrame tidak aktif");
            }
            
        });
        form.setVisible(true); // memunculkan form
        
    }
    
}
