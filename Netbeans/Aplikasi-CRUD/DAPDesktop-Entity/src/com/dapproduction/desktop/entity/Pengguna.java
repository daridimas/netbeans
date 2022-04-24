/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dapproduction.desktop.entity;

import com.stripbandunk.jwidget.annotation.TableColumn;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author dimas
 */
public class Pengguna implements Serializable{
    
    @TableColumn(number = 1, name = "Kode")
    private String kode;
    @TableColumn(number = 2, name = "Sandi")
    private String sandi;
    @TableColumn(number = 3, name = "Nama")
    private String nama;
    @TableColumn(number = 4, name = "Tanggal Lahir")
    private Date tanggalLahir;
    @TableColumn(number = 5, name = "No. Telepon")
    private String telepon;
    @TableColumn(number = 6, name = "Alamat")
    private String alamat;
    @TableColumn(number = 7, name = "Waktu Dibuat")
    private Date waktuDibuat;
    @TableColumn(number = 8, name = "Waktu Diubah")
    private Date waktuDiubah;

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getSandi() {
        return sandi;
    }

    public void setSandi(String sandi) {
        this.sandi = sandi;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Date getTanggalLahir() {
        return tanggalLahir;
    }

    public void setTanggalLahir(Date tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    public String getTelepon() {
        return telepon;
    }

    public void setTelepon(String telepon) {
        this.telepon = telepon;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
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
    
    
}
