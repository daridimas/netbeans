/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dapproduction.desktop.entity.renderer;

import com.dapproduction.desktop.entity.Kategori;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author dimas
 */
public class KategoriRenderer extends DefaultTableCellRenderer{

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        JLabel label = (JLabel) super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column); //To change body of generated methods, choose Tools | Templates.
    
        if (value instanceof Kategori) {
            Kategori kategori = (Kategori) value;
            
            label.setText(kategori.getNama());
        }
        return label;
    }
    
    
    
}
