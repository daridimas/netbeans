/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dapproduction.desktop.entity;

import com.dapproduction.desktop.entity.renderer.KategoriRenderer;
import com.stripbandunk.jwidget.annotation.TableColumn;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author dimas
 */
public class Barang implements Serializable{
    
    @TableColumn(number = 1, name = "Kode")
    private String kode;
    @TableColumn(number = 2, name = "Nama")
    private String nama;
    @TableColumn(number = 3, name = "Harga")
    private Long harga;
    @TableColumn(number = 4, name = "Stok")
    private Integer stok;
    @TableColumn(number = 5, name = "Kategori", renderer = KategoriRenderer.class)
    private Kategori kategori;
    @TableColumn(number = 6, name = "Waktu Dibuat")
    private Date waktuDibuat;
    @TableColumn(number = 7, name = "Waktu Diubah")
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

    public Long getHarga() {
        return harga;
    }

    public void setHarga(Long harga) {
        this.harga = harga;
    }

    public Integer getStok() {
        return stok;
    }

    public void setStok(Integer stok) {
        this.stok = stok;
    }

    public Kategori getKategori() {
        return kategori;
    }

    public void setKategori(Kategori kategori) {
        this.kategori = kategori;
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
