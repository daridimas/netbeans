/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasiarsipsuratv2;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
// import javax.swing.JOptionPane;

/**
 *
 * @author dimas
 */
public class koneksi {
    Connection con;
    public koneksi() {
        String id, pass, driver, url;
        id = "root"; // id atau user dari DBMS
        pass = ""; // Password User DBMS
        driver = "com.mysql.jdbc.Driver"; // Driver JDBC MySQL
        url = "jdbc:mysql://localhost:3306/db_surat"; // Nama URL DBMS dan Database
        
        try {
            Class.forName(driver).newInstance();
            con = (Connection) DriverManager.getConnection(url, id, pass);
            // JOptionPane.showMessageDialog(null, "Koneksi Sukses!");          
        } 
        
        catch (Exception e) {
            System.out.println("" + e.getLocalizedMessage());
        }
    }
    
//    public static void main(String[] args) {
//        koneksi cek = new koneksi();
//    }
}
