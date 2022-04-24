/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stripbandunk.swing.jdynamictable;

import java.awt.Component;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author dimas
 */
public class TanggalRenderer extends DefaultTableCellRenderer{
    
    private SimpleDateFormat dateFormat = new SimpleDateFormat("dd MMMM yyyy");

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        JLabel label = (JLabel) super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column); //To change body of generated methods, choose Tools | Templates.
        
        if (value instanceof Date) {
            Date date = (Date) value;
            label.setText(dateFormat.format(date));
        }
        
        return label;
    }
    
}
