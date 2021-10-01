/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.stripbandunk.swing.jframe;

import java.awt.Component;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JLabel;
import javax.swing.JList;

/**
 *
 * @author dimas
 */
public class KategoriRendererBab94 extends DefaultListCellRenderer{

    @Override
    public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
        JLabel label = (JLabel) super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus); //To change body of generated methods, choose Tools | Templates.
        
        if(value instanceof KategoriBab93) {
            KategoriBab93 kategori = (KategoriBab93) value;
            String teks = kategori.getKode()+ " - " + kategori.getNama();
            label.setText(teks);
        }
        
        return label;
    }
    
}
