/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stripbandunk.swing.jdynamictable;

import com.stripbandunk.jwidget.annotation.TableColumn;
import java.util.Date;

/**
 *
 * @author dimas
 */
public class Kontak {
    @TableColumn(name = "Nama", number = 0, size = 20, groups = {"ADMIN", "GUEST"})
    private String nama;
    
    @TableColumn(name = "Telepon", number = 1, size = 20, groups = {"ADMIN"})
    private String telepon;
    
    @TableColumn(name = "Tanggal Lahir", number = 2, size = 18, renderer = TanggalRenderer.class, groups = {"ADMIN", "GUEST"})
    private Date tanggalLahir;
    
    @TableColumn(name = "Info", number=3, size = 50)
    private String info;

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getTelepon() {
        return telepon;
    }

    public void setTelepon(String telepon) {
        this.telepon = telepon;
    }

    public Date getTanggalLahir() {
        return tanggalLahir;
    }

    public void setTanggalLahir(Date tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }
    
    
}
