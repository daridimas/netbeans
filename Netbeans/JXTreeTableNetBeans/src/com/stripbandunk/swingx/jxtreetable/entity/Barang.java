/*
 *  Copyright (c) 2011-2012, StripBandunk and/or its affiliates. All rights reserved.
 *  STRIPBANDUNK PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.stripbandunk.swingx.jxtreetable.entity;

/**
 *
 * @author echo
 */
public class Barang {

    private String kode;
    private String nama;
    private Long harga;
    private Integer stok;

    public Barang() {
    }

    public Barang(String kode, String nama, Long harga, Integer stok) {
        this.kode = kode;
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
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
}
