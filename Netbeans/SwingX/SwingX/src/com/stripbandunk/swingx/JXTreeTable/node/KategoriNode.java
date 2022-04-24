/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stripbandunk.swingx.JXTreeTable.node;

import com.stripbandunk.swingx.JXTreeTable.Kategori;
import org.jdesktop.swingx.treetable.DefaultMutableTreeTableNode;

/**
 *
 * @author dimas
 */
public class KategoriNode extends DefaultMutableTreeTableNode {
    private Kategori kategori;

    public KategoriNode(Kategori kategori) {
        this.kategori = kategori;
        setUserObject(kategori);
    }

    @Override
    public int getColumnCount() {
        return 2;
    }

    @Override
    public Object getValueAt(int column) {
        switch(column) {
            case 0 : return kategori.getKode();
            case 1 : return kategori.getNama();
            default: return null;
        }
    }
    
    
}
