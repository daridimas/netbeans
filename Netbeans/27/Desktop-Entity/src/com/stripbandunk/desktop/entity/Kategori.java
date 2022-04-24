/*
 *  Copyright (c) 2011-2012, StripBandunk and/or its affiliates. All rights reserved.
 *  STRIPBANDUNK PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.stripbandunk.desktop.entity;

import com.stripbandunk.jwidget.annotation.TableColumn;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

/**
 *
 * @author Eko Kurniawan Khannedy
 */
public class Kategori implements Serializable {

    @TableColumn(number = 1, name = "Kode")
    private String kode;
    @TableColumn(number = 2, name = "Nama")
    private String nama;
    @TableColumn(number = 3, name = "Waktu Dibuat")
    private Date waktuDibuat;
    @TableColumn(number = 4, name = "Waktu Diubah")
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

    @Override
    public boolean equals(Object obj) {
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
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + Objects.hashCode(this.kode);
        return hash;
    }

    @Override
    public String toString() {
        return nama;
    }
}
