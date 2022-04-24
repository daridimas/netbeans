/*
 *  Copyright (c) 2011-2012, StripBandunk and/or its affiliates. All rights reserved.
 *  STRIPBANDUNK PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.stripbandunk.desktop.entity;

import com.stripbandunk.jwidget.annotation.TableColumn;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Eko Kurniawan Khannedy
 */
public class Pengguna implements Serializable {

    @TableColumn(number=1, name="Kode")
    private String kode;
    @TableColumn(number=2, name="Sandi")
    private String sandi;
    @TableColumn(number=3, name="Nama")
    private String nama;
    @TableColumn(number=4, name="Tanggal Lahir")
    private Date tanggalLahir;
    @TableColumn(number=5, name="Telepon")
    private String telepon;
    @TableColumn(number=6, name="Alamat", size=30)
    private String alamat;
    @TableColumn(number=7, name="Waktu Dibuat")
    private Date waktuDibuat;
    @TableColumn(number=8, name="Waktu Diubah")
    private Date waktuDiubah;

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

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
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

    public String getSandi() {
        return sandi;
    }

    public void setSandi(String sandi) {
        this.sandi = sandi;
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

    @Override
    public String toString() {
        return "Pengguna{" + "kode=" + kode + ", sandi=" + sandi + ", nama=" + nama + ", tanggalLahir=" + tanggalLahir + ", telepon=" + telepon + ", alamat=" + alamat + ", waktuDibuat=" + waktuDibuat + ", waktuDiubah=" + waktuDiubah + '}';
    }
}
