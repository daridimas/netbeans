/*
 *  Copyright (c) 2011-2012, StripBandunk and/or its affiliates. All rights reserved.
 *  STRIPBANDUNK PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.stripbandunk.swingx.jxtreetable.node;

import com.stripbandunk.swingx.jxtreetable.entity.Barang;
import org.jdesktop.swingx.treetable.DefaultMutableTreeTableNode;

/**
 *
 * @author echo
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
        switch (column) {
            case 0:
                return barang.getKode();
            case 1:
                return barang.getNama();
            case 2:
                return barang.getHarga();
            case 3:
                return barang.getStok();
            default:
                return null;
        }
    }
}
