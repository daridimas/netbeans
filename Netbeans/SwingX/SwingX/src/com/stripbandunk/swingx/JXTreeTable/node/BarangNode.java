/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stripbandunk.swingx.JXTreeTable.node;

import com.stripbandunk.swingx.JXTreeTable.Barang;
import org.jdesktop.swingx.treetable.DefaultMutableTreeTableNode;

/**
 *
 * @author dimas
 */
public class BarangNode extends DefaultMutableTreeTableNode {
    private Barang barang;

    public BarangNode(Barang barang) {
        this.barang = barang;
        setUserObject(barang);
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int column) {
        switch(column){
            case 0 : return barang.getKode();
            case 1 : return barang.getNama();
            case 2 : return barang.getHarga();
            case 3 : return barang.getStok();
            default: return null;
        }
    }

    
    
}
