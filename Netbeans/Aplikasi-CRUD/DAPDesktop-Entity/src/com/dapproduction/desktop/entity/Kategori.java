/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dapproduction.desktop.entity;

import com.stripbandunk.jwidget.annotation.TableColumn;
import java.util.Date;
import java.util.Objects;

/**
 *
 * @author dimas
 */
public class Kategori {
    
    @TableColumn(number = 1, name = "Kode")
    private String kode;
    @TableColumn(number = 2, name = "Nama")
    private String nama;
    @TableColumn(number = 3, name = "Waktu Dibuat")
    private Date waktuDibuat;
    @TableColumn(number = 4, name = "Waktu Diubah")
    private Date waktuDiubah;

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Date getWaktuDibuat() {
        return waktuDibuat;
    }

    public void setWaktuDibuat(Date waktuDibuat) {
        this.waktuDibuat = waktuDibuat;
    }

    public Date getWaktuDiubah() {
        return waktuDiubah;
    }

    public void setWaktuDiubah(Date waktuDiubah) {
        this.waktuDiubah = waktuDiubah;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + Objects.hashCode(this.kode);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Kategori other = (Kategori) obj;
        if (!Objects.equals(this.kode, other.kode)) {
            return false;
        }
        return true;
    }
    
    
    
    @Override
    public String toString() {
        return nama;
    }
}
