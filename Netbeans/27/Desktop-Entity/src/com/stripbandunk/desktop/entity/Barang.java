/*
 *  Copyright (c) 2011-2012, StripBandunk and/or its affiliates. All rights reserved.
 *  STRIPBANDUNK PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.stripbandunk.desktop.entity;

import com.stripbandunk.desktop.entity.renderer.KategoriRenderer;
import com.stripbandunk.jwidget.annotation.TableColumn;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Eko Kurniawan Khannedy
 */
public class Barang implements Serializable {

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

    public Kategori getKategori() {
        return kategori;
    }

    public void setKategori(Kategori kategori) {
        this.kategori = kategori;
    }

    public Long getHarga() {
        return harga;
    }

    public void setHarga(Long harga) {
        this.harga = harga;
    }

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

    public Integer getStok() {
        return stok;
    }

    public void setStok(Integer stok) {
        this.stok = stok;
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
    public String toString() {
        return "Barang{" + "kode=" + kode + ", nama=" + nama + ", harga=" + harga + ", stok=" + stok + ", kategori=" + kategori + ", waktuDibuat=" + waktuDibuat + ", waktuDiubah=" + waktuDiubah + '}';
    }
}
