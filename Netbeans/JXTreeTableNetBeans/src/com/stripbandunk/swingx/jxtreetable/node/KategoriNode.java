/*
 *  Copyright (c) 2011-2012, StripBandunk and/or its affiliates. All rights reserved.
 *  STRIPBANDUNK PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.stripbandunk.swingx.jxtreetable.node;

import com.stripbandunk.swingx.jxtreetable.entity.Kategori;
import org.jdesktop.swingx.treetable.DefaultMutableTreeTableNode;

/**
 *
 * @author echo
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
        switch (column) {
            case 0:
                return kategori.getKode();
            case 1:
                return kategori.getNama();
            default:
                return null;
        }
    }
}
