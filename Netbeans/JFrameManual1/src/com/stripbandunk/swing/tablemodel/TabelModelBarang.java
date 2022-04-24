/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.stripbandunk.swing.tablemodel;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author dimas
 */
public class TabelModelBarang extends AbstractTableModel{

    private List<Barang> list;
    
    public TabelModelBarang() {
        list = new ArrayList<>();
    }
    
    public void tambah(Barang barang) {
        list.add(barang);
        fireTableRowsInserted(getRowCount()-1, getRowCount()-1); // agar JTable tau kalau datanya bertambah
    }
    
    public void ubah(int baris, Barang barang) {
        list.set(baris, barang);
        fireTableRowsUpdated(baris, baris); // agar JTable tau kalau datanya terupdate
    }
    
    public void hapus(int baris){
        list.remove(baris);
        fireTableRowsDeleted(baris, baris); // agar JTable tau kalau datanya terhapus
    }
    
    public Barang ambilData(int baris){
        return list.get(baris); // agar data yang terseleksi dapat masuk ke jtexfield
    }
        
    @Override
    public int getRowCount() { // berapa jumlah baris
        return list.size();
    }

    @Override
    public int getColumnCount() { // berapa jumlah kolom
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) { //mengambil nilai di baris dan kolom tertentu
        switch(columnIndex){
            case 0 : return list.get(rowIndex).getKode();
            case 1 : return list.get(rowIndex).getNama();
            case 2 : return list.get(rowIndex).getKategori();
            case 3 : return list.get(rowIndex).getHarga();
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        switch(column) {
            case 0 : return "Kode";
            case 1 : return "Nama";
            case 2 : return "Kategori";
            case 3 : return "Harga";
            default :
                return null;
        }
    }
    
}
